package CONSULTAS;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

class BalanceCellRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        Component cellComponent = super.getTableCellRendererComponent(table, value,
                isSelected, hasFocus, row, column);

        String balanceValue = (String) value; // Suponiendo que 'value' es el balance en formato String

        if (balanceValue.startsWith("-")) {
            cellComponent.setForeground(Color.RED);
        } else {
            cellComponent.setForeground(table.getForeground()); // Restaura el color predeterminado
        }

        return cellComponent;
    }
}

public class BALANZA_GENERAL extends javax.swing.JFrame {

    public DefaultTableModel TablaM;

    public BALANZA_GENERAL() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Balanza General");
        PanelPrincipal.requestFocusInWindow();

        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Century Gothic", Font.PLAIN, 14)));
        UIManager.put("OptionPane.messageForeground", Color.black);

        TablaM = (DefaultTableModel) tablaRegistros.getModel();
        // Crear un renderizador personalizado para el encabezado de la tabla
        JTableHeader tableHeader = tablaRegistros.getTableHeader();
        Font headerFont = new Font("Century Gothic", Font.PLAIN, 14); // Cambiar el tipo de letra
        tableHeader.setFont(headerFont);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        PanelAzul = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistros = new javax.swing.JTable();
        LabelCred = new javax.swing.JLabel();
        LabelTotal = new javax.swing.JLabel();
        LabelDeb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAzul.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BALANZA GENERAL");

        javax.swing.GroupLayout PanelAzulLayout = new javax.swing.GroupLayout(PanelAzul);
        PanelAzul.setLayout(PanelAzulLayout);
        PanelAzulLayout.setHorizontalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );
        PanelAzulLayout.setVerticalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzulLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        PanelPrincipal.add(PanelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 60));

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
        PanelPrincipal.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 130, 50));

        tablaRegistros.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        tablaRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO. CUENTA", "DESCRIPCION", "DÉBITOS", "CRÉDITOS", "BALANCE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaRegistros.setInheritsPopupMenu(true);
        tablaRegistros.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablaRegistros);
        if (tablaRegistros.getColumnModel().getColumnCount() > 0) {
            tablaRegistros.getColumnModel().getColumn(0).setPreferredWidth(10);
            tablaRegistros.getColumnModel().getColumn(1).setPreferredWidth(140);
            tablaRegistros.getColumnModel().getColumn(2).setPreferredWidth(30);
            tablaRegistros.getColumnModel().getColumn(3).setPreferredWidth(30);
            tablaRegistros.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        PanelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 770, 360));

        LabelCred.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        PanelPrincipal.add(LabelCred, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 140, 20));

        LabelTotal.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        LabelTotal.setText("TOTAL");
        PanelPrincipal.add(LabelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 180, 20));

        LabelDeb.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        PanelPrincipal.add(LabelDeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 140, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        boolean filas = false;
        double deb = 0.00, cred = 0.00;
        double sumaD = 0.00, sumaC = 0.00;
        ArrayList<String[]> datos = new ArrayList<>();

        int indexDeLaColumnaDeBalance = TablaM.getColumnCount() - 1;
        tablaRegistros.getColumnModel().getColumn(indexDeLaColumnaDeBalance).setCellRenderer(new BalanceCellRenderer());

        try {
            File f = new File("Catalogo.txt");

            if (!f.exists()) {
                JOptionPane.showMessageDialog(rootPane, "El archivo no existe");
            } else {
                Scanner s = new Scanner(f);

                while (s.hasNextLine()) {
                    String line = s.nextLine();
                    Scanner s1 = new Scanner(line);

                    s1.useDelimiter("\\s*;\\s*");

                    String cuenta = s1.next();
                    String descC = s1.next();
                    String tipo = s1.next();
                    String nivel = s1.next();
                    String padre = s1.next();
                    String grupo = s1.next();
                    String fechaC = s1.next();
                    String horaC = s1.next();
                    String debitoA = s1.next();
                    String creditoA = s1.next();
                    String balance = s1.next();

                    if (!balance.equals("0.0")) {
                        if (grupo.equals("Activo") || grupo.equals("Pasivo") || grupo.equals("Capital")) {
                            datos.add(new String[]{cuenta, descC, debitoA, creditoA, balance});
                            filas = true;
                            deb = Double.parseDouble(debitoA);
                            cred = Double.parseDouble(creditoA);

                            sumaD += deb;
                            sumaC += cred;
                        }
                    }
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

                    for (String[] fila : datos) {
                        TablaM.addRow(fila);
                    }
                    String tdeb = Double.toString(sumaD);
                    String tcred = Double.toString(sumaC);

                    LabelDeb.setText(tdeb);
                    LabelCred.setText(tcred);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se encontró ningún registro");
                }
            }

        } catch (IOException e) {
            System.out.println("Error al abrir el archivo");
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(Color.red);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BALANZA_GENERAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCred;
    private javax.swing.JLabel LabelDeb;
    private javax.swing.JLabel LabelTotal;
    private javax.swing.JPanel PanelAzul;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaRegistros;
    // End of variables declaration//GEN-END:variables
}
