package PROCESOS;

import ARCHIVOS.ManejoArchivos;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class CIERRE_DIARIO_FECHA extends javax.swing.JFrame {

    Date fecha2;
    Date fecha1;
    String debitoNew, creditoNew, balanceNew;
    double acumD = 0.00, acumC = 0.00;

    public CIERRE_DIARIO_FECHA() {
        initComponents();
        this.setTitle("Proceso de Cierre Diario");
        this.setLocationRelativeTo(null);
        txtFecha.setText(fecha());
        txtFecha.setEditable(false);

        PanelPrincipal.requestFocusInWindow();
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Century Gothic", Font.PLAIN, 14)));
        UIManager.put("OptionPane.messageForeground", Color.black);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        PanelAzul = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fechaInicial = new com.toedter.calendar.JDateChooser();
        FechaFinal = new com.toedter.calendar.JDateChooser();
        btnProcesar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cierre de Diario");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAzul.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CIERRE DE DIARIO");

        javax.swing.GroupLayout PanelAzulLayout = new javax.swing.GroupLayout(PanelAzul);
        PanelAzul.setLayout(PanelAzulLayout);
        PanelAzulLayout.setHorizontalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzulLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelAzulLayout.setVerticalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzulLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        PanelPrincipal.add(PanelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, -1));

        fechaInicial.setBackground(new java.awt.Color(237, 237, 237));
        fechaInicial.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        PanelPrincipal.add(fechaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 220, 31));

        FechaFinal.setBackground(new java.awt.Color(237, 237, 237));
        FechaFinal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        PanelPrincipal.add(FechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 220, 31));

        btnProcesar.setBackground(new java.awt.Color(160, 171, 176));
        btnProcesar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnProcesar.setForeground(new java.awt.Color(255, 255, 255));
        btnProcesar.setText("PROCESAR");
        btnProcesar.setBorder(null);
        btnProcesar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProcesar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProcesarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProcesarMouseExited(evt);
            }
        });
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 130, 50));

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
        PanelPrincipal.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 130, 50));

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
        PanelPrincipal.add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 130, 50));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("FECHA FINAL");
        PanelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 90, 20));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("FECHA INICIAL");
        PanelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 100, 20));

        txtFecha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        PanelPrincipal.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 100, 30));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("FECHA");
        PanelPrincipal.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProcesarMouseEntered
        btnProcesar.setBackground(new Color(0, 51, 204));
    }//GEN-LAST:event_btnProcesarMouseEntered

    private void btnProcesarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProcesarMouseExited
        btnProcesar.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_btnProcesarMouseExited

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        fecha1 = fechaInicial.getDate();
        fecha2 = FechaFinal.getDate();
        boolean modificar = false;
        boolean encontradom = false;
        boolean hayTransacciones = false;
        String lineaVieja = null;
        String lineaNueva = null;
        ArrayList<String> lineasViejas = new ArrayList<>();
        ArrayList<String> lineasNuevas = new ArrayList<>();
        int estadoR = 0;
        
        if (fecha1 == null && fecha2 == null) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una fecha");
            fechaInicial.setDate(null);
            FechaFinal.setDate(null);
            return;
        }
        if (fecha1 == null) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una fecha inicial");
            fechaInicial.setDate(null);
            return;
        }
        if (fecha2 == null) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una fecha final");
            FechaFinal.setDate(null);
            return;
        } 

        try {
            estadoR = estado();

        } catch (ParseException ex) {
            Logger.getLogger(CIERRE_DIARIO_FECHA.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (estadoR == 1) {
            JOptionPane.showMessageDialog(null, "Ya se han Actualizado Todas las Transacciones en ese rango de fecha ");
            fechaInicial.setDate(null);
            FechaFinal.setDate(null);
        } else if (fecha1 == null || fecha2 == null) {
            JOptionPane.showMessageDialog(null, "Por favor Rellene ambos campos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (fecha1.after(fecha2)) {
            JOptionPane.showMessageDialog(null, "La Fecha de Inicio debe ser menor que la Fecha Final", "ERROR", JOptionPane.ERROR_MESSAGE);
            BtnLimpiarActionPerformed(evt);
        } else {

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            try {
                Scanner s;
                Scanner w;

                File f = new File("Cabecera Transacciones.txt");
                s = new Scanner(f);
                File d = new File("Detalle Transacciones.txt");
                w = new Scanner(d);

                while (s.hasNextLine()) {
                    String linea = s.nextLine();
                    Scanner s1 = new Scanner(linea);

                    s1.useDelimiter("\\s*;\\s*");

                    String nDoc = s1.next();
                    String fechaD = s1.next();
                    String tipoD = s1.next();
                    String descD = s1.next();
                    String hechoPor = s1.next();
                    String montoD = s1.next();
                    String fechaA = s1.next();
                    String estado = s1.next();

                    if (estado.equals("true")) {
                        //no hacer nada
//                        System.out.println("no entra porque esta actualizado");
                    } else {
                        lineaVieja = nDoc + ";" + fechaD + ";" + tipoD + ";" + descD + ";" + hechoPor + ";" + montoD + ";"
                                + fechaA + ";" + estado;

                        try {
                            Date currentDate = dateFormat.parse(fechaD);

                            if (currentDate.compareTo(fecha1) >= 0 && currentDate.compareTo(fecha2) <= 0) {

                                while (w.hasNextLine()) {
                                    String line = w.nextLine();
                                    Scanner s2 = new Scanner(line);

                                    s2.useDelimiter("\\s*;\\s*");

                                    String numD = s2.next();
                                    String sec = s2.next();
                                    String cuentaT = s2.next();
                                    String descCuenta = s2.next();
                                    String debito = s2.next();
                                    String credito = s2.next();
//                                    String coment = s2.next();

                                    //catalogo
                                    if (nDoc.equals(numD)) {
                                        Catalogo(cuentaT, debito, credito);

                                        lineaNueva = nDoc + ";" + fechaD + ";" + tipoD + ";" + descD + ";" + hechoPor + ";"
                                                + montoD + ";" + txtFecha.getText() + ";" + true;

                                        lineasViejas.add(lineaVieja);
                                        lineasNuevas.add(lineaNueva);

                                        modificar = true;
                                        hayTransacciones = true;
                                    }
                                }
                            }
                        } catch (ParseException p) {
                            p.printStackTrace();
                        }
                    }
                }
                s.close();
                w.close();

                if (modificar) {
                    ManejoArchivos m = new ManejoArchivos();
                    for (int i = 0; i < lineasViejas.size(); i++) {
                        m.Modificar(lineasViejas.get(i), lineasNuevas.get(i), f);
                    }
                }
                if (hayTransacciones) {
                    JOptionPane.showMessageDialog(null, "Cierre procesado");
                } else if (!hayTransacciones) {
                    JOptionPane.showMessageDialog(null, "No hay Transacciones en este rango de fechas");
                    fechaInicial.setDate(null);
                    FechaFinal.setDate(null);
                }

            } catch (FileNotFoundException e) {
            }
        }
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(Color.red);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void BtnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarMouseEntered
        BtnLimpiar.setBackground(new Color(0, 51, 204));
    }//GEN-LAST:event_BtnLimpiarMouseEntered

    private void BtnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarMouseExited
        BtnLimpiar.setBackground(new Color(160, 171, 176));
    }//GEN-LAST:event_BtnLimpiarMouseExited

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        FechaFinal.setDate(null);
        fechaInicial.setDate(null);
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    public void Catalogo(String DetalleCuenta, String deb, String cr) {
        boolean encontrado = false;
        boolean modificar = false;
        String LineaAntigua = "", LineaNueva = "";
        Scanner s;
        ArrayList<String> lineasAntiguas = new ArrayList<>();
        ArrayList<String> LineasNuevas = new ArrayList<>();

        try {
            File f = new File("Catalogo.txt");

            s = new Scanner(f);
            while (s.hasNextLine()) {

                String linea = s.nextLine();
                Scanner s1 = new Scanner(linea);

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

                LineaAntigua = cuenta + ";" + descC + ";" + tipo + ";" + nivel + ";" + padre + ";" + grupo + ";"
                        + fechaC + ";" + horaC + ";" + debitoA + ";" + creditoA + ";" + balance;

                if (DetalleCuenta.equals(cuenta)) {
                    acumD = Double.parseDouble(debitoA);
                    acumC = Double.parseDouble(creditoA);
                    trans(cuenta, grupo, deb, cr, balance);

                    LineaNueva = cuenta + ";" + descC + ";" + tipo + ";" + nivel + ";" + padre + ";" + grupo + ";"
                            + fechaC + ";" + horaC + ";" + debitoNew + ";" + creditoNew + ";" + balanceNew;

                    lineasAntiguas.add(LineaAntigua);
                    LineasNuevas.add(LineaNueva);
                    modificar = true;
                }
            }
            s.close();

            if (modificar) {

                int cantidadElementos = Math.min(lineasAntiguas.size(), LineasNuevas.size());
                for (int i = 0; i < cantidadElementos; i++) {
                    Modificar(lineasAntiguas.get(i), LineasNuevas.get(i), f);
                }
            }
        } catch (FileNotFoundException e) {
        }
    }

    public String origen(String grupo) {

        String origen = "";

        switch (grupo) {
            case "Activo":
                origen = "debito";
                break;

            case "Pasivo":
                origen = "credito";
                break;

            case "Capital":
                origen = "credito";
                break;

            case "Ingresos":
                origen = "credito";
                break;

            case "Costos":
                origen = "debito";
                break;

            case "Gastos":
                origen = "debito";
                break;

            default:
                origen = "";
                break;
        }

        return origen;
    }

    public void trans(String cnum, String itemg, String d, String c, String bl) {

        String orig = origen(itemg);
        double balancc = Double.parseDouble(bl);
        double almD = Double.parseDouble(d);
        double almC = Double.parseDouble(c);

        if (orig.equals("debito")) {

            acumD += almD;
            acumC += almC;

            balancc += almD;
            balancc -= almC;

            String pdeb = Double.toString(acumD);
            String pcre = Double.toString(acumC);
            String pbal = Double.toString(balancc);

            debitoNew = pdeb;
            creditoNew = pcre;
            balanceNew = pbal;

        } else if (orig.equals("credito")) {

            acumD += almD;
            acumC += almC;

            balancc -= almD;
            balancc += almC;

            String pdeb = Double.toString(acumD);
            String pcre = Double.toString(acumC);
            String pbal = Double.toString(balancc);

            debitoNew = pdeb;
            creditoNew = pcre;
            balanceNew = pbal;
        }
    }

    public int estado() throws ParseException {
        int num = 0;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
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

                Date currentDate = dateFormat.parse(fecha);

                if (currentDate.compareTo(fecha1) >= 0 && currentDate.compareTo(fecha2) <= 0) {
                    if (estado.equals("true")) {
                        num = 1;
                    } else {
                        num = 2;
                    }
                }
            }
            s.close();
        } catch (FileNotFoundException e) {

        }

        return num;
    }

    public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }

    public void GuardarDatos(String cadena, File archivo) {
        try {

            if (!archivo.exists()) {
                archivo.createNewFile();
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true));
            bw.write(cadena + "\r\n");
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void Modificar(String cadenaA, String cadenaN, File archivoA) {
        File archivoN = new File("AuxiliarC.txt");

        try {
            archivoN.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex);
        }

        BufferedReader br;
        try {
            if (archivoA.exists()) {

                br = new BufferedReader(new FileReader(archivoA));

                String linea;

                while ((linea = br.readLine()) != null) {

                    if (linea.equals(cadenaA)) {
                        GuardarDatos(cadenaN, archivoN);
                    } else {
                        GuardarDatos(linea, archivoN);
                    }
                }

                br.close();

                Borrar(archivoA);
                archivoN.renameTo(archivoA);

            } else {
                System.out.println("No existe el archivo");
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void Borrar(File f) {
        try {
            if (f.exists()) {
                f.delete();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CIERRE_DIARIO_FECHA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLimpiar;
    private com.toedter.calendar.JDateChooser FechaFinal;
    private javax.swing.JPanel PanelAzul;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JButton btnSalir;
    private com.toedter.calendar.JDateChooser fechaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
