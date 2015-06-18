package GUI;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author Fabian Aguila
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon("C:/Users/FaleTala/Pictures/cine5.jpg");
        JLabel fondo= new JLabel(); fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jButtonAcceder = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonOpc1 = new javax.swing.JButton();
        jButtonCrearUser = new javax.swing.JButton();
        jLabelInicioSesion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelInicioSesion1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/movies.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rut");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");

        jTextFieldUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldUserFocusLost(evt);
            }
        });

        jPasswordFieldContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldContraseñaFocusGained(evt);
            }
        });

        jButtonAcceder.setBackground(new java.awt.Color(153, 255, 153));
        jButtonAcceder.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonAcceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/login_32.png"))); // NOI18N
        jButtonAcceder.setText("Acceder");
        jButtonAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAccederActionPerformed(evt);
            }
        });
        jButtonAcceder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAccederKeyPressed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(255, 204, 204));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cancel_32.png"))); // NOI18N
        jButtonCancelar.setToolTipText("");

        jButtonOpc1.setBackground(new java.awt.Color(51, 51, 0));
        jButtonOpc1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOpc1.setText("¿Olvidaste tu contraseña?");
        jButtonOpc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpc1ActionPerformed(evt);
            }
        });

        jButtonCrearUser.setBackground(new java.awt.Color(0, 51, 0));
        jButtonCrearUser.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCrearUser.setText("Crear una cuenta");
        jButtonCrearUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearUserActionPerformed(evt);
            }
        });

        jLabelInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInicioSesion.setText(" ");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(102, 204, 0));
        jLabel4.setText("Ej: 12345678-9");

        jLabelInicioSesion1.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCrearUser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOpc1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonAcceder))
                                .addComponent(jPasswordFieldContraseña)
                                .addComponent(jTextFieldUser))
                            .addComponent(jLabelInicioSesion1)))
                    .addComponent(jLabelInicioSesion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelInicioSesion1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabelInicioSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAcceder)
                    .addComponent(jButtonCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButtonOpc1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCrearUser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccederActionPerformed
        String rut = jTextFieldUser.getText();
        if (validarRut(rut)) {
            validarAccesoUsuario();
        }else{
            jLabelInicioSesion.setForeground(Color.yellow);
            jLabelInicioSesion.setText("Rut Invalido");
        }
        
    }//GEN-LAST:event_jButtonAccederActionPerformed

    private void jButtonCrearUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearUserActionPerformed
        new RegistrarUsuario().configAccesoRegistro();
        dispose();
    }//GEN-LAST:event_jButtonCrearUserActionPerformed

    private void jButtonOpc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpc1ActionPerformed
        new OlvideContraseña().configOlvideContraseña();
    }//GEN-LAST:event_jButtonOpc1ActionPerformed

    private void jButtonAccederKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAccederKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            validarAccesoUsuario();
        }
    }//GEN-LAST:event_jButtonAccederKeyPressed

    private void jTextFieldUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUserFocusLost
        if(!validarRut(jTextFieldUser.getText()))
        {
            this.jLabelInicioSesion1.setForeground(Color.yellow);
            this.jLabelInicioSesion1.setText("Formato Rut incorrecto");
        }
    }//GEN-LAST:event_jTextFieldUserFocusLost

    private void jTextFieldUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUserFocusGained
        jTextFieldUser.selectAll();
        this.jLabelInicioSesion1.setText(" ");
        this.jLabelInicioSesion.setText(" ");
    }//GEN-LAST:event_jTextFieldUserFocusGained

    private void jPasswordFieldContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseñaFocusGained
        jPasswordFieldContraseña.selectAll();
    }//GEN-LAST:event_jPasswordFieldContraseñaFocusGained

    private boolean validarRut(String rut){
        try
        {
            String[] rut_dv = rut.split("-");
            if (rut_dv.length == 2)
            {
                int rutValor = Integer.parseInt(rut_dv[0]);
                String DV = rut_dv[1].substring(0).toUpperCase();
                char dv = DV.charAt(0);
            
                // Validamos que sea un rut valido según la norma
                int m = 0, s = 1;
                for (; rutValor != 0; rutValor /= 10)
                {
                    s = (s + rutValor % 10 * (9 - m++ % 6)) % 11;
                }
            
                return dv == (char) (s != 0 ? s + 47 : 75);    
            }
            return false;
        }
        catch(NumberFormatException e)
        {
            return false;
        }
        
    }
    
    private void validarAccesoUsuario(){
        String rutDV = jTextFieldUser.getText();
        int usuario = Integer.parseInt(rutDV.substring(0,rutDV.length() - 2));
        char[] password = jPasswordFieldContraseña.getPassword();
        String contraseña = new String(password);
        BLL.Usuario u = new BLL.Usuario().buscarUserUsuario(usuario);
            if(u != null)
            {
                    if (contraseña.equals(u.getContraseña())) 
                    {
                        if (u.getIdTipoUsuario() == 0) 
                        {
                            InterfaceUsuario i = new InterfaceUsuario();
                            i.setVisible(true);
                            i.setLocationRelativeTo(null);
                            i.setTitle("Centro de Control CINEDEMARK");
                            dispose();
                        }
                        else
                        {
                            InterfaceAdmin i = new InterfaceAdmin();
                            i.setVisible(true);
                            i.setLocationRelativeTo(null);
                            i.setTitle("Administración CINEDEMARK");
                            dispose();
                        }
                    }
                    else{this.jLabelInicioSesion.setText("Su contraseña no es válida");}   
            }       
            else{this.jLabelInicioSesion.setText("El usuario no existe");}
    }
    
    public void configAccesoLoginUsuario(){
        Login l = new Login();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        l.setTitle("Login CM");
        l.jTextFieldUser.requestFocus();
        l.setResizable(false);
    }
    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        /*CREAR Y MOSTRAR EL FORMULARIO*/
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login l = new Login();
                l.setVisible(true);
                l.setLocationRelativeTo(null);
                l.setTitle("Login CM");
                l.jTextFieldUser.requestFocus();
                l.setResizable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcceder;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonCrearUser;
    private javax.swing.JButton jButtonOpc1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelInicioSesion;
    private javax.swing.JLabel jLabelInicioSesion1;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
