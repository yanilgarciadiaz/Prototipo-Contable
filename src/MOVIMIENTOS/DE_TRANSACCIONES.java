package MOVIMIENTOS;

import ARCHIVOS.ManejoArchivos;
import MENU_PRINCIPAL.LOgin;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import texto.TextPrompt;

public class DE_TRANSACCIONES extends javax.swing.JFrame {

    public DefaultTableModel TablaM;
    private int secuencia = 0;
    String secf = "";
    String usuario = LOgin.getUsuario();
    boolean estatus;
    public static String LineaAntigua;
    public static String LineaAntigua1;
    public static String LineaTabla;
    private javax.swing.Timer timer;

    private static double DebitoA = 0.0;
    private static double CreditoA = 0.0;
    String fechaAc = "**/**/****";
    boolean Modificar = false;
    int seleccionar;
    boolean mod = false;
    boolean eliminar = false;
    String secuenciaGlobal;
    String num;
    int numero;
    private int maxSequence = 2;

    public DE_TRANSACCIONES() {
        initComponents();
        txtFecha.setText(fecha());
        txtFecha.setEditable(false);
        txtUser.setText(usuario);
        txtUser.setEditable(false);
        txtHora.setEditable(false);
        this.setTitle("Movimiento de Transacciones");
        this.setLocationRelativeTo(null);

        txtNdocumento.requestFocusInWindow();
        txtMonto.setEditable(false);
        txtDescripcionC.setEditable(false);
        this.TablaRegistros.setComponentPopupMenu(PopupMenuTabla);

        TablaM = (DefaultTableModel) TablaRegistros.getModel();

        timer = new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtHora.setText(hora());
            }
        });
        timer.start();

        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Century Gothic", Font.PLAIN, 14)));
        UIManager.put("OptionPane.messageForeground", Color.black);

        JTableHeader tableHeader = TablaRegistros.getTableHeader();
        Font headerFont = new Font("Century Gothic", Font.PLAIN, 14); // Cambiar el tipo de letra
        tableHeader.setFont(headerFont);

        TextPrompt ndoc = new TextPrompt(" Digite No. del documento", txtNdocumento, TextPrompt.Show.ALWAYS);
        ndoc.setForeground(Color.gray);
        TextPrompt ncuent = new TextPrompt(" Digite el No. de cuenta", txtNcuenta, TextPrompt.Show.ALWAYS);
        ncuent.setForeground(Color.gray);
        TextPrompt deb = new TextPrompt(" Digite el Debito", txtDebito, TextPrompt.Show.ALWAYS);
        deb.setForeground(Color.gray);
        TextPrompt cred = new TextPrompt(" Digite el Credito", txtCredito, TextPrompt.Show.ALWAYS);
        cred.setForeground(Color.gray);
        TextPrompt com = new TextPrompt(" Digite un Comentario", txtComentario, TextPrompt.Show.ALWAYS);
        com.setForeground(Color.gray);
        TextPrompt descD = new TextPrompt(" Digite la Descripcion del documento", txtDescripcion, TextPrompt.Show.ALWAYS);
        descD.setForeground(Color.gray);

        cargarEstados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopupMenuTabla = new javax.swing.JPopupMenu();
        m_eliminar = new javax.swing.JMenuItem();
        m_modificar = new javax.swing.JMenuItem();
        PanelPrincipal = new javax.swing.JPanel();
        PanelCabezera = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CbTipoDoc = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNdocumento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        PanelDetalles = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDebito = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcionC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNcuenta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCredito = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtComentario = new javax.swing.JTextField();
        BtnAgregar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        PanelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRegistros = new javax.swing.JTable();
        BtnSalir = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnLimpiarAll = new javax.swing.JButton();
        PanelAzul = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        m_eliminar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        m_eliminar.setText("ELIMINAR");
        m_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_eliminarActionPerformed(evt);
            }
        });
        PopupMenuTabla.add(m_eliminar);

        m_modificar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        m_modificar.setText("MODIFICAR");
        m_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_modificarActionPerformed(evt);
            }
        });
        PopupMenuTabla.add(m_modificar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCabezera.setBackground(new java.awt.Color(255, 255, 255));
        PanelCabezera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("HECHO POR");
        PanelCabezera.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 100, 30));

        CbTipoDoc.setBackground(new java.awt.Color(237, 237, 237));
        CbTipoDoc.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CbTipoDoc.setToolTipText("");
        CbTipoDoc.setBorder(null);
        CbTipoDoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbTipoDocItemStateChanged(evt);
            }
        });
        PanelCabezera.add(CbTipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 330, 26));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("TIPO DE DOCUMENTO");
        PanelCabezera.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 152, 32));

        txtFecha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        PanelCabezera.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 100, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("MONTO");
        PanelCabezera.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 105, 32));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("NO. DOCUMENTO");
        PanelCabezera.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 128, 32));

        txtNdocumento.setBackground(new java.awt.Color(237, 237, 237));
        txtNdocumento.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtNdocumento.setBorder(null);
        txtNdocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNdocumentoActionPerformed(evt);
            }
        });
        txtNdocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNdocumentoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNdocumentoKeyTyped(evt);
            }
        });
        PanelCabezera.add(txtNdocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 330, 26));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("DESCRIPCION");
        PanelCabezera.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 105, 32));

        txtMonto.setBackground(new java.awt.Color(237, 237, 237));
        txtMonto.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtMonto.setBorder(null);
        PanelCabezera.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 330, 26));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("FECHA");
        PanelCabezera.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 100, 30));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("HORA");
        jLabel13.setPreferredSize(new java.awt.Dimension(84, 19));
        PanelCabezera.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 100, 30));

        txtUser.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PanelCabezera.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 100, 30));

        txtHora.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PanelCabezera.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, 100, 30));

        txtDescripcion.setBackground(new java.awt.Color(237, 237, 237));
        txtDescripcion.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtDescripcion.setBorder(null);
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyPressed(evt);
            }
        });
        PanelCabezera.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 330, 26));

        PanelPrincipal.add(PanelCabezera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 930, 180));

        PanelDetalles.setBackground(new java.awt.Color(0, 153, 255));
        PanelDetalles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DEBITO");
        PanelDetalles.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 50, 32));

        txtDebito.setBackground(new java.awt.Color(237, 237, 237));
        txtDebito.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtDebito.setBorder(null);
        txtDebito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDebitoKeyTyped(evt);
            }
        });
        PanelDetalles.add(txtDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 250, 26));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("COMENTARIO");
        PanelDetalles.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 105, 30));

        txtDescripcionC.setBackground(new java.awt.Color(237, 237, 237));
        txtDescripcionC.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtDescripcionC.setBorder(null);
        txtDescripcionC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescripcionCKeyPressed(evt);
            }
        });
        PanelDetalles.add(txtDescripcionC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 250, 26));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NO. CUENTA");
        PanelDetalles.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 100, 32));

        txtNcuenta.setBackground(new java.awt.Color(237, 237, 237));
        txtNcuenta.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtNcuenta.setBorder(null);
        txtNcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNcuentaActionPerformed(evt);
            }
        });
        txtNcuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNcuentaKeyTyped(evt);
            }
        });
        PanelDetalles.add(txtNcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 250, 26));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CREDITO");
        PanelDetalles.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 70, 32));

        txtCredito.setBackground(new java.awt.Color(237, 237, 237));
        txtCredito.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtCredito.setBorder(null);
        txtCredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCreditoKeyTyped(evt);
            }
        });
        PanelDetalles.add(txtCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 250, 26));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("DESCRIPCION");
        PanelDetalles.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 105, 30));

        txtComentario.setBackground(new java.awt.Color(237, 237, 237));
        txtComentario.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        txtComentario.setBorder(null);
        txtComentario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtComentarioKeyPressed(evt);
            }
        });
        PanelDetalles.add(txtComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 250, 26));

        BtnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnAgregar.setText("AGREGAR");
        BtnAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnAgregarMouseExited(evt);
            }
        });
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        PanelDetalles.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 110, 40));

        BtnLimpiar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnLimpiar.setText("LIMPIAR");
        BtnLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BtnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLimpiar.setPreferredSize(new java.awt.Dimension(76, 19));
        BtnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnLimpiarMouseExited(evt);
            }
        });
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });
        PanelDetalles.add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 110, 40));

        PanelPrincipal.add(PanelDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 930, 190));

        PanelTable.setBackground(new java.awt.Color(255, 255, 255));
        PanelTable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaRegistros.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TablaRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SEC", "CUENTA", "DESCRIPCION", "DEBITO", "CREDITO", "COMENTARIO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaRegistros);
        if (TablaRegistros.getColumnModel().getColumnCount() > 0) {
            TablaRegistros.getColumnModel().getColumn(0).setPreferredWidth(1);
            TablaRegistros.getColumnModel().getColumn(1).setPreferredWidth(2);
            TablaRegistros.getColumnModel().getColumn(2).setResizable(false);
            TablaRegistros.getColumnModel().getColumn(2).setPreferredWidth(160);
            TablaRegistros.getColumnModel().getColumn(3).setResizable(false);
            TablaRegistros.getColumnModel().getColumn(3).setPreferredWidth(15);
            TablaRegistros.getColumnModel().getColumn(4).setResizable(false);
            TablaRegistros.getColumnModel().getColumn(4).setPreferredWidth(15);
            TablaRegistros.getColumnModel().getColumn(5).setResizable(false);
            TablaRegistros.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        PanelTable.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 170));

        BtnSalir.setBackground(new java.awt.Color(160, 171, 176));
        BtnSalir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        BtnSalir.setText("SALIR");
        BtnSalir.setBorder(null);
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.setPreferredSize(new java.awt.Dimension(76, 19));
        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnSalirMouseExited(evt);
            }
        });
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        PanelTable.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 130, 50));

        BtnGuardar.setBackground(new java.awt.Color(160, 171, 176));
        BtnGuardar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardar.setText("GUARDAR");
        BtnGuardar.setBorder(null);
        BtnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnGuardarMouseExited(evt);
            }
        });
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        PanelTable.add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 130, 50));

        BtnLimpiarAll.setBackground(new java.awt.Color(160, 171, 176));
        BtnLimpiarAll.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnLimpiarAll.setForeground(new java.awt.Color(255, 255, 255));
        BtnLimpiarAll.setText("LIMPIAR");
        BtnLimpiarAll.setBorder(null);
        BtnLimpiarAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLimpiarAll.setPreferredSize(new java.awt.Dimension(76, 19));
        BtnLimpiarAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnLimpiarAllMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnLimpiarAllMouseExited(evt);
            }
        });
        BtnLimpiarAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarAllActionPerformed(evt);
            }
        });
        PanelTable.add(BtnLimpiarAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 130, 50));

        PanelPrincipal.add(PanelTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 930, 250));

        PanelAzul.setBackground(new java.awt.Color(0, 153, 255));
        PanelAzul.setPreferredSize(new java.awt.Dimension(705, 70));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("TRANSACCIONES");

        javax.swing.GroupLayout PanelAzulLayout = new javax.swing.GroupLayout(PanelAzul);
        PanelAzul.setLayout(PanelAzulLayout);
        PanelAzulLayout.setHorizontalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzulLayout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelAzulLayout.setVerticalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzulLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel11)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        PanelPrincipal.add(PanelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNdocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNdocumentoActionPerformed
        String doc = txtNdocumento.getText();
        try {
            boolean encontrado = false;
            Scanner s;
            File t = new File("Cabecera Transacciones.txt");

            s = new Scanner(t);

            while (s.hasNextLine() && !encontrado) {
                String linea = s.nextLine();
                Scanner s1 = new Scanner(linea);

                s1.useDelimiter("\\s*;\\s*");

                String codigoT = s1.next();
                String fecha = s1.next();
                String tipo = s1.next();
                String Descripcion = s1.next();
                String hechoPor = s1.next();
                String monto = s1.next();
                String fechaAc = s1.next();
                String estado = s1.next();

                if (doc.equals(codigoT)) {

                    if (estado.equals("true")) {
                        JOptionPane.showMessageDialog(this, "Esta transaccion ya esta Actualizada");
                        BtnLimpiarAllActionPerformed(evt);
                    } else {
                        if (txtNdocumento.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(this, "Debe ingresar el Código del Documento para continuar");
                            txtNdocumento.grabFocus();
                        } else {
                            txtDescripcion.requestFocus();
                        }

                        int index = Integer.parseInt(tipo);
                        CbTipoDoc.setSelectedIndex(index);
                        txtDescripcion.setText(Descripcion);
                        txtMonto.setText(monto);

                        LineaAntigua = txtNdocumento.getText() + ";" + txtFecha.getText() + ";" + CbTipoDoc.getSelectedIndex()
                                + ";" + txtDescripcion.getText() + ";" + usuario + ";" + txtMonto.getText() + ";"
                                + fechaAc + ";" + estatus;

                        TablaC(codigoT); //para mostar las transacciones del txt en la tabla para su modificacion
                        secuencia = TablaM.getRowCount();

                        Modificar = true;
                        encontrado = true;
                    }
                } else {
                    txtNdocumento.setText(doc);
                    Modificar = false;
                    encontrado = false;
                }
            }
            s.close();
        } catch (FileNotFoundException e) {
        }

    }//GEN-LAST:event_txtNdocumentoActionPerformed

    private void txtNcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNcuentaActionPerformed
        if (txtNcuenta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el Código del Documento para continuar");
            txtNcuenta.grabFocus();
        } else {
            txtDebito.requestFocus();
        }

        String auxc = txtNcuenta.getText();
        int tipo;
        int cuenta = Integer.parseInt(auxc);

        boolean encontrado = false;
        Scanner s;

        try {

            File f = new File("Catalogo.txt");
            if (!f.exists()) {

            } else {

                s = new Scanner(f);

                while (s.hasNextLine() && !encontrado) {

                    String linea = s.nextLine();
                    Scanner s1 = new Scanner(linea);

                    s1.useDelimiter("\\s*;\\s*");

                    try {
                        if (cuenta == Integer.parseInt(s1.next())) {

                            txtNcuenta.setText(auxc);
                            txtDescripcionC.setText(s1.next());
                            tipo = Integer.parseInt(s1.next());

                            if (tipo == 0) {
                                JOptionPane.showMessageDialog(this, "Esta cuenta no puede realizar transacciones");
                                BtnLimpiarActionPerformed(evt);
                                txtNcuenta.requestFocus();
                            }

                            encontrado = true;
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                        System.out.println(e);
                    }
                }

                if (!encontrado) {
                    JOptionPane.showMessageDialog(this, "Este No. de cuenta no existe");
                    txtNcuenta.setText("");
                    txtNcuenta.requestFocus();
                }
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "No se encontró el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_txtNcuentaActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        if (txtNdocumento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el Código del Documento para Guardar");
            txtNdocumento.requestFocus();
        } else if (CbTipoDoc.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el Código del Documento para Guardar");
        } else if (txtMonto.getText().isEmpty() && secuencia < 2) {
            JOptionPane.showMessageDialog(this, "Debe realizar transacciones para Guardar");
            txtNcuenta.requestFocus();
        } else if (txtNcuenta.getText().isEmpty() && txtCredito.getText().isEmpty() && txtDebito.getText().isEmpty() && secuencia < 2) {
            JOptionPane.showMessageDialog(this, "Debe realizar transacciones para Guardar");
            txtNcuenta.grabFocus();
        } else if (secuencia < 2) {
            JOptionPane.showMessageDialog(rootPane, "Para guardar Debe al menos involucrar dos cuentas", "ERROR", HEIGHT);
            txtNcuenta.grabFocus();
        } else {
            
            num = (String) TablaM.getValueAt(TablaM.getRowCount() - 1, 0);
            numero = Integer.parseInt(num);
            
            double totaldb = 0, totalcr = 0;
            String monto;

            try {

                for (int i = 0; i < TablaM.getRowCount(); i++) {
                    double debito = Double.parseDouble(TablaM.getValueAt(i, 3).toString());
                    double credito = Double.parseDouble(TablaM.getValueAt(i, 4).toString());

                    totaldb += debito;
                    totalcr += credito;
                }

                if (totaldb == totalcr) {

                    monto = Double.toString(totaldb);
                    txtMonto.setText(monto);

                    File d = new File("Detalle Transacciones.txt");
                    if (!d.exists()) {
                        d.createNewFile();
                    }

                    String sec = (String) TablaM.getValueAt(seleccionar, 0);
                    String cuenta = (String) TablaM.getValueAt(seleccionar, 1);
                    String desc = (String) TablaM.getValueAt(seleccionar, 2);
                    String db = (String) TablaM.getValueAt(seleccionar, 3);
                    String cr = (String) TablaM.getValueAt(seleccionar, 4);
                    String coment = (String) TablaM.getValueAt(seleccionar, 5);

                    String LineaActual1 = txtNdocumento.getText() + ";" + sec + ";" + cuenta + ";" + desc
                            + ";" + db + ";" + cr + ";" + coment;

                    File f = new File("Cabecera Transacciones.txt");
                    ManejoArchivos file = new ManejoArchivos();
                    ManejoArchivos fL = new ManejoArchivos();

                    if (!f.exists()) {
                        f.createNewFile();
                    }

                    String LineaActual = txtNdocumento.getText() + ";" + txtFecha.getText() + ";" + CbTipoDoc.getSelectedIndex() + ";"
                            + txtDescripcion.getText() + ";" + usuario + ";" + txtMonto.getText() + ";" + fechaAc
                            + ";" + estatus;

                    if (Modificar) {
                        file.Modificar(LineaAntigua, LineaActual, f);
                        fL.Modificar(LineaAntigua1, LineaActual1, d);

                        if (numero > 2) {
                            maxSequence = secuencia;
                            int fila = TablaM.getRowCount() - 1;

                            String tsec = (String) TablaM.getValueAt(fila, 0);
                            String tcuent = (String) TablaM.getValueAt(fila, 1);
                            String tdesc = (String) TablaM.getValueAt(fila, 2);
                            String tdebito = (String) TablaM.getValueAt(fila, 3);
                            String tcred = (String) TablaM.getValueAt(fila, 4);
                            String tcomt = (String) TablaM.getValueAt(fila, 5);

                            String LineaGuardar = txtNdocumento.getText() + ";" + tsec + ";" + tcuent + ";" + tdesc
                                    + ";" + tdebito + ";" + tcred + ";" + tcomt;

                            fL.GuardarDatos(LineaGuardar, d);
                        }

                        if (eliminar) {
                            eliminarR();
                            eliminar = false;
                        }

                        BtnLimpiarAllActionPerformed(evt);
                        Modificar = false;
                        txtNdocumento.requestFocus();
                    } else {
                        file.GuardarDatos(LineaActual, f);

                        BufferedWriter writer = new BufferedWriter(new FileWriter(d, true));

                        for (int i = 0; i < TablaM.getRowCount(); i++) {
                            writer.write(txtNdocumento.getText());
                            writer.write(";");
                            for (int j = 0; j < TablaM.getColumnCount(); j++) {

                                writer.write(TablaM.getValueAt(i, j).toString());

                                if (j < TablaM.getColumnCount() - 1) {
                                    writer.write(";");
                                }
                            }
                            writer.newLine();
                        }
                        writer.close();
                        BtnLimpiarAllActionPerformed(evt);
                        txtNdocumento.requestFocus();
                    }

                    JOptionPane.showMessageDialog(rootPane, "Registro guardado");

                } else {
                    JOptionPane.showMessageDialog(rootPane, "La cantidad de Debitos y Creditos deben ser iguales", "ERROR", HEIGHT);
                    txtNcuenta.requestFocus();
                }
            } catch (IOException | NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Error al guardar los Datos");
            }
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        txtNcuenta.setText("");
        txtDescripcionC.setText("");
        txtDebito.setText("");
        txtCredito.setText("");
        txtComentario.setText("");
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        if (!(txtCredito.getText().isEmpty() || txtCredito.getText().equals("0")) && !(txtDebito.getText().isEmpty() || txtDebito.getText().equals("0"))) {
            JOptionPane.showMessageDialog(rootPane, "Una cuenta no puede tener una transaccion de creditos y debitos en la misma linea", "ERROR", HEIGHT);
        }
        if (txtNcuenta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Rellene el No. de cuenta antes de agregar", "ERROR", HEIGHT);
            txtNcuenta.grabFocus();
        } else if (txtCredito.getText().isEmpty() && txtDebito.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Rellene Creditos o Debitos antes de agregar", "ERROR", HEIGHT);
        } else {

            File d = new File("Detalle Transacciones.txt");

            int maxSecuencia = obtenerMaximaSecuencia();

            secuencia = maxSecuencia + 1;

            if (mod) {
                TablaM.setValueAt(secuenciaGlobal, seleccionar, 0);
                TablaM.setValueAt(txtNcuenta.getText(), seleccionar, 1);
                TablaM.setValueAt(txtDescripcionC.getText(), seleccionar, 2);
                TablaM.setValueAt(txtDebito.getText(), seleccionar, 3);
                TablaM.setValueAt(txtCredito.getText(), seleccionar, 4);
                TablaM.setValueAt(txtComentario.getText(), seleccionar, 5);

                mod = false;
                BtnLimpiarActionPerformed(evt);
            } else {
                secf = String.format("%03d", secuencia);
                String debito, credito;
                String cuenta = txtNcuenta.getText();
                String descrip = txtDescripcionC.getText();

                if (txtDebito.getText().isEmpty()) {
                    debito = "0";
                    txtMonto.setText(txtCredito.getText());
                } else {
                    debito = txtDebito.getText();
                }

                if (txtCredito.getText().isEmpty()) {
                    credito = "0";
                    txtMonto.setText(txtDebito.getText());
                } else {
                    credito = txtCredito.getText();
                }

                double acumD = Double.parseDouble(debito);
                double acumC = Double.parseDouble(credito);
                DebitoA = acumD;
                CreditoA = acumC;

                String coment = txtComentario.getText();

                TablaM.addRow(new Object[]{secf, cuenta, descrip, debito, credito, coment});
                BtnLimpiarActionPerformed(evt);
                txtNcuenta.requestFocus();
            }
        }
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void CbTipoDocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbTipoDocItemStateChanged
        txtNcuenta.requestFocus();

    }//GEN-LAST:event_CbTipoDocItemStateChanged

    private void txtDescripcionCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionCKeyPressed
        txtDebito.requestFocus();
    }//GEN-LAST:event_txtDescripcionCKeyPressed

    private void txtComentarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComentarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            BtnAgregar.doClick();
        }
    }//GEN-LAST:event_txtComentarioKeyPressed

    private void txtNdocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNdocumentoKeyTyped
        String allowedCharacters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-";
        char c = evt.getKeyChar();

        if ((allowedCharacters.indexOf(c) == -1) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_ENTER)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNdocumentoKeyTyped

    private void txtNcuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNcuentaKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0' || c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNcuentaKeyTyped

    private void txtDebitoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDebitoKeyTyped
        char c = evt.getKeyChar();

        if (((c < '0' || c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.' || txtDebito.getText().contains("."))) {
            evt.consume();
        }

        String debitoText = txtDebito.getText().trim();
        String creditoText = txtCredito.getText().trim();

        if (!debitoText.isEmpty() && creditoText.isEmpty()) {
            txtCredito.setEditable(false);
        } else {
            txtCredito.setEditable(true);
        }

        if (Modificar) {
            if ("0".equals(debitoText)) {
                txtDebito.setEditable(false);
                txtCredito.setEditable(true);
            } else if ("0".equals(creditoText)) {
                txtCredito.setEditable(false);
                txtDebito.setEditable(true);
            } else if ("0".equals(debitoText) && "0".equals(creditoText)) {
                txtDebito.setEditable(true);
                txtCredito.setEditable(true);
            }
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtComentario.requestFocus();
        }
    }//GEN-LAST:event_txtDebitoKeyTyped

    private void txtCreditoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreditoKeyTyped
        char c = evt.getKeyChar();

        if (((c < '0' || c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.' || txtCredito.getText().contains("."))) {
            evt.consume();
        }

        String creditoText = txtCredito.getText().trim();
        String debitoText = txtDebito.getText().trim();

        if (!creditoText.isEmpty() && debitoText.isEmpty()) {
            txtDebito.setEditable(false);
        } else {
            txtDebito.setEditable(true);
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtComentario.requestFocus();
        }

        if (Modificar) {
            if ("0".equals(creditoText)) {
                txtCredito.setEditable(false);
                txtDebito.setEditable(true);
            } else if ("0".equals(debitoText)) {
                txtDebito.setEditable(false);
                txtCredito.setEditable(true);
            } else if ("0".equals(debitoText) && "0".equals(creditoText)) {
                txtDebito.setEditable(true);
                txtCredito.setEditable(true);
            }
        }
    }//GEN-LAST:event_txtCreditoKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int resp = JOptionPane.showConfirmDialog(rootPane, "Desea cerrar la ventana de Transacciones?", "Cerrar Ventana", JOptionPane.YES_NO_OPTION);

        if (resp == JOptionPane.YES_OPTION) {
            this.dispose();
        } else if (resp == JOptionPane.NO_OPTION) {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        } else {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void BtnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseEntered
        BtnGuardar.setBackground(new Color(0, 51, 204));
    }//GEN-LAST:event_BtnGuardarMouseEntered

    private void BtnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseExited
        BtnGuardar.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_BtnGuardarMouseExited

    private void BtnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseEntered
        BtnSalir.setBackground(Color.red);
    }//GEN-LAST:event_BtnSalirMouseEntered

    private void BtnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseExited
        BtnSalir.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_BtnSalirMouseExited

    private void BtnLimpiarAllMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarAllMouseEntered
        BtnLimpiarAll.setBackground(new Color(0, 51, 204));
    }//GEN-LAST:event_BtnLimpiarAllMouseEntered

    private void BtnLimpiarAllMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarAllMouseExited
        BtnLimpiarAll.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_BtnLimpiarAllMouseExited

    private void BtnLimpiarAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarAllActionPerformed
        txtNdocumento.setText("");
        CbTipoDoc.setSelectedItem(null);
        txtDescripcion.setText("");
        txtMonto.setText("");
        txtNcuenta.setText("");
        txtDescripcionC.setText("");
        txtDebito.setText("");
        txtCredito.setText("");
        txtComentario.setText("");
        TablaM.setRowCount(0);
        txtNdocumento.requestFocus();
    }//GEN-LAST:event_BtnLimpiarAllActionPerformed

    private void txtNdocumentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNdocumentoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDescripcion.requestFocus();
        }
    }//GEN-LAST:event_txtNdocumentoKeyPressed

    private void m_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_eliminarActionPerformed
        int fila = TablaRegistros.getSelectedRow();

        String sec = (String) TablaM.getValueAt(fila, 0);
        String cuent = (String) TablaM.getValueAt(fila, 1);
        String desc = (String) TablaM.getValueAt(fila, 2);
        String db = (String) TablaM.getValueAt(fila, 3);
        String cr = (String) TablaM.getValueAt(fila, 4);
        String coment = (String) TablaM.getValueAt(fila, 5);

        if (fila >= 0) {
            TablaM.removeRow(fila);
            Asecuencia();

            LineaTabla = txtNdocumento.getText() + ";" + sec + ";" + cuent + ";" + desc + ";" + db + ";"
                    + cr + ";" + coment;
            eliminar = true;
        }
    }//GEN-LAST:event_m_eliminarActionPerformed

    private void m_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_modificarActionPerformed
        seleccionar = TablaRegistros.getSelectedRow();

        txtDebito.setEditable(false);
        txtCredito.setEditable(false);
        if (seleccionar >= 0) {
            secuenciaGlobal = String.valueOf(TablaRegistros.getValueAt(seleccionar, 0));
            txtNcuenta.setText(String.valueOf(TablaRegistros.getValueAt(seleccionar, 1)));
            txtDescripcionC.setText(String.valueOf(TablaRegistros.getValueAt(seleccionar, 2)));
            txtDebito.setText(String.valueOf(TablaRegistros.getValueAt(seleccionar, 3)));
            txtCredito.setText(String.valueOf(TablaRegistros.getValueAt(seleccionar, 4)));
            txtComentario.setText(String.valueOf(TablaRegistros.getValueAt(seleccionar, 5)));

            LineaAntigua1 = txtNdocumento.getText() + ";" + secuenciaGlobal + ";" + txtNcuenta.getText() + ";" + txtDescripcionC.getText() + ";" + txtDebito.getText()
                    + ";" + txtCredito.getText() + ";" + txtComentario.getText();

            txtDescripcionC.setEditable(false);
            mod = true;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione la fila de la cuenta que desea eliminar", "ERROR", HEIGHT);
        }

    }//GEN-LAST:event_m_modificarActionPerformed

    private void txtDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNcuenta.requestFocus();
        }
    }//GEN-LAST:event_txtDescripcionKeyPressed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void BtnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarMouseEntered
        BtnAgregar.setBorder(new LineBorder(new Color(160, 171, 176)));
    }//GEN-LAST:event_BtnAgregarMouseEntered

    private void BtnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarMouseExited
        BtnAgregar.setBorder(new LineBorder(Color.white));
    }//GEN-LAST:event_BtnAgregarMouseExited

    private void BtnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarMouseEntered
        BtnLimpiar.setBorder(new LineBorder(new Color(160, 171, 176)));
    }//GEN-LAST:event_BtnLimpiarMouseEntered

    private void BtnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarMouseExited
        BtnLimpiar.setBorder(new LineBorder(Color.white));
    }//GEN-LAST:event_BtnLimpiarMouseExited

    private void cargarEstados() {
        try {
            File archivo = new File("Documentos.txt");
            BufferedReader br = new BufferedReader(new FileReader(archivo));

            String linea;
            while ((linea = br.readLine()) != null) {

                String[] partes = linea.split(";");

                if (partes.length >= 2) {

                    String des = partes[1].trim();
                    CbTipoDoc.addItem(des);
                }
            }

            br.close();
        } catch (IOException e) {
        }
    }

    private void TablaC(String nombreDoc) {
        ArrayList<String[]> datos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("Detalle Transacciones.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                StringTokenizer tokens = new StringTokenizer(linea, ";");

                String aux = tokens.nextToken();

                if (aux.equals(nombreDoc)) {
                    String[] fila = new String[TablaM.getColumnCount()];
                    for (int j = 0; j < TablaM.getColumnCount(); j++) {
                        if (tokens.hasMoreTokens()) {
                            fila[j] = tokens.nextToken();
                        } else {
                            fila[j] = "";
                        }
                    }

                    datos.add(fila);
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        TablaM.setRowCount(0);
        for (String[] fila : datos) {
            TablaM.addRow(fila);
        }
    }

    private void Asecuencia() {
        for (int i = 0; i < TablaM.getRowCount(); i++) {
            TablaM.setValueAt(String.format("%03d", i + 1), i, 0);
        }
    }

    private int obtenerMaximaSecuencia() {
        int maxSecuencia = 0;

        for (int i = 0; i < TablaM.getRowCount(); i++) {
            Object valor = TablaM.getValueAt(i, 0);
            if (valor != null) {
                int valorSecuencia = Integer.parseInt(valor.toString());
                maxSecuencia = Math.max(maxSecuencia, valorSecuencia);
            }
        }

        return maxSecuencia;
    }

    public void eliminarR() {
        File archivo = new File("Detalle Transacciones.txt");
        File archivoNuevo = new File("AuxuliarDetalles.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivoNuevo));

            String linea;

            while ((linea = reader.readLine()) != null) {

                if (linea.equals(LineaTabla)) {
                    //es la que se queda
                } else {
                    writer.write(linea);
                    writer.newLine();
                }
            }

            reader.close();
            writer.close();

            archivo.delete();
            archivoNuevo.renameTo(archivo);

            JOptionPane.showMessageDialog(this, "Registro eliminado");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar el registro");
        }
    }

    public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }

    public static String hora() {
        LocalTime horaActual = LocalTime.now();
        DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm:ss");
        return horaActual.format(hora);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DE_TRANSACCIONES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnLimpiarAll;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JComboBox<String> CbTipoDoc;
    private javax.swing.JPanel PanelAzul;
    private javax.swing.JPanel PanelCabezera;
    private javax.swing.JPanel PanelDetalles;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelTable;
    private javax.swing.JPopupMenu PopupMenuTabla;
    private javax.swing.JTable TablaRegistros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem m_eliminar;
    private javax.swing.JMenuItem m_modificar;
    private javax.swing.JTextField txtComentario;
    private javax.swing.JTextField txtCredito;
    private javax.swing.JTextField txtDebito;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDescripcionC;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNcuenta;
    private javax.swing.JTextField txtNdocumento;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
