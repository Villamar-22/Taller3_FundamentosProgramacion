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
<<<<<<< HEAD
        Scanner Ec = new Scanner(System.in);
=======
        Scanner EC = new Scanner(System.in);
>>>>>>> 7fed89f2af2c8e8ab39e746110dd9c84d93f09e7
        ArrayList<Ingrediente> lista = new ArrayList<>();
        char continuar;

        System.out.println("=== SISTEMA DE CÁLCULO NUTRICIONAL ===");

        do {
            System.out.print("Ingrediente: ");
<<<<<<< HEAD
            String nombre = Ec.next();

            System.out.print("Calorías: ");
            double cal = Ec.nextDouble();

            System.out.print("Proteínas (g): ");
            double prot = Ec.nextDouble();

            System.out.print("Grasas (g): ");
            double grasa = Ec.nextDouble();

            System.out.print("Carbohidratos (g): ");
            double carb = Ec.nextDouble();
=======
            String nombre = EC.next();

            System.out.print("Calorías: ");
            double cal = EC.nextDouble();

            System.out.print("Proteínas (g): ");
            double prot = EC.nextDouble();

            System.out.print("Grasas (g): ");
            double grasa = EC.nextDouble();

            System.out.print("Carbohidratos (g): ");
            double carb = EC.nextDouble();
>>>>>>> 7fed89f2af2c8e8ab39e746110dd9c84d93f09e7

            lista.add(new Ingrediente(nombre, cal, prot, grasa, carb));

            System.out.print("¿Desea agregar otro ingrediente? (s/n): ");
<<<<<<< HEAD
            continuar = Ec.next().charAt(0);
=======
            continuar = EC.next().charAt(0);
>>>>>>> 7fed89f2af2c8e8ab39e746110dd9c84d93f09e7

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

<<<<<<< HEAD
        Ec.close();
=======
        ce.close();
>>>>>>> 7fed89f2af2c8e8ab39e746110dd9c84d93f09e7
    }
}
