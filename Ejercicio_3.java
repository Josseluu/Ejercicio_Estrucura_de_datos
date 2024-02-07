
import java.util.Arrays;
public class Ejercicio_3 {
    public static void main(String[] args) {
        int begin = 1;
        int end = 100;

        // Obtener todos los múltiplos de 5 entre begin y end
        int[] multiplosDe5 = obtenerMultiplosDe5(begin, end);

        // Visualizar cada uno de los múltiplos de 5
        System.out.println("Múltiplos de 5 entre " + begin + " y " + end + ": ");
        for (int multiplo : multiplosDe5) {
            System.out.print(multiplo + " ");
        }
        System.out.println();

        // Calcular la suma de los múltiplos de 5
        int suma = calcularSuma(multiplosDe5);

        // Visualizar la suma de los múltiplos de 5
        System.out.println("La suma de los múltiplos de 5 es: " + suma);
    }

    public static int[] obtenerMultiplosDe5(int begin, int end) {
        int cantidadMultiplos = 0;
        // Calcular la cantidad de múltiplos de 5 entre begin y end
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                cantidadMultiplos++;
            }
        }
        // Crear un array para almacenar los múltiplos de 5
        int[] multiplosDe5 = new int[cantidadMultiplos];
        int index = 0;
        // Llenar el array con los múltiplos de 5
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiplosDe5[index] = i;
                index++;
            }
        }
        return multiplosDe5;
    }

    public static int calcularSuma(int[] array) {
        int suma = 0;
        // Sumar todos los valores del array
        for (int num : array) {
            suma += num;
        }
        return suma;
    }
}
