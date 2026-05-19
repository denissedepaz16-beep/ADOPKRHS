import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        // Creamos el objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Generador de Tablas de Multiplicar ---");
        System.out.print("Por favor, ingresa un número natural: ");
        int numero = teclado.nextInt();

        System.out.println("\n=================================");
        System.out.println("      TABLA DEL NÚMERO " + numero);
        System.out.println("=================================");

        // El ciclo for va desde 1 hasta 12 para armar la tabla
        for (int i = 1; i <= 12; i++) {
            int resultado = numero * i;
            // Mostramos la operación formateada (Ejemplo: 5 x 1 = 5)
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        System.out.println("=================================");

        // Cerramos el scanner
        teclado.close();
    }
}
