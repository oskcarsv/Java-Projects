/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.oscarmorales.vista;

import java.awt.Color;
import org.oscarmorales.controlador.ControlDeCamioneta;
import org.oscarmorales.modelo.Camioneta;

/**
 * Ventana agregar camioneta
 * @author Oscar
 */
public class VentanaAgregarCamioneta extends javax.swing.JInternalFrame {

    /**
     * Instancia agregar camioneta
     */
    public ControlDeCamioneta controlador = ControlDeCamioneta.getInstanciaCamioneta();
    
    
    /**
     * Creates new form VentanaAgregarCarro
     */
    public VentanaAgregarCamioneta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAgregarCamioneta = new javax.swing.JPanel();
        panelTitleAgregarCamioneta = new javax.swing.JPanel();
        lblTitleIAgregarCamioneta = new javax.swing.JLabel();
        lblMarcaCamioneta = new javax.swing.JLabel();
        lblModeloCamioneta = new javax.swing.JLabel();
        lblPlacaCamioneta = new javax.swing.JLabel();
        lblCombustibleCamioneta = new javax.swing.JLabel();
        lblAsientosCamioneta = new javax.swing.JLabel();
        txtMarcaAgregarCamioneta = new javax.swing.JTextField();
        txtModeloAgregarCamioneta = new javax.swing.JTextField();
        txtPlacaAgregarCamioneta = new javax.swing.JTextField();
        txtCombustibleAgregarCamioneta = new javax.swing.JTextField();
        txtAsientosAgregarCamioneta = new javax.swing.JTextField();
        separatorAgregarCamioneta = new javax.swing.JSeparator();
        btnAgregarCamioneta = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setForeground(java.awt.Color.darkGray);
        setResizable(true);

        panelAgregarCamioneta.setBackground(new java.awt.Color(51, 51, 51));
        panelAgregarCamioneta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelAgregarCamioneta.setPreferredSize(new java.awt.Dimension(1150, 650));
        panelAgregarCamioneta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTitleAgregarCamioneta.setBackground(new java.awt.Color(0, 102, 102));

        lblTitleIAgregarCamioneta.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        lblTitleIAgregarCamioneta.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleIAgregarCamioneta.setText("INGRESAR CAMIONETA");

