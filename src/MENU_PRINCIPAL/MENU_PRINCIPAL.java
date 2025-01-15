package MENU_PRINCIPAL;

import CONSULTAS.BALANZA_DE_COMPROBACION;
import CONSULTAS.BALANZA_GENERAL;
import CONSULTAS.CONSULTA_USUARIO;
import CONSULTAS.DE_CATALOGO_DE_CUENTA;
import CONSULTAS.DE_DOCUMENTOS;
import CONSULTAS.DE_TRANSACCIONES_POR_DOCUMENTO;
import CONSULTAS.DE_TRANSACCIONES_POR_FECHA;
import CONSULTAS.DE_TRANSACCIONES_RANGO_FECHA;
import CONSULTAS.DE_TRANSACCIONES_TIPO_DOCUMENTO;
import CONSULTAS.RESUMEN_DE_GASTOS_GENERALES;
import MANTENIMIENTO.DE_CATALOGO;
import MANTENIMIENTO.DE_DOCUMENTO;
import MANTENIMIENTO.DE_USUARIOS;
import MOVIMIENTOS.DE_TRANSACCIONES;
import PROCESOS.CIERRE_DIARIO_FECHA;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.plaf.FontUIResource;

public class MENU_PRINCIPAL extends javax.swing.JFrame {

