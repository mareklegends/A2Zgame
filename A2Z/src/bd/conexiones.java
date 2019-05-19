
package bd;

import a2z.Jugadores;
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
    
    public static ArrayList<Jugadores>  topJugadores(){
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
                j = new Jugadores(rs.getInt(5), rs.getInt(1), rs.getString(2), ParseFecha(rs.getString(4)));
                
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
    
}
