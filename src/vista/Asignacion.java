/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Conexion;  //importando la conexion
import java.sql.Connection;//importando sql connectin para la conexion a la BD
import java.sql.PreparedStatement;// importando Ps para la preparacion de sentencia 
import java.sql.ResultSet; //importando Rs para la ejecucion de la sentencia 
import java.text.SimpleDateFormat;
import java.util.Date;    //importando la libreria Date
import javax.swing.JComboBox;   //importando combobox para utilizarlo
import javax.swing.JOptionPane; //importando JoptionPane para ejecucion de mensajes
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brayan
 */
public class Asignacion extends javax.swing.JInternalFrame {

    Conexion cn = new Conexion(); //creando un objeto para la conexio
    Connection con;   
    PreparedStatement ps; // aqui se crean las variables que vamos a utilizar
    ResultSet rs;
    DefaultTableModel modelo;

    public Asignacion() {
        initComponents();
        txt_codigo.setEnabled(false);
        listar();
        combo_lote.removeAllItems();
        combo_tra.removeAllItems();                       // aqui se pone todo los componentes que se van a iniciar de primero
        combo_asig.removeAllItems();
        combo_labor.removeAllItems();
        cargar_lotes(combo_lote);
        cargar_trabajadores(combo_tra);
        cargar_asignador(combo_asig);
        cargar_labor(combo_labor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_fin = new javax.swing.JTextField();
        txt_inicio = new javax.swing.JTextField();
        combo_labor = new javax.swing.JComboBox<>();
        combo_lote = new javax.swing.JComboBox<>();
        combo_asig = new javax.swing.JComboBox<>();
        combo_tra = new javax.swing.JComboBox<>();
        txt_costo = new javax.swing.JTextField();
        txt_codigo = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setTitle("Asignacion de Labores");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "COSTO", "TRABAJADOR", "ASIGNADOR", "LOTE", "LABOR", "FECHA INICIO", "FECHA FIN"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("CÓDIGO:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("COSTO:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("TRABAJADOR:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ASIGNADOR:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("LOTE:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("LABOR:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("FECHA INICIO:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("FECHA FIN:");

        txt_fin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_fin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_finKeyTyped(evt);
            }
        });

        txt_inicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_inicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_inicioKeyTyped(evt);
            }
        });

        combo_labor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combo_labor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        combo_lote.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combo_lote.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        combo_asig.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combo_asig.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        combo_tra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combo_tra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_tra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_traActionPerformed(evt);
            }
        });

        txt_costo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_costo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_costoKeyTyped(evt);
            }
        });

        txt_codigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_agregar.png"))); // NOI18N
        btn_guardar.setContentAreaFilled(false);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_actualizar.png"))); // NOI18N
        btn_actualizar.setContentAreaFilled(false);
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_eliminar.png"))); // NOI18N
        btn_eliminar.setContentAreaFilled(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_nuevo.png"))); // NOI18N
        btnnuevo.setContentAreaFilled(false);
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_lote, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_labor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_asig, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_tra, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_costo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_codigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combo_asig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_lote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(combo_labor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_eliminar)
                    .addComponent(btnnuevo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_guardar))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        limpiartxt();
         JOptionPane.showMessageDialog(null, " Los campos se han limpiado correctamente ");
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        actualizar();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        guardar();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.getSelectedRow();
        String codigo = (String) tabla.getValueAt(fila, 0);
        String costo = (String) tabla.getValueAt(fila, 1);
        String tra_it = (String) tabla.getValueAt(fila, 2);
        String asig_it = (String) tabla.getValueAt(fila, 3);                  // se meten los valores seleccionados de la tabla en variables 
        String lote_it = (String) tabla.getValueAt(fila, 4);
        String labor_it = (String) tabla.getValueAt(fila, 5);
        String fec_in = (String) tabla.getValueAt(fila, 6);
        String fec_fin = (String) tabla.getValueAt(fila, 7);

        txt_codigo.setText(codigo);
        txt_costo.setText(costo);
        combo_tra.setSelectedItem(tra_it);
        combo_asig.setSelectedItem(asig_it);
        combo_lote.setSelectedItem(lote_it);
        combo_labor.setSelectedItem(labor_it);
        txt_inicio.setText(fec_in);                                            // se envian los valores de las varibles a los txts
        txt_fin.setText(fec_fin);
        btn_guardar.setEnabled(false);
        txt_codigo.setEnabled(false);


    }//GEN-LAST:event_tablaMouseClicked

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped
        char c = evt.getKeyChar();  //validando que solamente acepte numeros
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_txt_codigoKeyTyped

    private void txt_costoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_costoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_costoKeyTyped

    private void combo_traActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_traActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_traActionPerformed

    private void txt_inicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_inicioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inicioKeyTyped

    private void txt_finKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_finKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_finKeyTyped

    public void cargar_lotes(JComboBox cbox_lotes) {

        try {
            con = cn.conectarse();
            ps = con.prepareStatement("select id_lote from lotes");
            rs = ps.executeQuery();
            cbox_lotes.addItem("Selecciona un lote ");

            while (rs.next()) {
                cbox_lotes.addItem(rs.getString("id_lote"));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void cargar_labor(JComboBox cbox_labor) {

        try {
            con = cn.conectarse();
            ps = con.prepareStatement("select id_labor from labores");
            rs = ps.executeQuery();
            cbox_labor.addItem("Selecciona una labor ");

            while (rs.next()) {
                cbox_labor.addItem(rs.getString("id_labor"));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void cargar_trabajadores(JComboBox cbox_tra) {

        try {
            con = cn.conectarse();
            ps = con.prepareStatement("select cedula_tra from trabajadores");
            rs = ps.executeQuery();
            cbox_tra.addItem("Selecciona un trabajador ");

            while (rs.next()) {
                cbox_tra.addItem(rs.getString("cedula_tra"));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void cargar_asignador(JComboBox cbox_asig) {

        try {
            con = cn.conectarse();
            ps = con.prepareStatement("select cedula_admin from administradores");
            rs = ps.executeQuery();
            cbox_asig.addItem("Selecciona un asignador");

            while (rs.next()) {
                cbox_asig.addItem(rs.getString("cedula_admin"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    void listar() {

        try {
            con = cn.conectarse();
            ps = con.prepareStatement("select * from asignacion");
            rs = ps.executeQuery();            // ejercutamos la consulta

            Object[] labor = new Object[8];
            modelo = (DefaultTableModel) tabla.getModel();
            while (rs.next()) {
                labor[0] = rs.getString("id_asig");
                labor[1] = rs.getString("costo");
                labor[2] = rs.getString("trabajador");
                labor[3] = rs.getString("asignador");
                labor[4] = rs.getString("lote");                       // agregamos los resultados de la consulta a la tabla.
                labor[5] = rs.getString("labor");
                labor[6] = rs.getString("f_inicio");
                labor[7] = rs.getString("f_fin");
                modelo.addRow(labor);

            }

        } catch (Exception e) {
             // saldra este mensaje si lo anterior falla
                JOptionPane.showMessageDialog(null, " Error ");
        }

    }

    void guardar() {
    
        String costo = txt_costo.getText();
        String trabajador = (String) combo_tra.getSelectedItem();
        String asignador = (String) combo_asig.getSelectedItem();        // se meten los valores de los txts en variables
        String lote = (String) combo_lote.getSelectedItem();
        String labor = (String) combo_labor.getSelectedItem();
        String inicio = txt_inicio.getText();
        String fin = txt_fin.getText();
        if ( costo.equals("") || trabajador.equals("") || asignador.equals("") || lote.equals("") || labor.equals("") || inicio.equals("") || fin.equals("")) {
            JOptionPane.showMessageDialog(null, " Los campos deben estar todos llenos ");
        //aqui se valida que ningun campó este vacio
        } else {
            try {
                
                 // si no hay campos vacios se insertan los datos en la tabla de administradores
                con = cn.conectarse(); 
                ps = con.prepareStatement("insert into asignacion (costo,trabajador,asignador,lote,labor,f_inicio,f_fin) values('" + costo + "','" + trabajador + "','" + asignador + "','" + lote + "','" + labor + "','" + inicio + "','" + fin + "')");
                ps.executeUpdate();   // se ejecuta la consulta
                JOptionPane.showMessageDialog(null, "asignacion agregada correctamente"); 
                limpiarTabla();
                limpiartxt();
                listar();
            } catch (Exception e) {
                // saldra este mensaje si lo anterior falla
                JOptionPane.showMessageDialog(null, " Error ");
            }
        }
    }

    void actualizar() {

        String codigo = txt_codigo.getText();
        String costo = txt_costo.getText();
        String trabajador = (String) combo_tra.getSelectedItem(); // se meten los valores de los txts en variables
        String asignador = (String) combo_asig.getSelectedItem(); 
        String lote = (String) combo_lote.getSelectedItem();
        String labor = (String) combo_labor.getSelectedItem();
        String inicio = txt_inicio.getText();
        String fin = txt_fin.getText();
      if (codigo.equals("") || costo.equals("") || trabajador.equals("") || asignador.equals("") || lote.equals("") || labor.equals("") || inicio.equals("") || fin.equals("")) {
            JOptionPane.showMessageDialog(null, " Los campos deben estar todos llenos ");
            //aqui se valida que ningun campó este vacio
      
      } else {
        try {
            con = cn.conectarse();
            ps = con.prepareStatement("update asignacion set  costo='" + costo + "',trabajador='" + trabajador + "',asignador='" + asignador + "',lote='" + lote + "',labor='" + labor + "',f_inicio='" + inicio + "',f_fin='" + fin + "' where id_asig='" + codigo + "'");
            ps.executeUpdate(); // ejecuta la consulta
            JOptionPane.showMessageDialog(null, "se actualizo correctamente");
            limpiarTabla();                      // luego limpia los txts
            limpiartxt();                    
            listar();                           // enlista de nuevo para ver los cambios
        } catch (Exception e) {
        
              // saldra este mensaje si lo anterior falla
                JOptionPane.showMessageDialog(null, " Error ");
            JOptionPane.showMessageDialog(null, e);
        }

        } 
    }

    public void eliminar() {// creacion de metodo eliminar 
        String codigo = txt_codigo.getText();
         int opc = JOptionPane.showConfirmDialog(null, "¿Realmente quiere eliminar una asignación? "); // mensaje de opcion 
        if (opc == JOptionPane.YES_OPTION) { // si la opcion es si el procede a elimar un ADMIN
    
        
        try {
            con = cn.conectarse();
            ps = con.prepareStatement("delete from asignacion where id_asig='" + codigo + "'");
            ps.executeUpdate();   // ejecuta la consulta
            JOptionPane.showMessageDialog(null, "Se elimino correctamente");
            limpiarTabla();    
            limpiartxt();  //  despues limpiar los txt
            listar();   // mostrar lo que hemos agregado 

            btn_guardar.setEnabled(true);

        } catch (Exception e) {  // en caso de que haya un error muestra este mensaje
            JOptionPane.showMessageDialog(null, " Eror ");
            JOptionPane.showMessageDialog(null, e);
        }
        }
           if (opc == JOptionPane.NO_OPTION) {  // si la opcino es no, muestra ese mensaje 
            JOptionPane.showMessageDialog(null, " NO se pudo eliminar");
        }
        if (opc == JOptionPane.CANCEL_OPTION) { // si la opcino es cancelar, muestra ese mensaje 
            JOptionPane.showMessageDialog(null, "Se ha cancelado  ");
        }
    }

    void limpiartxt() {// creacion de metodo de limpiar los txt   
        txt_codigo.setText("");
        txt_costo.setText("");
        combo_tra.setSelectedIndex(0);
        combo_asig.setSelectedIndex(0);         //mostrando txt limpios
        combo_lote.setSelectedIndex(0);
        combo_labor.setSelectedIndex(0);
        txt_inicio.setText("");
        txt_fin.setText("");             
        btn_guardar.setEnabled(true);             // despues de impiar los txt  se habilita el boton guardar

    }

    private void limpiarTabla() {

        for (int i = 0; i < tabla.getRowCount(); i++) {      // este for recorre la tabla y va eliminando lo que haya en ella
            modelo.removeRow(i);
            i -= 1;

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JComboBox<String> combo_asig;
    private javax.swing.JComboBox<String> combo_labor;
    private javax.swing.JComboBox<String> combo_lote;
    private javax.swing.JComboBox<String> combo_tra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextField txt_fin;
    private javax.swing.JTextField txt_inicio;
    // End of variables declaration//GEN-END:variables
}
