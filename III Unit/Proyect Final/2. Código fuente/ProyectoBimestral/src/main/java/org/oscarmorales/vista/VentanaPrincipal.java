package org.oscarmorales.vista;

import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.io.*;

/**
 * Clase Ventana principal
 * @author Oscar
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private String dialogo;
    
    // CARRO
    /**
     * Instancia agregar carro
     */
    public VentanaAgregarCarro instanciaAgregarCarro = null; 
    /**
     * Instancia ver carro
     */
    public VentanaVerCarro instanciaVerCarro = null;
    /**
     * Instancia actualizar carro
     */
    public VentanaActualizarCarro instanciaAtualizarCarro = null;
    /**
     * Instancia eliminar carro
     */
    public VentanaEliminarCarro instanciaEliminarCarro = null;
    
    
    // MOTO
    /**
     * Instancia agregar moto
     */
    public VentanaAgregarMoto instanciaAgregarMoto = null; 
    /**
     * Instancia ver moto
     */
    public VentanaVerMoto instanciaVerMoto = null;  
    /**
     * Instancia actualizar moto
     */
    public VentanaActualizarMoto instanciaAtualizarMoto = null;
    /**
     * Instancia eliminar moto
     */
    public VentanaEliminarMoto instanciaEliminarMoto = null;
    
    
    // CAMIONETA
    /**
     * Instancia agregar camioneta
     */
    public VentanaAgregarCamioneta instanciaAgregarCamioneta = null;
    /**
     * Instancia ver camioneta
     */
    public VentanaVerCamioneta instanciaVerCamioneta = null;   
    /**
     * Instancia actualizar camioneta
     */
    public VentanaActualizarCamioneta instanciaActualizarCamioneta = null;
    /**
     * Instancia eliminar camioneta
     */
    public VentanaEliminarCamioneta instanciaEliminarCamioneta = null;

    
    // TRAILER
    /**
     * Instancia agregar trailer
     */
    public VentanaAgregarTrailer instanciaAgregarTrailer = null;   
    /**
     * Instancia ver trailer
     */
    public VentanaVerTrailer instanciaVerTrailer= null;     
    /**
     * Instancia actualizar trailer
     */
    public VentanaActualizarTrailer instanciaActualizarTrailer = null;
    /**
     * Instancia eliminar trailler
     */
    public VentanaEliminarTrailer instanciaEliminarTrailer = null;    
   
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    
    // CARRO
    /**
     * Metodo para mostrar y ocultar ventana agregar carro
     * @return 
     */
    public synchronized VentanaAgregarCarro getInstanciaAgregarCarro(){
        if(instanciaAgregarCarro == null){
            instanciaAgregarCarro = new VentanaAgregarCarro();
            panelDeEscritorio.add(instanciaAgregarCarro);
        } else if(instanciaAgregarCarro.isVisible() == false)
            instanciaAgregarCarro.setVisible(true);
        instanciaAgregarCarro.show();
        return instanciaAgregarCarro;
    }    
 
    /**
    * Metodo para mostrar y ocultar ventana ver carro
    * @return 
    */
    public synchronized VentanaVerCarro getInstanciaVerCarro(){
        if(instanciaVerCarro == null){
            instanciaVerCarro = new VentanaVerCarro();
            panelDeEscritorio.add(instanciaVerCarro);
        } else if(instanciaVerCarro.isVisible() == false)
            instanciaVerCarro.setVisible(true);
        instanciaVerCarro.show();
        return instanciaVerCarro;
    }
    
    /**
    * Metodo para mostrar y ocultar ventana actualizar carro
    * @return 
    */
    public synchronized VentanaActualizarCarro getInstanciaActualizarCarro(){
        if(instanciaAtualizarCarro == null){
            instanciaAtualizarCarro = new VentanaActualizarCarro();
            panelDeEscritorio.add(instanciaAtualizarCarro);
        } else if(instanciaAtualizarCarro.isVisible() == false)
            instanciaAtualizarCarro.setVisible(true);
        instanciaAtualizarCarro.show();
        return instanciaAtualizarCarro;
    }     

    /**
     * Metodo para mostrar y ocultar ventana eliminar carro
     * @return 
     */    
    public synchronized VentanaEliminarCarro getInstanciaEliminarCarro(){
        if(instanciaEliminarCarro == null){
            instanciaEliminarCarro = new VentanaEliminarCarro();
            panelDeEscritorio.add(instanciaEliminarCarro);
        } else if(instanciaEliminarCarro.isVisible() == false)
            instanciaEliminarCarro.setVisible(true);
        instanciaEliminarCarro.show();
        return instanciaEliminarCarro;
    }    
  
    
    // MOTO
    /**
     * Metodo para mostrar y ocultar ventana agregar moto
     * @return 
     */ 
    public synchronized VentanaAgregarMoto getInstanciaAgregarMoto(){
        if(instanciaAgregarMoto == null){
            instanciaAgregarMoto = new VentanaAgregarMoto();
            panelDeEscritorio.add(instanciaAgregarMoto);
        } else if(instanciaAgregarMoto.isVisible() == false)
            instanciaAgregarMoto.setVisible(true);
        instanciaAgregarMoto.show();
        return instanciaAgregarMoto;
    }     
  
    /**
     * Metodo para mostrar y ocultar ventana ver moto
     * @return 
     */ 
    public synchronized VentanaVerMoto getInstanciaVerMoto(){
        if(instanciaVerMoto == null){
            instanciaVerMoto = new VentanaVerMoto();
            panelDeEscritorio.add(instanciaVerMoto);
        } else if(instanciaVerMoto.isVisible() == false)
            instanciaVerMoto.setVisible(true);
        instanciaVerMoto.show();
        return instanciaVerMoto;
    }     
 
    /**
     * Metodo para mostrar y ocultar ventana actualizar moto
     * @return 
     */     
    public synchronized VentanaActualizarMoto getInstanciaActualizarMoto(){
        if(instanciaAtualizarMoto == null){
            instanciaAtualizarMoto = new VentanaActualizarMoto();
            panelDeEscritorio.add(instanciaAtualizarMoto);
        } else if(instanciaAtualizarMoto.isVisible() == false)
            instanciaAtualizarMoto.setVisible(true);
        instanciaAtualizarMoto.show();
        return instanciaAtualizarMoto;
    }     

    /**
     * Metodo para mostrar y ocultar ventana eliminar moto
     * @return 
     */     
    public synchronized VentanaEliminarMoto getInstanciaEliminarMoto(){
        if(instanciaEliminarMoto == null){
            instanciaEliminarMoto = new VentanaEliminarMoto();
            panelDeEscritorio.add(instanciaEliminarMoto);
        } else if(instanciaEliminarMoto.isVisible() == false)
            instanciaEliminarMoto.setVisible(true);
        instanciaEliminarMoto.show();
        return instanciaEliminarMoto;
    }     
    
    
    // CAMIONETA
    /**
     * Metodo para mostrar y ocultar ventana agregar camioneta
     * @return 
     */     
    public synchronized VentanaAgregarCamioneta getInstanciaAgregarCamioneta(){
        if(instanciaAgregarCamioneta == null){
            instanciaAgregarCamioneta = new VentanaAgregarCamioneta();
            panelDeEscritorio.add(instanciaAgregarCamioneta);
        } else if(instanciaAgregarCamioneta.isVisible() == false)
            instanciaAgregarCamioneta.setVisible(true);
        instanciaAgregarCamioneta.show();
        return instanciaAgregarCamioneta;
    }     
  
    /**
     * Metodo para mostrar y ocultar ventana ver camioneta
     * @return 
     */      
    public synchronized VentanaVerCamioneta getInstanciaVerCamioneta(){
        if(instanciaVerCamioneta == null){
            instanciaVerCamioneta = new VentanaVerCamioneta();
            panelDeEscritorio.add(instanciaVerCamioneta);
        } else if(instanciaVerCamioneta.isVisible() == false)
            instanciaVerCamioneta.setVisible(true);
        instanciaVerCamioneta.show();
        return instanciaVerCamioneta;
    }

    /**
     * Metodo para mostrar y ocultar ventana actualizar camioneta
     * @return 
     */      
    public synchronized VentanaActualizarCamioneta getInstanciaActualizarCamioneta(){
        if(instanciaActualizarCamioneta == null){
            instanciaActualizarCamioneta = new VentanaActualizarCamioneta();
            panelDeEscritorio.add(instanciaActualizarCamioneta);
        } else if(instanciaActualizarCamioneta.isVisible() == false)
            instanciaActualizarCamioneta.setVisible(true);
        instanciaActualizarCamioneta.show();
        return instanciaActualizarCamioneta;
    }     

    /**
     * Metodo para mostrar y ocultar ventana eliminar camioneta
     * @return 
     */      
    public synchronized VentanaEliminarCamioneta getInstanciaEliminarCamioneta(){
        if(instanciaEliminarCamioneta == null){
            instanciaEliminarCamioneta = new VentanaEliminarCamioneta();
            panelDeEscritorio.add(instanciaEliminarCamioneta);
        } else if(instanciaEliminarCamioneta.isVisible() == false)
            instanciaEliminarCamioneta.setVisible(true);
        instanciaEliminarCamioneta.show();
        return instanciaEliminarCamioneta;
    }      
 
    
    // TRAILER
    /**
     * Metodo para mostrar y ocultar ventana agregar trailer
     * @return 
     */      
    public synchronized VentanaAgregarTrailer getInstanciaAgregarTrailer(){
        if(instanciaAgregarTrailer == null){
            instanciaAgregarTrailer = new VentanaAgregarTrailer();
            panelDeEscritorio.add(instanciaAgregarTrailer);
        } else if(instanciaAgregarTrailer.isVisible() == false)
            instanciaAgregarTrailer.setVisible(true);
        instanciaAgregarTrailer.show();
        return instanciaAgregarTrailer;
    }     

    /**
     * Metodo para mostrar y ocultar ventana ver trailer
     * @return 
     */      
    public synchronized VentanaVerTrailer getInstanciaVerTrailer(){
        if(instanciaVerTrailer == null){
            instanciaVerTrailer = new VentanaVerTrailer();
            panelDeEscritorio.add(instanciaVerTrailer);
        } else if(instanciaVerTrailer.isVisible() == false)
            instanciaVerTrailer.setVisible(true);
        instanciaVerTrailer.show();
        return instanciaVerTrailer;
    }   
    
    /**
     * Metodo para mostrar y ocultar ventana actualizar trailer
     * @return 
     */      
    public synchronized VentanaActualizarTrailer getInstanciaActualizarTrailer(){
        if(instanciaActualizarTrailer == null){
            instanciaActualizarTrailer = new VentanaActualizarTrailer();
            panelDeEscritorio.add(instanciaActualizarTrailer);
        } else if(instanciaActualizarTrailer.isVisible() == false)
            instanciaActualizarTrailer.setVisible(true);
        instanciaActualizarTrailer.show();
        return instanciaActualizarTrailer;
    }    
 
    /**
     * Metodo para mostrar y ocultar ventana eliminar trailer
     * @return 
     */      
    public synchronized VentanaEliminarTrailer getInstanciaEliminarTrailer(){
        if(instanciaEliminarTrailer == null){
            instanciaEliminarTrailer = new VentanaEliminarTrailer();
            panelDeEscritorio.add(instanciaEliminarTrailer);
        } else if(instanciaEliminarTrailer.isVisible() == false)
            instanciaEliminarTrailer.setVisible(true);
        instanciaEliminarTrailer.show();
        return instanciaEliminarTrailer;
    }     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDeEscritorio = new javax.swing.JDesktopPane();
        barraDeMenu = new javax.swing.JMenuBar();
        menuCarro = new javax.swing.JMenu();
        menuItemAgregarCarro = new javax.swing.JMenuItem();
        menuItemVerCarro = new javax.swing.JMenuItem();
        menuItemActualizarCarro = new javax.swing.JMenuItem();
        menuItemEliminarCarro = new javax.swing.JMenuItem();
        menuMoto = new javax.swing.JMenu();
        menuItemAgregarMoto = new javax.swing.JMenuItem();
        menuItemVerMoto = new javax.swing.JMenuItem();
        menuItemActualizarMoto = new javax.swing.JMenuItem();
        menuItemEliminarMoto = new javax.swing.JMenuItem();
        menuCamioneta = new javax.swing.JMenu();
        menuItemAgregarCamioneta = new javax.swing.JMenuItem();
        menuItemVerCamioneta = new javax.swing.JMenuItem();
        menuItemActualizarCamioneta = new javax.swing.JMenuItem();
        menuItemEliminarCamioneta = new javax.swing.JMenuItem();
        menuTrailer = new javax.swing.JMenu();
        menuItemAgregarTrailer = new javax.swing.JMenuItem();
        menuItemVerTrailer = new javax.swing.JMenuItem();
        menuItemActualizarTrailer = new javax.swing.JMenuItem();
        menuItemEliminarTrailer = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelDeEscritorio.setBackground(new java.awt.Color(51, 51, 51));
        panelDeEscritorio.setPreferredSize(new java.awt.Dimension(1366, 768));

        javax.swing.GroupLayout panelDeEscritorioLayout = new javax.swing.GroupLayout(panelDeEscritorio);
        panelDeEscritorio.setLayout(panelDeEscritorioLayout);
        panelDeEscritorioLayout.setHorizontalGroup(
            panelDeEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        panelDeEscritorioLayout.setVerticalGroup(
            panelDeEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        barraDeMenu.setBackground(new java.awt.Color(0, 102, 102));
        barraDeMenu.setBorder(null);
        barraDeMenu.setForeground(new java.awt.Color(255, 255, 255));

        menuCarro.setBackground(new java.awt.Color(0, 51, 51));
        menuCarro.setForeground(new java.awt.Color(255, 255, 255));
        menuCarro.setText("CARRO");
        menuCarro.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        menuItemAgregarCarro.setBackground(new java.awt.Color(0, 51, 51));
        menuItemAgregarCarro.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        menuItemAgregarCarro.setForeground(new java.awt.Color(255, 255, 255));
        menuItemAgregarCarro.setText("INGRESAR");
        menuItemAgregarCarro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menuItemAgregarCarro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemAgregarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAgregarCarroActionPerformed(evt);
            }
        });
        menuCarro.add(menuItemAgregarCarro);

        menuItemVerCarro.setBackground(new java.awt.Color(0, 51, 51));
        menuItemVerCarro.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        menuItemVerCarro.setForeground(new java.awt.Color(255, 255, 255));
        menuItemVerCarro.setText("VER");
        menuItemVerCarro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menuItemVerCarro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemVerCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerCarroActionPerformed(evt);
            }
        });
        menuCarro.add(menuItemVerCarro);

        menuItemActualizarCarro.setBackground(new java.awt.Color(0, 51, 51));
        menuItemActualizarCarro.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        menuItemActualizarCarro.setForeground(new java.awt.Color(255, 255, 255));
        menuItemActualizarCarro.setText("ACTUALIZAR");
        menuItemActualizarCarro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menuItemActualizarCarro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemActualizarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarCarroActionPerformed(evt);
            }
        });
        menuCarro.add(menuItemActualizarCarro);

        menuItemEliminarCarro.setBackground(new java.awt.Color(0, 51, 51));
        menuItemEliminarCarro.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        menuItemEliminarCarro.setForeground(new java.awt.Color(255, 255, 255));
        menuItemEliminarCarro.setText("ELIMINAR");
        menuItemEliminarCarro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menuItemEliminarCarro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemEliminarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarCarroActionPerformed(evt);
            }
        });
        menuCarro.add(menuItemEliminarCarro);

        barraDeMenu.add(menuCarro);

        menuMoto.setBackground(new java.awt.Color(0, 51, 51));
        menuMoto.setForeground(new java.awt.Color(255, 255, 255));
        menuMoto.setText("MOTO");
        menuMoto.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        menuItemAgregarMoto.setBackground(new java.awt.Color(0, 51, 51));
        menuItemAgregarMoto.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        menuItemAgregarMoto.setForeground(new java.awt.Color(255, 255, 255));
        menuItemAgregarMoto.setText("INGRESAR");
        menuItemAgregarMoto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menuItemAgregarMoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemAgregarMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAgregarMotoActionPerformed(evt);
            }
        });
        menuMoto.add(menuItemAgregarMoto);

        menuItemVerMoto.setBackground(new java.awt.Color(0, 51, 51));
        menuItemVerMoto.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        menuItemVerMoto.setForeground(new java.awt.Color(255, 255, 255));
        menuItemVerMoto.setText("VER");
        menuItemVerMoto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menuItemVerMoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemVerMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerMotoActionPerformed(evt);
            }
        });
        menuMoto.add(menuItemVerMoto);

        menuItemActualizarMoto.setBackground(new java.awt.Color(0, 51, 51));
        menuItemActualizarMoto.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        menuItemActualizarMoto.setForeground(new java.awt.Color(255, 255, 255));
        menuItemActualizarMoto.setText("ACTUALIZAR");
        menuItemActualizarMoto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menuItemActualizarMoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemActualizarMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarMotoActionPerformed(evt);
            }
        });
        menuMoto.add(menuItemActualizarMoto);

        menuItemEliminarMoto.setBackground(new java.awt.Color(0, 51, 51));
        menuItemEliminarMoto.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        menuItemEliminarMoto.setForeground(new java.awt.Color(255, 255, 255));
        menuItemEliminarMoto.setText("ELIMINAR");
        menuItemEliminarMoto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menuItemEliminarMoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemEliminarMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarMotoActionPerformed(evt);
            }
        });
        menuMoto.add(menuItemEliminarMoto);

        barraDeMenu.add(menuMoto);

        menuCamioneta.setBackground(new java.awt.Color(0, 51, 51));
        menuCamioneta.setForeground(new java.awt.Color(255, 255, 255));
        menuCamioneta.setText("CAMIONETA");
        menuCamioneta.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        menuItemAgregarCamioneta.setBackground(new java.awt.Color(0, 51, 51));
        menuItemAgregarCamioneta.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        menuItemAgregarCamioneta.setForeground(new java.awt.Color(255, 255, 255));
        menuItemAgregarCamioneta.setText("INGRESAR");
        menuItemAgregarCamioneta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menuItemAgregarCamioneta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemAgregarCamioneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAgregarCamionetaActionPerformed(evt);
            }
        });
        menuCamioneta.add(menuItemAgregarCamioneta);

        menuItemVerCamioneta.setBackground(new java.awt.Color(0, 51, 51));
        menuItemVerCamioneta.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        menuItemVerCamioneta.setForeground(new java.awt.Color(255, 255, 255));
        menuItemVerCamioneta.setText("VER");
        menuItemVerCamioneta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menuItemVerCamioneta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemVerCamioneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerCamionetaActionPerformed(evt);
            }
        });
        menuCamioneta.add(menuItemVerCamioneta);

        menuItemActualizarCamioneta.setBackground(new java.awt.Color(0, 51, 51));
        menuItemActualizarCamioneta.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        menuItemActualizarCamioneta.setForeground(new java.awt.Color(255, 255, 255));
        menuItemActualizarCamioneta.setText("ACTUALIZAR");
        menuItemActualizarCamioneta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menuItemActualizarCamioneta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemActualizarCamioneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarCamionetaActionPerformed(evt);
            }
        });
        menuCamioneta.add(menuItemActualizarCamioneta);

        menuItemEliminarCamioneta.setBackground(new java.awt.Color(0, 51, 51));
        menuItemEliminarCamioneta.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        menuItemEliminarCamioneta.setForeground(new java.awt.Color(255, 255, 255));
        menuItemEliminarCamioneta.setText("ELIMINAR");
        menuItemEliminarCamioneta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menuItemEliminarCamioneta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemEliminarCamioneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarCamionetaActionPerformed(evt);
            }
        });
        menuCamioneta.add(menuItemEliminarCamioneta);

        barraDeMenu.add(menuCamioneta);

        menuTrailer.setBackground(new java.awt.Color(0, 51, 51));
        menuTrailer.setForeground(new java.awt.Color(255, 255, 255));
        menuTrailer.setText("TRAILER");
        menuTrailer.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        menuItemAgregarTrailer.setBackground(new java.awt.Color(0, 51, 51));
        menuItemAgregarTrailer.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        menuItemAgregarTrailer.setForeground(new java.awt.Color(255, 255, 255));
        menuItemAgregarTrailer.setText("INGRESAR");
        menuItemAgregarTrailer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menuItemAgregarTrailer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemAgregarTrailer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAgregarTrailerActionPerformed(evt);
            }
        });
        menuTrailer.add(menuItemAgregarTrailer);

        menuItemVerTrailer.setBackground(new java.awt.Color(0, 51, 51));
        menuItemVerTrailer.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        menuItemVerTrailer.setForeground(new java.awt.Color(255, 255, 255));
        menuItemVerTrailer.setText("VER");
        menuItemVerTrailer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menuItemVerTrailer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemVerTrailer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerTrailerActionPerformed(evt);
            }
        });
        menuTrailer.add(menuItemVerTrailer);

        menuItemActualizarTrailer.setBackground(new java.awt.Color(0, 51, 51));
        menuItemActualizarTrailer.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        menuItemActualizarTrailer.setForeground(new java.awt.Color(255, 255, 255));
        menuItemActualizarTrailer.setText("ACTUALIZAR");
        menuItemActualizarTrailer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menuItemActualizarTrailer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemActualizarTrailer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarTrailerActionPerformed(evt);
            }
        });
        menuTrailer.add(menuItemActualizarTrailer);

        menuItemEliminarTrailer.setBackground(new java.awt.Color(0, 51, 51));
        menuItemEliminarTrailer.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        menuItemEliminarTrailer.setForeground(new java.awt.Color(255, 255, 255));
        menuItemEliminarTrailer.setText("ELIMINAR");
        menuItemEliminarTrailer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menuItemEliminarTrailer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemEliminarTrailer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarTrailerActionPerformed(evt);
            }
        });
        menuTrailer.add(menuItemEliminarTrailer);

        barraDeMenu.add(menuTrailer);

        setJMenuBar(barraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDeEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 639, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDeEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 340, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // ACTIONS CARRO	
    private void menuItemAgregarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAgregarCarroActionPerformed
        // TODO add your handling code here:
        getInstanciaAgregarCarro();        
    }//GEN-LAST:event_menuItemAgregarCarroActionPerformed
	
    private void menuItemVerCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerCarroActionPerformed
        // TODO add your handling code here:
        getInstanciaVerCarro();
        instanciaVerCarro.mostrarCarro();        
    }//GEN-LAST:event_menuItemVerCarroActionPerformed
	
    private void menuItemActualizarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarCarroActionPerformed
        // TODO add your handling code here:
        getInstanciaActualizarCarro();
    }//GEN-LAST:event_menuItemActualizarCarroActionPerformed

    private void menuItemEliminarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarCarroActionPerformed
        // TODO add your handling code here:
        getInstanciaEliminarCarro();        
    }//GEN-LAST:event_menuItemEliminarCarroActionPerformed


    // ACTIONS MOTO	
    private void menuItemAgregarMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAgregarMotoActionPerformed
        // TODO add your handling code here:
        getInstanciaAgregarMoto();                
    }//GEN-LAST:event_menuItemAgregarMotoActionPerformed
	
    private void menuItemVerMotoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        getInstanciaVerMoto();
        instanciaVerMoto.mostrarMoto();         
    }                                                

    private void menuItemActualizarMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarMotoActionPerformed
        // TODO add your handling code here:
        getInstanciaActualizarMoto();        
    }//GEN-LAST:event_menuItemActualizarMotoActionPerformed

    private void menuItemEliminarMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarMotoActionPerformed
        // TODO add your handling code here:
        getInstanciaEliminarMoto();                
    }//GEN-LAST:event_menuItemEliminarMotoActionPerformed


    //ACTIONS CAMIONETA
    private void menuItemAgregarCamionetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAgregarCamionetaActionPerformed
        // TODO add your handling code here:
        getInstanciaAgregarCamioneta();                        
    }//GEN-LAST:event_menuItemAgregarCamionetaActionPerformed

    private void menuItemVerCamionetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerCamionetaActionPerformed
        // TODO add your handling code here:
        getInstanciaVerCamioneta();
        instanciaVerCamioneta.mostrarCamioneta();         
    }//GEN-LAST:event_menuItemVerCamionetaActionPerformed

    private void menuItemActualizarCamionetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarCamionetaActionPerformed
        // TODO add your handling code here:
        getInstanciaActualizarCamioneta();                
    }//GEN-LAST:event_menuItemActualizarCamionetaActionPerformed

    private void menuItemEliminarCamionetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarCamionetaActionPerformed
        // TODO add your handling code here:
        getInstanciaEliminarCamioneta();                        
    }//GEN-LAST:event_menuItemEliminarCamionetaActionPerformed


    // ACTION TRAILER
    private void menuItemAgregarTrailerActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
        getInstanciaAgregarTrailer();
    }   

    private void menuItemVerTrailerActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
        getInstanciaVerTrailer();
        instanciaVerTrailer.mostrarTrailer();
    } 	
    
    private void menuItemActualizarTrailerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarTrailerActionPerformed
        // TODO add your handling code here:
        getInstanciaActualizarTrailer();                
    }//GEN-LAST:event_menuItemActualizarTrailerActionPerformed

    private void menuItemEliminarTrailerActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
        getInstanciaEliminarTrailer();
    }     
 
      
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraDeMenu;
    private javax.swing.JMenu menuCamioneta;
    private javax.swing.JMenu menuCarro;
    private javax.swing.JMenuItem menuItemActualizarCamioneta;
    private javax.swing.JMenuItem menuItemActualizarCarro;
    private javax.swing.JMenuItem menuItemActualizarMoto;
    private javax.swing.JMenuItem menuItemActualizarTrailer;
    private javax.swing.JMenuItem menuItemAgregarCamioneta;
    private javax.swing.JMenuItem menuItemAgregarCarro;
    private javax.swing.JMenuItem menuItemAgregarMoto;
    private javax.swing.JMenuItem menuItemAgregarTrailer;
    private javax.swing.JMenuItem menuItemEliminarCamioneta;
    private javax.swing.JMenuItem menuItemEliminarCarro;
    private javax.swing.JMenuItem menuItemEliminarMoto;
    private javax.swing.JMenuItem menuItemEliminarTrailer;
    private javax.swing.JMenuItem menuItemVerCamioneta;
    private javax.swing.JMenuItem menuItemVerCarro;
    private javax.swing.JMenuItem menuItemVerMoto;
    private javax.swing.JMenuItem menuItemVerTrailer;
    private javax.swing.JMenu menuMoto;
    private javax.swing.JMenu menuTrailer;
    private javax.swing.JDesktopPane panelDeEscritorio;
    // End of variables declaration//GEN-END:variables
}
