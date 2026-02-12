import javax.swing.*;
import java.awt.event.*;
public class ejercicio16 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tabla de multiplicar");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Ingrese un número:");
        JTextField input = new JTextField(10);
        JButton boton = new JButton("Calcular");       boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero = Integer.parseInt(input.getText());
                StringBuilder resultado = new StringBuilder();
                for (int i=1; i<=12; i++) {
                    int mult = numero*i;
                    resultado.append(numero).append(" x ").append(i).append(" = ").append(mult).append("\n");
                }
                JOptionPane.showMessageDialog(frame, resultado.toString(), "Resultado de tabla de multiplicar", JOptionPane.INFORMATION_MESSAGE);               
            }
        });
     panel.add(label);
        panel.add(input);
        panel.add(boton);
        frame.add(panel);
        frame.setVisible(true);
    }
}