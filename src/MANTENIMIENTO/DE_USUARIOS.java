package MANTENIMIENTO;

import static java.awt.image.ImageObserver.HEIGHT;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import ARCHIVOS.ManejoArchivos;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import texto.TextPrompt;

public class DE_USUARIOS extends javax.swing.JFrame {

    int nivel;
    boolean Modificar = false;
    public static String LineaAntigua;

    public DE_USUARIOS() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Mantenimiento de Usuarios");
        buttonGroup1.add(rbAdmin);
        buttonGroup1.add(rbNormal);

        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Century Gothic", Font.PLAIN, 14)));
        UIManager.put("OptionPane.messageForeground", Color.black);

        TextPrompt usuario = new TextPrompt(" Digite el usuario", txtUsuario, TextPrompt.Show.ALWAYS);
        usuario.setForeground(Color.gray);
        TextPrompt password = new TextPrompt(" Digite la contraseña", txtcontrasena, TextPrompt.Show.ALWAYS);
        password.setForeground(Color.gray);
        TextPrompt nombre = new TextPrompt(" Digite el Nombre", txtNombre, TextPrompt.Show.ALWAYS);
        nombre.setForeground(Color.gray);
        TextPrompt apell = new TextPrompt(" Digite el Apellido", txtApellido, TextPrompt.Show.ALWAYS);
        apell.setForeground(Color.gray);
        TextPrompt email = new TextPrompt(" Digite el Email", txtEmail, TextPrompt.Show.ALWAYS);
        email.setForeground(Color.gray);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        PanelAzul = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        rbNormal = new javax.swing.JRadioButton();
        rbAdmin = new javax.swing.JRadioButton();
        estado = new javax.swing.JLabel();
        txtcontrasena = new javax.swing.JPasswordField();

        jButton4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton4.setText("SALIR");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAzul.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANTENIMIENTO DE USUARIO");

