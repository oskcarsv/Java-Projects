package org.oscarmorales.vista;

import java.awt.Color;
import org.oscarmorales.controlador.ControlDeMoto;
import org.oscarmorales.modelo.Moto;

/**
 * Ventana agregar moto
 * @author Oscar
 */
public class VentanaAgregarMoto extends javax.swing.JInternalFrame {

    /**
     * Instancia agregar moto
     */
    public ControlDeMoto controlador = ControlDeMoto.getInstanciaMoto();
    
    
    /**
     * Creates new form VentanaAgregarCarro
     */
    public VentanaAgregarMoto() {
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

        panelAgregarMoto = new javax.swing.JPanel();
        panelTitleAgregarMoto = new javax.swing.JPanel();
        lblTitleIAgregarMoto = new javax.swing.JLabel();
        lblMarcaMoto = new javax.swing.JLabel();
        lblModeloMoto = new javax.swing.JLabel();
        lblPlacaMoto = new javax.swing.JLabel();
        lblCombustibleMoto = new javax.swing.JLabel();
        lblMotorMoto = new javax.swing.JLabel();
        txtMarcaAgregarMoto = new javax.swing.JTextField();
        txtModeloAgregarMoto = new javax.swing.JTextField();
        txtPlacaAgregarMoto = new javax.swing.JTextField();
        txtCombustibleAgregarMoto = new javax.swing.JTextField();
        txtMotorAgregarMoto = new javax.swing.JTextField();
        btnAgregarMoto = new javax.swing.JButton();
        separatorAgregarMoto = new javax.swing.JSeparator();

        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setForeground(java.awt.Color.darkGray);
        setResizable(true);

        panelAgregarMoto.setBackground(new java.awt.Color(51, 51, 51));
        panelAgregarMoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelAgregarMoto.setPreferredSize(new java.awt.Dimension(1150, 650));
        panelAgregarMoto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTitleAgregarMoto.setBackground(new java.awt.Color(0, 102, 102));

        lblTitleIAgregarMoto.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        lblTitleIAgregarMoto.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleIAgregarMoto.setText("INGRESAR MOTO");

        javax.swing.GroupLayout panelTitleAgregarMotoLayout = new javax.swing.GroupLayout(panelTitleAgregarMoto);
        panelTitleAgregarMoto.setLayout(panelTitleAgregarMotoLayout);
        panelTitleAgregarMotoLayout.setHorizontalGroup(
            panelTitleAgregarMotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleAgregarMotoLayout.createSequentialGroup()
                .addGap(406, 406, 406)
                .addComponent(lblTitleIAgregarMoto)
                .addContainerGap(440, Short.MAX_VALUE))
        );
        panelTitleAgregarMotoLayout.setVerticalGroup(
            panelTitleAgregarMotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleAgregarMotoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitleIAgregarMoto)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelAgregarMoto.add(panelTitleAgregarMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 100));

        lblMarcaMoto.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblMarcaMoto.setForeground(new java.awt.Color(255, 255, 255));
        lblMarcaMoto.setText("Marca");
        panelAgregarMoto.add(lblMarcaMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 80, -1));

        lblModeloMoto.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblModeloMoto.setForeground(new java.awt.Color(255, 255, 255));
        lblModeloMoto.setText("Modelo");
        panelAgregarMoto.add(lblModeloMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 80, -1));

        lblPlacaMoto.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblPlacaMoto.setForeground(new java.awt.Color(255, 255, 255));
        lblPlacaMoto.setText("Placa");
        panelAgregarMoto.add(lblPlacaMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 70, -1));

        lblCombustibleMoto.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblCombustibleMoto.setForeground(new java.awt.Color(255, 255, 255));
        lblCombustibleMoto.setText("Combustible");
        panelAgregarMoto.add(lblCombustibleMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 140, -1));

        lblMotorMoto.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblMotorMoto.setForeground(new java.awt.Color(255, 255, 255));
        lblMotorMoto.setText("Motor");
        panelAgregarMoto.add(lblMotorMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 140, -1));

        txtMarcaAgregarMoto.setBackground(new java.awt.Color(255, 255, 255));
        txtMarcaAgregarMoto.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtMarcaAgregarMoto.setForeground(new java.awt.Color(0, 0, 0));
        txtMarcaAgregarMoto.setBorder(null);
        panelAgregarMoto.add(txtMarcaAgregarMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 230, 30));

        txtModeloAgregarMoto.setBackground(new java.awt.Color(255, 255, 255));
        txtModeloAgregarMoto.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtModeloAgregarMoto.setForeground(new java.awt.Color(0, 0, 0));
        txtModeloAgregarMoto.setBorder(null);
        panelAgregarMoto.add(txtModeloAgregarMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 230, 30));

        txtPlacaAgregarMoto.setBackground(new java.awt.Color(255, 255, 255));
        txtPlacaAgregarMoto.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtPlacaAgregarMoto.setForeground(new java.awt.Color(0, 0, 0));
        txtPlacaAgregarMoto.setBorder(null);
        panelAgregarMoto.add(txtPlacaAgregarMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 230, 30));

        txtCombustibleAgregarMoto.setBackground(new java.awt.Color(255, 255, 255));
        txtCombustibleAgregarMoto.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtCombustibleAgregarMoto.setForeground(new java.awt.Color(0, 0, 0));
        txtCombustibleAgregarMoto.setBorder(null);
        panelAgregarMoto.add(txtCombustibleAgregarMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 230, 30));

        txtMotorAgregarMoto.setBackground(new java.awt.Color(255, 255, 255));
        txtMotorAgregarMoto.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtMotorAgregarMoto.setForeground(new java.awt.Color(0, 0, 0));
        txtMotorAgregarMoto.setBorder(null);
        panelAgregarMoto.add(txtMotorAgregarMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 230, 30));

        btnAgregarMoto.setBackground(new java.awt.Color(0, 102, 102));
        btnAgregarMoto.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        btnAgregarMoto.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarMoto.setText("GUARDAR");
        btnAgregarMoto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnAgregarMoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMotoActionPerformed(evt);
            }
        });
        panelAgregarMoto.add(btnAgregarMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, 180, 60));
        panelAgregarMoto.add(separatorAgregarMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAgregarMoto, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAgregarMoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMotoActionPerformed
        // TODO add your handling code here:
        Moto moto = new Moto();
        moto.setMarca(txtMarcaAgregarMoto.getText());
        moto.setModelo(txtModeloAgregarMoto.getText());
        moto.setPlaca(txtPlacaAgregarMoto.getText());
        moto.setCombustible(txtCombustibleAgregarMoto.getText());
        moto.setMotor(Integer.parseInt(txtMotorAgregarMoto.getText()));
        controlador.agregarMoto(moto);
        setVisible(false);
        txtMarcaAgregarMoto.setText("");
        txtModeloAgregarMoto.setText("");
        txtPlacaAgregarMoto.setText("");
        txtCombustibleAgregarMoto.setText("");               
        txtMotorAgregarMoto.setText("");               
    }//GEN-LAST:event_btnAgregarMotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarMoto;
    private javax.swing.JLabel lblCombustibleMoto;
    private javax.swing.JLabel lblMarcaMoto;
    private javax.swing.JLabel lblModeloMoto;
    private javax.swing.JLabel lblMotorMoto;
    private javax.swing.JLabel lblPlacaMoto;
    private javax.swing.JLabel lblTitleIAgregarMoto;
    private javax.swing.JPanel panelAgregarMoto;
    private javax.swing.JPanel panelTitleAgregarMoto;
    private javax.swing.JSeparator separatorAgregarMoto;
    private javax.swing.JTextField txtCombustibleAgregarMoto;
    private javax.swing.JTextField txtMarcaAgregarMoto;
    private javax.swing.JTextField txtModeloAgregarMoto;
    private javax.swing.JTextField txtMotorAgregarMoto;
    private javax.swing.JTextField txtPlacaAgregarMoto;
    // End of variables declaration//GEN-END:variables
}
