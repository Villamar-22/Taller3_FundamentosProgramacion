import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Películas {

    static class Pelicula {
        String titulo;
        int año;
        String genero;

        Pelicula(String titulo, int año, String genero) {
            this.titulo = titulo;
            this.año = año;
            this.genero = genero;
        }
    }

    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner Ec = new Scanner(System.in);
=======
        Scanner CE = new Scanner(System.in);
>>>>>>> 7fed89f2af2c8e8ab39e746110dd9c84d93f09e7
        ArrayList<Pelicula> lista = new ArrayList<>();
        char continuar;

        System.out.println("=== SISTEMA DE ORDENAMIENTO DE PELÍCULAS ===");

        do {
<<<<<<< HEAD
            Ec.nextLine();
=======
            CE.nextLine();
>>>>>>> 7fed89f2af2c8e8ab39e746110dd9c84d93f09e7
            System.out.print("Título: ");
            String titulo = Ec.nextLine();

            System.out.print("Año de lanzamiento: ");
<<<<<<< HEAD
            int anio = Ec.nextInt();
=======
            int anio = CE.nextInt();
>>>>>>> 7fed89f2af2c8e8ab39e746110dd9c84d93f09e7

            Ec.nextLine();
            System.out.print("Género: ");
<<<<<<< HEAD
            String genero = Ec.nextLine();
=======
            String genero = CE.nextLine();
>>>>>>> 7fed89f2af2c8e8ab39e746110dd9c84d93f09e7

            lista.add(new Pelicula(titulo, anio, genero));

            System.out.print("¿Desea agregar otra película? (s/n): ");
<<<<<<< HEAD
            continuar = Ec.next().charAt(0);
=======
            continuar = CE.next().charAt(0);
>>>>>>> 7fed89f2af2c8e8ab39e746110dd9c84d93f09e7

        } while (continuar == 's' || continuar == 'S');

        Collections.sort(lista, Comparator.comparingInt(p -> p.año));

        System.out.println("\n--- PELÍCULAS ORDENADAS POR AÑO ---");
        for (Pelicula p : lista) {
            System.out.println(p.año + " - " + p.titulo + " (" + p.genero + ")");
        }

<<<<<<< HEAD
        Ec.close();
=======
        CE.close();
>>>>>>> 7fed89f2af2c8e8ab39e746110dd9c84d93f09e7
    }
}
