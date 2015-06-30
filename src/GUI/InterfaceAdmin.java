package GUI;

import BLL.Comuna;
import BLL.Genero;
import BLL.Pais;
import BLL.Productora;
import BLL.Sucursal;
import BLL.TipoCliente;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
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
        jInternalFramePeliculas.setVisible(false);
        jInternalFrameSalas.setVisible(false);
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
        jInternalFramePeliculas = new javax.swing.JInternalFrame();
        jLabelSerial = new javax.swing.JLabel();
        jLabelNombrePelicula = new javax.swing.JLabel();
        jLabelSinopsis = new javax.swing.JLabel();
        jLabelCensura = new javax.swing.JLabel();
        jLabelFechaProduccion = new javax.swing.JLabel();
        jLabelFechaEstreno = new javax.swing.JLabel();
        jLabelPeginaWeb = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelProductora = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jLabelPais = new javax.swing.JLabel();
        jTextFieldSerial = new javax.swing.JTextField();
        jTextFieldNombrePelicula = new javax.swing.JTextField();
        jTextFieldSinopsis = new javax.swing.JTextField();
        jComboBoxCensura = new javax.swing.JComboBox();
        jComboBoxFPaño = new javax.swing.JComboBox();
        jComboBoxFPmes = new javax.swing.JComboBox();
        jComboBoxFPdia = new javax.swing.JComboBox();
        jComboBoxFEaño = new javax.swing.JComboBox();
        jComboBoxFEmes = new javax.swing.JComboBox();
        jComboBoxFEdia = new javax.swing.JComboBox();
        jTextFieldPaginaWeb = new javax.swing.JTextField();
        jComboBoxEstado = new javax.swing.JComboBox();
        jComboBoxProductora = new javax.swing.JComboBox();
        jComboBoxGenero = new javax.swing.JComboBox();
        jComboBoxPais = new javax.swing.JComboBox();
        jButtonADD = new javax.swing.JButton();
        jButtonSEARCH = new javax.swing.JButton();
        jButtonEDIT = new javax.swing.JButton();
        jButtonDELETE = new javax.swing.JButton();
        jButtonCLEAN = new javax.swing.JButton();
        jInternalFrameSalas = new javax.swing.JInternalFrame();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jTextField2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jInternalFrameCartelera = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jMenuBarInterfasAdmin = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemCerrarSesion = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuOpciones = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemPeliculas = new javax.swing.JMenuItem();
        jMenuItemSalas = new javax.swing.JMenuItem();
        jMenuItemCartelera = new javax.swing.JMenuItem();

        setPreferredSize(new java.awt.Dimension(1000, 1000));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jInternalFrameCliente.setBackground(new java.awt.Color(153, 153, 153));
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
        jLabelRut.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRut.setText("RUT");

        jLabelNombre.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombre.setText("NOMBRE");

        jLabelApellido.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelApellido.setForeground(new java.awt.Color(0, 0, 0));
        jLabelApellido.setText("APELLIDO");

        jLabelDireccion.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelDireccion.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDireccion.setText("DIRECCION");

        jLabelComuna.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelComuna.setForeground(new java.awt.Color(0, 0, 0));
        jLabelComuna.setText("COMUNA");

        jLabelTelefono.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelTelefono.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTelefono.setText("TELEFONO");

        jLabelFechaNacimiento.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFechaNacimiento.setText("FECHA NAC.");

        jLabelMembresia.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelMembresia.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMembresia.setText("MEMBRESIA");

        jLabelSucursal.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelSucursal.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSucursal.setText("SUCURSAL");

        jTextFieldRut.setToolTipText("Ingrese su Rut");
        jTextFieldRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldRutKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldRutKeyTyped(evt);
            }
        });

        jTextFieldNombre.setToolTipText("Ingrese su nombre");
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jTextFieldApellido.setToolTipText("ingrese su Apellido");
        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyTyped(evt);
            }
        });

        jTextFieldDireccion.setToolTipText("Ingrese su Direccion");
        jTextFieldDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDireccionKeyTyped(evt);
            }
        });

        jComboBoxComuna.setToolTipText("Seleccione una Comuna");

        jTextFieldTelefono.setToolTipText("Ingrese un Telefono EJ: 98746543");
        jTextFieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoKeyTyped(evt);
            }
        });

        jComboBoxFechanac_mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jComboBoxFechanac_mes.setSelectedIndex(-1);
        jComboBoxFechanac_mes.setToolTipText("Mes");
        jComboBoxFechanac_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFechanac_mesActionPerformed(evt);
            }
        });

        jComboBoxFechanac_año.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015" }));
        jComboBoxFechanac_año.setSelectedIndex(-1);
        jComboBoxFechanac_año.setToolTipText("Año");
        jComboBoxFechanac_año.setName(""); // NOI18N
        jComboBoxFechanac_año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFechanac_añoActionPerformed(evt);
            }
        });

        jComboBoxMembresia.setToolTipText("tipo de Membresia");

        jComboBoxSucursal.setToolTipText("Sucursal de inscripcion");

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
        jButtonLimpiarFormulario.setToolTipText("LIMPIAR EL FORMULARIO");
        jButtonLimpiarFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarFormularioActionPerformed(evt);
            }
        });

        jComboBoxFechanac_dia.setToolTipText("Dia");

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
                .addGap(18, 18, 18)
                .addComponent(jButtonActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonLimpiarFormulario))
                .addContainerGap())
        );

        getContentPane().add(jInternalFrameCliente);
        jInternalFrameCliente.setBounds(30, 10, 378, 650);

        jInternalFramePeliculas.setBackground(new java.awt.Color(153, 153, 153));
        jInternalFramePeliculas.setClosable(true);
        jInternalFramePeliculas.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFramePeliculas.setTitle("Peliculas");
        jInternalFramePeliculas.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/video-24.png"))); // NOI18N
        jInternalFramePeliculas.setPreferredSize(new java.awt.Dimension(300, 300));
        jInternalFramePeliculas.setVisible(true);
        jInternalFramePeliculas.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jInternalFramePeliculasComponentShown(evt);
            }
        });

        jLabelSerial.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelSerial.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSerial.setText("SERIAL");

        jLabelNombrePelicula.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelNombrePelicula.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombrePelicula.setText("NOMBRE");

        jLabelSinopsis.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelSinopsis.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSinopsis.setText("SINOPSIS");

        jLabelCensura.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelCensura.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCensura.setText("CENSURA");

        jLabelFechaProduccion.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelFechaProduccion.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFechaProduccion.setText("FECHA PRODUCCION");

        jLabelFechaEstreno.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelFechaEstreno.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFechaEstreno.setText("FECHA ESTRENO");

        jLabelPeginaWeb.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelPeginaWeb.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPeginaWeb.setText("PEGINA WEB");

        jLabelEstado.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEstado.setText("ESTADO");

        jLabelProductora.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelProductora.setForeground(new java.awt.Color(0, 0, 0));
        jLabelProductora.setText("PRODUCTORA");

        jLabelGenero.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelGenero.setForeground(new java.awt.Color(0, 0, 0));
        jLabelGenero.setText("GENERO");

        jLabelPais.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelPais.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPais.setText("PAIS");

        jComboBoxCensura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "3", "5", "8", "12", "16", "18" }));
        jComboBoxCensura.setSelectedIndex(-1);

        jComboBoxFPaño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015" }));
        jComboBoxFPaño.setSelectedIndex(-1);
        jComboBoxFPaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFPañoActionPerformed(evt);
            }
        });

        jComboBoxFPmes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jComboBoxFPmes.setSelectedIndex(-1);
        jComboBoxFPmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFPmesActionPerformed(evt);
            }
        });

        jComboBoxFEaño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015" }));
        jComboBoxFEaño.setSelectedIndex(-1);
        jComboBoxFEaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFEañoActionPerformed(evt);
            }
        });

        jComboBoxFEmes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jComboBoxFEmes.setSelectedIndex(-1);
        jComboBoxFEmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFEmesActionPerformed(evt);
            }
        });

        jComboBoxFEdia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBoxFEdia.setSelectedIndex(-1);

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "En Cartelera", "Fuera de Cartelera" }));
        jComboBoxEstado.setSelectedIndex(-1);

        jComboBoxProductora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

        jComboBoxPais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

        jButtonADD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/filmadd.png"))); // NOI18N
        jButtonADD.setText("Add");
        jButtonADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADDActionPerformed(evt);
            }
        });

        jButtonSEARCH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/filmsearch.png"))); // NOI18N
        jButtonSEARCH.setText("Search");
        jButtonSEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSEARCHActionPerformed(evt);
            }
        });

        jButtonEDIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/filmedit.png"))); // NOI18N
        jButtonEDIT.setText("Edit");
        jButtonEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEDITActionPerformed(evt);
            }
        });

        jButtonDELETE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/filmdelete.png"))); // NOI18N
        jButtonDELETE.setText("Delete");
        jButtonDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDELETEActionPerformed(evt);
            }
        });

        jButtonCLEAN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/limpiar32.png"))); // NOI18N
        jButtonCLEAN.setText("Clean");
        jButtonCLEAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCLEANActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFramePeliculasLayout = new javax.swing.GroupLayout(jInternalFramePeliculas.getContentPane());
        jInternalFramePeliculas.getContentPane().setLayout(jInternalFramePeliculasLayout);
        jInternalFramePeliculasLayout.setHorizontalGroup(
            jInternalFramePeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFramePeliculasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFramePeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPais)
                    .addComponent(jLabelGenero)
                    .addComponent(jLabelProductora)
                    .addComponent(jLabelEstado)
                    .addComponent(jLabelPeginaWeb)
                    .addComponent(jLabelFechaEstreno)
                    .addComponent(jLabelFechaProduccion)
                    .addComponent(jLabelCensura)
                    .addComponent(jLabelSinopsis)
                    .addComponent(jLabelNombrePelicula)
                    .addComponent(jLabelSerial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFramePeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxCensura, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFramePeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jInternalFramePeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFramePeliculasLayout.createSequentialGroup()
                                .addComponent(jButtonADD, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFramePeliculasLayout.createSequentialGroup()
                                .addComponent(jButtonEDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFramePeliculasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonCLEAN)
                                .addGap(51, 51, 51)))
                        .addGroup(jInternalFramePeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNombrePelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jTextFieldSinopsis, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jTextFieldPaginaWeb, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jComboBoxProductora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxPais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFramePeliculasLayout.createSequentialGroup()
                                .addGroup(jInternalFramePeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxFEaño, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxFPaño, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jInternalFramePeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxFPmes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxFEmes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFramePeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxFPdia, 0, 50, Short.MAX_VALUE)
                                    .addComponent(jComboBoxFEdia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jComboBoxEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jInternalFramePeliculasLayout.setVerticalGroup(
            jInternalFramePeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFramePeliculasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFramePeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSerial)
                    .addComponent(jTextFieldSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFramePeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombrePelicula)
                    .addComponent(jTextFieldNombrePelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFramePeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSinopsis)
                    .addComponent(jTextFieldSinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFramePeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCensura)
                    .addComponent(jComboBoxCensura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFramePeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaProduccion)
                    .addComponent(jComboBoxFPaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFPmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFPdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFramePeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaEstreno)
                    .addComponent(jComboBoxFEaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFEmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFEdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFramePeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPeginaWeb)
                    .addComponent(jTextFieldPaginaWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFramePeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstado)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFramePeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProductora)
                    .addComponent(jComboBoxProductora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFramePeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelGenero)
                    .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFramePeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPais)
                    .addComponent(jComboBoxPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFramePeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonADD)
                    .addComponent(jButtonSEARCH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFramePeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEDIT)
                    .addComponent(jButtonDELETE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCLEAN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jInternalFramePeliculas);
        jInternalFramePeliculas.setBounds(440, 10, 390, 670);

        jInternalFrameSalas.setClosable(true);
        jInternalFrameSalas.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameSalas.setTitle("Salas");
        jInternalFrameSalas.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cinema-24.png"))); // NOI18N
        jInternalFrameSalas.setPreferredSize(new java.awt.Dimension(300, 300));
        jInternalFrameSalas.setVisible(true);

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField2.setText("jTextField2");

        jButton6.setText("jButton6");

        jButton7.setText("jButton7");

        javax.swing.GroupLayout jInternalFrameSalasLayout = new javax.swing.GroupLayout(jInternalFrameSalas.getContentPane());
        jInternalFrameSalas.getContentPane().setLayout(jInternalFrameSalasLayout);
        jInternalFrameSalasLayout.setHorizontalGroup(
            jInternalFrameSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameSalasLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jInternalFrameSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jInternalFrameSalasLayout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7))
                    .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jInternalFrameSalasLayout.setVerticalGroup(
            jInternalFrameSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameSalasLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jInternalFrameSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jInternalFrameSalas);
        jInternalFrameSalas.setBounds(860, 10, 330, 300);

        jInternalFrameCartelera.setClosable(true);
        jInternalFrameCartelera.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameCartelera.setTitle("Cartelera");
        jInternalFrameCartelera.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/media-10-24.png"))); // NOI18N
        jInternalFrameCartelera.setPreferredSize(new java.awt.Dimension(300, 300));
        jInternalFrameCartelera.setVisible(true);

        jLabel1.setText("CODIGO");

        jLabel2.setText("SUCURSAL");

        jLabel3.setText("PELICULA");

        jButton1.setText("Add");

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Edit");

        jButton4.setText("Delete");

        jButton5.setText("Clean");

        javax.swing.GroupLayout jInternalFrameCarteleraLayout = new javax.swing.GroupLayout(jInternalFrameCartelera.getContentPane());
        jInternalFrameCartelera.getContentPane().setLayout(jInternalFrameCarteleraLayout);
        jInternalFrameCarteleraLayout.setHorizontalGroup(
            jInternalFrameCarteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameCarteleraLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jInternalFrameCarteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameCarteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameCarteleraLayout.createSequentialGroup()
                        .addGroup(jInternalFrameCarteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrameCarteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameCarteleraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        jInternalFrameCarteleraLayout.setVerticalGroup(
            jInternalFrameCarteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameCarteleraLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jInternalFrameCarteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameCarteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameCarteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameCarteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameCarteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(jInternalFrameCartelera);
        jInternalFrameCartelera.setBounds(860, 350, 330, 330);

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

        setJMenuBar(jMenuBarInterfasAdmin);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        jInternalFrameCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuItemPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPeliculasActionPerformed
        jInternalFramePeliculas.setVisible(true);
    }//GEN-LAST:event_jMenuItemPeliculasActionPerformed

    private void jMenuItemSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalasActionPerformed
        jInternalFrameSalas.setVisible(true);
    }//GEN-LAST:event_jMenuItemSalasActionPerformed

    private void jMenuItemCarteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCarteleraActionPerformed
        jInternalFrameCartelera.setVisible(true);
    }//GEN-LAST:event_jMenuItemCarteleraActionPerformed

    private void jMenuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCerrarSesionActionPerformed
        new Login().configAccesoLoginUsuario();
        dispose();
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
            new FechaNacimiento().cargarDiasDelMes(mes);
        }
    }//GEN-LAST:event_jComboBoxFechanac_añoActionPerformed

    private void jComboBoxFechanac_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFechanac_mesActionPerformed
        int mes = this.jComboBoxFechanac_mes.getSelectedIndex();
        new FechaNacimiento().cargarDiasDelMes(mes);
    }//GEN-LAST:event_jComboBoxFechanac_mesActionPerformed

    private void jInternalFrameClienteComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jInternalFrameClienteComponentHidden
        
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
        }else{
            JOptionPane.showMessageDialog(jInternalFrameCliente, "Debe ingresar los campos correctamente", "Registros", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/Add-Male-User.png"));
        }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        BuscarCliente();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        if (validarFormularioRegistrodeClientesCinedeMark()) {
            ActualizarCliente();
        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        EliminarCliente();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new Login().configAccesoLoginUsuario();
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jInternalFramePeliculasComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jInternalFramePeliculasComponentShown
        LimpiarFormularioPelicula();
        cargarProductoraPelicula();
        cargarGeneroPelicula();
        cargarPaisPelicula();
    }//GEN-LAST:event_jInternalFramePeliculasComponentShown

    private void jButtonCLEANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCLEANActionPerformed
        LimpiarFormularioPelicula();
    }//GEN-LAST:event_jButtonCLEANActionPerformed

    private void jButtonADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDActionPerformed
        AgregarPelicula();
    }//GEN-LAST:event_jButtonADDActionPerformed

    private void jComboBoxFPañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFPañoActionPerformed
        if (jComboBoxFPmes.getSelectedIndex() != -1)
        {
            int mes = jComboBoxFPmes.getSelectedIndex();
            new FechaProduccion().cargarDiasDelMesFP(mes);
        }
    }//GEN-LAST:event_jComboBoxFPañoActionPerformed

    private void jComboBoxFPmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFPmesActionPerformed
        int mes = this.jComboBoxFPmes.getSelectedIndex();
        new FechaProduccion().cargarDiasDelMesFP(mes);
    }//GEN-LAST:event_jComboBoxFPmesActionPerformed

    private void jComboBoxFEañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFEañoActionPerformed
        if (jComboBoxFEmes.getSelectedIndex() != -1)
        {
            int mes = jComboBoxFEmes.getSelectedIndex();
            new FechaEstreno().cargarDiasDelMesFE(mes);
        }
    }//GEN-LAST:event_jComboBoxFEañoActionPerformed

    private void jComboBoxFEmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFEmesActionPerformed
        int mes = this.jComboBoxFEmes.getSelectedIndex();
        new FechaEstreno().cargarDiasDelMesFE(mes);
    }//GEN-LAST:event_jComboBoxFEmesActionPerformed

    private void jButtonDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDELETEActionPerformed
        EliminarPelicula();
    }//GEN-LAST:event_jButtonDELETEActionPerformed

    private void jButtonEDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEDITActionPerformed
        ActualizarPelicula();
    }//GEN-LAST:event_jButtonEDITActionPerformed

    private void jButtonSEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSEARCHActionPerformed
        BuscarPelicula();
    }//GEN-LAST:event_jButtonSEARCHActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////METODOS//////////////METODOS////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    
    /////////////////////////////METODOS CLIENTES///////////////////////////////
    
                /* MANTENEDOR CLIENTE*/
    private void ActualizarCliente(){
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

            //CREAR UN NUEVO OBJETO CLIENTE PARA ACTUALIZARLO EN LA BASE DE DATOS
                int resultado = new BLL.Cliente().ActualizarClienteBLL( rut,  nombre,  apellido,  direccion,  telefono,  fechaNacimiento,  membresia,  comuna,  sucursal);
                switch(resultado)
                {
                    case 1: JOptionPane.showMessageDialog(null, "Usuario actualizado exitosamente", "Registros", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/Edit-Male-User.png"));
                            LimpiarFormularioClientes();
                            break; 
                    default: JOptionPane.showMessageDialog(null, "Error: "+ resultado +", Contacte a cinedemark2015@gmail.com ", "Registros", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/Image/Edit-Male-User.png")); 
                            break;
                }
        } 
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Debe ingresar los campos correctamente", "Registros", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/Edit-Male-User.png"));
        } 
        catch (NullPointerException f){
            JOptionPane.showMessageDialog(null, "Debe ingresar los campos correctamente", "Registros", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/Edit-Male-User.png"));
        }
        catch (StringIndexOutOfBoundsException e) 
        {
            JOptionPane.showMessageDialog(null, "Ingrese el rut del cliente", "Registros", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/Edit-Male-User.png"));
            this.jTextFieldRut.requestFocus();
        }
    }

    private void BuscarCliente(){
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
                    jTextFieldRut.setText(c.getRut()+ "-" +obtenerDigitoVerificador(c.getRut()));
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
                    
                    /*FECHA NACIMIENTO CLIENTE*/
                String año = c.getFechaNac().substring(0, 4);
                String mes = c.getFechaNac().substring(5, 7);
                String dia = c.getFechaNac().substring(8, 10);
                
                int indiceaño = -1;
                for (int i = 0; i < jComboBoxFechanac_año.getItemCount(); i++) {
                    if (año.equals(jComboBoxFechanac_año.getItemAt(i).toString())) 
                    {
                        indiceaño = i;
                        break;
                    }
                }
                jComboBoxFechanac_año.setSelectedIndex(indiceaño);
                
                int indicemes = Integer.parseInt(mes) - 1;
                jComboBoxFechanac_mes.setSelectedIndex(indicemes);
                
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addElement(dia);
                jComboBoxFechanac_dia.setModel(modelo);
                }
                else
                {
                    JOptionPane.showMessageDialog(jInternalFrameCliente, "El rut ingresado no existe en registros",
                    "Registros",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/Search-Male-User.png"));
                    this.jTextFieldRut.requestFocus();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(jInternalFrameCliente, "Rut Inválido",
                "Registros",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/Search-Male-User.png"));
            }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(jInternalFrameCliente, "Debe ingresar un rut valido a buscar",
            "Registros",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/Search-Male-User.png"));
            this.jTextFieldRut.requestFocus();
        }
        catch (StringIndexOutOfBoundsException e) 
        {
            JOptionPane.showMessageDialog(jInternalFrameCliente, "Ingrese el rut de la persona",
            "Registros",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/Search-Male-User.png"));
            this.jTextFieldRut.requestFocus();
        }
        catch (NullPointerException e) 
        {
            JOptionPane.showMessageDialog(jInternalFrameCliente, "Ingrese el rut de la persona",
            "Registros",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/Search-Male-User.png"));
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
                    case 1: JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente", "Registros", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/Add-Male-User.png"));
                               LimpiarFormularioClientes();
                                break; 
                    default: JOptionPane.showMessageDialog(null, "Error "+ resultado +", Contacte a cinedemark2015@gmail.com ", "Registros", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/Image/Add-Male-User.png")); 
                               break;
                }

        } 
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Debe ingresar los campos correctamente", "Registros", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/Add-Male-User.png"));
        } 
        catch (NullPointerException f){
            JOptionPane.showMessageDialog(null, "Debe ingresar los campos correctamente", "Registros", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/Add-Male-User.png"));
        }
    }

    private void EliminarCliente(){
        try
        {
            if(validarRut())
            {    
                String rutDV = this.jTextFieldRut.getText();
                int rut = Integer.parseInt(rutDV.substring(0,rutDV.length() - 2));
                int resultado = new BLL.Cliente().eliminarCliente(rut);
                switch(resultado)
                {
                    case 0: JOptionPane.showMessageDialog(jButtonEliminar, "El Cliente no existe en nuestros registros", "Eliminando", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/Remove-Male-User.png"));
                            break;
                    case 1: JOptionPane.showMessageDialog(jButtonEliminar, "Persona Eliminada del Registro", "Eliminando", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/Remove-Male-User.png"));
                            LimpiarFormularioClientes();
                            break;
                    default: JOptionPane.showMessageDialog(jButtonEliminar, "Error desconocido Contacte a Coordinador: " + resultado, "Eliminando", JOptionPane.ERROR_MESSAGE);
                            break;
                }
            }
            else
            {
                JOptionPane.showMessageDialog(jButtonEliminar, "Rut Invalido", "Eliminando", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/Remove-Male-User.png"));
            }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(jButtonEliminar, "Ingrese el rut de la persona", "Eliminando", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/Remove-Male-User.png"));
            this.jTextFieldRut.requestFocus();
        }
        catch (StringIndexOutOfBoundsException e) 
        {
            JOptionPane.showMessageDialog(jButtonEliminar, "Ingrese el rut de la persona", "Eliminando", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/Remove-Male-User.png"));
            this.jTextFieldRut.requestFocus();
        }
    }
                /*FIN MANTENEDOR CLIENTE*/
    
    private char obtenerDigitoVerificador(int rut){
        int m = 0, s = 1;
        for (; rut != 0; rut /= 10)
        {
            s = (s + rut % 10 * (9 - m++ % 6)) % 11;
        }
        return (char) (s != 0 ? s + 47 : 75);  
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
    
    class FechaNacimiento{
    
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
    
    
    //////////////////////////FIN METODOS CLIENTES//////////////////////////////
    
    ///////////////////////////METODOS PELICULAS////////////////////////////////
    
                /*MANTENEDOR PELICULA*/
    private void AgregarPelicula(){
        try
        {
        int serial = Integer.parseInt(jTextFieldSerial.getText());
        String nombre = jTextFieldNombrePelicula.getText();
        String sinopsis = jTextFieldSinopsis.getText();
        int censura = Integer.parseInt(jComboBoxCensura.getSelectedItem().toString());
        String pagina = jTextFieldPaginaWeb.getText();
            int añoFP = Integer.parseInt(jComboBoxFPaño.getSelectedItem().toString());
            int mesFP = jComboBoxFPmes.getSelectedIndex() + 1;
            int diaFP = Integer.parseInt(jComboBoxFPdia.getSelectedItem().toString());
        String fechaProduccion = diaFP + "/" + mesFP + "/" + añoFP;
            int añoFE = Integer.parseInt(jComboBoxFEaño.getSelectedItem().toString());
            int mesFE = jComboBoxFEmes.getSelectedIndex() + 1;
            int diaFE = Integer.parseInt(jComboBoxFEdia.getSelectedItem().toString());
        String fechaEstreno = diaFE + "/" + mesFE + "/" + añoFE;
        int estado = -1;
        if (jComboBoxEstado.getSelectedItem().toString().equalsIgnoreCase("En Cartelera"))
        {
            estado =  0;
        }
        else{
            estado = 1;
        }
        String genero = jComboBoxGenero.getSelectedItem().toString();
        String productora = jComboBoxProductora.getSelectedItem().toString();
        String pais = jComboBoxPais.getSelectedItem().toString();
        
        int resultado = new BLL.Pelicula().AgregarPelicula(serial,nombre,sinopsis,censura,fechaProduccion,fechaEstreno,pagina,estado,productora,genero,pais);
            switch (resultado)
            {
                case 1:
                    JOptionPane.showMessageDialog(jInternalFramePeliculas, "Pelicula ingresada Correctamente", "Ingreso Peliculas", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/clip-48.png"));
                    LimpiarFormularioPelicula();
                    break;
                default:
                    JOptionPane.showMessageDialog(jInternalFramePeliculas, "error " + resultado, "Ingreso Peliculas", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(jInternalFramePeliculas, "Debe ingresar los campos correctamente", "Registros", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/clip-48.png"));
        } 
        catch (NullPointerException f){
            JOptionPane.showMessageDialog(jInternalFramePeliculas, "Debe ingresar los campos correctamente", "Registros", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/clip-48.png"));
        }
    }

    private void EliminarPelicula(){
        try
        {  
                int codigo = Integer.parseInt(jTextFieldSerial.getText());
                int resultado = new BLL.Pelicula().eliminarPelicula(codigo);
                switch(resultado)
                {
                    case 0: JOptionPane.showMessageDialog(jButtonDELETE, "El codigo de la pelicula no existe en los registros", "Eliminando", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/filmstrip-remove-48.png"));
                            break;
                    case 1: JOptionPane.showMessageDialog(jButtonDELETE, "Pelicula Eliminada del Registro", "Eliminando", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/filmstrip-remove-48.png"));
                            LimpiarFormularioPelicula();
                            break;
                    default: JOptionPane.showMessageDialog(jButtonDELETE, "Contacte a un Administrador \n Codigo del error: " + resultado, "Error", JOptionPane.ERROR_MESSAGE);
                            break;
                }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(jButtonDELETE, "Ingrese un el codigo de la pelicula", "Eliminando", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/filmstrip-remove-48.png"));
            this.jTextFieldSerial.requestFocus();
        }
        catch (StringIndexOutOfBoundsException e) 
        {
            JOptionPane.showMessageDialog(jButtonDELETE, "Ingrese un el codigo de la pelicula", "Eliminando", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/filmstrip-remove-48.png"));
            this.jTextFieldSerial.requestFocus();
        }
    }
    
    private void ActualizarPelicula(){
        try
        {
        int serial = Integer.parseInt(jTextFieldSerial.getText());
        String nombre = jTextFieldNombrePelicula.getText();
        String sinopsis = jTextFieldSinopsis.getText();
        int censura = Integer.parseInt(jComboBoxCensura.getSelectedItem().toString());
        String pagina = jTextFieldPaginaWeb.getText();
            int añoFP = Integer.parseInt(jComboBoxFPaño.getSelectedItem().toString());
            int mesFP = jComboBoxFPmes.getSelectedIndex() + 1;
            int diaFP = Integer.parseInt(jComboBoxFPdia.getSelectedItem().toString());
        String fechaProduccion = diaFP + "/" + mesFP + "/" + añoFP;
            int añoFE = Integer.parseInt(jComboBoxFEaño.getSelectedItem().toString());
            int mesFE = jComboBoxFEmes.getSelectedIndex() + 1;
            int diaFE = Integer.parseInt(jComboBoxFEdia.getSelectedItem().toString());
        String fechaEstreno = diaFE + "/" + mesFE + "/" + añoFE;
        int estado = -1;
        if (jComboBoxEstado.getSelectedItem().toString().equalsIgnoreCase("En Cartelera"))
        {
            estado =  0;
        }
        else{
            estado = 1;
        }
        String genero = jComboBoxGenero.getSelectedItem().toString();
        String productora = jComboBoxProductora.getSelectedItem().toString();
        String pais = jComboBoxPais.getSelectedItem().toString();
        
        int resultado = new BLL.Pelicula().ActualizarPelicula(serial,nombre,sinopsis,censura,fechaProduccion,fechaEstreno,pagina,estado,productora,genero,pais);
            switch (resultado)
            {
                case 1:
                    JOptionPane.showMessageDialog(jInternalFramePeliculas, "Pelicula actualizada Correctamente",
                            "Actualizar Peliculas", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/filmstrip-edit-48.png"));
                    LimpiarFormularioPelicula();
                    break;
                default:
                    JOptionPane.showMessageDialog(jInternalFramePeliculas, "error " + resultado,
                            "Actualizar Peliculas", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(jInternalFramePeliculas, "Debe ingresar los campos correctamente",
                    "Registros", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/filmstrip-edit-48.png"));
        } 
        catch (NullPointerException f){
            JOptionPane.showMessageDialog(jInternalFramePeliculas, "Debe ingresar los campos correctamente",
                    "Registros", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/filmstrip-edit-48.png"));
        }
    }
    
    private void BuscarPelicula(){
        try
        {   
            int codigo = Integer.parseInt(jTextFieldSerial.getText());
            BLL.Pelicula p = new BLL.Pelicula().buscarPelicula(codigo);
            if(p != null)
            {
                jTextFieldSerial.setText(String.valueOf(p.getCodigo()));
                jTextFieldNombrePelicula.setText(p.getNombre());
                jTextFieldSinopsis.setText(p.getSinopsis());
                jTextFieldPaginaWeb.setText(p.getPagWeb());
                
                int censura = p.getCensura();
                String numcensura = String.valueOf(censura);
                int indexCensura = -1;
                for (int i = 0; i < jComboBoxCensura.getItemCount(); i++) {
                    if (numcensura.equals(jComboBoxCensura.getItemAt(i).toString())) 
                    {
                        indexCensura = i;
                        break;
                    }
                }
                jComboBoxCensura.setSelectedIndex(indexCensura);
                
                int estado = p.getEstado();
                jComboBoxEstado.setSelectedIndex(estado);
                
                /*PRODUCTORA*/
                int idproductora = p.getCodProductora();
                String nombreproductora = new BLL.Productora().obtenerNombreProductora(idproductora);
                int indiceProductora = -1;
                for (int i = 0; i < jComboBoxProductora.getItemCount(); i++) {
                    if (nombreproductora.equals(jComboBoxProductora.getItemAt(i).toString())) 
                    {
                        indiceProductora = i;
                        break;
                    }
                }
                jComboBoxProductora.setSelectedIndex(indiceProductora);
                /*GENERO*/
                int idgenero = p.getCodProductora();
                String nombregenero = new BLL.Genero().obtenerNombreGenero(idgenero);
                int indicegenero = -1;
                for (int i = 0; i < jComboBoxGenero.getItemCount(); i++) {
                    if (nombregenero.equals(jComboBoxGenero.getItemAt(i).toString())) 
                    {
                        indicegenero = i;
                        break;
                    }
                }
                jComboBoxGenero.setSelectedIndex(indicegenero);
                /*PAIS*/
                int idpais = p.getCodProductora();
                String nombrepais = new BLL.Pais().obtenerNombrePais(idpais);
                int indicepais = -1;
                for (int i = 0; i < jComboBoxPais.getItemCount(); i++) {
                    if (nombrepais.equals(jComboBoxPais.getItemAt(i).toString())) 
                    {
                        indicepais = i;
                        break;
                    }
                }
                jComboBoxPais.setSelectedIndex(indicepais);
                
                /*FECHA DE PRODUCCION*/
                String añofp = p.getFecProduccion().substring(0, 4);
                String mesfp = p.getFecProduccion().substring(5, 7);
                String diafp = p.getFecProduccion().substring(8, 10);
                
                int indiceaño = -1;
                for (int i = 0; i < jComboBoxFPaño.getItemCount(); i++) {
                    if (añofp.equals(jComboBoxFPaño.getItemAt(i).toString())) 
                    {
                        indiceaño = i;
                        break;
                    }
                }
                jComboBoxFPaño.setSelectedIndex(indiceaño);
                
                int indicemes = Integer.parseInt(mesfp) - 1;
                jComboBoxFPmes.setSelectedIndex(indicemes);
                
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addElement(diafp);
                jComboBoxFPdia.setModel(modelo);
                
                /*FECHA DE ESTRENO*/
                String añofe = p.getFecEstreno().substring(0, 4);
                String mesfe = p.getFecEstreno().substring(5, 7);
                String diafe = p.getFecEstreno().substring(8, 10);
                
                int indiceañofe = -1;
                for (int i = 0; i < jComboBoxFEaño.getItemCount(); i++) {
                    if (añofe.equals(jComboBoxFEaño.getItemAt(i).toString())) 
                    {
                        indiceañofe = i;
                        break;
                    }
                }
                jComboBoxFEaño.setSelectedIndex(indiceañofe);
                
                int indicemesfe = Integer.parseInt(mesfe) - 1;
                jComboBoxFEmes.setSelectedIndex(indicemesfe);
                
                DefaultComboBoxModel modelo2 = new DefaultComboBoxModel();
                modelo2.addElement(diafe);
                jComboBoxFEdia.setModel(modelo2);
            }
            else
            {
                JOptionPane.showMessageDialog(jInternalFrameCliente, "El codigo ingresado no existe en registros",
                "Pelicula",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/filmstrip-search-48.png"));
                this.jTextFieldSerial.requestFocus();
            }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(jInternalFrameCliente, "Debe ingresar un codigo valido a buscar",
            "Pelicula",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/filmstrip-search-48.png"));
            this.jTextFieldSerial.requestFocus();
        }
        catch (StringIndexOutOfBoundsException e) 
        {
            JOptionPane.showMessageDialog(jInternalFrameCliente, "Ingrese el codigo de la pelicula",
            "Pelicula",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/filmstrip-search-48.png"));
            this.jTextFieldSerial.requestFocus();
        }
        catch (NullPointerException e) 
        {
            JOptionPane.showMessageDialog(jInternalFrameCliente, "Ingrese el codigo de la pelicula",
            "Registros",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Image/Search-Male-User.png"));
            this.jTextFieldSerial.requestFocus();
        }
    }
                /*FIN MANTENEDOR PELICULA*/
    
    private void cargarPaisPelicula(){
        this.jComboBoxPais.removeAllItems();
        ArrayList<Pais> Pais = new Pais().listadoPais();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for(BLL.Pais c: Pais)
        {
            modelo.addElement(c);
        }
        this.jComboBoxPais.setModel(modelo);
        this.jComboBoxPais.setSelectedIndex(-1);
    }
    
    private void cargarGeneroPelicula(){
        this.jComboBoxGenero.removeAllItems();
        ArrayList<Genero> Genero = new Genero().listadoGenero();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for(BLL.Genero c: Genero)
        {
            modelo.addElement(c);
        }
        this.jComboBoxGenero.setModel(modelo);
        this.jComboBoxGenero.setSelectedIndex(-1);
    }
    
    private void cargarProductoraPelicula(){
        this.jComboBoxProductora.removeAllItems();
        ArrayList<Productora> Productora = new Productora().listadoProductora();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for(BLL.Productora c: Productora)
        {
            modelo.addElement(c);
        }
        this.jComboBoxProductora.setModel(modelo);
        this.jComboBoxProductora.setSelectedIndex(-1);
    }
    
    private void LimpiarFormularioPelicula(){
        obtenerMaxIdPelicula();
        jTextFieldNombrePelicula.setText("");
        jTextFieldSinopsis.setText("");
        jComboBoxCensura.setSelectedIndex(-1);
        jTextFieldPaginaWeb.setText("");
        jComboBoxFPaño.setSelectedIndex(-1);
        jComboBoxFPmes.setSelectedIndex(-1);
        jComboBoxFPdia.setSelectedIndex(-1);
        jComboBoxFEaño.setSelectedIndex(-1);
        jComboBoxFEmes.setSelectedIndex(-1);
        jComboBoxFEdia.setSelectedIndex(-1);
        jComboBoxEstado.setSelectedIndex(-1);
        jComboBoxGenero.setSelectedIndex(-1);
        jComboBoxProductora.setSelectedIndex(-1);
        jComboBoxPais.setSelectedIndex(-1);
    }
    
    private void obtenerMaxIdPelicula(){
        int max = new BLL.Pelicula().registroMaxPelicula();
        if(max > -1)
        {
            this.jTextFieldSerial.setText(String.valueOf(max + 1));
        }
        else
        {
            JOptionPane.showMessageDialog(this.jInternalFramePeliculas, "Se ha producido un error!!!", "Registro Peliculas", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    class FechaProduccion{
        
    private void cargarDiasDelMesFP(int mes){
        switch(mes)
        {
            case 0: mes31DiasFP();break;
            case 1: mesfebreroFP();break;
            case 2: mes31DiasFP();break;
            case 3: mes30DiasFP();break;
            case 4: mes31DiasFP();break;
            case 5: mes30DiasFP();break;
            case 6: mes31DiasFP();break;   
            case 7: mes31DiasFP();break;
            case 8: mes31DiasFP();break;   
            case 9: mes31DiasFP();break;  
            case 10: mes30DiasFP();break;
            case 11: mes31DiasFP();break;   
        }
    }
    
    private void mesfebreroFP(){
        try{
        jComboBoxFPdia.removeAllItems();
        int año = Integer.parseInt(jComboBoxFPaño.getSelectedItem().toString());
        if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)))
        {
            for (int i = 1; i <= 29; i++) 
            {
                if (i < 10) 
                {
                    jComboBoxFPdia.addItem("0" + i);
                }
                else
                {
                    jComboBoxFPdia.addItem(i);
                }    
            }
        }
        else
        {
            for (int i = 1; i <= 28; i++) 
            {
                if (i < 10) 
                {
                    jComboBoxFPdia.addItem("0" + i);
                }
                else
                {
                    jComboBoxFPdia.addItem(i);
                }    
            }
        }
        }catch(NullPointerException e){
            
        }
    }
    
    private void mes30DiasFP(){
        jComboBoxFPdia.removeAllItems();
        for (int i = 1; i <= 30; i++) 
        {
            if (i < 10) 
            {
                jComboBoxFPdia.addItem("0" + i);
            }
            else
            {
                jComboBoxFPdia.addItem(i);
            }    
        }
    }
    
    private void mes31DiasFP(){
        jComboBoxFPdia.removeAllItems();
        for (int i = 1; i <= 31; i++) 
        {
            if (i < 10) 
            {
                jComboBoxFPdia.addItem("0" + i);
            }
            else
            {
                jComboBoxFPdia.addItem(i);
            }    
        }
    }
    }
    
    class FechaEstreno{
        
    private void cargarDiasDelMesFE(int mes){
        switch(mes)
        {
            case 0: mes31DiasFE();break;
            case 1: mesfebreroFE();break;
            case 2: mes31DiasFE();break;
            case 3: mes30DiasFE();break;
            case 4: mes31DiasFE();break;
            case 5: mes30DiasFE();break;
            case 6: mes31DiasFE();break;   
            case 7: mes31DiasFE();break;
            case 8: mes31DiasFE();break;   
            case 9: mes31DiasFE();break;  
            case 10: mes30DiasFE();break;
            case 11: mes31DiasFE();break;   
        }
    }
    
    private void mesfebreroFE(){
        try{
        jComboBoxFEdia.removeAllItems();
        int año = Integer.parseInt(jComboBoxFEaño.getSelectedItem().toString());
        if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)))
        {
            for (int i = 1; i <= 29; i++) 
            {
                if (i < 10) 
                {
                    jComboBoxFEdia.addItem("0" + i);
                }
                else
                {
                    jComboBoxFEdia.addItem(i);
                }    
            }
        }
        else
        {
            for (int i = 1; i <= 28; i++) 
            {
                if (i < 10) 
                {
                    jComboBoxFEdia.addItem("0" + i);
                }
                else
                {
                    jComboBoxFEdia.addItem(i);
                }    
            }
        }
        }catch(NullPointerException e){
            
        }
    }
    
    private void mes30DiasFE(){
        jComboBoxFEdia.removeAllItems();
        for (int i = 1; i <= 30; i++) 
        {
            if (i < 10) 
            {
                jComboBoxFEdia.addItem("0" + i);
            }
            else
            {
                jComboBoxFEdia.addItem(i);
            }    
        }
    }
    
    private void mes31DiasFE(){
        jComboBoxFEdia.removeAllItems();
        for (int i = 1; i <= 31; i++) 
        {
            if (i < 10) 
            {
                jComboBoxFEdia.addItem("0" + i);
            }
            else
            {
                jComboBoxFEdia.addItem(i);
            }    
        }
    }
    }
    ///////////////////////////FIN METODOS PELICULAS////////////////////////////
    
    ////////////////////////////METODOS DEL JFRAME//////////////////////////////
    public void configInterfaceAdmin(){
        InterfaceAdmin i = new InterfaceAdmin();
        i.setVisible(true);
        i.setLocationRelativeTo(null);
        i.setExtendedState(MAXIMIZED_BOTH);
        i.setTitle("Administración CINEDEMARK");
        
    }
    ////////////////////////////////////////////////////////////////////////////
    /////////////////////FIN METODOS///////////FIN METODOS//////////////////////
    ////////////////////////////////////////////////////////////////////////////
    
    
    
    
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
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
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonADD;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCLEAN;
    private javax.swing.JButton jButtonDELETE;
    private javax.swing.JButton jButtonEDIT;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonLimpiarFormulario;
    private javax.swing.JButton jButtonSEARCH;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBoxCensura;
    private javax.swing.JComboBox jComboBoxComuna;
    private javax.swing.JComboBox jComboBoxEstado;
    private javax.swing.JComboBox jComboBoxFEaño;
    private javax.swing.JComboBox jComboBoxFEdia;
    private javax.swing.JComboBox jComboBoxFEmes;
    private javax.swing.JComboBox jComboBoxFPaño;
    private javax.swing.JComboBox jComboBoxFPdia;
    private javax.swing.JComboBox jComboBoxFPmes;
    private javax.swing.JComboBox jComboBoxFechanac_año;
    private javax.swing.JComboBox jComboBoxFechanac_dia;
    private javax.swing.JComboBox jComboBoxFechanac_mes;
    private javax.swing.JComboBox jComboBoxGenero;
    private javax.swing.JComboBox jComboBoxMembresia;
    private javax.swing.JComboBox jComboBoxPais;
    private javax.swing.JComboBox jComboBoxProductora;
    private javax.swing.JComboBox jComboBoxSucursal;
    private javax.swing.JInternalFrame jInternalFrameCartelera;
    private javax.swing.JInternalFrame jInternalFrameCliente;
    private javax.swing.JInternalFrame jInternalFramePeliculas;
    private javax.swing.JInternalFrame jInternalFrameSalas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCensura;
    private javax.swing.JLabel jLabelComuna;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFechaEstreno;
    private javax.swing.JLabel jLabelFechaNacimiento;
    private javax.swing.JLabel jLabelFechaProduccion;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelMembresia;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombrePelicula;
    private javax.swing.JLabel jLabelPais;
    private javax.swing.JLabel jLabelPeginaWeb;
    private javax.swing.JLabel jLabelProductora;
    private javax.swing.JLabel jLabelRut;
    private javax.swing.JLabel jLabelSerial;
    private javax.swing.JLabel jLabelSinopsis;
    private javax.swing.JLabel jLabelSucursal;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBarInterfasAdmin;
    private javax.swing.JMenuItem jMenuItemCartelera;
    private javax.swing.JMenuItem jMenuItemCerrarSesion;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemPeliculas;
    private javax.swing.JMenuItem jMenuItemSalas;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuOpciones;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNombrePelicula;
    private javax.swing.JTextField jTextFieldPaginaWeb;
    private javax.swing.JTextField jTextFieldRut;
    private javax.swing.JTextField jTextFieldSerial;
    private javax.swing.JTextField jTextFieldSinopsis;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
