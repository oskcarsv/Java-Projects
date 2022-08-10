import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ShowImputDialog implements ActionListener {
    private JTextField cuadroTexto;
    
    public ShowImputDialog(JTextField cuadroTexto) {
        this.cuadroTexto = cuadroTexto;
    }
    
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showInputDialog(null, "¡Hola, " +
        cuadroTexto.getText() + "!  Ingresa tu apellido",null);
    }
    
}