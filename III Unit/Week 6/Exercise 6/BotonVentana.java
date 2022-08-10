import javax.swing.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

public class BotonVentana extends JFrame {
    public BotonVentana() {
        super("Botón");
        setSize(700,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JButton boton = new JButton("¡Púlsame!");
        boton.addActionListener (new EventoBotonPulsado());
        cp.add(boton);
    }
}
    