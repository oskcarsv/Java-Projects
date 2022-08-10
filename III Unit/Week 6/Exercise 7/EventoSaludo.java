import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EventoSaludo implements ActionListener {
    private JTextField cuadroTexto;
    
    public EventoSaludo(JTextField cuadroTexto) {
        this.cuadroTexto = cuadroTexto;
    }
    
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "¡Hola, " +
        cuadroTexto.getText() + "!");
    }
    
}