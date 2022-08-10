package org.oscarmorales.vista;

import javax.swing.JOptionPane;
import org.oscarmorales.controlador.ControlDeCamioneta;
import org.oscarmorales.modelo.Camioneta;

/**
 * Ventana actualizar camioneta
 * @author Oscar
 */
public class VentanaActualizarCamioneta extends javax.swing.JInternalFrame {

    /**
     * Instancia actualizar camioneta
     */
    public ControlDeCamioneta controlador = ControlDeCamioneta.getInstanciaCamioneta();
    
    
    /**
     * Creates new form VentanaAgregarCarro
     */
    public VentanaActualizarCamioneta() {
        initComponents();
    }
    
    Camioneta camionetaAntiguo = new Camioneta();
    Camioneta camionetaActualizado = new Camioneta();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelActualizarCarro = new javax.swing.JPanel();
        panelTitleActualizarCamioneta = new javax.swing.JPanel();
        lblTitleIAgregarCamioneta = new javax.swing.JLabel();
        lblCamionetaABuscar = new javax.swing.JLabel();
        lblInstruccion = new javax.swing.JLabel();
        lblMarcaCamioneta = new javax.swing.JLabel();
        lblModeloCamioneta = new javax.swing.JLabel();
        lblPlacaCamioneta = new javax.swing.JLabel();
        lblCombustibleCamioneta = new javax.swing.JLabel();
        lblPuertasCamioneta = new javax.swing.JLabel();
        txtCamionetaABuscar = new javax.swing.JTextField();
        txtMarcaActualizarCamioneta = new javax.swing.JTextField();
        txtModeloActualizarCamioneta = new javax.swing.JTextField();
        txtPlacaActualizarCamioneta = new javax.swing.JTextField();
        txtCombustibleActualizarCamioneta = new javax.swing.JTextField();
        txtAsientosActualizarCamioneta = new javax.swing.JTextField();
        separatorActualizarCamioneta = new javax.swing.JSeparator();
        btnCamionetaABuscar = new javax.swing.JButton();
        btnActualizarCamioneta = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setForeground(java.awt.Color.darkGray);
        setResizable(true);

        panelActualizarCarro.setBackground(new java.awt.Color(51, 51, 51));
        panelActualizarCarro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelActualizarCarro.setPreferredSize(new java.awt.Dimension(1150, 650));
        panelActualizarCarro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTitleActualizarCamioneta.setBackground(new java.awt.Color(0, 102, 102));

        lblTitleIAgregarCamioneta.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        lblTitleIAgregarCamioneta.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleIAgregarCamioneta.setText("ACTUALIZAR CAMIONETA");

