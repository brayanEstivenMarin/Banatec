/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cintaje extends javax.swing.JInternalFrame {

   Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion conexion = new Conexion();

    DefaultTableModel defaul;

    public Cintaje() {
        initComponents();
        lista();
        cargar_lotes(combolotes);
              txtid.setEnabled(false );
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        combolotes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtamarillo = new javax.swing.JTextField();
        txtnaranja = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtrojo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtblanco = new javax.swing.JTextField();
        txtnegro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtcafe = new javax.swing.JTextField();
        txtmorado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtazul = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setClosable(true);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono2.png"))); // NOI18N

        jLabel11.setText("ID");

        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidKeyTyped(evt);
            }
        });

        combolotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combolotesActionPerformed(evt);
            }
        });

        jLabel1.setText("LOTE");

        jLabel2.setText("AMARILLO");

        txtamarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtamarilloActionPerformed(evt);
            }
        });
        txtamarillo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtamarilloKeyTyped(evt);
            }
        });

        txtnaranja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnaranjaKeyTyped(evt);
            }
        });

        jLabel3.setText("NARANJA");

        jLabel4.setText("ROJO");

        txtrojo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrojoKeyTyped(evt);
            }
        });

        jLabel5.setText("BLANCO");

        txtblanco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtblancoKeyTyped(evt);
            }
        });

        txtnegro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnegroKeyTyped(evt);
            }
        });

        jLabel6.setText("NEGRO");

        jLabel9.setText("CAFE");

        txtcafe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcafeKeyTyped(evt);
            }
        });

        txtmorado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmoradoKeyTyped(evt);
            }
        });

        jLabel8.setText("MORADO");

        jLabel7.setText("AZUL");

        txtazul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtazulKeyTyped(evt);
            }
        });

        btn_guardar.setText("AGREGAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_actualizar.setText("ACTUALIZAR");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        jButton1.setText("ELIMINAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnnuevo.setText("NUEVO");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtblanco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtrojo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtcafe)
                            .addComponent(txtnegro)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmorado)
                            .addComponent(txtazul)
                            .addComponent(txtnaranja)
                            .addComponent(txtamarillo)
                            .addComponent(combolotes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtid))))
                .addGap(191, 191, 191))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(150, 150, 150))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combolotes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtamarillo)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnaranja)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtazul)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmorado)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtcafe, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtrojo)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtblanco)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnegro)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))))
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "LOTE", "AMARILLO", "NARANJA", "ROJO", "BLANCO", "NEGRO", "AZUL", "MORADO", "CAFE", "TOTAL"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(105, 105, 105))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(309, 309, 309))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combolotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combolotesActionPerformed

    }//GEN-LAST:event_combolotesActionPerformed

    private void txtamarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtamarilloActionPerformed
      
    }//GEN-LAST:event_txtamarilloActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        agregar();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        actualizar();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        eliminar();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        cancelar();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
       txtid.setEnabled(false);
            btn_guardar.setEnabled(false);
         int fila=tabla.getSelectedRow();
        String id=(String)tabla.getValueAt(fila,0);
        String lote=(String)tabla.getValueAt(fila,1);
        String co1=(String)tabla.getValueAt(fila,2);
        String co2=(String)tabla.getValueAt(fila,3);
        String co3=(String)tabla.getValueAt(fila,4);
        String co4=(String)tabla.getValueAt(fila,5);
        String co5=(String)tabla.getValueAt(fila,6);
        String co6=(String)tabla.getValueAt(fila,7);
        String co7=(String)tabla.getValueAt(fila,8);
        String co8=(String)tabla.getValueAt(fila,9);
        String total=(String)tabla.getValueAt(fila,10);
        txtid.setText(""+id);
         combolotes.setSelectedIndex(0);
       txtamarillo.setText(co1);
        txtnaranja.setText(co2);
        txtazul.setText(co3);
        txtmorado.setText(co4);
        txtcafe.setText(co5);
        txtrojo.setText(co6);
        txtblanco.setText(co7);
        txtnegro.setText(co8);
        
        
        
    }//GEN-LAST:event_tablaMouseClicked

    private void txtidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyTyped
          char c= evt.getKeyChar();
   if(c<'0' || c>'9' ) evt.consume();
    }//GEN-LAST:event_txtidKeyTyped

    private void txtamarilloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtamarilloKeyTyped
char c= evt.getKeyChar();
   if(c<'0' || c>'9' ) evt.consume();
    }//GEN-LAST:event_txtamarilloKeyTyped

    private void txtnaranjaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnaranjaKeyTyped
char c= evt.getKeyChar();
   if(c<'0' || c>'9' ) evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txtnaranjaKeyTyped

    private void txtazulKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtazulKeyTyped
char c= evt.getKeyChar();
   if(c<'0' || c>'9' ) evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txtazulKeyTyped

    private void txtmoradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmoradoKeyTyped
char c= evt.getKeyChar();
   if(c<'0' || c>'9' ) evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txtmoradoKeyTyped

    private void txtcafeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcafeKeyTyped
char c= evt.getKeyChar();
   if(c<'0' || c>'9' ) evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txtcafeKeyTyped

    private void txtrojoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrojoKeyTyped
char c= evt.getKeyChar();
   if(c<'0' || c>'9' ) evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txtrojoKeyTyped

    private void txtblancoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtblancoKeyTyped
