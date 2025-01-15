package CONSULTAS;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class DE_TRANSACCIONES_POR_FECHA extends javax.swing.JFrame {

    public DefaultTableModel TablaM;

    public DE_TRANSACCIONES_POR_FECHA() {
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

        PanelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistro = new javax.swing.JTable();
        btnconsultar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        Cfecha = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        PanelAzul1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PanelAzul = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaRegistro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tablaRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Doc", "Fecha ", "Hecho Por", "#", "Cuenta", "Descripcion C", "Debitos", "Creditos", "Monto", "Actualizacion"
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
            tablaRegistro.getColumnModel().getColumn(0).setPreferredWidth(10);
            tablaRegistro.getColumnModel().getColumn(1).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(1).setPreferredWidth(25);
            tablaRegistro.getColumnModel().getColumn(2).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(2).setPreferredWidth(16);
            tablaRegistro.getColumnModel().getColumn(3).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(3).setPreferredWidth(2);
            tablaRegistro.getColumnModel().getColumn(4).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(4).setPreferredWidth(10);
            tablaRegistro.getColumnModel().getColumn(5).setPreferredWidth(160);
            tablaRegistro.getColumnModel().getColumn(6).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(6).setPreferredWidth(15);
            tablaRegistro.getColumnModel().getColumn(7).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(7).setPreferredWidth(15);
            tablaRegistro.getColumnModel().getColumn(8).setPreferredWidth(20);
            tablaRegistro.getColumnModel().getColumn(9).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(9).setPreferredWidth(10);
        }

        PanelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 900, 420));

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
        PanelPrincipal.add(btnconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 130, 50));

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
        PanelPrincipal.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, 130, 50));

        Cfecha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Cfecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CfechaKeyPressed(evt);
            }
        });
        PanelPrincipal.add(Cfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 230, 30));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("FECHA");
        PanelPrincipal.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 100, 30));

        PanelAzul1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TRANSACCIONES POR FECHA");

        javax.swing.GroupLayout PanelAzul1Layout = new javax.swing.GroupLayout(PanelAzul1);
        PanelAzul1.setLayout(PanelAzul1Layout);
        PanelAzul1Layout.setHorizontalGroup(
            PanelAzul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );
        PanelAzul1Layout.setVerticalGroup(
            PanelAzul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzul1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        PanelPrincipal.add(PanelAzul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 60));

        PanelAzul.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTA DE TRANSACCIONES POR FECHA");

        javax.swing.GroupLayout PanelAzulLayout = new javax.swing.GroupLayout(PanelAzul);
        PanelAzul.setLayout(PanelAzulLayout);
        PanelAzulLayout.setHorizontalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );
        PanelAzulLayout.setVerticalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzulLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 526, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnconsultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconsultarMouseEntered
        btnconsultar.setBackground(new Color(0, 51, 204));
    }//GEN-LAST:event_btnconsultarMouseEntered

    private void btnconsultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconsultarMouseExited
        btnconsultar.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_btnconsultarMouseExited

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        Date selectedDate = Cfecha.getDate();

        if (selectedDate == null) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una fecha");
            Cfecha.setDate(null);
            return;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String selectedDateString = dateFormat.format(selectedDate);
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
                Scanner w = new Scanner(d);

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
                    
                    if (fechaArchivo.equals(selectedDateString)) {

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
//                        comt = s2.next();

                            TablaM.addRow(new Object[]{numDoc, fechaArchivo, nombH, sec, cuenta, descC, deb, cred,monto,act});
                            filas = true;
                        }
                    }
                }
                s.close();
                w.close();

                if (!filas) {
                    JOptionPane.showMessageDialog(rootPane, "No se encontró ningún registro para la fecha seleccionada.");
                }
            }
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo");
        }

//        Cfecha.setDate(null);
//        TablaM.setRowCount(0);
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void CfechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CfechaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CfechaKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DE_TRANSACCIONES_POR_FECHA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Cfecha;
    private javax.swing.JPanel PanelAzul;
    private javax.swing.JPanel PanelAzul1;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaRegistro;
    // End of variables declaration//GEN-END:variables
}
