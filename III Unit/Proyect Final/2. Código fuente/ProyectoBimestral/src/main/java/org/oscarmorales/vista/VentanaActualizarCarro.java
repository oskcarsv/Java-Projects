package org.oscarmorales.vista;

import javax.swing.JOptionPane;
import org.oscarmorales.controlador.ControlDeCarro;
import org.oscarmorales.modelo.Carro;

/**
 * Ventana actualizar carro
 * @author Oscar
 */
public class VentanaActualizarCarro extends javax.swing.JInternalFrame {

    /**
     * Instancia actualizar carro
     */
    public ControlDeCarro controlador = ControlDeCarro.getInstanciaCarro();
    
    
    /**
     * Creates new form VentanaAgregarCarro
     */
    public VentanaActualizarCarro() {
        initComponents();
    }
    
    Carro carroAntiguo = new Carro();
    Carro carroActualizado = new Carro();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelActualizarCarro = new javax.swing.JPanel();
        panelTitleActualizarCarro = new javax.swing.JPanel();
        lblTitleIAgregarCarro = new javax.swing.JLabel();
        lblCarroABuscar = new javax.swing.JLabel();
        lblInstruccion = new javax.swing.JLabel();
        lblMarcaCarro = new javax.swing.JLabel();
        lblModeloCarro = new javax.swing.JLabel();
        lblPlacaCarro = new javax.swing.JLabel();
        lblCombustibleCarro = new javax.swing.JLabel();
        lblPuertasCarro = new javax.swing.JLabel();
        txtCarroABuscar = new javax.swing.JTextField();
        txtMarcaActualizarCarro = new javax.swing.JTextField();
        txtModeloActualizarCarro = new javax.swing.JTextField();
        txtPlacaActualizarCarro = new javax.swing.JTextField();
        txtCombustibleActualizarCarro = new javax.swing.JTextField();
        txtPuertasActualizarCarro = new javax.swing.JTextField();
        separatorActualizarCarro = new javax.swing.JSeparator();
        btnCarroABuscar = new javax.swing.JButton();
        btnActualizarCarro = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setForeground(java.awt.Color.darkGray);
        setResizable(true);

        panelActualizarCarro.setBackground(new java.awt.Color(51, 51, 51));
        panelActualizarCarro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelActualizarCarro.setPreferredSize(new java.awt.Dimension(1150, 650));
        panelActualizarCarro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTitleActualizarCarro.setBackground(new java.awt.Color(0, 102, 102));

        lblTitleIAgregarCarro.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        lblTitleIAgregarCarro.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleIAgregarCarro.setText("ACTUALIZAR CARRO");

