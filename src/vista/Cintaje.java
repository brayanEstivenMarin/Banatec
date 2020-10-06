/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Conexion;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

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
        txtid.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btn_guardar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        grafica = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1370, 677));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("ID:");

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("LOTE:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/amarillo.png"))); // NOI18N
        jLabel2.setText("AMARILLO:");

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/naranja.png"))); // NOI18N
        jLabel3.setText("NARANJA:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rojo.png"))); // NOI18N
        jLabel4.setText("ROJO:");

        txtrojo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrojoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blanco.png"))); // NOI18N
        jLabel5.setText("BLANCO:");

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/negro.png"))); // NOI18N
        jLabel6.setText("NEGRO:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cafe.png"))); // NOI18N
        jLabel9.setText("CAFE:");

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

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/morado.png"))); // NOI18N
        jLabel8.setText("MORADO:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/azul.png"))); // NOI18N
        jLabel7.setText("AZUL:");

        txtazul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtazulKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combolotes, javax.swing.GroupLayout.Alignment.TRAILING, 0, 145, Short.MAX_VALUE)
                            .addComponent(txtid, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnegro, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(txtblanco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtrojo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtcafe, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtmorado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtazul, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtnaranja, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtamarillo))))
                .addGap(63, 63, 63))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combolotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtamarillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnaranja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtazul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmorado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtcafe))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtblanco)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnegro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        tabla.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_agregar.png"))); // NOI18N
        btn_guardar.setContentAreaFilled(false);
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_actualizar.png"))); // NOI18N
        btn_actualizar.setContentAreaFilled(false);
        btn_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_eliminar.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_nuevo.png"))); // NOI18N
        btnnuevo.setContentAreaFilled(false);
        btnnuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        grafica.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        grafica.setForeground(new java.awt.Color(51, 51, 255));
        grafica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_grafica.png"))); // NOI18N
        grafica.setToolTipText("");
        grafica.setContentAreaFilled(false);
        grafica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(grafica, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(184, 184, 184)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(btnnuevo)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_guardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(grafica, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        txtid.setEnabled(false);
        btn_guardar.setEnabled(false);
        int fila = tabla.getSelectedRow();
        String id = (String) tabla.getValueAt(fila, 0);
        String lote = (String) tabla.getValueAt(fila, 1);
        String co1 = (String) tabla.getValueAt(fila, 2);
        String co2 = (String) tabla.getValueAt(fila, 3);
        String co3 = (String) tabla.getValueAt(fila, 4);
        String co4 = (String) tabla.getValueAt(fila, 5);
        String co5 = (String) tabla.getValueAt(fila, 6);
        String co6 = (String) tabla.getValueAt(fila, 7);
        String co7 = (String) tabla.getValueAt(fila, 8);
        String co8 = (String) tabla.getValueAt(fila, 9);
        String total = (String) tabla.getValueAt(fila, 10);
        txtid.setText("" + id);
        combolotes.setSelectedItem(lote);
        txtamarillo.setText(co1);
        txtnaranja.setText(co2);
        txtazul.setText(co3);
        txtmorado.setText(co4);
        txtcafe.setText(co5);
        txtrojo.setText(co6);
        txtblanco.setText(co7);
        txtnegro.setText(co8);


    }//GEN-LAST:event_tablaMouseClicked

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        cancelar();
        JOptionPane.showMessageDialog(null, " Los campos se han limpiado correctamente ");
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        eliminar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        actualizar();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        agregar();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txtazulKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtazulKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txtazulKeyTyped

    private void txtmoradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmoradoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txtmoradoKeyTyped

    private void txtcafeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcafeKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txtcafeKeyTyped

    private void txtnegroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnegroKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txtnegroKeyTyped

    private void txtblancoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtblancoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txtblancoKeyTyped

    private void txtrojoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrojoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txtrojoKeyTyped

    private void txtnaranjaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnaranjaKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txtnaranjaKeyTyped

    private void txtamarilloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtamarilloKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_txtamarilloKeyTyped

    private void txtamarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtamarilloActionPerformed

    }//GEN-LAST:event_txtamarilloActionPerformed

    private void combolotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combolotesActionPerformed

    }//GEN-LAST:event_combolotesActionPerformed

    private void txtidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_txtidKeyTyped

    private void graficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficaActionPerformed
