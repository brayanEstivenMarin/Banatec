
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {
    Connection con;

    public Conexion() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net/sql10358696", "sql10358696", "qHeQvDyW7X");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al conectarse con la base de datos");
        }
        
        
        
        
    }
    public Connection conectarse(){
    
    return con;
}
}
