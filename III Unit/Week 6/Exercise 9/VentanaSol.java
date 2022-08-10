import java.awt.Container;
import javax.swing.*;

public class VentanaSol extends JFrame {
    
    public VentanaSol() {
        super("Saludo personalizado");
        setSize(450, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        Container cp = getContentPane();
        cp.add(new PanelSol());
		
    }
	
}