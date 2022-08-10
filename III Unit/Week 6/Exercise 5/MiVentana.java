import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class MiVentana extends JFrame{
    
    public MiVentana(){
		
        super(" usuario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);
        
        // Panel de fechaJ
        JPanel panelFecha = new JPanel();        
        panelFecha.setLayout(new FlowLayout());        
        panelFecha.add(new JTextField(2));        
        panelFecha.add(new JLabel("/"));        
        panelFecha.add(new JTextField(2));        
        panelFecha.add(new JLabel("/"));        
        panelFecha.add(new JTextField(2));  
        
        // Panel de datos
        JPanel panelDatos = new JPanel();        
        GridLayout gl = new GridLayout(3,2,0,5);        
        panelDatos.setLayout(gl);        
        panelDatos.add(new JLabel("Nombre:"));        
        panelDatos.add(new JTextField(10));        
        panelDatos.add(new JLabel("DNI:"));        
        panelDatos.add(new JTextField(10));        
        panelDatos.add(new JLabel("Fecha de nacimiento: "));        
        panelDatos.add(panelFecha); 
        
        // Panel de botones
        JPanel panelBotones = new JPanel();        
        panelBotones.setLayout(new FlowLayout());        
        panelBotones.add(new JButton("Aceptar"));        
        panelBotones.add(new JButton("Cancelar"));
        Container cp = getContentPane();        
        cp.add(panelDatos, BorderLayout.CENTER);        
        cp.add(panelBotones, BorderLayout.SOUTH);       
        
    } 
}
