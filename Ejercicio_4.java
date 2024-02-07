
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce números enteros positivos (introduce un número negativo para finalizar):");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (true) {
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            min = Math.min(min, numero);
            max = Math.max(max, numero);
        }
        if (min == Integer.MAX_VALUE || max == Integer.MIN_VALUE) {
            System.out.println("No se ingresaron números positivos.");
        } else {
            System.out.println("El mínimo es: " + min);
            System.out.println("El máximo es: " + max);
        }

        scanner.close();
    }
}
