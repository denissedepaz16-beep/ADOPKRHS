import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero (inicio): ");
        int n1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero (fin): ");
        int n2 = scanner.nextInt();

        System.out.println("Números pares en el rango seleccionado:");
        mostrarParesEnRango(n1, n2);

        scanner.close();
    }

    public static void mostrarParesEnRango(int num1, int num2) {
        // Encontramos el verdadero inicio y fin de forma automática
        int inicio = Math.min(num1, num2);
        int fin = Math.max(num1, num2);

        int contador = inicio;
        while (contador <= fin) {
            if (contador % 2 == 0) {
                System.out.print(contador + " ");
            }
            contador++;
        }
        System.out.println();
    }
}
