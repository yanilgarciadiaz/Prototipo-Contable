package CONSULTAS;

import MANTENIMIENTO.DE_CATALOGO;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class DE_CATALOGO_DE_CUENTA extends javax.swing.JFrame {

    public DefaultTableModel TablaM;

    public DE_CATALOGO_DE_CUENTA() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Consulta Cuentas");
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistro = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnconsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        PanelAzul.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTA DE CATÁLOGO DE CUENTAS");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaRegistro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tablaRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Cuenta", "Descripción", "Tipo", "Nivel", "Padre", "Grupo", "Fecha C", "Hora C", "Débito", "Credito", "Balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaRegistro);
        if (tablaRegistro.getColumnModel().getColumnCount() > 0) {
            tablaRegistro.getColumnModel().getColumn(0).setPreferredWidth(3);
            tablaRegistro.getColumnModel().getColumn(1).setPreferredWidth(155);
            tablaRegistro.getColumnModel().getColumn(2).setPreferredWidth(4);
            tablaRegistro.getColumnModel().getColumn(3).setPreferredWidth(1);
            tablaRegistro.getColumnModel().getColumn(4).setPreferredWidth(1);
            tablaRegistro.getColumnModel().getColumn(5).setPreferredWidth(10);
            tablaRegistro.getColumnModel().getColumn(6).setPreferredWidth(17);
            tablaRegistro.getColumnModel().getColumn(7).setPreferredWidth(15);
            tablaRegistro.getColumnModel().getColumn(8).setPreferredWidth(15);
            tablaRegistro.getColumnModel().getColumn(9).setPreferredWidth(15);
            tablaRegistro.getColumnModel().getColumn(10).setPreferredWidth(15);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 410));

        btnSalir.setBackground(new java.awt.Color(160, 171, 176));
        btnSalir.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
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
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 150, 50));

        btnconsultar.setBackground(new java.awt.Color(160, 171, 176));
        btnconsultar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
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
        jPanel1.add(btnconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 150, 50));

        javax.swing.GroupLayout PanelAzulLayout = new javax.swing.GroupLayout(PanelAzul);
        PanelAzul.setLayout(PanelAzulLayout);
        PanelAzulLayout.setHorizontalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelAzulLayout.setVerticalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzulLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE))
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

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(Color.red);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
//        DE_CATALOGO e = new DE_CATALOGO();
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
        TablaM.setRowCount(0);
        boolean filas = false;

        String num, desc, tipo, nivel, padre, grupo, debito, credito, balance, fecha, hora;
        String tipoL = "";
        File f = new File("Catalogo.txt");
        ArrayList<String[]> datos = new ArrayList<>();

        try {
            if (!f.exists()) {
                JOptionPane.showMessageDialog(rootPane, "El archivo no existe");
            } else {
                Scanner s = new Scanner(f);

                while (s.hasNextLine()) {
                    String linea = s.nextLine();
                    Scanner s1 = new Scanner(linea);

                    s1.useDelimiter("\\s*;\\s*");

                    num = s1.next();
                    desc = s1.next();
                    tipo = s1.next();
                    nivel = s1.next();
                    padre = s1.next();
                    grupo = s1.next();
                    fecha = s1.next();
                    hora = s1.next();
                    debito = s1.next();
                    credito = s1.next();
                    balance = s1.next();
                    
                    if (tipo.equals("0")) {
                        tipoL = "GENERAL";
                    } else if (tipo.equals("1")) {
                        tipoL = "DETALLE";
                    }
                    
                    datos.add(new String[]{num, desc, tipoL, nivel, padre, grupo, fecha, hora, debito, credito, balance});

                    filas = true;
                }
                s.close();

                if (filas) {
                    
                     Comparator<String[]> comparator = (arr1, arr2) -> {
                        String num1 = arr1[0];
                        String num2 = arr2[0];

                        int digit1 = Integer.parseInt(num1.substring(0, 1));
                        int digit2 = Integer.parseInt(num2.substring(0, 1));

                        if (digit1 != digit2) {
                            return Integer.compare(digit1, digit2);
                        } else {
                            return Integer.compare(Integer.parseInt(num1), Integer.parseInt(num2));
                        }
                    };
                     
                    datos.sort(comparator);
                    
                    for (String[] fila: datos) {
                        TablaM.addRow(fila);
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se encontró ningún registro");
                }
            }
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo");
        }

    }//GEN-LAST:event_btnconsultarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DE_CATALOGO_DE_CUENTA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAzul;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaRegistro;
    // End of variables declaration//GEN-END:variables
}
