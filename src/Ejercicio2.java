import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero límite: ");
        int limite = scanner.nextInt();

        System.out.println("Los números pares entre 0 y " + limite + " son:");
        mostrarParesHasta(limite);

        scanner.close();
    }

    public static void mostrarParesHasta(int limite) {
        int contador = 0;
        while (contador <= limite) {
            if (contador % 2 == 0) {
                System.out.print(contador + " ");
            }
            contador++;
        }
        System.out.println(); // Salto de línea final
    }
}