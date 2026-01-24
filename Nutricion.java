import java.util.ArrayList;
import java.util.Scanner;

public class Nutricion {

    static class Ingrediente {
        String nombre;
        double calorias;
        double proteinas;
        double grasas;
        double carbohidratos;

        Ingrediente(String nombre, double calorias, double proteinas,
                    double grasas, double carbohidratos) {
            this.nombre = nombre;
            this.calorias = calorias;
            this.proteinas = proteinas;
            this.grasas = grasas;
            this.carbohidratos = carbohidratos;
        }
    }

    public static void main(String[] args) {
        Scanner EC = new Scanner(System.in);
        ArrayList<Ingrediente> lista = new ArrayList<>();
        char continuar;

        System.out.println("=== SISTEMA DE CÁLCULO NUTRICIONAL ===");

        do {
            System.out.print("Ingrediente: ");
            String nombre = EC.next();

            System.out.print("Calorías: ");
            double cal = EC.nextDouble();

            System.out.print("Proteínas (g): ");
            double prot = EC.nextDouble();

            System.out.print("Grasas (g): ");
            double grasa = EC.nextDouble();

            System.out.print("Carbohidratos (g): ");
            double carb = EC.nextDouble();

            lista.add(new Ingrediente(nombre, cal, prot, grasa, carb));

            System.out.print("¿Desea agregar otro ingrediente? (s/n): ");
            continuar = EC.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        double totalCal = 0, totalProt = 0, totalGrasa = 0, totalCarb = 0;

        for (Ingrediente i : lista) {
            totalCal += i.calorias;
            totalProt += i.proteinas;
            totalGrasa += i.grasas;
            totalCarb += i.carbohidratos;
        }

        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Calorías totales: " + totalCal);
        System.out.println("Proteínas totales: " + totalProt);
        System.out.println("Grasas totales: " + totalGrasa);
        System.out.println("Carbohidratos totales: " + totalCarb);

        if (totalCal <= 700) {
            System.out.println("Estado nutricional: ACEPTABLE");
        } else {
            System.out.println("Estado nutricional: NO ACEPTABLE");
        }

        ce.close();
    }
}
