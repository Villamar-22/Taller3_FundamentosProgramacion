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
        Scanner CE = new Scanner(System.in);
        ArrayList<Pelicula> lista = new ArrayList<>();
        char continuar;

        System.out.println("=== SISTEMA DE ORDENAMIENTO DE PELÍCULAS ===");

        do {
            CE.nextLine();
            System.out.print("Título: ");
            String titulo = sc.nextLine();

            System.out.print("Año de lanzamiento: ");
            int anio = CE.nextInt();

            sc.nextLine();
            System.out.print("Género: ");
            String genero = CE.nextLine();

            lista.add(new Pelicula(titulo, anio, genero));

            System.out.print("¿Desea agregar otra película? (s/n): ");
            continuar = CE.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        Collections.sort(lista, Comparator.comparingInt(p -> p.año));

        System.out.println("\n--- PELÍCULAS ORDENADAS POR AÑO ---");
        for (Pelicula p : lista) {
            System.out.println(p.año + " - " + p.titulo + " (" + p.genero + ")");
        }

        CE.close();
    }
}