    public MENU_PRINCIPAL() {
        initComponents();
        this.setExtendedState(MENU_PRINCIPAL.MAXIMIZED_BOTH);
        
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Century Gothic", Font.PLAIN, 14)));
        UIManager.put("OptionPane.messageForeground", Color.black);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Mantenimientos = new javax.swing.JMenu();
        m_usuarios = new javax.swing.JMenuItem();
        m_cuentas = new javax.swing.JMenuItem();
        m_documentos = new javax.swing.JMenuItem();
        Movimiento = new javax.swing.JMenu();
        m_transacciones = new javax.swing.JMenuItem();
        Procesos = new javax.swing.JMenu();
        p_cierreD = new javax.swing.JMenuItem();
        Consultas = new javax.swing.JMenu();
        c_Manteniminentos = new javax.swing.JMenu();
        c_usuarios = new javax.swing.JMenuItem();
        c_cuentas = new javax.swing.JMenuItem();
        c_tipoDoc = new javax.swing.JMenuItem();
        c_Transacciones = new javax.swing.JMenu();
        t_PorFecha = new javax.swing.JMenuItem();
        t_porRango = new javax.swing.JMenuItem();
        t_PorDoc = new javax.swing.JMenuItem();
        t_PorTipoD = new javax.swing.JMenuItem();
        c_balanzaG = new javax.swing.JMenuItem();
        c_balanzaC = new javax.swing.JMenuItem();
        c_resumenG = new javax.swing.JMenuItem();
        Salida = new javax.swing.JMenu();
        m_login = new javax.swing.JMenuItem();
        m_salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        PanelPrincipal.setBackground(new java.awt.Color(0, 153, 255));
        PanelPrincipal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        PanelPrincipal.setLayout(null);

        Mantenimientos.setIcon(new javax.swing.ImageIcon("C:\\Users\\garci\\Documents\\Imagenes Proyecto\\mantenimiento.png")); // NOI18N
        Mantenimientos.setText("MANTENIMIENTOS");
        Mantenimientos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Mantenimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientosActionPerformed(evt);
            }
        });

        m_usuarios.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        m_usuarios.setIcon(new javax.swing.ImageIcon("C:\\Users\\garci\\Documents\\Imagenes Proyecto\\usuarios.png")); // NOI18N
        m_usuarios.setText("USUARIOS");
        m_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_usuariosActionPerformed(evt);
            }
        });
        Mantenimientos.add(m_usuarios);

        m_cuentas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        m_cuentas.setIcon(new javax.swing.ImageIcon("C:\\Users\\garci\\Documents\\Imagenes Proyecto\\extracto-de-cuenta.png")); // NOI18N
        m_cuentas.setText("CUENTAS");
        m_cuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_cuentasActionPerformed(evt);
            }
        });
        Mantenimientos.add(m_cuentas);

        m_documentos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        m_documentos.setIcon(new javax.swing.ImageIcon("C:\\Users\\garci\\Documents\\Imagenes Proyecto\\google-docs.png")); // NOI18N
        m_documentos.setText("DOCUMENTOS");
        m_documentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_documentosActionPerformed(evt);
            }
        });
        Mantenimientos.add(m_documentos);

        jMenuBar1.add(Mantenimientos);

        Movimiento.setIcon(new javax.swing.ImageIcon("C:\\Users\\garci\\Documents\\Imagenes Proyecto\\transaccion (1).png")); // NOI18N
        Movimiento.setText("MOVIMIENTO");
        Movimiento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        m_transacciones.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        m_transacciones.setIcon(new javax.swing.ImageIcon("C:\\Users\\garci\\Documents\\Imagenes Proyecto\\cambio-de-dinero.png")); // NOI18N
        m_transacciones.setText("TRANSACCIONES");
        m_transacciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_transaccionesActionPerformed(evt);
            }
        });
        Movimiento.add(m_transacciones);

        jMenuBar1.add(Movimiento);

        Procesos.setIcon(new javax.swing.ImageIcon("C:\\Users\\garci\\Documents\\Imagenes Proyecto\\flujo-de-trabajo.png")); // NOI18N
        Procesos.setText("PROCESOS");
        Procesos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        p_cierreD.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        p_cierreD.setIcon(new javax.swing.ImageIcon("C:\\Users\\garci\\Documents\\Imagenes Proyecto\\actualizar-pagina.png")); // NOI18N
        p_cierreD.setText("CIERRE DIARO");
        p_cierreD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_cierreDActionPerformed(evt);
            }
        });
        Procesos.add(p_cierreD);

        jMenuBar1.add(Procesos);

        Consultas.setIcon(new javax.swing.ImageIcon("C:\\Users\\garci\\Documents\\Imagenes Proyecto\\simbolo-de-base-de-datos-verificado-para-interfaz.png")); // NOI18N
        Consultas.setText("CONSULTAS");
        Consultas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        c_Manteniminentos.setText("MANTENIMIENTOS");
        c_Manteniminentos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        c_usuarios.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        c_usuarios.setIcon(new javax.swing.ImageIcon("C:\\Users\\garci\\Documents\\Imagenes Proyecto\\usuarios.png")); // NOI18N
        c_usuarios.setText("USUARIOS");
        c_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_usuariosActionPerformed(evt);
            }
        });
        c_Manteniminentos.add(c_usuarios);

        c_cuentas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        c_cuentas.setIcon(new javax.swing.ImageIcon("C:\\Users\\garci\\Documents\\Imagenes Proyecto\\extracto-de-cuenta.png")); // NOI18N
        c_cuentas.setText("CATALOGO DE CUENTAS");
        c_cuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cuentasActionPerformed(evt);
            }
        });
        c_Manteniminentos.add(c_cuentas);

        c_tipoDoc.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        c_tipoDoc.setIcon(new javax.swing.ImageIcon("C:\\Users\\garci\\Documents\\Imagenes Proyecto\\google-docs.png")); // NOI18N
        c_tipoDoc.setText("TIPO DE DOCUMENTO");
        c_tipoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_tipoDocActionPerformed(evt);
            }
        });
        c_Manteniminentos.add(c_tipoDoc);

        Consultas.add(c_Manteniminentos);

        c_Transacciones.setText("TRANSACCIONES");
        c_Transacciones.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        t_PorFecha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        t_PorFecha.setText("FECHA");
        t_PorFecha.setToolTipText("");
        t_PorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_PorFechaActionPerformed(evt);
            }
        });
        c_Transacciones.add(t_PorFecha);

        t_porRango.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        t_porRango.setText("RANGO DE FECHAS");
        t_porRango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_porRangoActionPerformed(evt);
            }
        });
        c_Transacciones.add(t_porRango);

        t_PorDoc.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        t_PorDoc.setText("DOCUMENTO");
        t_PorDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_PorDocActionPerformed(evt);
            }
        });
        c_Transacciones.add(t_PorDoc);

        t_PorTipoD.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        t_PorTipoD.setText("TIPO DE DOCUMENTO");
        t_PorTipoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_PorTipoDActionPerformed(evt);
            }
        });
        c_Transacciones.add(t_PorTipoD);

        Consultas.add(c_Transacciones);

        c_balanzaG.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        c_balanzaG.setText("BALANZA GENERAL");
        c_balanzaG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_balanzaGActionPerformed(evt);
            }
        });
        Consultas.add(c_balanzaG);

        c_balanzaC.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        c_balanzaC.setText("BALANZA DE COMPROBACION");
        c_balanzaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_balanzaCActionPerformed(evt);
            }
        });
        Consultas.add(c_balanzaC);

        c_resumenG.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        c_resumenG.setText("RESUMEN DE GASTOS");
        c_resumenG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_resumenGActionPerformed(evt);
            }
        });
        Consultas.add(c_resumenG);

        jMenuBar1.add(Consultas);

        Salida.setIcon(new javax.swing.ImageIcon("C:\\Users\\garci\\Documents\\Imagenes Proyecto\\cerrar-sesion.png")); // NOI18N
        Salida.setText("SALIR");
        Salida.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        m_login.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        m_login.setIcon(new javax.swing.ImageIcon("C:\\Users\\garci\\Documents\\Imagenes Proyecto\\acceso.png")); // NOI18N
        m_login.setText("IR AL LOGIN");
        m_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_loginActionPerformed(evt);
            }
        });
        Salida.add(m_login);

        m_salir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        m_salir.setIcon(new javax.swing.ImageIcon("C:\\Users\\garci\\Documents\\Imagenes Proyecto\\salida.png")); // NOI18N
        m_salir.setText("SALIR DEL PROGRAMA");
        m_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_salirActionPerformed(evt);
            }
        });
        Salida.add(m_salir);

        jMenuBar1.add(Salida);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MantenimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MantenimientosActionPerformed

    private void m_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_usuariosActionPerformed
        DE_USUARIOS u = new DE_USUARIOS();
        u.setVisible(true);
    }//GEN-LAST:event_m_usuariosActionPerformed

    private void m_cuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_cuentasActionPerformed
        DE_CATALOGO c = new DE_CATALOGO();
        c.setVisible(true);
    }//GEN-LAST:event_m_cuentasActionPerformed

    private void m_documentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_documentosActionPerformed
        DE_DOCUMENTO d = new DE_DOCUMENTO();
        d.setVisible(true);
    }//GEN-LAST:event_m_documentosActionPerformed

    private void m_transaccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_transaccionesActionPerformed
        DE_TRANSACCIONES t = new DE_TRANSACCIONES();
        t.setVisible(true);
    }//GEN-LAST:event_m_transaccionesActionPerformed

    private void c_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_usuariosActionPerformed
        CONSULTA_USUARIO cu = new CONSULTA_USUARIO();
        cu.setVisible(true);
    }//GEN-LAST:event_c_usuariosActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int resp = JOptionPane.showConfirmDialog(rootPane, "Seguro desea Salir?","Cerrar Ventana",JOptionPane.YES_NO_CANCEL_OPTION);

        if (resp == JOptionPane.YES_OPTION) {
            this.dispose();
        } else if(resp == JOptionPane.NO_OPTION){
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        } else {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void m_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_loginActionPerformed
        LOgin L = new LOgin();
        L.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_m_loginActionPerformed

    private void m_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_m_salirActionPerformed

    private void c_tipoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_tipoDocActionPerformed
      DE_DOCUMENTOS t = new DE_DOCUMENTOS();
        t.setVisible(true);
    }//GEN-LAST:event_c_tipoDocActionPerformed

    private void c_cuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cuentasActionPerformed
        DE_CATALOGO_DE_CUENTA t = new DE_CATALOGO_DE_CUENTA();
        t.setVisible(true);
    }//GEN-LAST:event_c_cuentasActionPerformed

    private void t_PorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_PorFechaActionPerformed
        DE_TRANSACCIONES_POR_FECHA t = new DE_TRANSACCIONES_POR_FECHA();
        t.setVisible(true);
    }//GEN-LAST:event_t_PorFechaActionPerformed

    private void c_balanzaGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_balanzaGActionPerformed
        BALANZA_GENERAL b = new BALANZA_GENERAL();
        b.setVisible(true);
    }//GEN-LAST:event_c_balanzaGActionPerformed

    private void p_cierreDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_cierreDActionPerformed
        CIERRE_DIARIO_FECHA cf = new CIERRE_DIARIO_FECHA();
        cf.setVisible(true);
    }//GEN-LAST:event_p_cierreDActionPerformed

    private void c_balanzaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_balanzaCActionPerformed
        BALANZA_DE_COMPROBACION b = new BALANZA_DE_COMPROBACION();
        b.setVisible(true);
    }//GEN-LAST:event_c_balanzaCActionPerformed

    private void c_resumenGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_resumenGActionPerformed
        RESUMEN_DE_GASTOS_GENERALES r = new RESUMEN_DE_GASTOS_GENERALES();
        r.setVisible(true);
    }//GEN-LAST:event_c_resumenGActionPerformed

    private void t_porRangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_porRangoActionPerformed
        DE_TRANSACCIONES_RANGO_FECHA f = new DE_TRANSACCIONES_RANGO_FECHA();
        f.setVisible(true);
    }//GEN-LAST:event_t_porRangoActionPerformed

    private void t_PorDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_PorDocActionPerformed
        DE_TRANSACCIONES_POR_DOCUMENTO d = new DE_TRANSACCIONES_POR_DOCUMENTO();
        d.setVisible(true);
    }//GEN-LAST:event_t_PorDocActionPerformed

    private void t_PorTipoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_PorTipoDActionPerformed
        DE_TRANSACCIONES_TIPO_DOCUMENTO n = new DE_TRANSACCIONES_TIPO_DOCUMENTO();
        n.setVisible(true);
    }//GEN-LAST:event_t_PorTipoDActionPerformed
    
    public void habilitarMantenimientos(boolean habilitar) {
        Mantenimientos.setEnabled(habilitar);
    }

    public void habilitarProcesos(boolean habilitar) {
        Procesos.setEnabled(habilitar);
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU_PRINCIPAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Consultas;
    private javax.swing.JMenu Mantenimientos;
    private javax.swing.JMenu Movimiento;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JMenu Procesos;
    private javax.swing.JMenu Salida;
    private javax.swing.JMenu c_Manteniminentos;
    private javax.swing.JMenu c_Transacciones;
    private javax.swing.JMenuItem c_balanzaC;
    private javax.swing.JMenuItem c_balanzaG;
    private javax.swing.JMenuItem c_cuentas;
    private javax.swing.JMenuItem c_resumenG;
    private javax.swing.JMenuItem c_tipoDoc;
    private javax.swing.JMenuItem c_usuarios;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem m_cuentas;
    private javax.swing.JMenuItem m_documentos;
    private javax.swing.JMenuItem m_login;
    private javax.swing.JMenuItem m_salir;
    private javax.swing.JMenuItem m_transacciones;
    private javax.swing.JMenuItem m_usuarios;
    private javax.swing.JMenuItem p_cierreD;
    private javax.swing.JMenuItem t_PorDoc;
    private javax.swing.JMenuItem t_PorFecha;
    private javax.swing.JMenuItem t_PorTipoD;
    private javax.swing.JMenuItem t_porRango;
    // End of variables declaration//GEN-END:variables
}
