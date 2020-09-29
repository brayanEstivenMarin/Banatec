
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion2 {
    Connection con2;

    public Conexion2() {
        
        try {
            Class.forName("org.hsqldb.jdbcDriver");
             con2=DriverManager.getConnection("jdbc:hsqldb:file:C:\\Users\\Nestor\\Documents\\NetBeansProjects\\Banatec\\DB\\banatec","root","");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al conectarse con la base de datos");
        }
        
        
        
        
    }
    public Connection conectarse2(){
    
    return con2;
}
}
