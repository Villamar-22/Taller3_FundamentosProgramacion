import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

/*
 Autor: Yamileth Villamar
 Asignatura: Fundamentos de Programación
 Unidad 4: Manejo de archivos y librería gráfica
 Descripción:
 Este programa permite registrar facturas, consultarlas por número
 y guardar la información en un archivo de texto.
*/

class FacturaCliente {
    String numeroFactura;
    String nombreCliente;
    double montoFactura;
    String fechaFactura;

    public FacturaCliente(String numeroFactura, String nombreCliente, double montoFactura, String fechaFactura) {
        this.numeroFactura = numeroFactura;
        this.nombreCliente = nombreCliente;
        this.montoFactura = montoFactura;
        this.fechaFactura = fechaFactura;
    }
}

public class SistemaFacturacionYamileth extends JFrame {

    // Lista donde almaceno las facturas registradas
    ArrayList<FacturaCliente> listaFacturas = new ArrayList<>();

    // Campos de texto de la interfaz
    JTextField txtNumero, txtCliente, txtMonto, txtFecha;

    public SistemaFacturacionYamileth() {

        setTitle("Sistema de Facturación - Unidad 4");
        setSize(420, 330);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(6, 2, 8, 8));

        panel.add(new JLabel("Número de factura:"));
        txtNumero = new JTextField();
        panel.add(txtNumero);

        panel.add(new JLabel("Nombre del cliente:"));
        txtCliente = new JTextField();
        panel.add(txtCliente);

        panel.add(new JLabel("Monto ($):"));
        txtMonto = new JTextField();
        panel.add(txtMonto);

        panel.add(new JLabel("Fecha:"));
        txtFecha = new JTextField();
        panel.add(txtFecha);

        JButton btnRegistrar = new JButton("Registrar factura");
        JButton btnConsultar = new JButton("Consultar factura");
        JButton btnGuardar = new JButton("Guardar en archivo");
        JButton btnSalir = new JButton("Salir");

        panel.add(btnRegistrar);
        panel.add(btnConsultar);
        panel.add(btnGuardar);
        panel.add(btnSalir);

        add(panel);

        // Acciones de los botones
        btnRegistrar.addActionListener(e -> registrarFactura());
        btnConsultar.addActionListener(e -> consultarFactura());
        btnGuardar.addActionListener(e -> guardarFacturasEnArchivo());
        btnSalir.addActionListener(e -> System.exit(0));
    }

    // Método para registrar una nueva factura
    private void registrarFactura() {
        try {
            String numero = txtNumero.getText();
            String cliente = txtCliente.getText();
            double monto = Double.parseDouble(txtMonto.getText());
            String fecha = txtFecha.getText();

            listaFacturas.add(new FacturaCliente(numero, cliente, monto, fecha));

            JOptionPane.showMessageDialog(this, "Factura registrada correctamente.");

            txtNumero.setText("");
            txtCliente.setText("");
            txtMonto.setText("");
            txtFecha.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al ingresar los datos.");
        }
    }

    // Método para consultar una factura por su número
    private void consultarFactura() {
        String numeroBuscado = JOptionPane.showInputDialog("Ingrese el número de factura:");

        for (FacturaCliente f : listaFacturas) {
            if (f.numeroFactura.equals(numeroBuscado)) {
                JOptionPane.showMessageDialog(this,
                        "Factura encontrada:\n" +
                        "Número: " + f.numeroFactura +
                        "\nCliente: " + f.nombreCliente +
                        "\nMonto: $" + f.montoFactura +
                        "\nFecha: " + f.fechaFactura);
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Factura no se encuentra registrada");
    }

    // Método para guardar las facturas en un archivo de texto
    private void guardarFacturasEnArchivo() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("facturas_yamileth.txt"));

            for (FacturaCliente f : listaFacturas) {
                writer.write("Factura: " + f.numeroFactura +
                        " | Cliente: " + f.nombreCliente +
                        " | Monto: $" + f.montoFactura);
                writer.newLine();
            }

            writer.close();
            JOptionPane.showMessageDialog(this, "Archivo creado correctamente.");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al crear el archivo.");
        }
    }

    public static void main(String[] args) {

        // Factura inicial proporcionada para pruebas
        SistemaFacturacionYamileth sistema = new SistemaFacturacionYamileth();
        sistema.listaFacturas.add(new FacturaCliente(
                "00022",
                "Anthony Jara Padilla",
                5000,
                "4 de febrero del 2026"
        ));

        sistema.setVisible(true);
    }
}
