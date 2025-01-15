package MANTENIMIENTO;

import ARCHIVOS.ManejoArchivos;
import MOVIMIENTOS.DE_TRANSACCIONES11;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import texto.TextPrompt;

public class DE_CATALOGO extends javax.swing.JFrame {

    boolean Modificar = false;
    public static String LineaAntigua;
    int tipo;
    private javax.swing.Timer timer;

    double acumD = 0.0;
    double acumC = 0.0;

    public DE_CATALOGO() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Mantenimiento de Catalogo de Cuentas");
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Century Gothic", Font.PLAIN, 14)));
        UIManager.put("OptionPane.messageForeground", Color.black);
        txtfecha.setText(fecha());
        txthora.setText(hora());
        txtfecha.setEditable(false);
        txthora.setEditable(false);
        txtnumero.requestFocusInWindow();

        buttonGroupTipoCta.add(rbgeneral);
        buttonGroupTipoCta.add(rbdetalle);

        timer = new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txthora.setText(hora());
            }
        });
        timer.start();

        txtdebito.setEditable(false);
        txtcredito.setEditable(false);
        txtbalance.setEditable(false);

        TextPrompt numeroC = new TextPrompt(" Digite el No. de Cuenta", txtnumero, TextPrompt.Show.ALWAYS);
        numeroC.setForeground(Color.gray);
        TextPrompt descr = new TextPrompt(" Digite la Descripcion", txtdescripcion, TextPrompt.Show.ALWAYS);
        descr.setForeground(Color.gray);
        TextPrompt padre = new TextPrompt(" Digite la Cuenta padre", txtpadre, TextPrompt.Show.ALWAYS);
        padre.setForeground(Color.gray);
