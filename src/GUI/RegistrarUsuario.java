package GUI;

import BLL.Sucursal;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Fabian Aguila
 */
public class RegistrarUsuario extends javax.swing.JFrame {

    public RegistrarUsuario() {
        initComponents();
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon("src/Image/cine5.jpg");
        JLabel fondo= new JLabel(); fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelApellido = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        jLabelConfirmarContraseña = new javax.swing.JLabel();
        jLabelRut = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldRut = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jPasswordFieldConfContraseña = new javax.swing.JPasswordField();
        jButtonRegistrarUsuario = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonLimpiarFormulario = new javax.swing.JButton();
        jLabelBanner = new javax.swing.JLabel();
        jlblEstadoContraseña = new javax.swing.JLabel();
        jlblEstadoRut = new javax.swing.JLabel();
        jlblEstadoContraseñasIguales = new javax.swing.JLabel();
        jLabelValidarEmail = new javax.swing.JLabel();
        jLabelSucursal = new javax.swing.JLabel();
        jComboBoxSucursal = new javax.swing.JComboBox();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelApellido.setBackground(new java.awt.Color(255, 255, 255));
        jLabelApellido.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelApellido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApellido.setText("Apellido");

        jLabelContraseña.setBackground(new java.awt.Color(255, 255, 255));
        jLabelContraseña.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContraseña.setText("Contraseña");

        jLabelConfirmarContraseña.setBackground(new java.awt.Color(255, 255, 255));
        jLabelConfirmarContraseña.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelConfirmarContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConfirmarContraseña.setText("Confirma contraseña");

        jLabelRut.setBackground(new java.awt.Color(255, 255, 255));
        jLabelRut.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelRut.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRut.setText("Rut");

        jLabelNombre.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre");

        jLabelEmail.setBackground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("Email");

        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyTyped(evt);
            }
        });

        jTextFieldRut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldRutFocusLost(evt);
            }
        });
        jTextFieldRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldRutKeyTyped(evt);
            }
        });

        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jTextFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldEmailFocusLost(evt);
            }
        });
        jTextFieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEmailKeyTyped(evt);
            }
        });

        jPasswordFieldContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldContraseñaFocusLost(evt);
            }
        });
        jPasswordFieldContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFieldContraseñaKeyTyped(evt);
            }
        });

        jPasswordFieldConfContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldConfContraseñaFocusLost(evt);
            }
        });
        jPasswordFieldConfContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFieldConfContraseñaKeyTyped(evt);
            }
        });

        jButtonRegistrarUsuario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonRegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/registrar2424.png"))); // NOI18N
        jButtonRegistrarUsuario.setText("Registrar");
        jButtonRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarUsuarioActionPerformed(evt);
            }
        });
        jButtonRegistrarUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonRegistrarUsuarioKeyPressed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close2424.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");

        jButtonLimpiarFormulario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonLimpiarFormulario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/recycle2424.png"))); // NOI18N
        jButtonLimpiarFormulario.setText("Limpiar Formulario");
        jButtonLimpiarFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarFormularioActionPerformed(evt);
            }
        });

        jLabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/movies.png"))); // NOI18N

        jlblEstadoContraseña.setText(" ");

        jlblEstadoRut.setText(" ");

        jlblEstadoContraseñasIguales.setText(" ");

        jLabelValidarEmail.setText(" ");

        jLabelSucursal.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSucursal.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelSucursal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSucursal.setText("Sucursal");

        jComboBoxSucursal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxSucursalFocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelBanner)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonLimpiarFormulario)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlblEstadoContraseña)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRut, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelContraseña, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelConfirmarContraseña, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelSucursal, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldEmail)
                            .addComponent(jTextFieldApellido)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jPasswordFieldConfContraseña)
                            .addComponent(jPasswordFieldContraseña)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldRut, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlblEstadoRut))
                            .addComponent(jComboBoxSucursal, 0, 169, Short.MAX_VALUE)))
                    .addComponent(jlblEstadoContraseñasIguales)
                    .addComponent(jLabelValidarEmail)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelBanner)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabelRut))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblEstadoRut)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabelContraseña))
                    .addComponent(jPasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jlblEstadoContraseña)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabelConfirmarContraseña))
                    .addComponent(jPasswordFieldConfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jlblEstadoContraseñasIguales)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelApellido)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabelEmail))
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabelValidarEmail)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSucursal)
                    .addComponent(jComboBoxSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButtonRegistrarUsuario)
                .addGap(11, 11, 11)
                .addComponent(jButtonCancelar)
                .addGap(11, 11, 11)
                .addComponent(jButtonLimpiarFormulario)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarUsuarioActionPerformed
        registrarUsuarios();
    }//GEN-LAST:event_jButtonRegistrarUsuarioActionPerformed

    private void jButtonRegistrarUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonRegistrarUsuarioKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            registrarUsuarios();
        }
    }//GEN-LAST:event_jButtonRegistrarUsuarioKeyPressed

    private void jTextFieldRutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldRutFocusLost
        if(validarRut())
        {
            this.jlblEstadoRut.setForeground(Color.white);
            this.jlblEstadoRut.setText("Rut válido");
        }
        else
        {
            this.jlblEstadoRut.setForeground(Color.yellow);
            this.jlblEstadoRut.setText("Rut Inválido");
        }
    }//GEN-LAST:event_jTextFieldRutFocusLost

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new Login().configAccesoLoginUsuario();
    }//GEN-LAST:event_formWindowClosing

    private void jButtonLimpiarFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarFormularioActionPerformed
        ReestablecerFormularioRegistroDeUsuario();
    }//GEN-LAST:event_jButtonLimpiarFormularioActionPerformed

    private void jPasswordFieldConfContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldConfContraseñaFocusLost
        validarIgualdadContraseñas();
    }//GEN-LAST:event_jPasswordFieldConfContraseñaFocusLost

    private void jTextFieldRutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRutKeyTyped
        char caracter = evt.getKeyChar();
        if(! (Character.isDigit(caracter) || caracter == KeyEvent.VK_MINUS
            || caracter == 'k' || caracter == 'K'))
        {
            evt.consume();
        }
        if (jTextFieldRut.getText().contains("-"))
        {
            if(! (Character.isDigit(caracter) || caracter == 'k' || caracter == 'K'))
            {
                evt.consume();
            }
        }
        if (jTextFieldRut.getText().contains("k"))
        {
            evt.consume();
        }
        if (this.jTextFieldRut.getText().length() == 12)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldRutKeyTyped

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        char caracter = evt.getKeyChar();
        if (! (Character.isLetter(caracter) || caracter == KeyEvent.VK_SPACE))
        {
            evt.consume();
        }
        if (this.jTextFieldNombre.getText().length() == 30)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEmailFocusLost
        if (validarEmail(jTextFieldEmail.getText()))
        {
            this.jLabelValidarEmail.setForeground(Color.white);
            this.jLabelValidarEmail.setText("Email válido");
        }
        else
        {
            this.jLabelValidarEmail.setForeground(Color.yellow);
            this.jLabelValidarEmail.setText("Email Inválido");
        }
    }//GEN-LAST:event_jTextFieldEmailFocusLost

    private void jPasswordFieldContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseñaFocusLost
       validarContraseñaLetrasyNumeros();
    }//GEN-LAST:event_jPasswordFieldContraseñaFocusLost

    private void jTextFieldApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyTyped
        char caracter = evt.getKeyChar();
        if (! (Character.isLetter(caracter) || caracter == KeyEvent.VK_SPACE))
        {
            evt.consume();
        }
        if (this.jTextFieldApellido.getText().length() == 30)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldApellidoKeyTyped

    private void jPasswordFieldContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseñaKeyTyped
        if (this.jPasswordFieldContraseña.getPassword().length == 30)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jPasswordFieldContraseñaKeyTyped

    private void jPasswordFieldConfContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldConfContraseñaKeyTyped
        if (this.jPasswordFieldConfContraseña.getPassword().length == 30)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jPasswordFieldConfContraseñaKeyTyped

    private void jTextFieldEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailKeyTyped
        if (this.jTextFieldEmail.getText().length() == 50)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldEmailKeyTyped

    private void jComboBoxSucursalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxSucursalFocusGained
        
    }//GEN-LAST:event_jComboBoxSucursalFocusGained

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarListadoSucursales();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed
    
    private boolean validarIgualdadContraseñas(){
        char[] pw1 = jPasswordFieldContraseña.getPassword();
        char[] pw2 = jPasswordFieldConfContraseña.getPassword();
        String pass1 = new String(pw1);
        String pass2 = new String(pw2);
        if (pass1.equals("") || pass2.equals("")) 
        {
            jlblEstadoContraseñasIguales.setForeground(Color.yellow);
            jlblEstadoContraseñasIguales.setText("Campo(s) vacio(s)");
            return false;
        }
        else 
        {
            if (pass1.equals(pass2))
            {
                jlblEstadoContraseñasIguales.setForeground(Color.white);
                jlblEstadoContraseñasIguales.setText("Ok");
                return true;
            } 
            else 
            {
                if(pass2.length() < 6)
                {       
                jlblEstadoContraseñasIguales.setForeground(Color.yellow);
                jlblEstadoContraseñasIguales.setText("minimo 6 caracteres");
                return false;
                }
                else
                {
                jlblEstadoContraseñasIguales.setForeground(Color.yellow);
                jlblEstadoContraseñasIguales.setText("Las contraseñas no coinciden");
                return false;
                }    
            }
        }
    }
    
    private void registrarUser(){
        try
        {
            /* caputa rut*/
            String rutDV = this.jTextFieldRut.getText();
            int rut = Integer.parseInt(rutDV.substring(0,rutDV.length() - 2));
            /*captura de contraseña*/
            char[] pw = this.jPasswordFieldContraseña.getPassword();
            String contraseña = new String(pw);
            if (contraseña.length() == 0)
            {
                contraseña = null;
            } 
            /*captura nombre*/
            String nombre = this.jTextFieldNombre.getText().trim();
            if(nombre.length() == 0)
            {
                nombre = null;
            }
            /* captura apellido*/
            String apellido = this.jTextFieldApellido.getText();
            if(apellido.length() == 0)
            {
                apellido = null;
            }
            /*captura de Email*/
            String email = this.jTextFieldEmail.getText().trim();
            if(email.length() == 0)
            {
                email = null;
            }
            String sucursal = jComboBoxSucursal.getSelectedItem().toString();

            int resultado = new BLL.Usuario().registrarUsuarioBLL(rut, contraseña, nombre, apellido, email, sucursal);
            switch(resultado)
            {
                case 1: JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente", "Registros", JOptionPane.INFORMATION_MESSAGE);
                            this.dispose();
                            new Login().configAccesoLoginUsuario();
                            break;
                case 1048: JOptionPane.showMessageDialog(null, "Debe ingresar todos los campos", "Registros", JOptionPane.ERROR_MESSAGE); 
                           break;
                case 1062: JOptionPane.showMessageDialog(null, "Persona ya registrada", "Registros", JOptionPane.ERROR_MESSAGE); 
                           break;
                case 1406: JOptionPane.showMessageDialog(null, "Datos exceden la longitud máxima permitida", "Registros", JOptionPane.ERROR_MESSAGE); 
                           break;  
                default: JOptionPane.showMessageDialog(null, "Error desconocido. Contacte al Administrador: " + resultado, "Registros", JOptionPane.ERROR_MESSAGE); 
                           break;
            }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this.jTextFieldRut, "Ingrese el rut Correctamente","Registros",JOptionPane.WARNING_MESSAGE);
            this.jTextFieldRut.requestFocus();
        }
        catch(NullPointerException e)
        {
            JOptionPane.showMessageDialog(this.jTextFieldRut, "Debe seleccionar una Fecha Valida","Registros",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private boolean validarFormularioRegistroUsuarios(){
        int validaciones = 0; 
        if(this.jTextFieldApellido.getText().trim().isEmpty())
        {
            this.jTextFieldApellido.setBackground(Color.yellow);
            validaciones++;
        }
        else{
            this.jTextFieldApellido.setBackground(Color.white);
        }
        if (! validarContraseñaLetrasyNumeros()) 
        {
            this.jPasswordFieldContraseña.setBackground(Color.yellow);
            this.jPasswordFieldConfContraseña.setBackground(Color.yellow);
            validaciones++;
        }
        else{
            this.jPasswordFieldContraseña.setBackground(Color.white);
            this.jPasswordFieldConfContraseña.setBackground(Color.white);
        }
        if(! validarRut())
        {
            this.jTextFieldRut.setBackground(Color.yellow);
            validaciones++;
        }
        else{
            this.jTextFieldRut.setBackground(Color.white);
        }
        if(this.jTextFieldNombre.getText().trim().isEmpty())
        {
            this.jTextFieldNombre.setBackground(Color.yellow);
            validaciones++;
        }
        else{
            this.jTextFieldNombre.setBackground(Color.white);
        }
        if(! validarEmail(this.jTextFieldEmail.getText().trim()))
        {
            this.jTextFieldEmail.setBackground(Color.yellow);
            validaciones++;
        }
        else{
            this.jTextFieldEmail.setBackground(Color.white);
        }
        if (jComboBoxSucursal.getSelectedIndex() == -1) {
            jComboBoxSucursal.setBackground(Color.yellow);
            validaciones++;
        } else {
            jComboBoxSucursal.setBackground(Color.white);
        }
        return validaciones == 0;
    }
    
    private void registrarUsuarios(){
        if (validarFormularioRegistroUsuarios())
        {
            registrarUser();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe ingresar todos los valores que se indican...", "Registro CINEDEMARK", JOptionPane.WARNING_MESSAGE);
            this.jTextFieldApellido.requestFocus();
        }
    }
    
    private void cargarListadoSucursales(){
        this.jComboBoxSucursal.removeAllItems();
        ArrayList<Sucursal> ciudades = new Sucursal().listadoSucursales();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for(BLL.Sucursal c: ciudades)
        {
            modelo.addElement(c);
        }
        this.jComboBoxSucursal.setModel(modelo);
        this.jComboBoxSucursal.setSelectedIndex(-1);
    }
    
    private boolean validarContraseñaLetrasyNumeros(){
        char[] Contraseña = this.jPasswordFieldContraseña.getPassword();
        if(Contraseña.length >=6)
        { 
            int numeros = 0; 
            int letras = 0;
            
            for(char x=0; x<Contraseña.length; x++)
            { 
                if((Contraseña[x] >47) && Contraseña[x]<58)
                { 
                    numeros++; 
                } 
            }
            for(char x=0; x<Contraseña.length; x++)
            { 
                if((Contraseña[x] >64) && Contraseña[x]<123)
                { 
                    letras++; 
                } 
            }
            if(numeros>0 && letras>0)
            { 
                jlblEstadoContraseña.setForeground(Color.white);
                jlblEstadoContraseña.setText("Su contraseña es Segura.");
                return true;
            }
            else
            { 
                jlblEstadoContraseña.setForeground(Color.yellow);
                jlblEstadoContraseña.setText("inserte letras y numeros.");
                return false;
            } 
        }
        else
        { 
            jlblEstadoContraseña.setForeground(Color.orange);
            jlblEstadoContraseña.setText("minimo 6 caracteres");
            return false;
        }
    }
    
    private boolean validarRut(){
        try
        {
            String rut = this.jTextFieldRut.getText();
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
    
    public void configAccesoRegistro(){
        RegistrarUsuario r = new RegistrarUsuario();
        r.setVisible(true);
        r.setLocationRelativeTo(null);
        r.setTitle("Registrar Usuario CINEDEMARK");
        r.jTextFieldApellido.requestFocus();
        r.setResizable(false);
    }
    
    private void ReestablecerFormularioRegistroDeUsuario(){
    jPasswordFieldConfContraseña.setText(null);
    jPasswordFieldContraseña.setText(null);
    jTextFieldApellido.setText(null);
    jTextFieldNombre.setText(null);
    jTextFieldRut.setText(null);
    jTextFieldEmail.setText(null);
    jlblEstadoContraseña.setText(" ");
    jlblEstadoContraseñasIguales.setText(" ");
    jlblEstadoRut.setText(" ");
    jLabelValidarEmail.setText(" ");
    jPasswordFieldConfContraseña.setBackground(Color.white);
    jPasswordFieldContraseña.setBackground(Color.white);
    jTextFieldApellido.setBackground(Color.white);
    jTextFieldNombre.setBackground(Color.white);
    jTextFieldRut.setBackground(Color.white);
    jTextFieldEmail.setBackground(Color.white);
    jComboBoxSucursal.setBackground(Color.white);
    }
    
    private boolean validarEmail(String email){
        String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        // Compiles the given regular expression into a pattern.
        Pattern pattern = Pattern.compile(PATTERN_EMAIL);
 
        // Match the given input against this pattern
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
        
    }
    
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
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrarUsuario r = new RegistrarUsuario();
        r.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpiarFormulario;
    private javax.swing.JButton jButtonRegistrarUsuario;
    private javax.swing.JComboBox jComboBoxSucursal;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelBanner;
    private javax.swing.JLabel jLabelConfirmarContraseña;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRut;
    private javax.swing.JLabel jLabelSucursal;
    private javax.swing.JLabel jLabelValidarEmail;
    private javax.swing.JPasswordField jPasswordFieldConfContraseña;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldRut;
    private javax.swing.JLabel jlblEstadoContraseña;
    private javax.swing.JLabel jlblEstadoContraseñasIguales;
    private javax.swing.JLabel jlblEstadoRut;
    // End of variables declaration//GEN-END:variables
}
