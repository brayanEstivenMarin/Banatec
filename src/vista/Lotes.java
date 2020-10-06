/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Conexion;  //importando la conexion
import java.sql.Connection;  //importando sql connectin para la conexion a la BD
import java.sql.PreparedStatement;  // importando Ps para la preparacion de sentencia 
import java.sql.ResultSet;                         //importando Rs para la ejecucion de la sentencia 
import javax.swing.JOptionPane;                     //importando JoptionPane para ejecucion de mensajes
import javax.swing.table.DefaultTableModel;       //importando Default para la utilizacion de la tabla

public class Lotes extends javax.swing.JInternalFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;                           // creamos las variables que vamos a utilizar
    DefaultTableModel defaul;
    int id;

    public Lotes() {
        initComponents();                // componentes que se ejecutan al comienzo del programa
        lista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtlote = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtdes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnagregar = new javax.swing.JButton();
        btnactua = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setClosable(true);

        txtlote.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtlote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtloteKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("LOTE:");

        txtdes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("DESCRIPCION:");

        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_agregar.png"))); // NOI18N
        btnagregar.setContentAreaFilled(false);
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnactua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_actualizar.png"))); // NOI18N
        btnactua.setContentAreaFilled(false);
        btnactua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactuaActionPerformed(evt);
            }
        });

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_eliminar.png"))); // NOI18N
        btneliminar.setContentAreaFilled(false);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_nuevo.png"))); // NOI18N
        btncancelar.setContentAreaFilled(false);
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnactua, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtlote, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdes, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtlote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtdes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncancelar)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnagregar)
                        .addComponent(btnactua)
                        .addComponent(btneliminar)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        tabla.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LOTE", "DESCRIPCIÓN"
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
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.getSelectedRow();             
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Usuario no seleccionado"); 
        } else {
            id = Integer.parseInt((String) tabla.getValueAt(fila, 0).toString());
            String des = (String) tabla.getValueAt(fila, 1);
            txtlote.setText("" + id);
            txtdes.setText(des);                                      // aqui se selecciona un valor de la tabla y se le asigna a los txts
            txtlote.setEnabled(false);
            btnagregar.setEnabled(false);
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        agregar();      // utilizamos el metodo agregar() en el  boton agregar
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnactuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactuaActionPerformed
        actualizar();    // utilizamos el metodo actualizar() en el  boton actualizar
    }//GEN-LAST:event_btnactuaActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        eliminar();     // utilizamos el metodo eliminar() en el  boton eliminar
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        nuevo();                 // limpiamos todo con el boton cancelar
        JOptionPane.showMessageDialog(null, " Los campos se han limpiado correctamente ");
    }//GEN-LAST:event_btncancelarActionPerformed

    private void txtloteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtloteKeyTyped
char c= evt.getKeyChar();                   // solo acepte numeros en el campo de lotes
   if(c<'0' || c>'9' ) evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txtloteKeyTyped

    void lista() {
        try {
            Conexion conexion = new Conexion();
            con = conexion.conectarse();                              // abrimos la conexion
            ps = con.prepareStatement("select * from lotes");          // preparamos la consulta
            rs = ps.executeQuery();                                           // ejecutamos la consulta   
            defaul = (DefaultTableModel) tabla.getModel();
            Object[] arreglo = new Object[2];                              // creamos el arreglo para insertar en la tabla
            while (rs.next()) {
                arreglo[0] = rs.getInt("id_lote");
                arreglo[1] = rs.getString("descripcion");    // aqui se agregan los valores de la consulta en la tabla
                defaul.addRow(arreglo);
            }
            tabla.setModel(defaul);
        } catch (Exception e) {
        }
    }
    
    void agregar() {
        String id_lote = txtlote.getText();
        String descripcion = txtdes.getText();            // se meten los valores de los txts en variables
        if (id_lote.equals("") || descripcion.equals("")) {       // valida campos vacios
            JOptionPane.showMessageDialog(null, "Ingrese los datos por favor");
            
        } else {
            try {
                ps = con.prepareStatement("INSERT INTO lotes (id_lote,descripcion)values('" + id_lote + "','" + descripcion + "')");
                ps.executeUpdate(); //preparamos y ejecutamos la consulta
                JOptionPane.showMessageDialog(null, "AGREGADO CORRECTAMENTE");
                limpiartabla();
                lista();                //refrescamos la tabla
                nuevo();
                 txtlote.setEnabled(true);
            btnagregar.setEnabled(true);           // activamos botones y txts
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, "ERROR AL AGREGAR");
            }
        }
        
    }
    
    void actualizar() {
        String id_lote = txtlote.getText();   // se meten los valores de los txts en variables
        String de = txtdes.getText();
        if (id_lote.equals("") || de.equals("")) {   // valida campos vacios
            JOptionPane.showMessageDialog(null, "SELECCIONE El LOTE POR FAVOR.");
            
        } else {
            try {
                ps = con.prepareStatement("UPDATE lotes SET descripcion='" + de + "' where id_lote='" + id_lote + "'");
                ps.executeUpdate();  // preparamos y ejecutamos la consulta   
                JOptionPane.showMessageDialog(null, "ACTUALIZADO CORRECTAMENTE.");
                limpiartabla();
                lista(); 
                nuevo();      //refrescamos la tabla y activamos otones y txts
                btnagregar.setEnabled(true);
                txtlote.setEnabled(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "!UPS¡ ERROR.");
            }
            
        }
    }
    
    void eliminar() {
        String id = txtlote.getText();         // se meten los valores de los txts en variables
            int opc = JOptionPane.showConfirmDialog(null, " ¿Realmente quieres eliminar una labor? "); // pregunta que si quiere eliminar
        if (opc == JOptionPane.YES_OPTION) {
        try {
            
            ps = con.prepareStatement("delete from lotes where id_lote='" + id + "'");
            ps.executeUpdate();                 // preparamos y ejecutamos la consulta
            JOptionPane.showMessageDialog(null, "ELIMINADO CORRECTAMENTE.");
            limpiartabla();
            lista();
            nuevo();          //refrescamos la tabla
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "!UPS¡ ERROR.");
        }
        }
        
         if (opc == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, " NO se pudo eliminar");           
        }
        if (opc == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Se ha cancelado la operacion ");
        }
    }
    
    void nuevo() {
        btnagregar.setEnabled(true);
        txtlote.setEnabled(true);         //limpiamos los txts y habilitamos los botones y txts
        txtlote.setText("");
        txtdes.setText("");
        
    }
  
    void limpiartabla() {
        for (int i = 0; i < tabla.getRowCount(); i++) {
            defaul.removeRow(i);            // recorre y limpiamos los valores de la tabla
            i -= 1;
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactua;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtdes;
    private javax.swing.JTextField txtlote;
    // End of variables declaration//GEN-END:variables
}
