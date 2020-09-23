
package vista;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Trabajadores extends javax.swing.JInternalFrame {
       Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel modelo;
      Statement stt;
      int id;
            
          
    public Trabajadores() {
        initComponents();
      listar();
     
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_edad = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        jButton2.setText("jButton2");

        setClosable(true);
        setTitle("Trabajadores de la Finca");
        setPreferredSize(new java.awt.Dimension(1367, 670));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("CÉDULA:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("NOMBRE:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("APELLIDOS:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("TELÉFONO:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("EDAD:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("DIRECCIÓN:");

        txt_cedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });
        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyTyped(evt);
            }
        });

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        txt_edad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_edadKeyTyped(evt);
            }
        });

        txt_apellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidoKeyTyped(evt);
            }
        });

        txt_telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });

        txt_direccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_eliminar.setForeground(new java.awt.Color(239, 12, 19));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_guardar)
                .addGap(18, 18, 18)
                .addComponent(btn_actualizar)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminar)
                .addGap(18, 18, 18)
                .addComponent(cancelar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_edad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                        .addComponent(txt_telefono, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_eliminar)
                    .addComponent(cancelar))
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(219, 219, 219)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÉDULA", "NOMBRE", "APELLIDOS", "TELÉFONO", "EDAD", "DIRECCIÓN"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, Short.MAX_VALUE)
                .addGap(54, 54, 54)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(666, 666, 666))
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
   
        int fila=tabla.getSelectedRow();
        if (fila==-1) {
            JOptionPane.showMessageDialog(null, "ninguna fila seleccionada");
        }
        
        else{
            txt_cedula.setEnabled(false);
            btn_guardar.setEnabled(false);
        id=Integer.parseInt((String)tabla.getValueAt(fila, 0)) ;
        String cedula=(String)tabla.getValueAt(fila,0);
        String nombre=(String)tabla.getValueAt(fila,1);
        String apellido=(String)tabla.getValueAt(fila,2);
        String telefono=(String)tabla.getValueAt(fila,3);
        String edad=(String)tabla.getValueAt(fila,4);
        String direccion=(String)tabla.getValueAt(fila,5);
        txt_cedula.setText(""+cedula);
         txt_nombre.setText(nombre);
         txt_apellido.setText(apellido);
        txt_edad.setText(edad);
        txt_telefono.setText(telefono);
        txt_direccion.setText(direccion);
        
        
        }
        
        
        
    }//GEN-LAST:event_tablaMouseClicked

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        limpiartxt();
    }//GEN-LAST:event_cancelarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        actualizar();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        guardar();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        char c= evt.getKeyChar();
        if(c<'0' || c>'9' ) evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void txt_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyTyped
        char c= evt.getKeyChar();
        if((c<'a' || c>'z' ) && (c<'A')|c>'Z') evt.consume() ;              // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoKeyTyped

    private void txt_edadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edadKeyTyped
        char c= evt.getKeyChar();
        if(c<'0' || c>'9' ) evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_edadKeyTyped

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        char c= evt.getKeyChar();
        if((c<'a' || c>'z' ) && (c<'A')|c>'Z') evt.consume() ;              // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyTyped
        char c= evt.getKeyChar();
        if(c<'0' || c>'9' ) evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaKeyTyped

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaActionPerformed

    void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setExtendedState(int MAXIMIZED_BOTH) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

void listar(){
    try {
      con=cn.conectarse();
      ps=con.prepareStatement("select * from trabajadores");
      rs=ps.executeQuery();
      Object[]trabajador= new Object[6];
      modelo=(DefaultTableModel) tabla.getModel();
      
      while(rs.next()){
         trabajador[0]=rs.getString("cedula_tra");
         trabajador[1]=rs.getString("nombre_t");
         trabajador[2]=rs.getString("apellido_t");
         trabajador[3]=rs.getString("telefono_t");
         trabajador[4]=rs.getString("edad_t");
         trabajador[5]=rs.getString("direccion_t");
            modelo.addRow(trabajador);
  
      }
         tabla.setModel(modelo);
        
    } catch (Exception e) {
    }
    


}
 private void limpiarTabla() {
     
for (int i = 0; i < tabla.getRowCount(); i++) {
modelo.removeRow(i);
i-=1;

}
}
 
 public void guardar(){

 String cedula = txt_cedula.getText();
  String nombre = txt_nombre.getText();
   String apellidos = txt_apellido.getText();
    String telefono = txt_telefono.getText();
     String edad = txt_edad.getText();
      String direccion= txt_direccion.getText();
      
       if(cedula.equals("") || nombre.equals("") || apellidos.equals("") || edad.equals("") || telefono.equals("") || direccion.equals("")){
      JOptionPane.showMessageDialog(null,"los campos deben estar todos llenos");
       }
       else{
      
      try {
          con=cn.conectarse();
          ps=con.prepareStatement("INSERT INTO trabajadores value('"+cedula+"','"+nombre+"','"+apellidos+"','"+telefono+"','"+edad+"','"+direccion+"')");
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null, "Trabajador guardado correctamente");
          
          limpiartxt();
          limpiarTabla();
          listar();
          
          
     } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "No se pudo crear el trabajador");
     }
 

 
 
 
 
 }
 
 }
     void limpiartxt(){
   txt_cedula.setText("");
   txt_nombre.setText("");
   txt_apellido.setText("");
  txt_direccion.setText("");
  txt_telefono.setText("");
   txt_edad.setText("");
  btn_guardar.setEnabled(true);
  txt_cedula.setEnabled(true);

      }
     
     
     
     void actualizar(){
         
         
        String cedula = txt_cedula.getText();
        String nombre = txt_nombre.getText();
        String apellidos = txt_apellido.getText();
         String telefono = txt_telefono.getText();
     String edad = txt_edad.getText();
      String direccion= txt_direccion.getText();
      if(nombre.equals("") || apellidos.equals("") || edad.equals("") || telefono.equals("") || direccion.equals("")){
      JOptionPane.showMessageDialog(null,"los campos deben estar todos llenos");
       }
      else{
      
          try {
 
          con=cn.conectarse();
          ps=con.prepareStatement("update trabajadores set nombre_t='"+nombre+"',apellido_t='"+apellidos+"',telefono_t='"+telefono+"',edad_t='"+edad+"',direccion_t='"+direccion+"' where cedula_tra='"+cedula+"'");
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null, "Actualizado correctamente");
          limpiartxt();
          limpiarTabla();
          listar();
          
          btn_guardar.setEnabled(true);
          txt_cedula.setEnabled(true);
          } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Error al actualizar");
          }
      
      
      }
}
 void eliminar(){
   
     try {
          String cedula=txt_cedula.getText();
         con=cn.conectarse();
        ps=con.prepareStatement("DELETE FROM trabajadores WHERE cedula_tra='"+cedula+"'");
        ps.executeUpdate();
       limpiarTabla();
       limpiartxt();
       listar();
           JOptionPane.showMessageDialog(null, "Se elimino correctamente");
     } catch (Exception e) {
     }
 
 
 
 
 
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
