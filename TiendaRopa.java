import java.util.ArrayList;
import java.util.Scanner;

class Producto {
    String codigo;
    String nombre;
    String descripcion;
    String categoria;
    int stock;

    public Producto(String codigo, String nombre, String descripcion, String categoria, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.stock = stock;
    }

    public void mostrarProducto() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Categoría: " + categoria);
        System.out.println("Stock: " + stock);
        System.out.println("-----------------------------");
    }
}

public class TiendaRopa {

    static ArrayList<Producto> productos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n=== TIENDA DE ROPA ===");
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Vender producto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarProducto();
                    break;
                case 2:
                    mostrarProductos();
                    break;
                case 3:
                    venderProducto();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 4);
    }

    static void registrarProducto() {
        System.out.print("Código: ");
        String codigo = scanner.nextLine();

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();

        System.out.print("Categoría (niños/damas/caballeros): ");
        String categoria = scanner.nextLine();

        System.out.print("Stock: ");
        int stock = scanner.nextInt();
        scanner.nextLine();

        productos.add(new Producto(codigo, nombre, descripcion, categoria, stock));
        System.out.println("Producto registrado con éxito ✅");
    }

    static void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            for (Producto p : productos) {
                p.mostrarProducto();
            }
        }
    }

    static void venderProducto() {
        System.out.print("Ingrese el código del producto: ");
        String codigo = scanner.nextLine();

        for (Producto p : productos) {
            if (p.codigo.equalsIgnoreCase(codigo)) {
                System.out.print("Cantidad a vender: ");
                int cantidad = scanner.nextInt();
                scanner.nextLine();

                if (cantidad <= p.stock) {
                    p.stock -= cantidad;
                    System.out.println("Venta realizada con éxito 🛒");
                } else {
                    System.out.println("Stock insuficiente ❌");
                }
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }
}