//grafica

        JFreeChart grafico = null;
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        int dato1 = Integer.parseInt(txtamarillo.getText());
        int dato2 = Integer.parseInt(txtnaranja.getText());
        int dato3 = Integer.parseInt(txtazul.getText());
        int dato4 = Integer.parseInt(txtmorado.getText());
        int dato5 = Integer.parseInt(txtcafe.getText());
        int dato6 = Integer.parseInt(txtblanco.getText());
        int dato7 = Integer.parseInt(txtnegro.getText());
        datos.addValue(dato1, "Grafica 1", "Amarillo");
        datos.addValue(dato2, "Grafica 1", "Naranja");
        datos.addValue(dato3, "Grafica 1", "Azul");
        datos.addValue(dato4, "Grafica 1", "Morado");
        datos.addValue(dato5, "Grafica 1", "Cafe");
        datos.addValue(dato6, "Grafica 1", "Blanco");
        datos.addValue(dato7, "Grafica 1", "CNegro");
        grafico = ChartFactory.createBarChart("Banatec", "Eje X", "Eje Y", datos, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel cPanel = new ChartPanel(grafico);
        JFrame informacion = new JFrame("Grafica");
        informacion.getContentPane().add(cPanel);
        informacion.pack();
        informacion.setVisible(true);

    }//GEN-LAST:event_graficaActionPerformed

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
                arreglo[10] = rs.getString("total");
                defaul.addRow(arreglo);
            }
            tabla.setModel(defaul);
        } catch (Exception e) {
        }
    }

    void agregar() {

        String lote = (String) combolotes.getSelectedItem();
        int amarillo = Integer.parseInt(txtamarillo.getText());
        int naranja = Integer.parseInt(txtnaranja.getText());
        int rojo = Integer.parseInt(txtrojo.getText());
        int blanco = Integer.parseInt(txtblanco.getText());
        int negro = Integer.parseInt(txtnegro.getText());
        int azul = Integer.parseInt(txtazul.getText());
        int morado = Integer.parseInt(txtmorado.getText());
        int cafe = Integer.parseInt(txtcafe.getText());
        int total = amarillo + naranja + rojo + blanco + negro + azul + morado + cafe;

        try {
            ps = con.prepareStatement("INSERT INTO cintaje (lote,amarillo,naranja,rojo,blanco,negro,azul,morado,cafe,total) VALUES('" + lote + "','" + amarillo + "','" + naranja + "','" + rojo + "','" + blanco + "','" + negro + "','" + azul + "','" + morado + "','" + cafe + "','" + total + "')");
            ps.executeUpdate();
            limpiar();
            lista();
            cancelar();
            JOptionPane.showMessageDialog(null, "SE HA AGREGADO CORRECTAMENTE");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR");

        }

    }

    void sumar() {

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
                JOptionPane.showMessageDialog(null, "Actualizado correctamente");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        }

    }

    void eliminar() {
        String id = txtid.getText();

        int opc = JOptionPane.showConfirmDialog(null, " ¿Realmente quieres eliminar? ");
        if (opc == JOptionPane.YES_OPTION) {
            try {
                ps = con.prepareStatement("DELETE FROM cintaje where id_encintaje='" + id + "'");
                ps.executeUpdate();
                limpiar();
                lista();
                cancelar();
                JOptionPane.showMessageDialog(null, "Eliminado correctamente");

                btn_guardar.setEnabled(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        }
        if (opc == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, " NO se pudo eliminar");
        }
        if (opc == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Se ha cancelado la operacion ");
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
        btn_guardar.setEnabled(true);
        combolotes.setSelectedIndex(0);

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
    private javax.swing.JButton grafica;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
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