        javax.swing.GroupLayout panelTitleAgregarCamionetaLayout = new javax.swing.GroupLayout(panelTitleAgregarCamioneta);
        panelTitleAgregarCamioneta.setLayout(panelTitleAgregarCamionetaLayout);
        panelTitleAgregarCamionetaLayout.setHorizontalGroup(
            panelTitleAgregarCamionetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleAgregarCamionetaLayout.createSequentialGroup()
                .addContainerGap(380, Short.MAX_VALUE)
                .addComponent(lblTitleIAgregarCamioneta)
                .addGap(350, 350, 350))
        );
        panelTitleAgregarCamionetaLayout.setVerticalGroup(
            panelTitleAgregarCamionetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleAgregarCamionetaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitleIAgregarCamioneta)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        panelAgregarCamioneta.add(panelTitleAgregarCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 100));

        lblMarcaCamioneta.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblMarcaCamioneta.setForeground(new java.awt.Color(255, 255, 255));
        lblMarcaCamioneta.setText("Marca");
        panelAgregarCamioneta.add(lblMarcaCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 80, -1));

        lblModeloCamioneta.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblModeloCamioneta.setForeground(new java.awt.Color(255, 255, 255));
        lblModeloCamioneta.setText("Modelo");
        panelAgregarCamioneta.add(lblModeloCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 80, -1));

        lblPlacaCamioneta.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblPlacaCamioneta.setForeground(new java.awt.Color(255, 255, 255));
        lblPlacaCamioneta.setText("Placa");
        panelAgregarCamioneta.add(lblPlacaCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 70, -1));

        lblCombustibleCamioneta.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblCombustibleCamioneta.setForeground(new java.awt.Color(255, 255, 255));
        lblCombustibleCamioneta.setText("Combustible");
        panelAgregarCamioneta.add(lblCombustibleCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 100, -1));

        lblAsientosCamioneta.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblAsientosCamioneta.setForeground(new java.awt.Color(255, 255, 255));
        lblAsientosCamioneta.setText("No. de asientos");
        panelAgregarCamioneta.add(lblAsientosCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 120, -1));

        txtMarcaAgregarCamioneta.setBackground(new java.awt.Color(255, 255, 255));
        txtMarcaAgregarCamioneta.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtMarcaAgregarCamioneta.setForeground(new java.awt.Color(0, 0, 0));
        txtMarcaAgregarCamioneta.setBorder(null);
        panelAgregarCamioneta.add(txtMarcaAgregarCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 230, 30));

        txtModeloAgregarCamioneta.setBackground(new java.awt.Color(255, 255, 255));
        txtModeloAgregarCamioneta.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtModeloAgregarCamioneta.setForeground(new java.awt.Color(0, 0, 0));
        txtModeloAgregarCamioneta.setBorder(null);
        panelAgregarCamioneta.add(txtModeloAgregarCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 230, 30));

        txtPlacaAgregarCamioneta.setBackground(new java.awt.Color(255, 255, 255));
        txtPlacaAgregarCamioneta.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtPlacaAgregarCamioneta.setForeground(new java.awt.Color(0, 0, 0));
        txtPlacaAgregarCamioneta.setBorder(null);
        panelAgregarCamioneta.add(txtPlacaAgregarCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 230, 30));

        txtCombustibleAgregarCamioneta.setBackground(new java.awt.Color(255, 255, 255));
        txtCombustibleAgregarCamioneta.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtCombustibleAgregarCamioneta.setForeground(new java.awt.Color(0, 0, 0));
        txtCombustibleAgregarCamioneta.setBorder(null);
        panelAgregarCamioneta.add(txtCombustibleAgregarCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 230, 30));

        txtAsientosAgregarCamioneta.setBackground(new java.awt.Color(255, 255, 255));
        txtAsientosAgregarCamioneta.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtAsientosAgregarCamioneta.setForeground(new java.awt.Color(0, 0, 0));
        txtAsientosAgregarCamioneta.setBorder(null);
        panelAgregarCamioneta.add(txtAsientosAgregarCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 230, 30));
        panelAgregarCamioneta.add(separatorAgregarCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 1150, 30));

        btnAgregarCamioneta.setBackground(new java.awt.Color(0, 102, 102));
        btnAgregarCamioneta.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        btnAgregarCamioneta.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCamioneta.setText("GUARDAR");
        btnAgregarCamioneta.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnAgregarCamioneta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarCamioneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCamionetaActionPerformed(evt);
            }
        });
        panelAgregarCamioneta.add(btnAgregarCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 180, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAgregarCamioneta, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAgregarCamioneta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarCamionetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCamionetaActionPerformed
        // TODO add your handling code here:
        Camioneta camioneta = new Camioneta();
        camioneta.setMarca(txtMarcaAgregarCamioneta.getText());
        camioneta.setModelo(txtModeloAgregarCamioneta.getText());
        camioneta.setPlaca(txtPlacaAgregarCamioneta.getText());
        camioneta.setCombustible(txtCombustibleAgregarCamioneta.getText());
        camioneta.setAsientos(Integer.parseInt(txtAsientosAgregarCamioneta.getText()));
        controlador.agregarCamioneta(camioneta);
        setVisible(false);
        txtMarcaAgregarCamioneta.setText("");
        txtModeloAgregarCamioneta.setText("");
        txtPlacaAgregarCamioneta.setText("");
        txtCombustibleAgregarCamioneta.setText("");
        txtAsientosAgregarCamioneta.setText("");        
    }//GEN-LAST:event_btnAgregarCamionetaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCamioneta;
    private javax.swing.JLabel lblAsientosCamioneta;
    private javax.swing.JLabel lblCombustibleCamioneta;
    private javax.swing.JLabel lblMarcaCamioneta;
    private javax.swing.JLabel lblModeloCamioneta;
    private javax.swing.JLabel lblPlacaCamioneta;
    private javax.swing.JLabel lblTitleIAgregarCamioneta;
    private javax.swing.JPanel panelAgregarCamioneta;
    private javax.swing.JPanel panelTitleAgregarCamioneta;
    private javax.swing.JSeparator separatorAgregarCamioneta;
    private javax.swing.JTextField txtAsientosAgregarCamioneta;
    private javax.swing.JTextField txtCombustibleAgregarCamioneta;
    private javax.swing.JTextField txtMarcaAgregarCamioneta;
    private javax.swing.JTextField txtModeloAgregarCamioneta;
    private javax.swing.JTextField txtPlacaAgregarCamioneta;
    // End of variables declaration//GEN-END:variables
}
