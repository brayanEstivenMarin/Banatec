
package vista;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import controlador.Conexion;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Login extends javax.swing.JFrame {

  
    Conexion conexion= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
      public Login() {    
    
          initComponents();
        setLocationRelativeTo(null); //Centra la vantana en la pantalla
        //
        Shape forma = new RoundRectangle2D.Double(0, 0, getBounds().width, getBounds().height, 20, 20);
        AWTUtilities.setWindowShape(this, forma);
       
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btniniciar = new javax.swing.JButton();
        txtcorreo = new javax.swing.JTextField();
        pswcontra = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btncerrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/fondo_login.jpg"));
        Image image = icon.getImage();
        fondo_login = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(33, 45, 62));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Iniciar Sesión");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 275, 53));

        jLabel4.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CORREO ELECTRÓNICO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTRASEÑA");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        btniniciar.setBackground(new java.awt.Color(73, 181, 172));
        btniniciar.setFont(new java.awt.Font("Gotham Extra Light", 0, 18)); // NOI18N
        btniniciar.setForeground(new java.awt.Color(255, 255, 255));
        btniniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ingresar.png"))); // NOI18N
        btniniciar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btniniciar.setContentAreaFilled(false);
        btniniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btniniciar.setFocusPainted(false);
        btniniciar.setFocusable(false);
        btniniciar.setRequestFocusEnabled(false);
        btniniciar.setVerifyInputWhenFocusTarget(false);
        btniniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarActionPerformed(evt);
            }
        });
        jPanel2.add(btniniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 200, -1));

        txtcorreo.setBackground(new java.awt.Color(33, 45, 62));
        txtcorreo.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txtcorreo.setForeground(new java.awt.Color(73, 181, 172));
        txtcorreo.setBorder(null);
        txtcorreo.setCaretColor(new java.awt.Color(73, 181, 172));
        jPanel2.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 270, 40));

        pswcontra.setBackground(new java.awt.Color(33, 45, 62));
        pswcontra.setFont(pswcontra.getFont().deriveFont(pswcontra.getFont().getSize()+7f));
        pswcontra.setForeground(new java.awt.Color(73, 181, 172));
        pswcontra.setBorder(null);
        pswcontra.setCaretColor(new java.awt.Color(73, 181, 172));
        pswcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswcontraActionPerformed(evt);
            }
        });
        jPanel2.add(pswcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 270, 36));

        jSeparator1.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator1.setForeground(new java.awt.Color(73, 181, 172));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 310, 10));

        jSeparator2.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator2.setForeground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 310, 10));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mail.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 226, 30, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/contra.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 40));

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        btncerrar.setBorder(null);
        btncerrar.setBorderPainted(false);
        btncerrar.setContentAreaFilled(false);
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        jPanel2.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 30, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("¿Olvidaste tu contraseña? ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 154, 146));
        jButton1.setText("Restablecer");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 80, 20));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimiz.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 30, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 400, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono.png"))); // NOI18N

        fondo_login.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout fondo_loginLayout = new javax.swing.GroupLayout(fondo_login);
        fondo_login.setLayout(fondo_loginLayout);
        fondo_loginLayout.setHorizontalGroup(
            fondo_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondo_loginLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(38, 38, 38))
        );
        fondo_loginLayout.setVerticalGroup(
            fondo_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo_loginLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel1)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        getContentPane().add(fondo_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pswcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswcontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswcontraActionPerformed

    private void btniniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarActionPerformed
         try {
            con = conexion.conectarse();
            ps=con.prepareStatement("Select * from administradores where correo_a=? and contraseña=?");
            ps.setString(1,txtcorreo.getText());
            ps.setString(2,pswcontra.getText());
            
            rs=ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null,"BIENVENIDO");
                Inicio inicio=new Inicio();
                inicio.setVisible(true);
                this.setVisible(false);

            }else{
                JOptionPane.showMessageDialog(null,"USUARIO O CONTRASEÑA INCORRECTA");
                txtcorreo.setText("");
                pswcontra.setText("");
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_btniniciarActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        System.exit( 0 );
    }//GEN-LAST:event_btncerrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 this.setExtendedState(ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
                                           

            

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
            java.util.logging.Logger.getLogger(vista.Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista.Login().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btniniciar;
    private javax.swing.JDesktopPane fondo_login;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField pswcontra;
    private javax.swing.JTextField txtcorreo;
    // End of variables declaration//GEN-END:variables
}
