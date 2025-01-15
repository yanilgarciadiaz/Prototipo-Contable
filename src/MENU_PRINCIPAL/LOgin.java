 package MENU_PRINCIPAL;

import texto.TextPrompt;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class LOgin extends javax.swing.JFrame {

    private static String Usuario;

    public LOgin() {
        initComponents();
        this.setLocationRelativeTo(null);
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Century Gothic", Font.PLAIN, 14)));
        UIManager.put("OptionPane.messageForeground", Color.black);

        TextPrompt usuario = new TextPrompt("Digite su usuario", txtUsuario, TextPrompt.Show.ALWAYS);
        usuario.setForeground(Color.gray);

        TextPrompt contr = new TextPrompt("*********", contraseña, TextPrompt.Show.ALWAYS);
        contr.setForeground(Color.gray);
    }
    public int Nivel;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JPasswordField();
        BtnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtUsuario.setAutoscrolls(false);
        txtUsuario.setBorder(null);
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        contraseña.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        contraseña.setBorder(null);
        contraseña.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
        contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contraseñaKeyPressed(evt);
            }
        });

        BtnLogin.setBackground(new java.awt.Color(0, 153, 255));
        BtnLogin.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        BtnLogin.setForeground(new java.awt.Color(255, 255, 255));
        BtnLogin.setText("LOGIN");
        BtnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnLoginMouseExited(evt);
            }
        });
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SISTEMA CONTABLE");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INICIAR SESIÓN");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Password");

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\garci\\Documents\\Imagenes Proyecto\\usuario.png")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\garci\\Documents\\Imagenes Proyecto\\llave.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5))
                                    .addComponent(jSeparator2)
                                    .addComponent(jSeparator1)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(BtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 460, 430));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\garci\\Documents\\Imagenes Proyecto\\fondoA.png")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        if (txtUsuario.getText().equals("") || contraseña.getText().equals("")) {

            if (txtUsuario.getText().isBlank()) {
                JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene Todos los campos", "ERROR", HEIGHT);
                txtUsuario.requestFocus();
                txtUsuario.setText("");
            }
            if (contraseña.getText().isBlank()) {
                JOptionPane.showMessageDialog(rootPane, "Por Favor Rellene Todos los campos", "ERROR", HEIGHT);
                contraseña.requestFocus();
                contraseña.setText("");
            }

        } else {

            boolean encontrado = false;

            try {
                File f = new File("Usuarios.txt");

                if (!f.exists()) {
                    f.createNewFile();
                    JOptionPane.showMessageDialog(rootPane, "No se encontraron registros de Usuarios");
                } else {
                    Scanner s = new Scanner(f);
                    while (s.hasNextLine() && !encontrado) {
                        String linea = s.nextLine();
                        Scanner s1 = new Scanner(linea);

                        s1.useDelimiter("\\s*;\\s*");

                        String auxLogin = s1.next();
                        String auxPass = s1.next();

                        if (auxLogin.equals(txtUsuario.getText()) && auxPass.equals(contraseña.getText())) {
                            Nivel = Integer.parseInt(s1.next());
                            Usuario = s1.next();

                            MENU_PRINCIPAL m = new MENU_PRINCIPAL();

                            if (Nivel == 1) {

                                m.setVisible(true);

                                encontrado = true;
                                this.dispose();
                            } else if (Nivel == 0) {

                                MENU_PRINCIPAL menuPrincipal = new MENU_PRINCIPAL();
                                menuPrincipal.habilitarMantenimientos(false);
                                menuPrincipal.habilitarProcesos(false);
                                menuPrincipal.setVisible(true);
                                dispose();

                            }

                            JOptionPane.showMessageDialog(rootPane, "Bienvenido " + Usuario);

                        } else {
                            encontrado = false;
                            if (auxLogin.equals(txtUsuario.getText())) {
                                JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "Atención", 2);
                                contraseña.setText("");
                                return;
                            } else if (!s.hasNextLine()) {
                                JOptionPane.showMessageDialog(rootPane, "No hay registro de este usuario");
                                txtUsuario.setText("");
                                contraseña.setText("");
                                txtUsuario.requestFocus();
                            }
                        }
                    }
                    s.close();
                }

            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }//GEN-LAST:event_BtnLoginActionPerformed

    private void BtnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLoginMouseExited
        BtnLogin.setBackground(new Color(0, 153, 225));
    }//GEN-LAST:event_BtnLoginMouseExited

    private void BtnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLoginMouseEntered
        BtnLogin.setBackground(new Color(0, 102, 225));
    }//GEN-LAST:event_BtnLoginMouseEntered

    private void contraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseñaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            BtnLogin.doClick();
        }
    }//GEN-LAST:event_contraseñaKeyPressed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        // hola ndiowhfiofjefjwel
    }//GEN-LAST:event_contraseñaActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        if (evt.getSource() == txtUsuario) {
            contraseña.grabFocus();
        }
    }//GEN-LAST:event_txtUsuarioActionPerformed

    public static String getUsuario() {
        return Usuario;
    }

    public static void setUsuario(String Usuario) {
        LOgin.Usuario = Usuario;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOgin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogin;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
