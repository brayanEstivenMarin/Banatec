
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {
    Connection con; //creacion de variable para utilizar la conexion sea utilizada con la app.

    public Conexion() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver"); //Utilzando libreria 
             con=DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net/sql10369180", "sql10369180", "2vCUtWv1zT"); //Llamado de BD
            
            
        } catch (Exception e) { // En caso de que no haya una conexion a la BD muestra ese mensaje.
            JOptionPane.showMessageDialog(null, "error al conectarse con la base de datos"); 
        }
        
        
        
        
    }
    public Connection conectarse(){
    
    return con;
}
}
