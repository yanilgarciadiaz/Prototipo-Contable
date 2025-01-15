package MANTENIMIENTO;

import ARCHIVOS.ManejoArchivos;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import java.util.Scanner;
import texto.TextPrompt;

public class DE_DOCUMENTO extends javax.swing.JFrame {

    boolean Modificar = false;
    public static String LineaAntigua;

    public DE_DOCUMENTO() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Mantenimiento de Documentos");
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Century Gothic", Font.PLAIN, 14)));
        UIManager.put("OptionPane.messageForeground", Color.black);
        txtCodigo.requestFocusInWindow();

        TextPrompt codig = new TextPrompt(" Digite el Codigo", txtCodigo, TextPrompt.Show.ALWAYS);
        codig.setForeground(Color.gray);

        TextPrompt descr = new TextPrompt(" Digite la Descripcion", txtDescripcion, TextPrompt.Show.ALWAYS);
        descr.setForeground(Color.gray);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        PanelAzul = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        estado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAzul.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANTENIMIENTO DE DOCUMENTOS");

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

        PanelPrincipal.add(PanelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 70));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Código");
        PanelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Descripción");
        PanelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 110, 30));

        txtDescripcion.setBackground(new java.awt.Color(237, 237, 237));
        txtDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyPressed(evt);
            }
        });
        PanelPrincipal.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 290, 30));

        txtCodigo.setBackground(new java.awt.Color(237, 237, 237));
        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });
        PanelPrincipal.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 290, 30));

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
        PanelPrincipal.add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 130, 50));

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
        PanelPrincipal.add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 130, 50));

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
        PanelPrincipal.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 130, 50));

        estado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        estado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PanelPrincipal.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        txtCodigo.setText("");
        txtDescripcion.setText("");
        estado.setText("");
        txtCodigo.requestFocus();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        if (txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el Código del Documento para continuar");
            txtCodigo.requestFocus();
        } else {
            txtDescripcion.setText("");
            txtDescripcion.requestFocus();
        }

        String auxcod = txtCodigo.getText();

        try {

            boolean encontrado = false;
            Scanner s;

            try {
                File f = new File("Documentos.txt");

                if (!f.exists()) {
                    f.createNewFile();
                    estado.setText("Creando");

                } else {
                    s = new Scanner(f);

                    while (s.hasNextLine() && !encontrado) {

                        String linea = s.nextLine();
                        Scanner s1 = new Scanner(linea);

                        s1.useDelimiter("\\s*;\\s*");

                        try {
                            String cod = s1.next();
                            if (auxcod.equals(cod)) {
                                txtDescripcion.setText(s1.next());

                                LineaAntigua = cod + ";" + txtDescripcion.getText();
                                estado.setText(" Modificando");

                                Modificar = true;
                                encontrado = true;
                            } else {
                                BtnLimpiarActionPerformed(evt);
                                txtCodigo.setText(auxcod);
                                estado.setText(" Creando");
                                Modificar = false;
                                encontrado = false;
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                            System.out.println(e);
                        }
                    }
                    s.close();
                    txtDescripcion.requestFocus();
                }
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(this, "No se encontró el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (HeadlessException | IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "El Id no permite carácteres, intente nuevamente...");
            BtnLimpiarActionPerformed(evt);
        }
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed

        if (txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene el Codigo antes de guardar", "ERROR", HEIGHT);
            txtCodigo.grabFocus();
        } else if (txtDescripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene la Descripcion antes de guardar", "ERROR", HEIGHT);
            txtDescripcion.grabFocus();
        } else {

            try {
                File f = new File("Documentos.txt");

                if (!f.exists()) {
                    f.createNewFile();
                }

                String lineaActual = txtCodigo.getText() + ";" + txtDescripcion.getText();

                ManejoArchivos file = new ManejoArchivos();

                if (Modificar) {
                    file.Modificar(LineaAntigua, lineaActual, f);
                    BtnLimpiarActionPerformed(evt);
                    Modificar = false;
                    txtCodigo.requestFocus();
                } else {
                    file.GuardarDatos(lineaActual, f);
                    BtnLimpiarActionPerformed(evt);
                    txtCodigo.requestFocus();
                }

                JOptionPane.showMessageDialog(null, "Registro guardado");

            } catch (IOException e) {
            }
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseEntered
        BtnGuardar.setBackground(new Color(0, 51, 204));
    }//GEN-LAST:event_BtnGuardarMouseEntered

    private void BtnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseExited
        BtnGuardar.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_BtnGuardarMouseExited

    private void BtnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarMouseEntered
        BtnLimpiar.setBackground(new Color(0, 51, 204));
    }//GEN-LAST:event_BtnLimpiarMouseEntered

    private void BtnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseEntered
        BtnSalir.setBackground(Color.red);
    }//GEN-LAST:event_BtnSalirMouseEntered

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDescripcion.requestFocus();
        }

        String allowedCharacters = "0123456789abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ-";
        char c = evt.getKeyChar();

        if ((allowedCharacters.indexOf(c) == -1) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_ENTER)) {
            txtCodigo.setEditable(false);
        } else {
            txtCodigo.setEditable(true);
        }
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void BtnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarMouseExited
        BtnLimpiar.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_BtnLimpiarMouseExited

    private void BtnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseExited
        BtnSalir.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_BtnSalirMouseExited

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int resp = JOptionPane.showConfirmDialog(rootPane, "Desea cerrar la ventana de Mantenimiento de Documentos", "Cerrar Ventana", JOptionPane.YES_NO_OPTION);

        if (resp == JOptionPane.YES_OPTION) {
            this.dispose();
        } else if (resp == JOptionPane.NO_OPTION) {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        } else {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void txtDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyPressed
        String allowedCharacters = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ-/.%()";
        char c = evt.getKeyChar();

        if ((allowedCharacters.indexOf(c) == -1) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_ENTER) && (c != KeyEvent.VK_SPACE)) {
            txtDescripcion.setEditable(false);
        } else {
            txtDescripcion.setEditable(true);
        }
    }//GEN-LAST:event_txtDescripcionKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DE_DOCUMENTO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JPanel PanelAzul;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