char c= evt.getKeyChar();
   if(c<'0' || c>'9' ) evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txtblancoKeyTyped

    private void txtnegroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnegroKeyTyped
char c= evt.getKeyChar();
   if(c<'0' || c>'9' ) evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txtnegroKeyTyped

    
    void lista() {
        try {
            con = conexion.conectarse();
            ps = con.prepareStatement("SELECT * FROM cintaje");
            rs = ps.executeQuery();
            defaul = (DefaultTableModel) tabla.getModel();
            Object[] arreglo = new Object[11];
            while (rs.next()) {
                arreglo[0] = rs.getString("id_encintaje");
                arreglo[1] = rs.getString("lote");
                arreglo[2] = rs.getString("amarillo");
                arreglo[3] = rs.getString("naranja");
                arreglo[4] = rs.getString("rojo");
                arreglo[5] = rs.getString("blanco");
                arreglo[6] = rs.getString("negro");
                arreglo[7] = rs.getString("azul");
                arreglo[8] = rs.getString("morado");
                arreglo[9] = rs.getString("cafe");
                arreglo[10]=rs.getString("total");
                defaul.addRow(arreglo);
            }
            tabla.setModel(defaul);
        } catch (Exception e) {
        }
    }

    void agregar() {
     
        String lote = (String) combolotes.getSelectedItem();
        int amarillo=Integer.parseInt(txtamarillo.getText());  
        int  naranja = Integer.parseInt(txtnaranja.getText());
        int rojo = Integer.parseInt(txtrojo.getText());
        int blanco = Integer.parseInt(txtblanco.getText());
       int negro =Integer.parseInt(txtnegro.getText()) ;
        int azul = Integer.parseInt(txtazul.getText());
        int morado =Integer.parseInt(txtmorado.getText());
        int cafe = Integer.parseInt(txtcafe.getText());
        int total=amarillo+naranja+rojo+blanco+negro+azul+morado+cafe;
        
       
        
            try {
                ps = con.prepareStatement("INSERT INTO cintaje (lote,amarillo,naranja,rojo,blanco,negro,azul,morado,cafe,total) VALUES('" + lote + "','" + amarillo + "','" + naranja + "','" + rojo + "','" + blanco + "','" + negro + "','" + azul + "','" + morado + "','" + cafe + "','"+ total +"')");
                ps.executeUpdate();
                limpiar();
                lista();
                cancelar();
                JOptionPane.showMessageDialog(null, "SE HA AGREGADO CORRECTAMENTE");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR");
            
        }

    }
void sumar(){
    
}
    void actualizar() {

        String id = txtid.getText();
       
        String amarillo = txtamarillo.getText();
        String naranja = txtnaranja.getText();
        String rojo = txtrojo.getText();
        String blanco = txtblanco.getText();
        String negro = txtnegro.getText();
        String azul = txtazul.getText();
        String morado = txtmorado.getText();
        String cafe = txtcafe.getText();
        if (id.equals("") || amarillo.equals("") || naranja.equals("") || rojo.equals("") || blanco.equals("") || negro.equals("") || azul.equals("") || morado.equals("") || cafe.equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE LOS DATOS");
        } else {
            try {
                ps = con.prepareStatement("UPDATE cintaje SET amarillo='" + amarillo + "',naranja='" + naranja + "',rojo='" + rojo + "',blanco='" + blanco + "',negro='" + negro + "',azul='" + azul + "',morado='" + morado + "',cafe='" + cafe + "' where id_encintaje='" + id + "' ");
                ps.executeUpdate();
                limpiar();
                lista();
                cancelar();
                JOptionPane.showMessageDialog(null, "ACTUALIZADO CORRECTAMENTE");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        }

    }

    void eliminar() {
        String id = txtid.getText();
        try {
            ps = con.prepareStatement("DELETE FROM cintaje where id_encintaje='" + id + "'");
            ps.executeUpdate();
            limpiar();
            lista();
            cancelar();
            JOptionPane.showMessageDialog(null, "ELIMINAR CORRECTAMENTE");
           
            btn_guardar.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }

    void limpiar() {
        for (int i = 0; i < tabla.getRowCount(); i++) {
            defaul.removeRow(i);
            i -= 1;
        }
    }

    void cancelar() {
        txtid.setText("");
        combolotes.setSelectedItem("");
        txtamarillo.setText("");
        txtnaranja.setText("");
        txtrojo.setText("");
        txtblanco.setText("");
        txtnegro.setText("");
        txtazul.setText("");
        txtmorado.setText("");
        txtcafe.setText("");
        combolotes.setEnabled(true);
  
    }
 public void cargar_lotes(JComboBox cbox_lotes) {

        try {
            con = conexion.conectarse();
            ps = con.prepareStatement("select id_lote from lotes");
            rs = ps.executeQuery();
            cbox_lotes.addItem("selecciona un lote ya registrado");

            while (rs.next()) {
                cbox_lotes.addItem(rs.getString("id_lote"));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JComboBox<String> combolotes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtamarillo;
    private javax.swing.JTextField txtazul;
    private javax.swing.JTextField txtblanco;
    private javax.swing.JTextField txtcafe;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmorado;
    private javax.swing.JTextField txtnaranja;
    private javax.swing.JTextField txtnegro;
    private javax.swing.JTextField txtrojo;
    // End of variables declaration//GEN-END:variables

    private void setExtendedState(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
