
import java.util.Scanner;

public class Ejercicio1  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto de la compra: $");
        double monto = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el búfer de la consola

        System.out.print("Ingrese el color de la etiqueta (verde, roja, azul, dorada): ");
        String etiqueta = scanner.nextLine();


        double porcentajeDescuento = obtenerPorcentajeDescuento(etiqueta);


        double descuento = monto * porcentajeDescuento;
        double totalAPagar = monto - descuento;


        System.out.println("\n--- Resumen de Compra ---");
        System.out.printf("Monto original: $%.2f\n", monto);
        System.out.printf("Descuento aplicado (%.0f%%): $%.2f\n", (porcentajeDescuento * 100), descuento);
        System.out.printf("Total a pagar: $%.2f\n", totalAPagar);

        scanner.close();
    }

    public static double obtenerPorcentajeDescuento(String color) {
        // Normalizamos el texto: quitamos espacios y lo pasamos a minúsculas
        String colorNormalizado = color.trim().toLowerCase();

        switch (colorNormalizado) {
            case "verde":
                return 0.05;
            case "roja":
                return 0.10;
            case "azul":
                return 0.15;
            case "dorada":
                return 0.20;
            default:
                System.out.println("[Aviso]: Color de etiqueta no reconocido. Descuento: 0%");
                return 0.00; // Si el color no existe, el descuento es cero
        }
    }
}
