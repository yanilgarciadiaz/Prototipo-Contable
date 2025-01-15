package CONSULTAS;

import MANTENIMIENTO.DE_DOCUMENTO;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class DE_TRANSACCIONES_TIPO_DOCUMENTO extends javax.swing.JFrame {

    public DefaultTableModel TablaM;

    public DE_TRANSACCIONES_TIPO_DOCUMENTO() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Consulta Transacciones Tipo de Documento");
        PanelPrincipal.requestFocusInWindow();

        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Century Gothic", Font.PLAIN, 14)));
        UIManager.put("OptionPane.messageForeground", Color.black);

        TablaM = (DefaultTableModel) TablaDoc.getModel();

        JTableHeader tableHeader = TablaDoc.getTableHeader();
        Font headerFont = new Font("Century Gothic", Font.PLAIN, 14); // Cambiar el tipo de letra
        tableHeader.setFont(headerFont);

        cargarEstados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        PanelAzul = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnconsultar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CbTipoDoc = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDoc = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAzul.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TRANSACCIONES POR TIPO DE DOCUMENTOS");

        javax.swing.GroupLayout PanelAzulLayout = new javax.swing.GroupLayout(PanelAzul);
        PanelAzul.setLayout(PanelAzulLayout);
        PanelAzulLayout.setHorizontalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzulLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelAzulLayout.setVerticalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzulLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelPrincipal.add(PanelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 70));

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
        PanelPrincipal.add(btnconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 130, 50));

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
        PanelPrincipal.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 130, 50));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("TIPO DE DOCUMENTO");
        PanelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 152, 32));

        CbTipoDoc.setBackground(new java.awt.Color(237, 237, 237));
        CbTipoDoc.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CbTipoDoc.setToolTipText("");
        CbTipoDoc.setBorder(null);
        CbTipoDoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbTipoDocItemStateChanged(evt);
            }
        });
        CbTipoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbTipoDocActionPerformed(evt);
            }
        });
        PanelPrincipal.add(CbTipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 240, 30));

        TablaDoc.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TablaDoc.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaDoc);
        if (TablaDoc.getColumnModel().getColumnCount() > 0) {
            TablaDoc.getColumnModel().getColumn(0).setResizable(false);
            TablaDoc.getColumnModel().getColumn(0).setPreferredWidth(15);
            TablaDoc.getColumnModel().getColumn(1).setResizable(false);
            TablaDoc.getColumnModel().getColumn(1).setPreferredWidth(25);
            TablaDoc.getColumnModel().getColumn(2).setResizable(false);
            TablaDoc.getColumnModel().getColumn(2).setPreferredWidth(25);
            TablaDoc.getColumnModel().getColumn(3).setResizable(false);
            TablaDoc.getColumnModel().getColumn(3).setPreferredWidth(2);
            TablaDoc.getColumnModel().getColumn(4).setResizable(false);
            TablaDoc.getColumnModel().getColumn(4).setPreferredWidth(15);
            TablaDoc.getColumnModel().getColumn(5).setPreferredWidth(160);
            TablaDoc.getColumnModel().getColumn(6).setResizable(false);
            TablaDoc.getColumnModel().getColumn(6).setPreferredWidth(10);
            TablaDoc.getColumnModel().getColumn(7).setPreferredWidth(10);
            TablaDoc.getColumnModel().getColumn(8).setPreferredWidth(20);
            TablaDoc.getColumnModel().getColumn(9).setResizable(false);
            TablaDoc.getColumnModel().getColumn(9).setPreferredWidth(10);
        }

        PanelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 920, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        int eleccion = CbTipoDoc.getSelectedIndex();

        if (CbTipoDoc.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(rootPane, "Debe Seleccionar un tipo de Documento");
            return;
        }

        TablaM.setRowCount(0);
        boolean filas = false;

        String Ndoc, tipo, desc, nombH, monto, fechaA, estado;
        String numDoc, sec, cuenta, descC, deb, cred, comt, act;

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

                    int tipoS = Integer.parseInt(tipo);
                    
                    if (estado.equals("true")) {
                        act = "SI";
                    } else {
                         act = "NO";
                    }

                    if (tipoS == eleccion) {

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

                            if (Ndoc.equals(numDoc)) {
                                TablaM.addRow(new Object[]{Ndoc, fechaArchivo, nombH, sec, cuenta, descC, deb, cred,monto,act});
                                filas = true;
                            }
                        }
                    }
                }
                s.close();
                w.close();

                if (!filas) {
                    JOptionPane.showMessageDialog(rootPane, "No se encontró ningún registro con el Documento Ingresado.");
                }
            }
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo");
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

    private void CbTipoDocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbTipoDocItemStateChanged

    }//GEN-LAST:event_CbTipoDocItemStateChanged

    private void CbTipoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbTipoDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbTipoDocActionPerformed

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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DE_TRANSACCIONES_TIPO_DOCUMENTO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbTipoDoc;
    private javax.swing.JPanel PanelAzul;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JTable TablaDoc;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
