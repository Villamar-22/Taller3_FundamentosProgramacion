import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class ejercicio15 {
    public static void main(String[] args) {
        // Uso de las librerías de interfaz gráfica: awt, swing
        JFrame frame = new JFrame("Interfaz Gráfica");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(null); // Desactiva el layout para usar coordenadas manuales
        JTextField textField = new JTextField(10);
        textField.setBounds(50, 30, 200, 30); // x, y, ancho, alto
        JButton button = new JButton("Mostrar");
        button.setBounds(260, 30, 90, 30);
        JLabel label = new JLabel("Texto ingresado aparecerá aquí");
        label.setBounds(50, 80, 300, 30);button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText(textField.getText());
            }
        });
                 
        panel.add(textField);
        panel.add(button);
        panel.add(label);
        frame.add(panel);
        
        frame.setVisible(true);
    }
}