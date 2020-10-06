/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Conexion;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Brayan
 */
public class Inicio extends javax.swing.JFrame {
 static Login i;
 String usu = Login.txtcorreo.getText();
 String nombre=usu;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion conexion = new Conexion();
 
 
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
       //para mostrar el usuario en el inicio y en la barra de arriba
        usuario();
        //icono del programa 
        setIconImage(new ImageIcon(getClass().getResource("/img/icono_nav.png")).getImage());
        setExtendedState(MAXIMIZED_BOTH);
        timer.start();
    }

      
    public void usuario(){
        try {
            con = conexion.conectarse();
            ps = con.prepareStatement("select nombre_a, apellido_a from administradores where correo_a='"+nombre+"'");
            rs = ps.executeQuery();
            while (rs.next()){
            usu=rs.getString(1);
            String ape=rs.getString("apellido_a");
            i= new Login();
            this.setTitle("BANATEC "+usu);
            this.user.setText(usu+" "+ape);
}
        } catch (Exception e) {
        }
    
    }
 //hora y fecha
    Timer timer = new Timer(1000, new ActionListener() {
         public void actionPerformed(ActionEvent e){
             Calendar cal = new GregorianCalendar();
             int hh, mm, dia, mes, aa;
             hh=cal.get(Calendar.HOUR_OF_DAY);
             mm=cal.get(Calendar.MINUTE);
             
             dia=cal.get(Calendar.DAY_OF_MONTH);
             mes=cal.get(Calendar.MONTH);
             aa=cal.get(Calendar.YEAR);
             
             mes=mes+1;
             
             reloj.setText(hh+":"+mm);
             fechas.setText(dia+"/"+mes+"/"+aa);
                 
         }
         
         });
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/img/fondo_inicio.jpg"));
        Image image = icon.getImage();
        fondo = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        btn_trabajador = new javax.swing.JButton();
        btn_labores = new javax.swing.JButton();
        btn_Lotes = new javax.swing.JButton();
        btncintaje = new javax.swing.JButton();
        btn_cosechas = new javax.swing.JButton();
        btn_asignar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        reloj = new javax.swing.JLabel();
        fechas = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        edad = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        lista_cin = new javax.swing.JMenuItem();
        lista_tra = new javax.swing.JMenuItem();
        admin = new javax.swing.JMenuItem();
        costos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        administador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono.png"))); // NOI18N

        btn_trabajador.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_trabajador.setForeground(new java.awt.Color(255, 255, 255));
        btn_trabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trabajadores_inicio.png"))); // NOI18N
        btn_trabajador.setText("TRABAJADORES");
        btn_trabajador.setAlignmentY(0.0F);
        btn_trabajador.setAutoscrolls(true);
        btn_trabajador.setBorder(null);
        btn_trabajador.setBorderPainted(false);
        btn_trabajador.setContentAreaFilled(false);
        btn_trabajador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_trabajador.setMargin(new java.awt.Insets(1, 8, 1, 8));
        btn_trabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_trabajadorActionPerformed(evt);
            }
        });

        btn_labores.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_labores.setForeground(new java.awt.Color(255, 255, 255));
        btn_labores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/labores.png"))); // NOI18N
        btn_labores.setText("LABORES");
        btn_labores.setAlignmentY(0.0F);
        btn_labores.setAutoscrolls(true);
        btn_labores.setBorder(null);
        btn_labores.setBorderPainted(false);
        btn_labores.setContentAreaFilled(false);
        btn_labores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_labores.setMargin(new java.awt.Insets(1, 8, 1, 8));
        btn_labores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_laboresActionPerformed(evt);
            }
        });

        btn_Lotes.setBackground(new java.awt.Color(255, 255, 255));
        btn_Lotes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_Lotes.setForeground(new java.awt.Color(255, 255, 255));
        btn_Lotes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lotes.png"))); // NOI18N
        btn_Lotes.setText("LOTES");
        btn_Lotes.setAlignmentY(0.0F);
        btn_Lotes.setAutoscrolls(true);
        btn_Lotes.setBorder(null);
        btn_Lotes.setBorderPainted(false);
        btn_Lotes.setContentAreaFilled(false);
        btn_Lotes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Lotes.setMargin(new java.awt.Insets(1, 8, 1, 8));
        btn_Lotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LotesActionPerformed(evt);
            }
        });

        btncintaje.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btncintaje.setForeground(new java.awt.Color(255, 255, 255));
        btncintaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cintaje.png"))); // NOI18N
        btncintaje.setText("CINTAJE");
        btncintaje.setAlignmentY(0.0F);
        btncintaje.setAutoscrolls(true);
        btncintaje.setBorder(null);
        btncintaje.setBorderPainted(false);
        btncintaje.setContentAreaFilled(false);
        btncintaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncintaje.setMargin(new java.awt.Insets(1, 8, 1, 8));
        btncintaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncintajeActionPerformed(evt);
            }
        });

        btn_cosechas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_cosechas.setForeground(new java.awt.Color(255, 255, 255));
        btn_cosechas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cosechas_inicio.png"))); // NOI18N
        btn_cosechas.setText("COSECHAS");
        btn_cosechas.setAlignmentY(0.0F);
        btn_cosechas.setAutoscrolls(true);
        btn_cosechas.setBorder(null);
        btn_cosechas.setBorderPainted(false);
        btn_cosechas.setContentAreaFilled(false);
        btn_cosechas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cosechas.setMargin(new java.awt.Insets(1, 8, 1, 8));
        btn_cosechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cosechasActionPerformed(evt);
            }
        });

        btn_asignar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_asignar.setForeground(new java.awt.Color(255, 255, 255));
        btn_asignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/asignar_labores.png"))); // NOI18N
        btn_asignar.setText("ASIGNAR LABORES");
        btn_asignar.setAlignmentY(0.0F);
        btn_asignar.setAutoscrolls(true);
        btn_asignar.setBorder(null);
        btn_asignar.setBorderPainted(false);
        btn_asignar.setContentAreaFilled(false);
        btn_asignar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_asignar.setMargin(new java.awt.Insets(1, 8, 1, 8));
        btn_asignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asignarActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario_ini.png"))); // NOI18N

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reloj.png"))); // NOI18N

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendario.png"))); // NOI18N

        user.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));

        reloj.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reloj.setForeground(new java.awt.Color(255, 255, 255));

        fechas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fechas.setForeground(new java.awt.Color(255, 255, 255));

        fondo.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fondo.setLayer(btn_trabajador, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fondo.setLayer(btn_labores, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fondo.setLayer(btn_Lotes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fondo.setLayer(btncintaje, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fondo.setLayer(btn_cosechas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fondo.setLayer(btn_asignar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fondo.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fondo.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fondo.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fondo.setLayer(user, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fondo.setLayer(reloj, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fondo.setLayer(fechas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btncintaje, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                        .addGap(89, 89, 89))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btn_asignar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_trabajador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btn_labores, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addGap(52, 52, 52)))
                .addGap(42, 42, 42)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cosechas, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btn_Lotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26)))
                .addGap(75, 75, 75))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(90, 90, 90)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechas, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(7, 7, 7)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(reloj, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncintaje)
                    .addComponent(btn_trabajador)
                    .addComponent(btn_Lotes))
                .addGap(29, 29, 29)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_asignar)
                    .addComponent(btn_labores)
                    .addComponent(btn_cosechas))
                .addGap(89, 89, 89))
        );

        edad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lista.png"))); // NOI18N
        edad.setText("Lista");
        edad.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadActionPerformed(evt);
            }
        });

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trabajadores_barra nav.png"))); // NOI18N
        jMenuItem2.setText("Trabajadores");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        edad.add(jMenuItem2);

        lista_cin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lista_cin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edad_fruta.png"))); // NOI18N
        lista_cin.setText("Edad fruta");
        lista_cin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lista_cinActionPerformed(evt);
            }
        });
        edad.add(lista_cin);

        lista_tra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lista_tra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cosechas_barranav.png"))); // NOI18N
        lista_tra.setText("Cosechas");
        lista_tra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lista_traActionPerformed(evt);
            }
        });
        edad.add(lista_tra);

        admin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin.png"))); // NOI18N
        admin.setText("Administradores");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        edad.add(admin);

        costos.setText("Costos");
        costos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                costosMouseClicked(evt);
            }
        });
        costos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costosActionPerformed(evt);
            }
        });
        edad.add(costos);

        jMenuBar1.add(edad);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/archivo.png"))); // NOI18N
        jMenu1.setText("Archivos");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        administador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        administador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agg_admin.png"))); // NOI18N
        administador.setText("Administradores");
        administador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administadorActionPerformed(evt);
            }
        });
        jMenu1.add(administador);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lista_cinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lista_cinActionPerformed
         Lista_Cintaje cin=new Lista_Cintaje();
       fondo.add(cin);
      cin.show();
      //no dejar mover jframeinternal y maximixar
        try {
        cin.setMaximum(true);
        } catch(PropertyVetoException e) { e.printStackTrace(); }
    }//GEN-LAST:event_lista_cinActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      Lista_Trabajadores lt=new Lista_Trabajadores();
      fondo.add(lt);
      lt.show();
      //no dejar mover jframeinternal y maximixar
        try {
        lt.setMaximum(true);
        } catch(PropertyVetoException e) { e.printStackTrace(); }
                                     
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadActionPerformed
      Lista_Cintaje lc =new Lista_Cintaje();
       fondo.add(lc);
      lc.show();
    }//GEN-LAST:event_edadActionPerformed

    private void lista_traActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lista_traActionPerformed
      Lista_Cosechas lco=new Lista_Cosechas();
       fondo.add(lco);
      lco.show();
      //no dejar mover jframeinternal y maximixar
        try {
        lco.setMaximum(true);
        } catch(PropertyVetoException e) { e.printStackTrace(); }
                                   
    }//GEN-LAST:event_lista_traActionPerformed

    private void administadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administadorActionPerformed
      Administradores admin=new Administradores();
       fondo.add(admin);
      admin.show();
       //no dejar mover jframeinternal y maximixar
      try {
        admin.setMaximum(true);
        } catch(PropertyVetoException e) { e.printStackTrace(); }
      
      
    }//GEN-LAST:event_administadorActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
    Lista_administradores lad=new Lista_administradores();
     fondo.add(lad);
      lad.show();
       //no dejar mover jframeinternal y maximixar
       try {
        lad.setMaximum(true);
        } catch(PropertyVetoException e) { e.printStackTrace(); }
    }//GEN-LAST:event_adminActionPerformed

    private void btn_asignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asignarActionPerformed
        Asignacion asig=new Asignacion();
        fondo.add(asig);
        asig.show();
        //no dejar mover jframeinternal y maximixar
      try {
        asig.setMaximum(true);
        } catch(PropertyVetoException e) { e.printStackTrace(); }
    }//GEN-LAST:event_btn_asignarActionPerformed

    private void btncintajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncintajeActionPerformed
       
        
        Cintaje cin=new Cintaje();
        fondo.add(cin);
        cin.show();
        //no dejar mover jframeinternal y maximixar
        try {
        cin.setMaximum(true);
        } catch(PropertyVetoException e) { e.printStackTrace(); }
    }//GEN-LAST:event_btncintajeActionPerformed

    private void btn_LotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LotesActionPerformed
        Lotes lot =new Lotes();
        fondo.add(lot);
        lot.show();
         //no dejar mover jframeinternal y maximixar
        try {
        lot.setMaximum(true);
        } catch(PropertyVetoException e) { e.printStackTrace(); }
        
    }//GEN-LAST:event_btn_LotesActionPerformed

    private void btn_laboresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_laboresActionPerformed
        Labores lab=new Labores();
        fondo.add(lab);
        lab.show();
        //no dejar mover jframeinternal y maximixar
        try {
        lab.setMaximum(true);
        } catch(PropertyVetoException e) { e.printStackTrace(); }
    }//GEN-LAST:event_btn_laboresActionPerformed

    private void btn_trabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_trabajadorActionPerformed
        Trabajadores tra=new Trabajadores();
        fondo.add(tra);
        tra.show();
        //no dejar mover jframeinternal y maximixar
        try {
        tra.setMaximum(true);
        } catch(PropertyVetoException e) { e.printStackTrace(); }
    }//GEN-LAST:event_btn_trabajadorActionPerformed

    private void btn_cosechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cosechasActionPerformed
        Cosechas cose=new Cosechas();
        fondo.add(cose);
        cose.show();
        //no dejar mover jframeinternal y maximixar
        try {
        cose.setMaximum(true);
        } catch(PropertyVetoException e) { e.printStackTrace(); }
    }//GEN-LAST:event_btn_cosechasActionPerformed

    private void costosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costosActionPerformed
           Costos co= new Costos();
     fondo.add(co);
     co.show();
    }//GEN-LAST:event_costosActionPerformed

    private void costosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_costosMouseClicked
  
    }//GEN-LAST:event_costosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem admin;
    private javax.swing.JMenuItem administador;
    private javax.swing.JButton btn_Lotes;
    private javax.swing.JButton btn_asignar;
    private javax.swing.JButton btn_cosechas;
    private javax.swing.JButton btn_labores;
    private javax.swing.JButton btn_trabajador;
    private javax.swing.JButton btncintaje;
    private javax.swing.JMenuItem costos;
    private javax.swing.JMenu edad;
    private javax.swing.JLabel fechas;
    private javax.swing.JDesktopPane fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem lista_cin;
    private javax.swing.JMenuItem lista_tra;
    private javax.swing.JLabel reloj;
    public static javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
