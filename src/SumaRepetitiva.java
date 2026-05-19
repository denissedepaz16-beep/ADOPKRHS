import java.util.Scanner;

public class SumaRepetitiva {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Variables para acumular la suma y controlar el ciclo
        double sumaTotal = 0;
        char continuar;

        System.out.println("--- Bienvenid@ al programa de suma continua ---");

        do {
            // 1. Solicitar el número
            System.out.print("Ingresa un número: ");
            double numero = teclado.nextDouble();

            // 2. Acumular el número en la variable sumaTotal
            sumaTotal += numero; // Esto es equivalente a: sumaTotal = sumaTotal + numero;

            // 3. Preguntar si desea continuar
            System.out.print("¿Deseas ingresar otro número? (s/n): ");
            continuar = teclado.next().toLowerCase().charAt(0);

            System.out.println("---------------------------------------------");

        } while (continuar == 's'); // El ciclo se repite si el usuario presiona 's' o 'S'

        // 4. Mostrar el resultado final al salir del ciclo
        System.out.println("¡Programa terminado!");
        System.out.println("La suma total de los números ingresados es: " + sumaTotal);

        // Cerramos el scanner por buena práctica
        teclado.close();
    }
}
