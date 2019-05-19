
package bd;

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
    
    
       public static Date ParseFecha(String fecha)
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return fechaDate;
    }
    
       
         public static ArrayList<Jugadores> jugadorInfo(int cod_usuario){
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
       
       
       
    public static ArrayList<Jugadores> topJugadores(){
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
    
      public static ArrayList<String>  verCategorias(){
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
      
       public static ArrayList<Preguntas>  jugarPregunta(int usario, String cat){
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
    
}
