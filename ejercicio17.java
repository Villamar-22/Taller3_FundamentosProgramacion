import java.awt.GridLayout;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class ejercicio17 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registro de Productos");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 5, 5)); // 5 filas, 2 columnas, espacios

        JLabel lb_caja = new JLabel("Descripción:");
        JTextField caja = new JTextField(15);

        JLabel lb_producto = new JLabel("Tipo de producto:");
        String[] items = {"Ropa", "Tecnología", "Alimentos", "Otros"};
        JComboBox<String> comboBox = new JComboBox<>(items);

        JCheckBox check = new JCheckBox("Producto con descuento");
        
        JButton registrar = new JButton("Registrar");
        JButton consultar = new JButton("Consultar");

        ArrayList<Object[]> datos = new ArrayList<>();

        registrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = caja.getText();
                String itemCombo = comboBox.getSelectedItem().toString();
                boolean seleccionado = check.isSelected();

                Object[] nuevoDato = {
                    texto,
                    itemCombo,
                    seleccionado ? "Seleccionado" : "No seleccionado"
                };
                datos.add(nuevoDato);

                caja.setText("");
                comboBox.setSelectedIndex(0);
                check.setSelected(false);

                String mensaje = "Descripción: " + texto + "\n"
                        + "Tipo de producto: " + itemCombo + "\n"
                        + "Producto con descuento: "
                        + (seleccionado ? "Seleccionado" : "No seleccionado");

                JOptionPane.showMessageDialog(frame, mensaje);
            }
        });

        consultar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringBuilder mensaje = new StringBuilder("Datos almacenados:\n\n");

                for (Object[] dato : datos) {
                    mensaje.append("Descripción: ").append(dato[0]).append("\n")
                           .append("Tipo producto: ").append(dato[1]).append("\n")
                           .append("Producto con descuento: ").append(dato[2]).append("\n\n");
                }

                JOptionPane.showMessageDialog(frame, mensaje.toString(),
                        "Datos", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        panel.add(lb_caja);
        panel.add(caja);
        panel.add(lb_producto);
        panel.add(comboBox);
        panel.add(check);
        panel.add(registrar);
        panel.add(consultar);
        frame.add(panel);
        frame.setLocationRelativeTo(null); // centrar ventana
        frame.setVisible(true);
    }
}
