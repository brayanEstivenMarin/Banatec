package vista;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cosechas extends javax.swing.JInternalFrame {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel modelo;

    public Cosechas() {

        initComponents();
        listar();
        txt_fecha.setText(fecha_actual());
        cargar_lotes(combolotes);
        txt_codigo.setEnabled(false);

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        combolotes = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        jLabel5.setText("jLabel5");

        setClosable(true);
        setTitle("Cosechas");
        setPreferredSize(new java.awt.Dimension(1370, 677));
        setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel1.setText("CÓDIGO:");

        txt_codigo.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel2.setText("LOTES:");

        combolotes.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel4.setText("FECHA:");

        txt_fecha.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txt_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechaActionPerformed(evt);
            }
        });

        btn_guardar.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_agregar.png"))); // NOI18N
        btn_guardar.setContentAreaFilled(false);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_actualizar.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_actualizar.png"))); // NOI18N
        btn_actualizar.setContentAreaFilled(false);
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_eliminar.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(239, 12, 19));
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_eliminar.png"))); // NOI18N
        btn_eliminar.setContentAreaFilled(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_nuevo.png"))); // NOI18N
        btn_cancelar.setContentAreaFilled(false);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel3.setText("CANTIDAD:");

        txt_cantidad.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txt_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cantidadKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(combolotes, 0, 198, Short.MAX_VALUE)
                                .addComponent(txt_codigo)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combolotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_guardar)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_cancelar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tabla.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "LOTE", "CANTIDAD", "FECHA"
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
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        guardar();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        actualizar();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        limpiartxt();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void txt_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.getSelectedRow();
        String codigo = (String) tabla.getValueAt(fila, 0);
        String lote = (String) tabla.getValueAt(fila, 1);
        String cantidad = (String) tabla.getValueAt(fila, 2);
        String fecha = (String) tabla.getValueAt(fila, 3);
        txt_codigo.setText(codigo);
        txt_fecha.setText(fecha);
        txt_cantidad.setText(cantidad);
        btn_guardar.setEnabled(false);
        txt_codigo.setEnabled(false);
    }//GEN-LAST:event_tablaMouseClicked

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoKeyTyped

    private void txt_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadKeyTyped

    public static String fecha_actual() {
        Date hoy = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("YYYY/MM/dd");
        return formato.format(hoy);

    }

    public void cargar_lotes(JComboBox cbox_lotes) {

        try {
            con = cn.conectarse();
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

    void limpiartxt() {
        txt_codigo.setText("");
        txt_cantidad.setText("");
        combolotes.setSelectedIndex(0);
        btn_guardar.setEnabled(true);

    }

    private void limpiarTabla() {

        for (int i = 0; i < tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;

        }
    }

    void listar() {

        try {
            con = cn.conectarse();
            ps = con.prepareStatement("select * from cosechas");
            rs = ps.executeQuery();

            Object[] labor = new Object[4];
            modelo = (DefaultTableModel) tabla.getModel();
            while (rs.next()) {
                labor[0] = rs.getString("id_cosecha");
                labor[1] = rs.getString("lote");
                labor[2] = rs.getString("cantidad");
                labor[3] = rs.getString("fecha");
                modelo.addRow(labor);

            }

        } catch (Exception e) {
        }

    }

    void guardar() {
        String codigo = txt_codigo.getText();
        String fecha = txt_fecha.getText();
        String cantidad = txt_cantidad.getText();
        String lote = (String) combolotes.getSelectedItem();
        try {
            con = cn.conectarse();
            ps = con.prepareStatement("insert into cosechas (lote,cantidad,fecha)values('" + lote + "','" + cantidad + "','" + fecha + "')");
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cosecha agregada correctamente");
            limpiarTabla();
            limpiartxt();
            listar();
        } catch (Exception e) {
        }
    }

    void actualizar() {
        String codigo = txt_codigo.getText();
        String lotes = (String) combolotes.getSelectedItem();
        String cantidad = txt_cantidad.getText();
        String fecha = txt_fecha.getText();
        if (cantidad.equals("") || fecha.equals("") || lotes.equals("")) {
            JOptionPane.showMessageDialog(null, "todos los campos deben estar llenos");
        } else {

            try {
                con = cn.conectarse();
                ps = con.prepareStatement("UPDATE cosechas SET lote='" + lotes + "',cantidad='" + cantidad + "',fecha='" + fecha + "' where id_cosecha='" + codigo + "'");
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "se actualizo correctamente");
                limpiarTabla();
                limpiartxt();
                listar();
                btn_guardar.setEnabled(true);

            } catch (Exception e) {
            }

        }
    }

    void eliminar() {

        String codigo = txt_codigo.getText();
        int opc = JOptionPane.showConfirmDialog(null, " ¿Realmente quieres elimiar una cosecha? ");
        if (opc == JOptionPane.YES_OPTION) {
            try {
                con = cn.conectarse();
                ps = con.prepareStatement("delete from cosechas where id_cosecha='" + codigo + "'");
                ps.executeUpdate();
                limpiarTabla();
                limpiartxt();
                listar();
                JOptionPane.showMessageDialog(null, " Cosecha eliminada ");
                btn_guardar.setEnabled(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, " Error ");

            }
           
        }
        if(opc==JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, " NO se pudo elimanr");
        } 
        if(opc==JOptionPane.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null, " Cancelado");
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JComboBox<String> combolotes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_fecha;
    // End of variables declaration//GEN-END:variables
}