//        Actualizardcb();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        buttonGroupTipoCta = new javax.swing.ButtonGroup();
        Principal = new javax.swing.JPanel();
        PanelAzul = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        txtpadre = new javax.swing.JTextField();
        txtdebito = new javax.swing.JTextField();
        txtcredito = new javax.swing.JTextField();
        txthora = new javax.swing.JTextField();
        txtbalance = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        txtfecha = new javax.swing.JFormattedTextField();
        rbgeneral = new javax.swing.JRadioButton();
        rbdetalle = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        cbxGrupo = new javax.swing.JComboBox<>();
        cbxNivel = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Principal.setBackground(new java.awt.Color(255, 255, 255));
        Principal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAzul.setBackground(new java.awt.Color(0, 153, 255));
        PanelAzul.setPreferredSize(new java.awt.Dimension(705, 70));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANTENIMIENTO DE CATALOGO");

        javax.swing.GroupLayout PanelAzulLayout = new javax.swing.GroupLayout(PanelAzul);
        PanelAzul.setLayout(PanelAzulLayout);
        PanelAzulLayout.setHorizontalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
        );
        PanelAzulLayout.setVerticalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzulLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Principal.add(PanelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel2.setText("Numero de Cuenta");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Principal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Descripción de Cuenta");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Principal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        estado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        estado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Principal.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 100, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setText("Tipo");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Principal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel5.setText("Nivel ");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Principal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel6.setText("Grupo");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Principal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel7.setText("Hora");
        Principal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel8.setText("Credito Acumulado");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Principal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel9.setText("Debito Acumulado");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Principal.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel10.setText("Fecha");
        Principal.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 25));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel11.setText("Balance ");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Principal.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, -1, -1));

        txtnumero.setBackground(new java.awt.Color(237, 237, 237));
        txtnumero.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtnumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));
        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });
        txtnumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnumeroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumeroKeyTyped(evt);
            }
        });
        Principal.add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 290, 30));

        txtdescripcion.setBackground(new java.awt.Color(237, 237, 237));
        txtdescripcion.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtdescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));
        txtdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdescripcionKeyPressed(evt);
            }
        });
        Principal.add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 290, 30));

        txtpadre.setBackground(new java.awt.Color(237, 237, 237));
        txtpadre.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtpadre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));
        txtpadre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpadreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpadreKeyTyped(evt);
            }
        });
        Principal.add(txtpadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 290, 30));

        txtdebito.setBackground(new java.awt.Color(237, 237, 237));
        txtdebito.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtdebito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));
        txtdebito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdebitoKeyPressed(evt);
            }
        });
        Principal.add(txtdebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 290, 30));

        txtcredito.setBackground(new java.awt.Color(237, 237, 237));
        txtcredito.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtcredito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));
        txtcredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcreditoKeyPressed(evt);
            }
        });
        Principal.add(txtcredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 290, 30));

        txthora.setBackground(new java.awt.Color(237, 237, 237));
        txthora.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txthora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Principal.add(txthora, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 97, 29));

        txtbalance.setBackground(new java.awt.Color(237, 237, 237));
        txtbalance.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtbalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));
        txtbalance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbalanceKeyTyped(evt);
            }
        });
        Principal.add(txtbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 290, 30));

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
        Principal.add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 630, 130, 50));

        BtnLimpiar.setBackground(new java.awt.Color(160, 171, 176));
        BtnLimpiar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        BtnLimpiar.setText("LIMPIAR");
        BtnLimpiar.setBorder(null);
        BtnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        Principal.add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, 130, 50));

        BtnSalir.setBackground(new java.awt.Color(160, 171, 176));
        BtnSalir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        BtnSalir.setText("SALIR");
        BtnSalir.setBorder(null);
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        Principal.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 630, 130, 50));

        txtfecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtfecha.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        Principal.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 99, 30));

        rbgeneral.setBackground(new java.awt.Color(255, 255, 255));
        rbgeneral.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        rbgeneral.setText("GENERAL");
        rbgeneral.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rbgeneralPropertyChange(evt);
            }
        });
        Principal.add(rbgeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        rbdetalle.setBackground(new java.awt.Color(255, 255, 255));
        rbdetalle.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        rbdetalle.setText("DETALLE");
        rbdetalle.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rbdetallePropertyChange(evt);
            }
        });
        Principal.add(rbdetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel12.setText("Cuenta padre");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Principal.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        cbxGrupo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbxGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Pasivo", "Capital", "Ingresos", "Costos", "Gastos" }));
        cbxGrupo.setSelectedIndex(-1);
        cbxGrupo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxGrupoItemStateChanged(evt);
            }
        });
        Principal.add(cbxGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 402, 290, 30));

        cbxNivel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbxNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cbxNivel.setSelectedIndex(-1);
        cbxNivel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxNivelItemStateChanged(evt);
            }
        });
        Principal.add(cbxNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 302, 290, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseEntered
        BtnGuardar.setBackground(new Color(0, 51, 204));
    }//GEN-LAST:event_BtnGuardarMouseEntered

    private void BtnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseExited
        BtnGuardar.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_BtnGuardarMouseExited

    private void BtnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarMouseEntered
        BtnLimpiar.setBackground(new Color(0, 51, 204));
    }//GEN-LAST:event_BtnLimpiarMouseEntered

    private void BtnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarMouseExited
        BtnLimpiar.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_BtnLimpiarMouseExited

    private void BtnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseEntered
        BtnSalir.setBackground(Color.red);
    }//GEN-LAST:event_BtnSalirMouseEntered

    private void BtnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseExited
        BtnSalir.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_BtnSalirMouseExited

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        txtbalance.setText("");
        txtcredito.setText("");
        txtdebito.setText("");
        txtdescripcion.setText("");
        cbxNivel.setSelectedItem(null);
        txtnumero.setText("");
        txtpadre.setText("");
        cbxGrupo.setSelectedItem(null);
        buttonGroupTipoCta.clearSelection();
        estado.setText("");
        txtnumero.requestFocus();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        if (txtnumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene el Numero antes de guardar", "ERROR", HEIGHT);
            txtnumero.grabFocus();
        } else if (txtdescripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene la Descripcion antes de guardar", "ERROR", HEIGHT);
            txtdescripcion.grabFocus();
        } else if (!rbgeneral.isSelected() && !rbdetalle.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene el Tipo antes de guardar", "ERROR", HEIGHT);
            rbgeneral.grabFocus();
        } else if (cbxNivel.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un nivel antes de guardar", "ERROR", HEIGHT);
            cbxNivel.grabFocus();
        } else if (txtpadre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene la cuenta padre antes de guardar, si no tiene colocar 0", "ERROR", HEIGHT);
            txtpadre.grabFocus();
        } else if (cbxGrupo.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un grupo antes de guardar", "ERROR", HEIGHT);
            cbxGrupo.grabFocus();
        } else {

            try {
                File f = new File("Catalogo.txt");

                if (!f.exists()) {
                    f.createNewFile();
                }

                if (rbgeneral.isSelected()) {
                    tipo = 0;
                } else {
                    tipo = 1;
                }

//                double cambioD = 0.0;
//                double cambioC = 0.0;
//                double balance = 0.0;
//
//                if (!txtdebito.getText().isEmpty()) {
//                    cambioD = Double.parseDouble(txtdebito.getText());
//                }
//
//                if (!txtcredito.getText().isEmpty()) {
//                    cambioC = Double.parseDouble(txtcredito.getText());
//                }
//
//                if (!txtbalance.getText().isEmpty()) {
//                    balance = Double.parseDouble(txtbalance.getText());
//                }
//
//                acumD += cambioD;
//                acumC += cambioC;
//                balance = acumD - acumC;
//
//                String cd = Double.toString(acumD);
//                String cc = Double.toString(acumC);
//                String cb = Double.toString(balance);
//
//                txtdebito.setText(cd);
//                txtcredito.setText(cc);
//                txtbalance.setText(cb);
                String lineaActual = txtnumero.getText() + ";" + txtdescripcion.getText() + ";" + tipo + ";"
                        + cbxNivel.getSelectedItem() + ";" + txtpadre.getText() + ";" + cbxGrupo.getSelectedItem() + ";"
                        + txtfecha.getText() + ";" + txthora.getText() + ";" + txtdebito.getText() + ";"
                        + txtcredito.getText() + ";" + txtbalance.getText();

                ManejoArchivos file = new ManejoArchivos();

                if (Modificar) {
                    file.Modificar(LineaAntigua, lineaActual, f);
                    BtnLimpiarActionPerformed(evt);
                    Modificar = false;
                    txtnumero.requestFocus();
                } else {
                    file.GuardarDatos(lineaActual, f);
                    BtnLimpiarActionPerformed(evt);
                    txtnumero.requestFocus();
                }

                JOptionPane.showMessageDialog(null, "Registro guardado");

            } catch (IOException | NumberFormatException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void txtnumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumeroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtdescripcion.requestFocus();
        }
    }//GEN-LAST:event_txtnumeroKeyPressed

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        if (txtnumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el Código del Documento para continuar");
            txtnumero.grabFocus();
        } else {
            txtdescripcion.setText("");
            txtdescripcion.requestFocus();
        }

        try {

            String auxcod = txtnumero.getText();
            int codigo = Integer.parseInt(auxcod);

            if (codigo <= 0) {
                JOptionPane.showMessageDialog(rootPane, "El codigo debe ser un número positivo intente nuevamente");
                BtnLimpiarActionPerformed(evt);
            } else {
                boolean encontrado = false;
                Scanner s;
                try {
                    File f = new File("Catalogo.txt");

                    if (!f.exists()) {
                        f.createNewFile();
                        estado.setText("Creando");
                        txtdebito.setText("0.0");
                        txtcredito.setText("0.0");
                        txtbalance.setText("0.0");

                    } else {
                        s = new Scanner(f);

                        while (s.hasNextLine() && !encontrado) {

                            String linea = s.nextLine();
                            Scanner s1 = new Scanner(linea);

                            s1.useDelimiter("\\s*;\\s*");

                            try {
                                if (codigo == Integer.parseInt(s1.next())) {

                                    txtdescripcion.setText(s1.next());
                                    tipo = Integer.parseInt(s1.next());

                                    if (tipo == 0) {
                                        rbgeneral.setSelected(true);
                                    } else {
                                        rbdetalle.setSelected(true);
                                    }

                                    cbxNivel.setSelectedItem(s1.next());
                                    txtpadre.setText(s1.next());
                                    cbxGrupo.setSelectedItem(s1.next());
                                    String fecha = s1.next();
                                    String hora = s1.next();

                                    String debito = "0.0";
                                    if (s1.hasNext()) {
                                        debito = s1.next();
                                    }

                                    String credito = "0.0";
                                    if (s1.hasNext()) {
                                        credito = s1.next();
                                    }

                                    String balance = "0.0";
                                    if (s1.hasNext()) {
                                        balance = s1.next();
                                    }

                                    txtdebito.setText(debito);
                                    txtcredito.setText(credito);
                                    txtbalance.setText(balance);

                                    LineaAntigua = txtnumero.getText() + ";" + txtdescripcion.getText() + ";" + tipo + ";"
                                            + cbxNivel.getSelectedItem() + ";" + txtpadre.getText() + ";" + cbxGrupo.getSelectedItem()
                                            + ";" + fecha + ";" + hora + ";" + txtdebito.getText() + ";"
                                            + txtcredito.getText() + ";" + txtbalance.getText();

                                    estado.setText(" Modificando");

                                    Modificar = true;
                                    encontrado = true;
                                } else {
                                    BtnLimpiarActionPerformed(evt);
                                    txtnumero.setText(auxcod);
                                    estado.setText(" Creando");
                                    Modificar = false;
                                    encontrado = false;

                                    txtdebito.setText("0.0");
                                    txtcredito.setText("0.0");
                                    txtbalance.setText("0.0");
                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                                System.out.println(e);
                            }
                        }
                        s.close();
                        txtdescripcion.requestFocus();
                    }
                } catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(this, "No se encontró el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (HeadlessException | IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Error al Abrir el Archivo...");
            BtnLimpiarActionPerformed(evt);
        }
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void txtdescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescripcionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            rbgeneral.requestFocus();
        }

        String allowedCharacters = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ-/.%()";
        char c = evt.getKeyChar();

        if ((allowedCharacters.indexOf(c) == -1) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_ENTER) && (c != KeyEvent.VK_SPACE)) {
            txtdescripcion.setEditable(false);
        } else {
            txtdescripcion.setEditable(true);
        }
    }//GEN-LAST:event_txtdescripcionKeyPressed

    private void txtpadreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpadreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtdebito.requestFocus();
        }
    }//GEN-LAST:event_txtpadreKeyPressed

    private void txtdebitoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdebitoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtcredito.requestFocus();
        }
    }//GEN-LAST:event_txtdebitoKeyPressed

    private void txtcreditoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcreditoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtbalance.requestFocus();
        }
    }//GEN-LAST:event_txtcreditoKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int resp = JOptionPane.showConfirmDialog(rootPane, "Desea cerrar la ventana de Mantenimiento de Catalogo", "Cerrar Ventana", JOptionPane.YES_NO_OPTION);

        switch (resp) {
            case JOptionPane.YES_OPTION:
                timer.stop();
                this.dispose();
                break;
            case JOptionPane.NO_OPTION:
                this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                break;
            default:
                this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                break;
        }
    }//GEN-LAST:event_formWindowClosing

    private void rbgeneralPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rbgeneralPropertyChange
        tipo = 0;
    }//GEN-LAST:event_rbgeneralPropertyChange

    private void txtnumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumeroKeyTyped
        char c = evt.getKeyChar();

        if (((c < '0' || c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnumeroKeyTyped

    private void txtbalanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbalanceKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0' || c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtbalanceKeyTyped

    private void cbxNivelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxNivelItemStateChanged
        txtpadre.requestFocus();
    }//GEN-LAST:event_cbxNivelItemStateChanged

    private void cbxGrupoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxGrupoItemStateChanged
        txtdebito.requestFocus();
    }//GEN-LAST:event_cbxGrupoItemStateChanged

    private void rbdetallePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rbdetallePropertyChange
        tipo = 1;
    }//GEN-LAST:event_rbdetallePropertyChange

    private void txtpadreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpadreKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0' || c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtpadreKeyTyped

    public String origen(int indice) {

        String origen = "";

        switch (indice) {
            case 0:
                origen = "debito";
                break;

            case 1:
                origen = "credito";
                break;

            case 2:
                origen = "credito";
                break;

            case 3:
                origen = "credito";
                break;

            case 4:
                origen = "debito";
                break;

            case 5:
                origen = "debito";
                break;

            default:
                origen = "";
                break;
        }

        return origen;
    }

    public void Actualizardcb() {
        ArrayList<String> cb = new ArrayList<>();
        Scanner s;

        try {

            File f = new File("Catalogo.txt");

            s = new Scanner(f);

            while (s.hasNextLine()) {

                String linea = s.nextLine();
                Scanner s1 = new Scanner(linea);

                s1.useDelimiter("\\s*;\\s*");

                cb.add(linea);

                trans(cb.get(0), cb.get(5));
            }
            s.close();

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "No se encontró el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void trans(String cnum, String itg) {

        Scanner k;
        try {
            File g = new File("Detalle Transacciones.txt");

            k = new Scanner(g);

            while (k.hasNextLine()) {
                String line = k.nextLine();
                Scanner s2 = new Scanner(line);

                s2.useDelimiter("\\s*;\\s*");

                String doc = s2.next();
                String sec = s2.next();
                String cuenta = s2.next();
                String descrip = s2.next();
                String debitoc = s2.next();
                String creditoc = s2.next();

                if (cuenta.equals(cnum)) {

                    int item = Integer.parseInt(itg);
                    String orig = origen(item);

                    if (orig.equals("debito")) {
                        double almD = Double.parseDouble(debitoc);
                        acumD += almD;

                        double almC = Double.parseDouble(creditoc);
                        acumC -= almC;

                        double balancc = acumD - acumC;

                        String pdeb = Double.toString(almD);
                        String pcre = Double.toString(almC);
                        String pbal = Double.toString(balancc);

                        txtdebito.setText(pdeb);
                        txtcredito.setText(pcre);
                        txtbalance.setText(pbal);

                    } else if (orig.equals("credito")) {

                        double almD = Double.parseDouble(debitoc);
                        acumD -= almD;

                        double almC = Double.parseDouble(creditoc);
                        acumC += almC;

                        double balancc = acumD - acumC;

                        String pdeb = Double.toString(almD);
                        String pcre = Double.toString(almC);
                        String pbal = Double.toString(balancc);

                        txtdebito.setText(pdeb);
                        txtcredito.setText(pcre);
                        txtbalance.setText(pbal);
                    }
                }
            }
            k.close();

        } catch (FileNotFoundException b) {
            JOptionPane.showMessageDialog(this, "No se encontró el archivo", "Error", JOptionPane.ERROR_MESSAGE);
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
                new DE_CATALOGO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JPanel PanelAzul;
    private javax.swing.JPanel Principal;
    private javax.swing.ButtonGroup buttonGroupTipoCta;
    private javax.swing.JComboBox<String> cbxGrupo;
    private javax.swing.JComboBox<String> cbxNivel;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JRadioButton rbdetalle;
    private javax.swing.JRadioButton rbgeneral;
    private javax.swing.JTextField txtbalance;
    private javax.swing.JTextField txtcredito;
    private javax.swing.JTextField txtdebito;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JFormattedTextField txtfecha;
    private javax.swing.JTextField txthora;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtpadre;
    // End of variables declaration//GEN-END:variables
}