        javax.swing.GroupLayout PanelAzulLayout = new javax.swing.GroupLayout(PanelAzul);
        PanelAzul.setLayout(PanelAzulLayout);
        PanelAzulLayout.setHorizontalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        PanelAzulLayout.setVerticalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzulLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(PanelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 70));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Email");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Contraseña");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setText("Nivel");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setText("Nombre");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setText("Apellido");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(160, 171, 176));
        btnGuardar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(null);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 130, 50));

        btnLimpiar.setBackground(new java.awt.Color(160, 171, 176));
        btnLimpiar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setBorder(null);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 130, 50));

        btnSalir.setBackground(new java.awt.Color(160, 171, 176));
        btnSalir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 130, 50));

        txtEmail.setBackground(new java.awt.Color(237, 237, 237));
        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 290, 30));

        txtUsuario.setBackground(new java.awt.Color(237, 237, 237));
        txtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 290, 30));

        txtNombre.setBackground(new java.awt.Color(237, 237, 237));
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 290, 30));

        txtApellido.setBackground(new java.awt.Color(237, 237, 237));
        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoKeyPressed(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 290, 30));

        rbNormal.setBackground(new java.awt.Color(255, 255, 255));
        rbNormal.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        rbNormal.setText("Normal");
        rbNormal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rbNormalPropertyChange(evt);
            }
        });
        jPanel1.add(rbNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        rbAdmin.setBackground(new java.awt.Color(255, 255, 255));
        rbAdmin.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        rbAdmin.setText("Administrador");
        rbAdmin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rbAdminPropertyChange(evt);
            }
        });
        jPanel1.add(rbAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        estado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        estado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 100, 30));

        txtcontrasena.setBackground(new java.awt.Color(237, 237, 237));
        txtcontrasena.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtcontrasena.setBorder(null);
        txtcontrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontrasenaActionPerformed(evt);
            }
        });
        txtcontrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontrasenaKeyTyped(evt);
            }
        });
        jPanel1.add(txtcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 172, 290, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtUsuario.setText("");
        txtcontrasena.setText("");
        buttonGroup1.clearSelection();
        txtNombre.setText("");
        txtApellido.setText("");
        txtEmail.setText("");
        estado.setText("");
        txtUsuario.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene el usuario antes de guardar", "ERROR", HEIGHT);
            txtUsuario.requestFocus();
        } else if (txtcontrasena.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene la contraseba antes de guardar", "ERROR", HEIGHT);
            txtcontrasena.requestFocus();
        } else if (!rbAdmin.isSelected() && !rbNormal.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Se debe elegir el nivel antes de guardar", "ERROR", HEIGHT);
            rbNormal.requestFocus();
        } else if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene el nombre del usuario antes de guardar", "ERROR", HEIGHT);
            txtNombre.requestFocus();
        } else if (txtApellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene el apellido del usuario antes de guardar", "ERROR", HEIGHT);
            txtApellido.requestFocus();
        } else if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene el email del usuario antes de guardar", "ERROR", HEIGHT);
            txtEmail.requestFocus();
        } else {
            try {
                File f = new File("Usuarios.txt");

                if (!f.exists()) {
                    f.createNewFile();
                }

                if (rbAdmin.isSelected()) {
                    nivel = 1;
                } else {
                    nivel = 0;
                }

                String lineaActual = txtUsuario.getText() + " ; " + txtcontrasena.getText() + " ; " + nivel + " ; "
                        + txtNombre.getText() + " ; " + txtApellido.getText() + " ; " + txtEmail.getText();

                ManejoArchivos file = new ManejoArchivos();

                if (Modificar) {
                    file.Modificar(LineaAntigua, lineaActual, f);
                    btnLimpiarActionPerformed(evt);
                    Modificar = false;
                    txtUsuario.requestFocus();
                } else {
                    file.GuardarDatos(lineaActual, f);
                    btnLimpiarActionPerformed(evt);
                    txtUsuario.requestFocus();
                }

                JOptionPane.showMessageDialog(null, "Registro guardado");

            } catch (IOException e) {
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        if (txtUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el usuario para continuar");
            txtUsuario.requestFocus();
        } else {
            txtcontrasena.requestFocus();
        }
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void rbNormalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rbNormalPropertyChange
        nivel = 0;
    }//GEN-LAST:event_rbNormalPropertyChange

    private void rbAdminPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rbAdminPropertyChange
        nivel = 1;
    }//GEN-LAST:event_rbAdminPropertyChange

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setBackground(new Color(0, 51, 204));
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked

    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        btnLimpiar.setBackground(new Color(0, 51, 204));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        btnLimpiar.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(Color.red);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_btnSalirMouseExited

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtApellido.requestFocus();
        }

        String allowedCharacters = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        char c = evt.getKeyChar();

        if ((allowedCharacters.indexOf(c) == -1) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_ENTER) && (c != KeyEvent.VK_SPACE)) {
            txtNombre.setEditable(false);
        } else {
            txtNombre.setEditable(true);
        }
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtEmail.requestFocus();
        }

        String allowedCharacters = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        char c = evt.getKeyChar();

        if ((allowedCharacters.indexOf(c) == -1) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_ENTER) && (c != KeyEvent.VK_SPACE)) {
            txtApellido.setEditable(false);
        } else {
            txtApellido.setEditable(true);
        }
    }//GEN-LAST:event_txtApellidoKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int resp = JOptionPane.showConfirmDialog(rootPane, "Desea cerrar la ventana de Mantenimiento de Usuarios", "Cerrar Ventana", JOptionPane.YES_NO_OPTION);

        if (resp == JOptionPane.YES_OPTION) {
            this.dispose();
        } else if (resp == JOptionPane.NO_OPTION) {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        } else {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        String allowedCharacters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ@_.";
        char c = evt.getKeyChar();

        if ((allowedCharacters.indexOf(c) == -1) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_ENTER)) {
            evt.consume();
        }

        char d = evt.getKeyChar();
        if (d == ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        String allowedCharacters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!-_.";
        char c = evt.getKeyChar();

        if ((allowedCharacters.indexOf(c) == -1) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_ENTER)) {
            evt.consume();
        }

        char d = evt.getKeyChar();
        if (d == ' ') {
            evt.consume();
        }

    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtcontrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontrasenaActionPerformed
        String login = txtUsuario.getText();
        String contr = txtcontrasena.getText();

        try {
            boolean encontrado = false;
            Scanner s;

            try {
                File f = new File("Usuarios.txt");

                if (!f.exists()) {
                    f.createNewFile();
                    estado.setText(" Creando");
                } else {
                    s = new Scanner(f);

                    while (s.hasNextLine() && !encontrado) {
                        String linea = s.nextLine();
                        Scanner s1 = new Scanner(linea);

                        s1.useDelimiter("\\s*;\\s*");

                        try {
                            String auxlogin = s1.next();
                            String auxPass = s1.next();
                            if (login.equals(auxlogin) && contr.equals(auxPass)) {
                                nivel = Integer.parseInt(s1.next());

                                if (nivel == 1) {
                                    rbAdmin.setSelected(true);
                                } else {
                                    rbNormal.setSelected(true);
                                }

                                txtNombre.setText(s1.next());
                                txtApellido.setText(s1.next());
                                txtEmail.setText(s1.next());

                                LineaAntigua = login + " ; " + contr + " ; " + nivel + " ; " + txtNombre.getText() + " ; " + txtApellido.getText() + " ; " + txtEmail.getText();
                                estado.setText(" Modificando");

                                Modificar = true;
                                encontrado = true;
                            } else {
                                if (login.equals(auxlogin)) {
                                    btnLimpiarActionPerformed(evt);
                                    txtUsuario.setText(login);
                                    JOptionPane.showMessageDialog(rootPane, "Contraseña incorrecta intente nuevamente");
                                    return;
                                }

                                Modificar = false;
                                encontrado = false;
                                estado.setText(" Creando");
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                            System.out.println(e);
                        }
                    }
                    s.close();
                    txtNombre.requestFocus();
                }
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(this, "No se encontró el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }

    }//GEN-LAST:event_txtcontrasenaActionPerformed

    private void txtcontrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontrasenaKeyTyped
        String allowedCharacters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*_-.,:;()[]{}<>?/|\\+~";
        char c = evt.getKeyChar();

        if ((allowedCharacters.indexOf(c) == -1) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_ENTER) && (c == KeyEvent.VK_SPACE)) {
            txtcontrasena.setEditable(false);
        } else {
            txtcontrasena.setEditable(true);
        }

    }//GEN-LAST:event_txtcontrasenaKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DE_USUARIOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAzul;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel estado;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbAdmin;
    private javax.swing.JRadioButton rbNormal;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JPasswordField txtcontrasena;
    // End of variables declaration//GEN-END:variables
}
