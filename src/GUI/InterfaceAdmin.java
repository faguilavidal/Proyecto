package GUI;

import BLL.Comuna;
import BLL.Sucursal;
import BLL.TipoCliente;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Fabian Aguila
 */
public class InterfaceAdmin extends javax.swing.JFrame {

    public InterfaceAdmin() {
        initComponents();
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon("src/Image/cine5.jpg");
        JLabel fondo= new JLabel(); fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        
        // ventanas internas cerradas
        jInternalFrameCartelera.setVisible(false);
        jInternalFrameCliente.setVisible(false);
        jInternalFramePeluculas.setVisible(false);
        jInternalFrameSalas.setVisible(false);
        jInternalFrameAbout.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameCliente = new javax.swing.JInternalFrame();
        jLabelRut = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelComuna = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelFechaNacimiento = new javax.swing.JLabel();
        jLabelMembresia = new javax.swing.JLabel();
        jLabelSucursal = new javax.swing.JLabel();
        jTextFieldRut = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jComboBoxComuna = new javax.swing.JComboBox();
        jTextFieldTelefono = new javax.swing.JTextField();
        jComboBoxFechanac_mes = new javax.swing.JComboBox();
        jComboBoxFechanac_año = new javax.swing.JComboBox();
        jComboBoxMembresia = new javax.swing.JComboBox();
        jComboBoxSucursal = new javax.swing.JComboBox();
        jButtonAgregar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonLimpiarFormulario = new javax.swing.JButton();
        jComboBoxFechanac_dia = new javax.swing.JComboBox();
        jInternalFramePeluculas = new javax.swing.JInternalFrame();
        jInternalFrameSalas = new javax.swing.JInternalFrame();
        jInternalFrameCartelera = new javax.swing.JInternalFrame();
        jInternalFrameAbout = new javax.swing.JInternalFrame();
        jMenuBarInterfasAdmin = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemCerrarSesion = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuOpciones = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemPeliculas = new javax.swing.JMenuItem();
        jMenuItemSalas = new javax.swing.JMenuItem();
        jMenuItemCartelera = new javax.swing.JMenuItem();
        jMenuAbout = new javax.swing.JMenu();
        jMenuItemAbout = new javax.swing.JMenuItem();

        setPreferredSize(new java.awt.Dimension(1000, 1000));
        setResizable(false);
        getContentPane().setLayout(null);

        jInternalFrameCliente.setBackground(new java.awt.Color(0, 51, 51));
        jInternalFrameCliente.setClosable(true);
        jInternalFrameCliente.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameCliente.setForeground(new java.awt.Color(255, 255, 255));
        jInternalFrameCliente.setTitle("Clientes");
        jInternalFrameCliente.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/registrar2424.png"))); // NOI18N
        jInternalFrameCliente.setPreferredSize(new java.awt.Dimension(300, 300));
        jInternalFrameCliente.setVisible(true);
        jInternalFrameCliente.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jInternalFrameClienteComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jInternalFrameClienteComponentShown(evt);
            }
        });

        jLabelRut.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelRut.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRut.setText("RUT");

        jLabelNombre.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("NOMBRE");

        jLabelApellido.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelApellido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApellido.setText("APELLIDO");

        jLabelDireccion.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDireccion.setText("DIRECCION");

        jLabelComuna.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelComuna.setForeground(new java.awt.Color(255, 255, 255));
        jLabelComuna.setText("COMUNA");

        jLabelTelefono.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelefono.setText("TELEFONO");

        jLabelFechaNacimiento.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFechaNacimiento.setText("FECHA NAC.");

        jLabelMembresia.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelMembresia.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMembresia.setText("MEMBRESIA");

        jLabelSucursal.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelSucursal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSucursal.setText("SUCURSAL");

        jTextFieldRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldRutKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldRutKeyTyped(evt);
            }
        });

        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyTyped(evt);
            }
        });

        jTextFieldDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDireccionKeyTyped(evt);
            }
        });

        jTextFieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoKeyTyped(evt);
            }
        });

        jComboBoxFechanac_mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jComboBoxFechanac_mes.setSelectedIndex(-1);
        jComboBoxFechanac_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFechanac_mesActionPerformed(evt);
            }
        });

        jComboBoxFechanac_año.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014" }));
        jComboBoxFechanac_año.setSelectedIndex(-1);
        jComboBoxFechanac_año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFechanac_añoActionPerformed(evt);
            }
        });

        jButtonAgregar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonAgregar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Add-Male-User.png"))); // NOI18N
        jButtonAgregar.setText("AGREGAR");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonBuscar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonBuscar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Search-Male-User.png"))); // NOI18N
        jButtonBuscar.setText("BUSCAR");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonActualizar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonActualizar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Edit-Male-User.png"))); // NOI18N
        jButtonActualizar.setText("ACTUALIZAR");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonEliminar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonEliminar.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Remove-Male-User.png"))); // NOI18N
        jButtonEliminar.setText("ELIMINAR");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonLimpiarFormulario.setBackground(new java.awt.Color(51, 51, 51));
        jButtonLimpiarFormulario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/limpiar32.png"))); // NOI18N
        jButtonLimpiarFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarFormularioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameClienteLayout = new javax.swing.GroupLayout(jInternalFrameCliente.getContentPane());
        jInternalFrameCliente.getContentPane().setLayout(jInternalFrameClienteLayout);
        jInternalFrameClienteLayout.setHorizontalGroup(
            jInternalFrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameClienteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jInternalFrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameClienteLayout.createSequentialGroup()
                        .addGroup(jInternalFrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMembresia)
                            .addComponent(jLabelApellido)
                            .addComponent(jLabelSucursal)
                            .addComponent(jLabelDireccion)
                            .addComponent(jLabelComuna)
                            .addComponent(jLabelTelefono)
                            .addComponent(jLabelRut)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelFechaNacimiento))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameClienteLayout.createSequentialGroup()
                        .addComponent(jButtonLimpiarFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jInternalFrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxComuna, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonActualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxSucursal, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldRut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrameClienteLayout.createSequentialGroup()
                        .addComponent(jComboBoxFechanac_año, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxFechanac_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxFechanac_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBoxMembresia, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNombre))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jInternalFrameClienteLayout.setVerticalGroup(
            jInternalFrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRut)
                    .addComponent(jTextFieldRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellido)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDireccion)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelComuna)
                    .addComponent(jComboBoxComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefono)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelFechaNacimiento)
                    .addGroup(jInternalFrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxFechanac_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxFechanac_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxFechanac_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMembresia)
                    .addComponent(jComboBoxMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSucursal)
                    .addComponent(jComboBoxSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAgregar)
                .addGap(17, 17, 17)
                .addComponent(jButtonBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonLimpiarFormulario))
                .addContainerGap())
        );

        getContentPane().add(jInternalFrameCliente);
        jInternalFrameCliente.setBounds(27, 25, 378, 650);

        jInternalFramePeluculas.setClosable(true);
        jInternalFramePeluculas.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFramePeluculas.setTitle("Peliculas");
        jInternalFramePeluculas.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/video-24.png"))); // NOI18N
        jInternalFramePeluculas.setPreferredSize(new java.awt.Dimension(300, 300));
        jInternalFramePeluculas.setVisible(true);

        javax.swing.GroupLayout jInternalFramePeluculasLayout = new javax.swing.GroupLayout(jInternalFramePeluculas.getContentPane());
        jInternalFramePeluculas.getContentPane().setLayout(jInternalFramePeluculasLayout);
        jInternalFramePeluculasLayout.setHorizontalGroup(
            jInternalFramePeluculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jInternalFramePeluculasLayout.setVerticalGroup(
            jInternalFramePeluculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        getContentPane().add(jInternalFramePeluculas);
        jInternalFramePeluculas.setBounds(424, 25, 300, 300);

        jInternalFrameSalas.setClosable(true);
        jInternalFrameSalas.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameSalas.setTitle("Salas");
        jInternalFrameSalas.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cinema-24.png"))); // NOI18N
        jInternalFrameSalas.setPreferredSize(new java.awt.Dimension(300, 300));
        jInternalFrameSalas.setVisible(true);

        javax.swing.GroupLayout jInternalFrameSalasLayout = new javax.swing.GroupLayout(jInternalFrameSalas.getContentPane());
        jInternalFrameSalas.getContentPane().setLayout(jInternalFrameSalasLayout);
        jInternalFrameSalasLayout.setHorizontalGroup(
            jInternalFrameSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jInternalFrameSalasLayout.setVerticalGroup(
            jInternalFrameSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        getContentPane().add(jInternalFrameSalas);
        jInternalFrameSalas.setBounds(742, 25, 300, 300);

        jInternalFrameCartelera.setClosable(true);
        jInternalFrameCartelera.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameCartelera.setTitle("Cartelera");
        jInternalFrameCartelera.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/media-10-24.png"))); // NOI18N
        jInternalFrameCartelera.setPreferredSize(new java.awt.Dimension(300, 300));
        jInternalFrameCartelera.setVisible(true);

        javax.swing.GroupLayout jInternalFrameCarteleraLayout = new javax.swing.GroupLayout(jInternalFrameCartelera.getContentPane());
        jInternalFrameCartelera.getContentPane().setLayout(jInternalFrameCarteleraLayout);
        jInternalFrameCarteleraLayout.setHorizontalGroup(
            jInternalFrameCarteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jInternalFrameCarteleraLayout.setVerticalGroup(
            jInternalFrameCarteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        getContentPane().add(jInternalFrameCartelera);
        jInternalFrameCartelera.setBounds(424, 343, 300, 300);

        jInternalFrameAbout.setClosable(true);
        jInternalFrameAbout.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameAbout.setVisible(true);

        javax.swing.GroupLayout jInternalFrameAboutLayout = new javax.swing.GroupLayout(jInternalFrameAbout.getContentPane());
        jInternalFrameAbout.getContentPane().setLayout(jInternalFrameAboutLayout);
        jInternalFrameAboutLayout.setHorizontalGroup(
            jInternalFrameAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );
        jInternalFrameAboutLayout.setVerticalGroup(
            jInternalFrameAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        getContentPane().add(jInternalFrameAbout);
        jInternalFrameAbout.setBounds(742, 343, 185, 172);

        jMenuArchivo.setText("Archivo");
        jMenuArchivo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jMenuItemCerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCerrarSesion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/salir2424.png"))); // NOI18N
        jMenuItemCerrarSesion.setText("Cerrar Sesion");
        jMenuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCerrarSesionActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemCerrarSesion);

        jMenuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close2424.png"))); // NOI18N
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemSalir);

        jMenuBarInterfasAdmin.add(jMenuArchivo);

        jMenuOpciones.setText("Opciones");
        jMenuOpciones.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jMenuItemCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/registrar2424.png"))); // NOI18N
        jMenuItemCliente.setText("Clientes");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMenuItemCliente);

        jMenuItemPeliculas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemPeliculas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemPeliculas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/video-24.png"))); // NOI18N
        jMenuItemPeliculas.setText("Peliculas");
        jMenuItemPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPeliculasActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMenuItemPeliculas);

        jMenuItemSalas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemSalas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemSalas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cinema-24.png"))); // NOI18N
        jMenuItemSalas.setText("Salas");
        jMenuItemSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalasActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMenuItemSalas);

        jMenuItemCartelera.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCartelera.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemCartelera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/media-10-24.png"))); // NOI18N
        jMenuItemCartelera.setText("Cartelera");
        jMenuItemCartelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCarteleraActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMenuItemCartelera);

        jMenuBarInterfasAdmin.add(jMenuOpciones);

        jMenuAbout.setText("Acerca de");
        jMenuAbout.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jMenuItemAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemAbout.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/information_info_about_question-2424.png"))); // NOI18N
        jMenuItemAbout.setText("Acerca de");
        jMenuItemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAboutActionPerformed(evt);
            }
        });
        jMenuAbout.add(jMenuItemAbout);

        jMenuBarInterfasAdmin.add(jMenuAbout);

        setJMenuBar(jMenuBarInterfasAdmin);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        jInternalFrameCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuItemPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPeliculasActionPerformed
        jInternalFramePeluculas.setVisible(true);
    }//GEN-LAST:event_jMenuItemPeliculasActionPerformed

    private void jMenuItemSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalasActionPerformed
        jInternalFrameSalas.setVisible(true);
    }//GEN-LAST:event_jMenuItemSalasActionPerformed

    private void jMenuItemCarteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCarteleraActionPerformed
        jInternalFrameCartelera.setVisible(true);
    }//GEN-LAST:event_jMenuItemCarteleraActionPerformed

    private void jMenuItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAboutActionPerformed
        jInternalFrameAbout.setVisible(true);
    }//GEN-LAST:event_jMenuItemAboutActionPerformed

    private void jMenuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCerrarSesionActionPerformed
        // Aqui va el codigo para cerrar sesion e abrir pagina de login.
    }//GEN-LAST:event_jMenuItemCerrarSesionActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jTextFieldRutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRutKeyPressed
        
    }//GEN-LAST:event_jTextFieldRutKeyPressed

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

    private void jTextFieldDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDireccionKeyTyped
        char caracter = evt.getKeyChar();
        if (! (Character.isDigit(caracter) || Character.isLetter(caracter) || caracter == KeyEvent.VK_SPACE))
        {
            evt.consume();
        }
        if (this.jTextFieldDireccion.getText().length() == 30)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldDireccionKeyTyped

    private void jTextFieldTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoKeyTyped
        if(jTextFieldTelefono.getText().length() >= 15){
            evt.consume();
        }
        char numero = evt.getKeyChar();
        if(!(Character.isDigit(numero))){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldTelefonoKeyTyped

    private void jButtonLimpiarFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarFormularioActionPerformed
        LimpiarFormularioClientes();
    }//GEN-LAST:event_jButtonLimpiarFormularioActionPerformed

    private void jInternalFrameClienteComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jInternalFrameClienteComponentShown
        LimpiarFormularioClientes();
        cargarMembresiasCliente();
        cargarSucursalesCliente();
        cargarComunasCliente();
    }//GEN-LAST:event_jInternalFrameClienteComponentShown

    private void jComboBoxFechanac_añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFechanac_añoActionPerformed
        if (jComboBoxFechanac_mes.getSelectedIndex() != -1)
        {
            int mes = jComboBoxFechanac_mes.getSelectedIndex();
            cargarDiasDelMes(mes);
        }
    }//GEN-LAST:event_jComboBoxFechanac_añoActionPerformed

    private void jComboBoxFechanac_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFechanac_mesActionPerformed
        int mes = this.jComboBoxFechanac_mes.getSelectedIndex();
        cargarDiasDelMes(mes);
    }//GEN-LAST:event_jComboBoxFechanac_mesActionPerformed

    private void jInternalFrameClienteComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jInternalFrameClienteComponentHidden
        LimpiarFormularioClientes();
    }//GEN-LAST:event_jInternalFrameClienteComponentHidden

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

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        if (validarFormularioRegistrodeClientesCinedeMark()) {
            AgregarCliente();
        }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        BuscarCliente();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        if (validarFormularioRegistrodeClientesCinedeMark()) {
            //ActualizarCliente();
        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        //EliminarCliente();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    
    
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////METODOS//////////////METODOS////////////////////////
    ////////////////////////////////////////////////////////////////////////////
   
    private  void BuscarCliente(){
        try
        {
            if(validarRut())
            {    
                String rutDV = this.jTextFieldRut.getText();
                int rut = Integer.parseInt(rutDV.substring(0,rutDV.length() - 2));
                BLL.Cliente c = new BLL.Cliente().buscarCliente(rut);
                if(c != null)
                {
                    jTextFieldApellido.setText(c.getApellido());
                    jTextFieldDireccion.setText(c.getDireccion());
                    jTextFieldNombre.setText(c.getNombre());
                    jTextFieldRut.setText(c.getRut()+"");
                    jTextFieldTelefono.setText(c.getTelefono()+"");
                    int idmembresia = c.getMembresia();
                    String nombremembresia = new BLL.TipoCliente().obtenerNombreTipoCliente(idmembresia);
                    int indiceMembresia = -1;
                    for (int i = 0; i < jComboBoxMembresia.getItemCount(); i++) {
                        if (nombremembresia.equals(jComboBoxMembresia.getItemAt(i).toString())) 
                        {
                            indiceMembresia = i;
                            break;
                        }
                    }
                    jComboBoxMembresia.setSelectedIndex(indiceMembresia);
                    
                    int idsucursal = c.getSucursal();
                    String nombresucursal = new BLL.Sucursal().obtenerNombreSucursal(idsucursal);
                    int indiceSucursal = -1;
                    for (int i = 0; i < jComboBoxSucursal.getItemCount(); i++) {
                        if (nombresucursal.equals(jComboBoxSucursal.getItemAt(i).toString())) 
                        {
                            indiceSucursal = i;
                            break;
                        }
                    }
                    jComboBoxSucursal.setSelectedIndex(indiceSucursal);
                    
                    int idcomuna = c.getComuna();
                    String nombrecomuna = new BLL.Comuna().obtenerNombreComuna(idcomuna);
                    int indiceComuna = -1;
                    for (int i = 0; i < jComboBoxComuna.getItemCount(); i++) {
                        if (nombrecomuna.equals(jComboBoxComuna.getItemAt(i).toString())) 
                        {
                            indiceComuna = i;
                            break;
                        }
                    }
                    jComboBoxComuna.setSelectedIndex(indiceComuna);
                }
                else
                {
                    //jlblBarraEstadoRegistro.setText("El rut ingresado no existe en registros");
                    this.jTextFieldRut.requestFocus();
                }
            }
            else
            {
                //this.jlblBarraEstadoRegistro.setText("Rut Inválido");
            }
        }
        catch(NumberFormatException e)
        {
            //jlblBarraEstadoRegistro.setText("Debe ingresar un rut valido a buscar");
            this.jTextFieldRut.requestFocus();
        }
        catch (StringIndexOutOfBoundsException e) 
        {
            //jlblBarraEstadoRegistro.setText("Ingrese el rut de la persona");
            this.jTextFieldRut.requestFocus();
        }
    }
    
    private void AgregarCliente(){
        try 
        {
            //CAPTURA DEL RUT
                String rutDV = this.jTextFieldRut.getText();
                int rut = Integer.parseInt(rutDV.substring(0,rutDV.length() - 2));
            //CAPTURA DEL NOMBRE
                String nombre = this.jTextFieldNombre.getText().trim();
                if(nombre.length() == 0)
                {
                    nombre = null;
                }
            //CAPTURA DEL APELLIDO
                String apellido = this.jTextFieldApellido.getText().trim();
                if(apellido.length() == 0)
                {
                    apellido = null;
                }
            //CAPTURA DE LADIRECCION
                String direccion = this.jTextFieldDireccion.getText().trim();
                if (direccion.length() == 0)
                {
                    direccion = null;
                }   
            //CAPTURA DE LA COMUNA
                String comuna = this.jComboBoxComuna.getSelectedItem().toString();
            //CAPTURA DEL TELEFONO
                int telefono = Integer.parseInt(this.jTextFieldTelefono.getText());
            //CAPTURA DE FECHA DE NACIMIENTO
                int año = Integer.parseInt(this.jComboBoxFechanac_año.getSelectedItem().toString());
                int mes = this.jComboBoxFechanac_mes.getSelectedIndex() + 1;
                int dia = Integer.parseInt(this.jComboBoxFechanac_dia.getSelectedItem().toString());
                String fechaNacimiento = dia + "/" + mes + "/" + año;
            //CAPTURA DE LA MEMBRESIA
                String membresia = this.jComboBoxMembresia.getSelectedItem().toString();
            //CAPTURA DE LA SUCURSAL DONDE SE INSCRIBE
                String sucursal = this.jComboBoxSucursal.getSelectedItem().toString();
                
            //CREAR UN NUEVO OBJETO CLIENTE PARA INSERTARLO EN LA BASE DE DATOS
            int resultado = new BLL.Cliente().registrarClienteBLL( rut,  nombre,  apellido,  direccion,  telefono,  fechaNacimiento,  membresia,  comuna,  sucursal);
            switch(resultado)
            {
                case 1: JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente", "Registros", JOptionPane.INFORMATION_MESSAGE);
                           LimpiarFormularioClientes();
                            break; 
                default: JOptionPane.showMessageDialog(null, "Error "+ resultado +", Contacte a cinedemark2015@gmail.com ", "Registros", JOptionPane.ERROR_MESSAGE); 
                           break;
            }
        
        } 
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Debe ingresar los campos correctamente", "Registros", JOptionPane.ABORT);
        } 
        catch (NullPointerException f){
            JOptionPane.showMessageDialog(null, "Debe ingresar los campos correctamente", "Registros", JOptionPane.ABORT);
        }
    }
    
    private boolean validarFormularioRegistrodeClientesCinedeMark(){
        int validaciones = 0; 
        
        if(! validarRut())
        {
            this.jTextFieldRut.setBackground(Color.blue);
            validaciones++;
        }else{
            this.jTextFieldRut.setBackground(Color.white);
        }
        if(this.jTextFieldNombre.getText().trim().isEmpty())
        {
            this.jTextFieldNombre.setBackground(Color.blue);
            validaciones++;
        }else{
            this.jTextFieldNombre.setBackground(Color.white);
        }
        if(this.jTextFieldApellido.getText().trim().isEmpty())
        {
            this.jTextFieldApellido.setBackground(Color.blue);
            validaciones++;
        }else{
            this.jTextFieldApellido.setBackground(Color.white);
        }
        if(this.jTextFieldDireccion.getText().trim().isEmpty())
        {
            this.jTextFieldDireccion.setBackground(Color.blue);
            validaciones++;
        }else{
            this.jTextFieldDireccion.setBackground(Color.white);
        }
        if(this.jTextFieldTelefono.getText().trim().isEmpty())
        {
            this.jTextFieldTelefono.setBackground(Color.blue);
            validaciones++;
        }else{
            this.jTextFieldTelefono.setBackground(Color.white);
        }
        if(this.jComboBoxFechanac_año.getSelectedIndex() == -1)
        {
            this.jComboBoxFechanac_año.setBackground(Color.blue);
            validaciones++;
        }else{
            this.jComboBoxFechanac_año.setBackground(Color.white);
        }
        if(this.jComboBoxFechanac_mes.getSelectedIndex() == -1)
        {
            this.jComboBoxFechanac_mes.setBackground(Color.blue);
            validaciones++;
        }else{
            this.jComboBoxFechanac_mes.setBackground(Color.white);
        }
        if(this.jComboBoxFechanac_dia.getSelectedIndex() == -1)
        {
            this.jComboBoxFechanac_dia.setBackground(Color.blue);
            validaciones++;
        }else{
            this.jComboBoxFechanac_dia.setBackground(Color.white);
        }
        if(this.jComboBoxMembresia.getSelectedIndex() == -1)
        {
            this.jComboBoxMembresia.setBackground(Color.blue);
            validaciones++;
        }else{
            this.jComboBoxMembresia.setBackground(Color.white);
        }
        if(this.jComboBoxSucursal.getSelectedIndex() == -1)
        {
            this.jComboBoxSucursal.setBackground(Color.blue);
            validaciones++;
        }else{
            this.jComboBoxSucursal.setBackground(Color.white);
        }
        if(this.jComboBoxComuna.getSelectedIndex() == -1)
        {
            this.jComboBoxComuna.setBackground(Color.blue);
            validaciones++;
        }else{
            this.jComboBoxComuna.setBackground(Color.white);
        }
        try
        {    
            int año = Integer.parseInt(this.jComboBoxFechanac_año.getSelectedItem().toString());
            int mes = this.jComboBoxFechanac_mes.getSelectedIndex() + 1;
            int dia = Integer.parseInt(this.jComboBoxFechanac_dia.getSelectedItem().toString());
            String fechaNacimiento = año + "-" + mes + "-" + dia;
            if (calcularEdad(fechaNacimiento) < 3) 
            {
                validaciones++;
                JOptionPane.showMessageDialog(jInternalFrameCliente, "El Cliente debe tener al menos 3 años cumplidos como minimo.", "Validacion de Edad", JOptionPane.INFORMATION_MESSAGE);
                this.jComboBoxFechanac_dia.setBackground(Color.blue);
                this.jComboBoxFechanac_mes.setBackground(Color.blue);
                this.jComboBoxFechanac_año.setBackground(Color.blue);
            }
        }
        catch(NullPointerException e)
        {
            System.out.println("error al capturar fecha " + e.getMessage());
            this.jComboBoxFechanac_dia.setBackground(Color.blue);
            this.jComboBoxFechanac_mes.setBackground(Color.blue);
            this.jComboBoxFechanac_año.setBackground(Color.blue);
        }
        return validaciones == 0;
    }
    
    private int calcularEdad(String FechaNacimiento){
        Date fechaNac=null;
        try 
        {
            fechaNac = new SimpleDateFormat("yyyy-MM-dd").parse(FechaNacimiento);
        } 
        catch (Exception ex) 
        {
            System.out.println("Error:"+ex);
        }
        Calendar fechaNacimiento = Calendar.getInstance();
        //Se crea un objeto con la fecha actual
        Calendar fechaActual = Calendar.getInstance();
        //Se asigna la fecha recibida a la fecha de nacimiento.
        fechaNacimiento.setTime(fechaNac);
        //Se restan la fecha actual y la fecha de nacimiento
        int año = fechaActual.get(Calendar.YEAR)- fechaNacimiento.get(Calendar.YEAR);
        int mes =fechaActual.get(Calendar.MONTH)- fechaNacimiento.get(Calendar.MONTH);
        int dia = fechaActual.get(Calendar.DATE)- fechaNacimiento.get(Calendar.DATE);
        //Se ajusta el año dependiendo el mes y el día
        if(mes<0 || (mes==0 && dia<0)){
            año--;
        }
        //Regresa la edad en base a la fecha de nacimiento
        return año;
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
    
    private void cargarDiasDelMes(int mes){
        switch(mes)
        {
            case 0: mes31Dias();break;
            case 1: mesfebrero();break;
            case 2: mes31Dias();break;
            case 3: mes30Dias();break;
            case 4: mes31Dias();break;
            case 5: mes30Dias();break;
            case 6: mes31Dias();break;   
            case 7: mes31Dias();break;
            case 8: mes31Dias();break;   
            case 9: mes31Dias();break;  
            case 10: mes30Dias();break;
            case 11: mes31Dias();break;   
        }
    }
    
    private void mesfebrero(){
        try{
        jComboBoxFechanac_dia.removeAllItems();
        int año = Integer.parseInt(jComboBoxFechanac_año.getSelectedItem().toString());
        if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)))
        {
            for (int i = 1; i <= 29; i++) 
            {
                if (i < 10) 
                {
                    jComboBoxFechanac_dia.addItem("0" + i);
                }
                else
                {
                    jComboBoxFechanac_dia.addItem(i);
                }    
            }
        }
        else
        {
            for (int i = 1; i <= 28; i++) 
            {
                if (i < 10) 
                {
                    jComboBoxFechanac_dia.addItem("0" + i);
                }
                else
                {
                    jComboBoxFechanac_dia.addItem(i);
                }    
            }
        }
        }catch(NullPointerException e){
            
        }
    }
    
    private void mes30Dias(){
        jComboBoxFechanac_dia.removeAllItems();
        for (int i = 1; i <= 30; i++) 
        {
            if (i < 10) 
            {
                jComboBoxFechanac_dia.addItem("0" + i);
            }
            else
            {
                jComboBoxFechanac_dia.addItem(i);
            }    
        }
    }
    
    private void mes31Dias(){
        jComboBoxFechanac_dia.removeAllItems();
        for (int i = 1; i <= 31; i++) 
        {
            if (i < 10) 
            {
                jComboBoxFechanac_dia.addItem("0" + i);
            }
            else
            {
                jComboBoxFechanac_dia.addItem(i);
            }    
        }
    }
    
    private  void LimpiarFormularioClientes(){
        jTextFieldApellido.setText("");
        jTextFieldDireccion.setText("");
        jTextFieldNombre.setText("");
        jTextFieldRut.setText("");
        jTextFieldTelefono.setText("");
        jComboBoxComuna.setSelectedIndex(-1);
        jComboBoxFechanac_año.setSelectedIndex(-1);
        jComboBoxFechanac_dia.setSelectedIndex(-1);
        jComboBoxFechanac_mes.setSelectedIndex(-1);
        jComboBoxMembresia.setSelectedIndex(-1);
        jComboBoxSucursal.setSelectedIndex(-1);
        jTextFieldApellido.setBackground(Color.white);
        jTextFieldDireccion.setBackground(Color.white);
        jTextFieldNombre.setBackground(Color.white);
        jTextFieldRut.setBackground(Color.white);
        jTextFieldTelefono.setBackground(Color.white);
        jComboBoxComuna.setBackground(Color.white);
        jComboBoxFechanac_año.setBackground(Color.white);
        jComboBoxFechanac_dia.setBackground(Color.white);
        jComboBoxFechanac_mes.setBackground(Color.white);
        jComboBoxMembresia.setBackground(Color.white);
        jComboBoxSucursal.setBackground(Color.white);
    }
    
    private void cargarComunasCliente(){
        this.jComboBoxComuna.removeAllItems();
        ArrayList<Comuna> Comunas = new Comuna().listadoComunas();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for(BLL.Comuna c: Comunas)
        {
            modelo.addElement(c);
        }
        this.jComboBoxComuna.setModel(modelo);
        this.jComboBoxComuna.setSelectedIndex(-1);
    }
    
    private void cargarSucursalesCliente(){
        this.jComboBoxSucursal.removeAllItems();
        ArrayList<Sucursal> sucursales = new Sucursal().listadoSucursales();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for(BLL.Sucursal c: sucursales)
        {
            modelo.addElement(c);
        }
        this.jComboBoxSucursal.setModel(modelo);
        this.jComboBoxSucursal.setSelectedIndex(-1);
    }
    
    private void cargarMembresiasCliente(){
        this.jComboBoxMembresia.removeAllItems();
        ArrayList<TipoCliente> TipoClientes = new TipoCliente().listadoTipoCliente();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for(BLL.TipoCliente c: TipoClientes)
        {
            modelo.addElement(c);
        }
        this.jComboBoxMembresia.setModel(modelo);
        this.jComboBoxMembresia.setSelectedIndex(-1);
    }
    
    public static void configInterfaceAdmin()
    {
        InterfaceAdmin i = new InterfaceAdmin();
        i.setVisible(true);
        i.setExtendedState(MAXIMIZED_BOTH);
        i.setTitle("Administración CINEDEMARK");
    }
    ////////////////////////////////////////////////////////////////////////////
    /////////////////////FIN METODOS///////////FIN METODOS//////////////////////
    ////////////////////////////////////////////////////////////////////////////
    
    
    
    
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Dark Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                configInterfaceAdmin();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonLimpiarFormulario;
    private javax.swing.JComboBox jComboBoxComuna;
    private javax.swing.JComboBox jComboBoxFechanac_año;
    private javax.swing.JComboBox jComboBoxFechanac_dia;
    private javax.swing.JComboBox jComboBoxFechanac_mes;
    private javax.swing.JComboBox jComboBoxMembresia;
    private javax.swing.JComboBox jComboBoxSucursal;
    private javax.swing.JInternalFrame jInternalFrameAbout;
    private javax.swing.JInternalFrame jInternalFrameCartelera;
    private javax.swing.JInternalFrame jInternalFrameCliente;
    private javax.swing.JInternalFrame jInternalFramePeluculas;
    private javax.swing.JInternalFrame jInternalFrameSalas;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelComuna;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelFechaNacimiento;
    private javax.swing.JLabel jLabelMembresia;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRut;
    private javax.swing.JLabel jLabelSucursal;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JMenu jMenuAbout;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBarInterfasAdmin;
    private javax.swing.JMenuItem jMenuItemAbout;
    private javax.swing.JMenuItem jMenuItemCartelera;
    private javax.swing.JMenuItem jMenuItemCerrarSesion;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemPeliculas;
    private javax.swing.JMenuItem jMenuItemSalas;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuOpciones;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldRut;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