        javax.swing.GroupLayout panelTitleActualizarCamionetaLayout = new javax.swing.GroupLayout(panelTitleActualizarCamioneta);
        panelTitleActualizarCamioneta.setLayout(panelTitleActualizarCamionetaLayout);
        panelTitleActualizarCamionetaLayout.setHorizontalGroup(
            panelTitleActualizarCamionetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleActualizarCamionetaLayout.createSequentialGroup()
                .addGap(406, 406, 406)
                .addComponent(lblTitleIAgregarCamioneta)
                .addContainerGap(285, Short.MAX_VALUE))
        );
        panelTitleActualizarCamionetaLayout.setVerticalGroup(
            panelTitleActualizarCamionetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleActualizarCamionetaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitleIAgregarCamioneta)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelActualizarCarro.add(panelTitleActualizarCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 100));

        lblCamionetaABuscar.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblCamionetaABuscar.setForeground(new java.awt.Color(255, 255, 255));
        lblCamionetaABuscar.setText("Ingrese placa de la camioneta a buscar");
        panelActualizarCarro.add(lblCamionetaABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 290, -1));

        lblInstruccion.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblInstruccion.setForeground(new java.awt.Color(255, 255, 255));
        lblInstruccion.setText("Ingrese los datos actualizados de la camioneta");
        panelActualizarCarro.add(lblInstruccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 350, -1));

        lblMarcaCamioneta.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblMarcaCamioneta.setForeground(new java.awt.Color(255, 255, 255));
        lblMarcaCamioneta.setText("Marca");
        panelActualizarCarro.add(lblMarcaCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 80, -1));

        lblModeloCamioneta.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblModeloCamioneta.setForeground(new java.awt.Color(255, 255, 255));
        lblModeloCamioneta.setText("Modelo");
        panelActualizarCarro.add(lblModeloCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 80, -1));

        lblPlacaCamioneta.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblPlacaCamioneta.setForeground(new java.awt.Color(255, 255, 255));
        lblPlacaCamioneta.setText("Placa");
        panelActualizarCarro.add(lblPlacaCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 70, -1));

        lblCombustibleCamioneta.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblCombustibleCamioneta.setForeground(new java.awt.Color(255, 255, 255));
        lblCombustibleCamioneta.setText("Combustible");
        panelActualizarCarro.add(lblCombustibleCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 100, -1));

        lblPuertasCamioneta.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblPuertasCamioneta.setForeground(new java.awt.Color(255, 255, 255));
        lblPuertasCamioneta.setText("No. de asientos");
        panelActualizarCarro.add(lblPuertasCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 120, -1));

        txtCamionetaABuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtCamionetaABuscar.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtCamionetaABuscar.setForeground(new java.awt.Color(0, 0, 0));
        txtCamionetaABuscar.setBorder(null);
        panelActualizarCarro.add(txtCamionetaABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 230, 30));

        txtMarcaActualizarCamioneta.setBackground(new java.awt.Color(255, 255, 255));
        txtMarcaActualizarCamioneta.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtMarcaActualizarCamioneta.setForeground(new java.awt.Color(0, 0, 0));
        txtMarcaActualizarCamioneta.setBorder(null);
        panelActualizarCarro.add(txtMarcaActualizarCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 230, 30));

        txtModeloActualizarCamioneta.setBackground(new java.awt.Color(255, 255, 255));
        txtModeloActualizarCamioneta.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtModeloActualizarCamioneta.setForeground(new java.awt.Color(0, 0, 0));
        txtModeloActualizarCamioneta.setBorder(null);
        panelActualizarCarro.add(txtModeloActualizarCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 230, 30));

        txtPlacaActualizarCamioneta.setBackground(new java.awt.Color(255, 255, 255));
        txtPlacaActualizarCamioneta.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtPlacaActualizarCamioneta.setForeground(new java.awt.Color(0, 0, 0));
        txtPlacaActualizarCamioneta.setBorder(null);
        panelActualizarCarro.add(txtPlacaActualizarCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 230, 30));

        txtCombustibleActualizarCamioneta.setBackground(new java.awt.Color(255, 255, 255));
        txtCombustibleActualizarCamioneta.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtCombustibleActualizarCamioneta.setForeground(new java.awt.Color(0, 0, 0));
        txtCombustibleActualizarCamioneta.setBorder(null);
        panelActualizarCarro.add(txtCombustibleActualizarCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 230, 30));

        txtAsientosActualizarCamioneta.setBackground(new java.awt.Color(255, 255, 255));
        txtAsientosActualizarCamioneta.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtAsientosActualizarCamioneta.setForeground(new java.awt.Color(0, 0, 0));
        txtAsientosActualizarCamioneta.setBorder(null);
        panelActualizarCarro.add(txtAsientosActualizarCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 230, 30));
        panelActualizarCarro.add(separatorActualizarCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 1150, 20));

        btnCamionetaABuscar.setBackground(new java.awt.Color(0, 102, 102));
        btnCamionetaABuscar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btnCamionetaABuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnCamionetaABuscar.setText("BUSCAR");
        btnCamionetaABuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnCamionetaABuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCamionetaABuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCamionetaABuscarActionPerformed(evt);
            }
        });
        panelActualizarCarro.add(btnCamionetaABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 110, 30));

        btnActualizarCamioneta.setBackground(new java.awt.Color(0, 102, 102));
        btnActualizarCamioneta.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnActualizarCamioneta.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarCamioneta.setText("ACTUALIZAR");
        btnActualizarCamioneta.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnActualizarCamioneta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarCamioneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCamionetaActionPerformed(evt);
            }
        });
        panelActualizarCarro.add(btnActualizarCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelActualizarCarro, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelActualizarCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCamionetaABuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCamionetaABuscarActionPerformed
        // TODO add your handling code here:
        camionetaAntiguo = controlador.verCamioneta(txtCamionetaABuscar.getText());
        txtMarcaActualizarCamioneta.setText(camionetaAntiguo.getMarca());
        txtModeloActualizarCamioneta.setText(camionetaAntiguo.getModelo());
        txtPlacaActualizarCamioneta.setText(camionetaAntiguo.getPlaca());
        txtCombustibleActualizarCamioneta.setText(camionetaAntiguo.getCombustible());
        txtAsientosActualizarCamioneta.setText(String.valueOf(camionetaAntiguo.getAsientos()));
    }//GEN-LAST:event_btnCamionetaABuscarActionPerformed

    private void btnActualizarCamionetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCamionetaActionPerformed
        // TODO add your handling code here:
        camionetaActualizado.setMarca(txtMarcaActualizarCamioneta.getText());
        camionetaActualizado.setModelo(txtModeloActualizarCamioneta.getText());
        camionetaActualizado.setPlaca(txtPlacaActualizarCamioneta.getText());
        camionetaActualizado.setCombustible(txtCombustibleActualizarCamioneta.getText());
        camionetaActualizado.setAsientos(Integer.parseInt(txtAsientosActualizarCamioneta.getText()));
        controlador.actualizarCamioneta(camionetaAntiguo, camionetaActualizado);
        setVisible(false);
        txtMarcaActualizarCamioneta.setText("");
        txtModeloActualizarCamioneta.setText("");
        txtPlacaActualizarCamioneta.setText("");
        txtCombustibleActualizarCamioneta.setText("");
        txtAsientosActualizarCamioneta.setText("");         
        txtCamionetaABuscar.setText("");         
    }//GEN-LAST:event_btnActualizarCamionetaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCamioneta;
    private javax.swing.JButton btnCamionetaABuscar;
    private javax.swing.JLabel lblCamionetaABuscar;
    private javax.swing.JLabel lblCombustibleCamioneta;
    private javax.swing.JLabel lblInstruccion;
    private javax.swing.JLabel lblMarcaCamioneta;
    private javax.swing.JLabel lblModeloCamioneta;
    private javax.swing.JLabel lblPlacaCamioneta;
    private javax.swing.JLabel lblPuertasCamioneta;
    private javax.swing.JLabel lblTitleIAgregarCamioneta;
    private javax.swing.JPanel panelActualizarCarro;
    private javax.swing.JPanel panelTitleActualizarCamioneta;
    private javax.swing.JSeparator separatorActualizarCamioneta;
    private javax.swing.JTextField txtAsientosActualizarCamioneta;
    private javax.swing.JTextField txtCamionetaABuscar;
    private javax.swing.JTextField txtCombustibleActualizarCamioneta;
    private javax.swing.JTextField txtMarcaActualizarCamioneta;
    private javax.swing.JTextField txtModeloActualizarCamioneta;
    private javax.swing.JTextField txtPlacaActualizarCamioneta;
    // End of variables declaration//GEN-END:variables
}