        javax.swing.GroupLayout panelTitleActualizarCarroLayout = new javax.swing.GroupLayout(panelTitleActualizarCarro);
        panelTitleActualizarCarro.setLayout(panelTitleActualizarCarroLayout);
        panelTitleActualizarCarroLayout.setHorizontalGroup(
            panelTitleActualizarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleActualizarCarroLayout.createSequentialGroup()
                .addGap(406, 406, 406)
                .addComponent(lblTitleIAgregarCarro)
                .addContainerGap(387, Short.MAX_VALUE))
        );
        panelTitleActualizarCarroLayout.setVerticalGroup(
            panelTitleActualizarCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleActualizarCarroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitleIAgregarCarro)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelActualizarCarro.add(panelTitleActualizarCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 100));

        lblCarroABuscar.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblCarroABuscar.setForeground(new java.awt.Color(255, 255, 255));
        lblCarroABuscar.setText("Ingrese placa del carro a buscar");
        panelActualizarCarro.add(lblCarroABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 250, -1));

        lblInstruccion.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblInstruccion.setForeground(new java.awt.Color(255, 255, 255));
        lblInstruccion.setText("Ingrese los datos actualizados del carro");
        panelActualizarCarro.add(lblInstruccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 300, -1));

        lblMarcaCarro.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblMarcaCarro.setForeground(new java.awt.Color(255, 255, 255));
        lblMarcaCarro.setText("Marca");
        panelActualizarCarro.add(lblMarcaCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 80, -1));

        lblModeloCarro.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblModeloCarro.setForeground(new java.awt.Color(255, 255, 255));
        lblModeloCarro.setText("Modelo");
        panelActualizarCarro.add(lblModeloCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 80, -1));

        lblPlacaCarro.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblPlacaCarro.setForeground(new java.awt.Color(255, 255, 255));
        lblPlacaCarro.setText("Placa");
        panelActualizarCarro.add(lblPlacaCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 70, -1));

        lblCombustibleCarro.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblCombustibleCarro.setForeground(new java.awt.Color(255, 255, 255));
        lblCombustibleCarro.setText("Combustible");
        panelActualizarCarro.add(lblCombustibleCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 100, -1));

        lblPuertasCarro.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblPuertasCarro.setForeground(new java.awt.Color(255, 255, 255));
        lblPuertasCarro.setText("No. de puertas");
        panelActualizarCarro.add(lblPuertasCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 110, -1));

        txtCarroABuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtCarroABuscar.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtCarroABuscar.setForeground(new java.awt.Color(0, 0, 0));
        txtCarroABuscar.setBorder(null);
        panelActualizarCarro.add(txtCarroABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 230, 30));

        txtMarcaActualizarCarro.setBackground(new java.awt.Color(255, 255, 255));
        txtMarcaActualizarCarro.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtMarcaActualizarCarro.setForeground(new java.awt.Color(0, 0, 0));
        txtMarcaActualizarCarro.setBorder(null);
        panelActualizarCarro.add(txtMarcaActualizarCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 230, 30));

        txtModeloActualizarCarro.setBackground(new java.awt.Color(255, 255, 255));
        txtModeloActualizarCarro.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtModeloActualizarCarro.setForeground(new java.awt.Color(0, 0, 0));
        txtModeloActualizarCarro.setBorder(null);
        panelActualizarCarro.add(txtModeloActualizarCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 230, 30));

        txtPlacaActualizarCarro.setBackground(new java.awt.Color(255, 255, 255));
        txtPlacaActualizarCarro.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtPlacaActualizarCarro.setForeground(new java.awt.Color(0, 0, 0));
        txtPlacaActualizarCarro.setBorder(null);
        panelActualizarCarro.add(txtPlacaActualizarCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 230, 30));

        txtCombustibleActualizarCarro.setBackground(new java.awt.Color(255, 255, 255));
        txtCombustibleActualizarCarro.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtCombustibleActualizarCarro.setForeground(new java.awt.Color(0, 0, 0));
        txtCombustibleActualizarCarro.setBorder(null);
        panelActualizarCarro.add(txtCombustibleActualizarCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 230, 30));

        txtPuertasActualizarCarro.setBackground(new java.awt.Color(255, 255, 255));
        txtPuertasActualizarCarro.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtPuertasActualizarCarro.setForeground(new java.awt.Color(0, 0, 0));
        txtPuertasActualizarCarro.setBorder(null);
        panelActualizarCarro.add(txtPuertasActualizarCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 230, 30));
        panelActualizarCarro.add(separatorActualizarCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 1150, 20));

        btnCarroABuscar.setBackground(new java.awt.Color(0, 102, 102));
        btnCarroABuscar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btnCarroABuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnCarroABuscar.setText("BUSCAR");
        btnCarroABuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnCarroABuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarroABuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarroABuscarActionPerformed(evt);
            }
        });
        panelActualizarCarro.add(btnCarroABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 110, 30));

        btnActualizarCarro.setBackground(new java.awt.Color(0, 102, 102));
        btnActualizarCarro.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnActualizarCarro.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarCarro.setText("ACTUALIZAR");
        btnActualizarCarro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnActualizarCarro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCarroActionPerformed(evt);
            }
        });
        panelActualizarCarro.add(btnActualizarCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, 160, 40));

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

    private void btnCarroABuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarroABuscarActionPerformed
        // TODO add your handling code here:
        carroAntiguo = controlador.verCarro(txtCarroABuscar.getText());
        txtMarcaActualizarCarro.setText(carroAntiguo.getMarca());
        txtModeloActualizarCarro.setText(carroAntiguo.getModelo());
        txtPlacaActualizarCarro.setText(carroAntiguo.getPlaca());
        txtCombustibleActualizarCarro.setText(carroAntiguo.getCombustible());
        txtPuertasActualizarCarro.setText(String.valueOf(carroAntiguo.getPuertas()));
    }//GEN-LAST:event_btnCarroABuscarActionPerformed

    private void btnActualizarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCarroActionPerformed
        // TODO add your handling code here:
        carroActualizado.setMarca(txtMarcaActualizarCarro.getText());
        carroActualizado.setModelo(txtModeloActualizarCarro.getText());
        carroActualizado.setPlaca(txtPlacaActualizarCarro.getText());
        carroActualizado.setCombustible(txtCombustibleActualizarCarro.getText());
        carroActualizado.setPuertas(Integer.parseInt(txtPuertasActualizarCarro.getText()));
        controlador.actualizarCarro(carroAntiguo, carroActualizado);
        setVisible(false);
        txtMarcaActualizarCarro.setText("");
        txtModeloActualizarCarro.setText("");
        txtPlacaActualizarCarro.setText("");
        txtCombustibleActualizarCarro.setText("");
        txtPuertasActualizarCarro.setText("");         
        txtCarroABuscar.setText("");         
    }//GEN-LAST:event_btnActualizarCarroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCarro;
    private javax.swing.JButton btnCarroABuscar;
    private javax.swing.JLabel lblCarroABuscar;
    private javax.swing.JLabel lblCombustibleCarro;
    private javax.swing.JLabel lblInstruccion;
    private javax.swing.JLabel lblMarcaCarro;
    private javax.swing.JLabel lblModeloCarro;
    private javax.swing.JLabel lblPlacaCarro;
    private javax.swing.JLabel lblPuertasCarro;
    private javax.swing.JLabel lblTitleIAgregarCarro;
    private javax.swing.JPanel panelActualizarCarro;
    private javax.swing.JPanel panelTitleActualizarCarro;
    private javax.swing.JSeparator separatorActualizarCarro;
    private javax.swing.JTextField txtCarroABuscar;
    private javax.swing.JTextField txtCombustibleActualizarCarro;
    private javax.swing.JTextField txtMarcaActualizarCarro;
    private javax.swing.JTextField txtModeloActualizarCarro;
    private javax.swing.JTextField txtPlacaActualizarCarro;
    private javax.swing.JTextField txtPuertasActualizarCarro;
    // End of variables declaration//GEN-END:variables
}
