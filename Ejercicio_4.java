
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce números enteros positivos (introduce un número negativo para finalizar):");

        // Inicializar el mínimo y el máximo con el primer número ingresado
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Leer los números ingresados por el usuario y encontrar el mínimo y el máximo
        while (true) {
            int numero = scanner.nextInt();

            // Verificar si el número es negativo para finalizar el bucle
            if (numero < 0) {
                break;
            }

            // Actualizar el mínimo y el máximo
            min = Math.min(min, numero);
            max = Math.max(max, numero);
        }

        // Imprimir el resultado
        if (min == Integer.MAX_VALUE || max == Integer.MIN_VALUE) {
            System.out.println("No se ingresaron números positivos.");
        } else {
            System.out.println("El mínimo es: " + min);
            System.out.println("El máximo es: " + max);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
