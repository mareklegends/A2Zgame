package bd;

import a2z.HelpLogin;
import a2z.Jugadores;
import a2z.Preguntas;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author marek
 */
public class conexiones {

    public static Date ParseFecha(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return fechaDate;
    }

    public static ArrayList<Jugadores> jugadorInfo(int cod_usuario) {
        ArrayList<Jugadores> vJugadorInfo = new ArrayList();
        Jugadores j2 = null;

        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:mysql://localhost:3306/basesproyectojava";
            String user = "root";
            String password = "";

            // create a connection to the database
            conn = (Connection) DriverManager.getConnection(url, user, password);
            // more processing here

            PreparedStatement ps3 = (PreparedStatement) conn.prepareStatement("SELECT * FROM usuarios WHERE admin=0 AND codusuarios=?");
            ps3.setInt(1, cod_usuario);

            ResultSet rs = ps3.executeQuery();

            while (rs.next()) {
                j2 = new Jugadores(rs.getInt(5), rs.getInt(6), rs.getInt(1), rs.getString(2), ParseFecha(rs.getString(4)));

                vJugadorInfo.add(j2);

            }

            // ... 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

        return vJugadorInfo;
    }

    public static ArrayList<Jugadores> topJugadores() {
        ArrayList<Jugadores> vJugadoresNOADMIN = new ArrayList();
        Jugadores j = null;

        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:mysql://localhost:3306/basesproyectojava";
            String user = "root";
            String password = "";

            // create a connection to the database
            conn = (Connection) DriverManager.getConnection(url, user, password);
            // more processing here

            String sql = "SELECT * FROM usuarios WHERE admin=0 group by puntos DESC";
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {
                j = new Jugadores(rs.getInt(5), rs.getInt(6), rs.getInt(1), rs.getString(2), ParseFecha(rs.getString(4)));

                vJugadoresNOADMIN.add(j);

            }

            // ... 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

        return vJugadoresNOADMIN;
    }

    public static ArrayList<String> verCategorias() {
        ArrayList<String> vCategorias = new ArrayList();
        Jugadores j = null;

        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:mysql://localhost:3306/basesproyectojava";
            String user = "root";
            String password = "";

            // create a connection to the database
            conn = (Connection) DriverManager.getConnection(url, user, password);
            // more processing here

            String sql = "SELECT nombre FROM categorias ";
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {

                vCategorias.add(rs.getString(1));

            }

            // ... 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

        return vCategorias;
    }

    public static ArrayList<Preguntas> jugarPregunta(int usario, String cat) {
        ArrayList<Preguntas> vPregunta = new ArrayList();
        Preguntas p = null;

        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:mysql://localhost:3306/basesproyectojava";
            String user = "root";
            String password = "";

            // create a connection to the database
            conn = (Connection) DriverManager.getConnection(url, user, password);
            // more processing here

            PreparedStatement ps2 = (PreparedStatement) conn.prepareStatement("SELECT preguntas.codpreguntas, preguntas.pregunta, preguntas.r1, preguntas.r2, preguntas.r3, preguntas.rbuena, categorias.nombre FROM preguntas, categorias WHERE preguntas.codcat=categorias.codcategorias and preguntas.codpreguntas NOT IN (SELECT pok.pokpregunta FROM pok where pok.pokuser=?) AND preguntas.codcat=(SELECT categorias.codcategorias FROM categorias WHERE categorias.nombre LIKE ?)");
            ps2.setString(2, cat);
            ps2.setInt(1, usario);

            ResultSet rs = ps2.executeQuery();

            while (rs.next()) {

                p = new Preguntas(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7));

                vPregunta.add(p);

            }

            // ... 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

