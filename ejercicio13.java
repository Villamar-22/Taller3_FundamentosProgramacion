import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        // Uso de la librería Scanner y Math
        Scanner scanner = new Scanner(System.in);

        try {
            double num1, num2;

            System.out.print("Ingrese número 1: ");
            num1 = scanner.nextDouble();

            System.out.print("Ingrese número 2: ");
            num2 = scanner.nextDouble();

            System.out.println("El número máximo de los dos números es: " + Math.max(num1, num2));
            System.out.println("El número mínimo de los dos números es: " + Math.min(num1, num2));
            System.out.println("La raíz cuadrada del número 2 es: " + Math.sqrt(num2));
            System.out.println("La potencia del número 1 con el número 2 es: " + Math.pow(num1, num2));

        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente un número decimal usando el punto.");
        }
    }
}
