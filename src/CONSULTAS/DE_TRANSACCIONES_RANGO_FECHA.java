package CONSULTAS;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class DE_TRANSACCIONES_RANGO_FECHA extends javax.swing.JFrame {

    Date selectedDate;
    Date selectedDate1;
    public DefaultTableModel TablaM;

    public DE_TRANSACCIONES_RANGO_FECHA() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Consulta Transacciones Por Fecha");
        PanelPrincipal.requestFocusInWindow();

        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Century Gothic", Font.PLAIN, 14)));
        UIManager.put("OptionPane.messageForeground", Color.black);

        TablaM = (DefaultTableModel) tablaRegistro.getModel();

        JTableHeader tableHeader = tablaRegistro.getTableHeader();
        Font headerFont = new Font("Century Gothic", Font.PLAIN, 14); // Cambiar el tipo de letra
        tableHeader.setFont(headerFont);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAzul = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JPanel();
        btnconsultar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        Cfecha2 = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Cfecha1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        PanelAzul.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TRANSACCIONES POR RANGO DE FECHA");

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnconsultar.setBackground(new java.awt.Color(160, 171, 176));
        btnconsultar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnconsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnconsultar.setText("CONSULTAR");
        btnconsultar.setBorder(null);
        btnconsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnconsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnconsultarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnconsultarMouseExited(evt);
            }
        });
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 130, 50));

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
        PanelPrincipal.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 130, 50));

        Cfecha2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        PanelPrincipal.add(Cfecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 230, 30));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("FECHA FINAL");
        PanelPrincipal.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 100, 30));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("FECHA INICIAL");
        PanelPrincipal.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 30));

        Cfecha1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        PanelPrincipal.add(Cfecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 230, 30));

        tablaRegistro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tablaRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Doc", "Fecha ", "Hecho Por", "#", "Cuenta", "Descripcion C", "Debitos", "Creditos", "Monto", "Actualizado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaRegistro);
        if (tablaRegistro.getColumnModel().getColumnCount() > 0) {
            tablaRegistro.getColumnModel().getColumn(0).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(0).setPreferredWidth(13);
            tablaRegistro.getColumnModel().getColumn(1).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(1).setPreferredWidth(25);
            tablaRegistro.getColumnModel().getColumn(2).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(2).setPreferredWidth(10);
            tablaRegistro.getColumnModel().getColumn(3).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(3).setPreferredWidth(2);
            tablaRegistro.getColumnModel().getColumn(4).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(4).setPreferredWidth(13);
            tablaRegistro.getColumnModel().getColumn(5).setPreferredWidth(160);
            tablaRegistro.getColumnModel().getColumn(6).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(6).setPreferredWidth(15);
            tablaRegistro.getColumnModel().getColumn(7).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(7).setPreferredWidth(15);
            tablaRegistro.getColumnModel().getColumn(8).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(8).setPreferredWidth(15);
            tablaRegistro.getColumnModel().getColumn(9).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(9).setPreferredWidth(10);
        }

        PanelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 930, 420));

        javax.swing.GroupLayout PanelAzulLayout = new javax.swing.GroupLayout(PanelAzul);
        PanelAzul.setLayout(PanelAzulLayout);
        PanelAzulLayout.setHorizontalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelAzulLayout.setVerticalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzulLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnconsultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconsultarMouseEntered
        btnconsultar.setBackground(new Color(0, 51, 204));
    }//GEN-LAST:event_btnconsultarMouseEntered

    private void btnconsultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconsultarMouseExited
        btnconsultar.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_btnconsultarMouseExited

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        selectedDate = Cfecha1.getDate();
        selectedDate1 = Cfecha2.getDate();

        if (selectedDate == null || selectedDate1 == null) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una fecha");
            return;
        } else if (selectedDate.after(selectedDate1)) {
            JOptionPane.showMessageDialog(null, "La Fecha de Inicio debe ser menor que la Fecha Final", "ERROR", JOptionPane.ERROR_MESSAGE);
            Cfecha1.setDate(null);
            Cfecha2.setDate(null);
        } else {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String selectedDateString = dateFormat.format(selectedDate);
            String selectedDateString1 = dateFormat.format(selectedDate1);
            TablaM.setRowCount(0);
            boolean filas = false;

            String Ndoc, tipo, desc, nombH, monto, fechaA, estado;
            String numDoc, sec, cuenta, descC, deb, cred, comt,act;

            File f = new File("Cabecera Transacciones.txt");
            File d = new File("Detalle Transacciones.txt");

            try {
                if (!f.exists()) {
                    JOptionPane.showMessageDialog(rootPane, "El archivo no existe");
                } else {
                    Scanner s = new Scanner(f);

                    while (s.hasNextLine()) {
                        String linea = s.nextLine();
                        Scanner s1 = new Scanner(linea);

                        s1.useDelimiter("\\s*;\\s*");

                        Ndoc = s1.next();
                        String fechaArchivo = s1.next();
                        tipo = s1.next();
                        desc = s1.next();
                        nombH = s1.next();
                        monto = s1.next();
                        fechaA = s1.next();
                        estado = s1.next();

                        if (estado.equals("true")) {
                            act = "SI";
                        } else {
                            act = "NO";
                        }
                        Date currentDate = dateFormat.parse(fechaArchivo);
                        if (currentDate.compareTo(selectedDate) >= 0 && currentDate.compareTo(selectedDate1) <= 0) {

                            try (Scanner w = new Scanner(d)) {
                                while (w.hasNextLine()) {
                                    String line = w.nextLine();
                                    Scanner s2 = new Scanner(line);

                                    s2.useDelimiter("\\s*;\\s*");

                                    numDoc = s2.next();
                                    sec = s2.next();
                                    cuenta = s2.next();
                                    descC = s2.next();
                                    deb = s2.next();
                                    cred = s2.next();
                                    // comt = s2.next();

                                    if (numDoc.equals(Ndoc)) {
                                        TablaM.addRow(new Object[]{numDoc, fechaArchivo, nombH, sec, cuenta, descC, deb, cred, monto,act});
                                        filas = true;
                                    }
                                }
                            }
                        }
                    }
                    s.close();

                    if (!filas) {
                        JOptionPane.showMessageDialog(rootPane, "No se encontró ningún registro para el rango de fechas seleccionado.");
                    }
                }
            } catch (IOException e) {
                System.out.println("Error al abrir el archivo");
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(Color.red);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //        DE_USUARIOS e = new DE_USUARIOS();
        //        e.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DE_TRANSACCIONES_RANGO_FECHA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Cfecha1;
    private com.toedter.calendar.JDateChooser Cfecha2;
    private javax.swing.JPanel PanelAzul;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaRegistro;
    // End of variables declaration//GEN-END:variables
}