        return vPregunta;
    }

    public static void nuevaPreguntaFormularios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static int contadorUsuarios() {
        int numero = 0;
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:mysql://localhost:3306/basesproyectojava";
            String user = "root";
            String password = "";

            // create a connection to the database
            conn = (Connection) DriverManager.getConnection(url, user, password);
            // more processing here

            PreparedStatement ps2 = (PreparedStatement) conn.prepareStatement("SELECT COUNT(usuarios.codusuarios) FROM usuarios WHERE usuarios.admin=0");

            ResultSet rs = ps2.executeQuery();

            while (rs.next()) {

                numero = rs.getInt(1);

            }

            // ... 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return numero;
    }

    public static int contadorPreguntas() {
        int numero = 0;
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:mysql://localhost:3306/basesproyectojava";
            String user = "root";
            String password = "";

            // create a connection to the database
            conn = (Connection) DriverManager.getConnection(url, user, password);
            // more processing here

            PreparedStatement ps2 = (PreparedStatement) conn.prepareStatement("SELECT COUNT(preguntas.codpreguntas) FROM preguntas");

            ResultSet rs = ps2.executeQuery();

            while (rs.next()) {

                numero = rs.getInt(1);

            }

            // ... 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return numero;

    }

    public static void darpuntosyvidas(int cod_usuario) {
        Connection conn = null;
        int puntos = 0;
        int vidas = 0;
        try {
            // db parameters
            String url = "jdbc:mysql://localhost:3306/basesproyectojava";
            String user = "root";
            String password = "";

            // create a connection to the database
            conn = (Connection) DriverManager.getConnection(url, user, password);
            // more processing here

            PreparedStatement ps1 = (PreparedStatement) conn.prepareStatement("SELECT usuarios.puntos, usuarios.vidas FROM usuarios WHERE usuarios.codusuarios=?");
            ps1.setInt(1, cod_usuario);
            ResultSet rs = ps1.executeQuery();

            while (rs.next()) {
                puntos = rs.getInt(1);
                vidas = rs.getInt(2);
            }

            PreparedStatement ps2 = (PreparedStatement) conn.prepareStatement("UPDATE usuarios SET usuarios.puntos=?, usuarios.vidas=? WHERE usuarios.codusuarios=?");
            ps2.setInt(1, (puntos + 10));
            ps2.setInt(2, (vidas + 1));
            ps2.setInt(3, cod_usuario);
            int rs2 = ps2.executeUpdate();

            // ... 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void quitarvidas(int cod_usuario) {
        Connection conn = null;
        int vidas = 0;
        try {
            // db parameters
            String url = "jdbc:mysql://localhost:3306/basesproyectojava";
            String user = "root";
            String password = "";

            // create a connection to the database
            conn = (Connection) DriverManager.getConnection(url, user, password);
            // more processing here

            PreparedStatement ps1 = (PreparedStatement) conn.prepareStatement("SELECT usuarios.vidas FROM usuarios WHERE usuarios.codusuarios=?");
            ps1.setInt(1, cod_usuario);
            ResultSet rs = ps1.executeQuery();

            while (rs.next()) {
                vidas = rs.getInt(1);
            }
            
            if (vidas==0) {
                 PreparedStatement ps2 = (PreparedStatement) conn.prepareStatement("UPDATE usuarios SET usuarios.vidas=? WHERE usuarios.codusuarios=?");
            ps2.setInt(1, (vidas + 1));
            ps2.setInt(2, cod_usuario);
            int rs2 = ps2.executeUpdate();
            }else{
                PreparedStatement ps2 = (PreparedStatement) conn.prepareStatement("UPDATE usuarios SET usuarios.vidas=? WHERE usuarios.codusuarios=?");
            ps2.setInt(1, (vidas - 1));
            ps2.setInt(2, cod_usuario);
            int rs2 = ps2.executeUpdate(); 
            }

           

            // ... 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void preguntaCorrecta(int cod_usuario, int cod_pregunta) {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:mysql://localhost:3306/basesproyectojava";
            String user = "root";
            
            String password = "";

            // create a connection to the database
            conn = (Connection) DriverManager.getConnection(url, user, password);
            // more processing here

            PreparedStatement ps2 = (PreparedStatement) conn.prepareStatement("INSERT INTO pok (pokuser, pokpregunta) VALUES (?, ?)");
            ps2.setInt(1, cod_usuario);
            ps2.setInt(2, cod_pregunta);
            int rs2 = ps2.executeUpdate();

            // ... 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static int regitrarse(String nombre, String pass, String fecha) {
        int cod_user=0;
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:mysql://localhost:3306/basesproyectojava";
            String user = "root";
            String password = "";

            // create a connection to the database
            conn = (Connection) DriverManager.getConnection(url, user, password);
            // more processing here

            PreparedStatement ps2 = (PreparedStatement) conn.prepareStatement("INSERT INTO usuarios (codusuarios, nickname, clave, fecha, puntos, vidas, admin) VALUES (0, ?, ?, ?, 0, 10, 0)");
            ps2.setString(1, nombre);
            ps2.setString(2, pass);
            ps2.setString(3, fecha);
            int rs2 = ps2.executeUpdate();

            
            PreparedStatement ps3 = (PreparedStatement) conn.prepareStatement("SELECT usuarios.codusuarios FROM usuarios WHERE usuarios.nickname LIKE ?");
            ps3.setString(1, nombre);
            ResultSet rs = ps3.executeQuery();

            while (rs.next()) {
                cod_user = rs.getInt(1);
            }
            
            
            // ... 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return cod_user;
    }
    
    public static ArrayList<HelpLogin> iniciarse(String nombre, String pass) {
        ArrayList<HelpLogin> vLogin = new ArrayList();
        HelpLogin hp = null;
        int cod_user=0;
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:mysql://localhost:3306/basesproyectojava";
            String user = "root";
            String password = "";

            // create a connection to the database
            conn = (Connection) DriverManager.getConnection(url, user, password);
            // more processing here

            

            
            PreparedStatement ps3 = (PreparedStatement) conn.prepareStatement("SELECT usuarios.codusuarios, usuarios.admin FROM usuarios WHERE usuarios.nickname LIKE ? AND usuarios.clave LIKE ? ");
            ps3.setString(1, nombre);
            ps3.setString(2, pass);
            ResultSet rs = ps3.executeQuery();

            while (rs.next()) {
                hp = new HelpLogin(rs.getInt(1), rs.getInt(2));                
                vLogin.add(hp);
            }
            
            
            // ... 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return vLogin;
    }
    

}
