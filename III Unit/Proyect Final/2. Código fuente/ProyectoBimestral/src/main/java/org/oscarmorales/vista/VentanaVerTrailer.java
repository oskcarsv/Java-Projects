/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.oscarmorales.vista;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.oscarmorales.controlador.ControlDeTrailer;
import org.oscarmorales.modelo.Trailer;

/**
 * Ventana ver trailer
 * @author Oscar
 */
public class VentanaVerTrailer extends javax.swing.JInternalFrame {

    /**
     * Instancia ver trailer
     */
    public ControlDeTrailer controlador = ControlDeTrailer.getInstanciaTrailer();
    
    /**
     * Creates new form VentanaVerCarro
     */
    public VentanaVerTrailer() {
        initComponents();
    }

    /**
     * Metodo mostrar trailer
     */
    public void mostrarTrailer(){
        String [] encabezados = {"Marca","Modelo","Placa","Combustible","Toneladas"};
        int cantidadDeTrailers = controlador.cantidadDeTrailers();
        
        DefaultTableModel cabecera = new DefaultTableModel(encabezados,cantidadDeTrailers);
        tablaDeTrailer.setModel(cabecera);
        TableModel listaDeTrailers = tablaDeTrailer.getModel();
        for(int i=0; i<cantidadDeTrailers; i++){
            Trailer trailer = controlador.mostrarTrailer().get(i);
            listaDeTrailers.setValueAt(trailer.getMarca(), i, 0);
            listaDeTrailers.setValueAt(trailer.getModelo(), i, 1);
            listaDeTrailers.setValueAt(trailer.getPlaca(), i, 2);
            listaDeTrailers.setValueAt(trailer.getCombustible(), i, 3);
            listaDeTrailers.setValueAt(trailer.getToneladas(), i, 4);
        }
    }    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPanelVistaVerTrailer = new javax.swing.JScrollPane();
        tablaDeTrailer = new javax.swing.JTable();
        panelTitleAgregarTrailer = new javax.swing.JPanel();
        lblTitleIAgregarTrailer = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1164, 676));

        tablaDeTrailer.setBackground(new java.awt.Color(51, 51, 51));
        tablaDeTrailer.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        tablaDeTrailer.setForeground(new java.awt.Color(255, 255, 255));
        tablaDeTrailer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Marca", "Modelo", "Placa", "Combustible", "No. de asientos"
            }
        ));
        tablaDeTrailer.setSelectionBackground(new java.awt.Color(0, 51, 51));
        tablaDeTrailer.setSelectionForeground(new java.awt.Color(255, 255, 255));
        scrollPanelVistaVerTrailer.setViewportView(tablaDeTrailer);

        panelTitleAgregarTrailer.setBackground(new java.awt.Color(0, 102, 102));

        lblTitleIAgregarTrailer.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        lblTitleIAgregarTrailer.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleIAgregarTrailer.setText("VER TRAILER");

        javax.swing.GroupLayout panelTitleAgregarTrailerLayout = new javax.swing.GroupLayout(panelTitleAgregarTrailer);
        panelTitleAgregarTrailer.setLayout(panelTitleAgregarTrailerLayout);
        panelTitleAgregarTrailerLayout.setHorizontalGroup(
            panelTitleAgregarTrailerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleAgregarTrailerLayout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(lblTitleIAgregarTrailer)
                .addContainerGap(463, Short.MAX_VALUE))
        );
        panelTitleAgregarTrailerLayout.setVerticalGroup(
            panelTitleAgregarTrailerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleAgregarTrailerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitleIAgregarTrailer)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitleAgregarTrailer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollPanelVistaVerTrailer)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitleAgregarTrailer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanelVistaVerTrailer, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblTitleIAgregarTrailer;
    private javax.swing.JPanel panelTitleAgregarTrailer;
    private javax.swing.JScrollPane scrollPanelVistaVerTrailer;
    private javax.swing.JTable tablaDeTrailer;
    // End of variables declaration//GEN-END:variables
}
