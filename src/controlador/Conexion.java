
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {
    Connection con;

    public Conexion() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banatec", "root", "");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al conectarse con la base de datos");
        }
        
        
        
        
    }
    public Connection conectarse(){
    
    return con;
}
}
