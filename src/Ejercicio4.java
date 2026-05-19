import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "si";

        while (continuar.equalsIgnoreCase("si")) {
            System.out.print("Ingrese el primer número: ");
            double n1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double n2 = scanner.nextDouble();

            double resultadoSuma = sumarDosNumeros(n1, n2);
            System.out.println("La suma es: " + resultadoSuma);

            System.out.print("¿Desea realizar otra suma? (si/no): ");
            continuar = scanner.next();
            System.out.println("---------------------------------");
        }

        System.out.println("Programa terminado.");
        scanner.close();
    }

    public static double sumarDosNumeros(double a, double b) {
        return a + b;
    }
}
