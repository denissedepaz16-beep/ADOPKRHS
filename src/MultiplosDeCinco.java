public class MultiplosDeCinco {
    public static void main(String[] args) {
        System.out.println("--- Los primeros 50 múltiplos de 5 ---");

        // El ciclo for va desde 1 hasta 50
        for (int i = 1; i <= 50; i++) {
            int multiplo = i * 5;

            // Mostramos el resultado en pantalla
            System.out.println("Múltiplo #" + i + ": " + multiplo);
        }

        System.out.println("-------------------------------------");
    }
}