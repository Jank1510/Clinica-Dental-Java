/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicadental.com.view;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jank
 */
public class contenido extends javax.swing.JFrame {
    public DefaultTableModel modelo;
    /**
     * Creates new form contenido
     */
    public contenido() {
        initComponents();
        modelo=new DefaultTableModel();
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("EDAD");
        modelo.addColumn("Nº CEDULA");
        modelo.addColumn("CODIGO");
        modelo.addColumn("FECHA_REALIZACION");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("TIPO DE SERVICIO");
        modelo.addColumn("PRECIO");

        this.tabla.setModel(modelo);



    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombreNew = new javax.swing.JTextField();
        apellidoNew = new javax.swing.JTextField();
        edadNew = new javax.swing.JTextField();
        cedulaNew = new javax.swing.JTextField();
        codigoNew = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fechaRealizacionNew = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        descripcionNew = new javax.swing.JComboBox<>();
        tipoServicioNew = new javax.swing.JComboBox<>();
        registrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        actualizar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cedulaBuscador = new javax.swing.JTextField();
        btnBuscarCedula = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        ver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("APELLIDO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EDAD:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nº CEDULA:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CODIGO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 110, -1, -1));

        nombreNew.setBackground(new java.awt.Color(6, 88, 147));
        nombreNew.setForeground(new java.awt.Color(255, 255, 255));
        nombreNew.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163)));
        jPanel1.add(nombreNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 110, -1));

        apellidoNew.setBackground(new java.awt.Color(6, 88, 147));
        apellidoNew.setForeground(new java.awt.Color(255, 255, 255));
        apellidoNew.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163)));
        jPanel1.add(apellidoNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 100, -1));

        edadNew.setBackground(new java.awt.Color(6, 88, 147));
        edadNew.setForeground(new java.awt.Color(255, 255, 255));
        edadNew.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163)));
        jPanel1.add(edadNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 50, -1));

        cedulaNew.setBackground(new java.awt.Color(6, 88, 147));
        cedulaNew.setForeground(new java.awt.Color(255, 255, 255));
        cedulaNew.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163)));
        jPanel1.add(cedulaNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 100, -1));

        codigoNew.setBackground(new java.awt.Color(6, 88, 147));
        codigoNew.setForeground(new java.awt.Color(255, 255, 255));
        codigoNew.setToolTipText("");
        codigoNew.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163)));
        jPanel1.add(codigoNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 110, 90, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("FECHA_REALIZACION:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        fechaRealizacionNew.setBackground(new java.awt.Color(6, 88, 147));
        fechaRealizacionNew.setForeground(new java.awt.Color(255, 255, 255));
        fechaRealizacionNew.setToolTipText("");
        fechaRealizacionNew.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163)));
        jPanel1.add(fechaRealizacionNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 110, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("dia/mes/año");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 110, -1));

        jLabel9.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CLINICA DENTAL KYLIAN");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DESCRIPCION:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("TIPO DE SERVICIO:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, -1, -1));

        descripcionNew.setBackground(new java.awt.Color(6, 88, 147));
        descripcionNew.setForeground(new java.awt.Color(255, 255, 255));
        descripcionNew.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "REGULAR", "PREVENTIVO", "CORRECTIVO" }));
        descripcionNew.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163)));
        descripcionNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(descripcionNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, -1, -1));

        tipoServicioNew.setBackground(new java.awt.Color(6, 88, 147));
        tipoServicioNew.setForeground(new java.awt.Color(255, 255, 255));
        tipoServicioNew.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Higiene Dental(profilaxis)_50000$", "Resina de fotocurado_70000$", "Sellante de fisuras y fosetas_30000$", "Fluorizacion_30000$" }));
        tipoServicioNew.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163)));
        tipoServicioNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(tipoServicioNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, -1, -1));

        registrar.setBackground(new java.awt.Color(71, 192, 167));
        registrar.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setText("REGISTRAR");
        registrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 90, 30));

        tabla.setBackground(new java.awt.Color(23, 156, 188));
        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "APELLIDO", "EDAD", "CEDULA", "CODIGO", "FECHA_REALIZACION", "DESCRIPCION", "TIPO SERVICIO", "PRECIO $"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setGridColor(new java.awt.Color(251, 228, 163));
        tabla.setSelectionBackground(new java.awt.Color(251, 228, 163));
        tabla.setSelectionForeground(new java.awt.Color(71, 192, 167));
        tabla.setShowHorizontalLines(true);
        tabla.setShowVerticalLines(true);
        jScrollPane2.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(5).setResizable(false);
            tabla.getColumnModel().getColumn(6).setResizable(false);
            tabla.getColumnModel().getColumn(7).setResizable(false);
            tabla.getColumnModel().getColumn(8).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 1150, 250));

        jLabel12.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("LISTA DE CLIENTES:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, -1));

        actualizar.setBackground(new java.awt.Color(71, 192, 167));
        actualizar.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        actualizar.setForeground(new java.awt.Color(255, 255, 255));
        actualizar.setText("ACTUALIZAR");
        actualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 120, 30));

        eliminar.setBackground(new java.awt.Color(71, 192, 167));
        eliminar.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setText("ELIMINAR");
        eliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, 80, 30));

        jLabel13.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("BUSCAR Nº DE CEDULA:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 560, -1, 30));

        cedulaBuscador.setBackground(new java.awt.Color(6, 88, 147));
        cedulaBuscador.setForeground(new java.awt.Color(255, 255, 255));
        cedulaBuscador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163), new java.awt.Color(251, 228, 163)));
        jPanel1.add(cedulaBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 560, 110, 30));

        btnBuscarCedula.setBackground(new java.awt.Color(71, 192, 167));
        btnBuscarCedula.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        btnBuscarCedula.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCedula.setText("OK");
        btnBuscarCedula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCedulaActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 560, 40, 30));

        salir.setBackground(new java.awt.Color(71, 192, 167));
        salir.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("SALIR");
        salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 560, 70, 30));

        ver.setBackground(new java.awt.Color(71, 192, 167));
        ver.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        ver.setForeground(new java.awt.Color(255, 255, 255));
        ver.setText("VER");
        ver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });
        jPanel1.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 80, 30));

        jLabel1.setBackground(new java.awt.Color(6, 88, 147));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarCedulaActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarActionPerformed

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(contenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(contenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(contenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(contenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new contenido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton actualizar;
    public javax.swing.JTextField apellidoNew;
    public javax.swing.JButton btnBuscarCedula;
    public javax.swing.JTextField cedulaBuscador;
    public javax.swing.JTextField cedulaNew;
    public javax.swing.JTextField codigoNew;
    public javax.swing.JComboBox<String> descripcionNew;
    public javax.swing.JTextField edadNew;
    public javax.swing.JButton eliminar;
    public javax.swing.JTextField fechaRealizacionNew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextField nombreNew;
    public javax.swing.JButton registrar;
    public javax.swing.JButton salir;
    public javax.swing.JTable tabla;
    public javax.swing.JComboBox<String> tipoServicioNew;
    public javax.swing.JButton ver;
    // End of variables declaration//GEN-END:variables
}
