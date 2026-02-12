import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> personas = new HashMap<>();
        System.out.println("Ingrese nombre y edad (Escriba 'fin' para terminar):");
        while (true) {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("fin")) break;
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            personas.put(nombre, edad);
        }System.out.println("\nLista de personas ordenadas:");
        personas.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }
}