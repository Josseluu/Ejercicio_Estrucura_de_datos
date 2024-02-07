import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la dimensión de los vectores: ");
        int N = scanner.nextInt();

        int[] vector1 = leerVector(N);
        int[] vector2 = leerVector(N);

        int productoEscalar = calcularProductoEscalar(vector1, vector2);

        System.out.println("El producto escalar de los dos vectores es: " + productoEscalar);

        scanner.close();
    }

    public static int[] leerVector(int N) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los " + N + " elementos del vector separados por espacios:");
        int[] vector = new int[N];
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextInt();
        }
        return vector;
    }

    public static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            throw new IllegalArgumentException("Los vectores deben tener la misma longitud.");
        }

        int productoEscalar = 0;
        for (int i = 0; i < vector1.length; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }
        return productoEscalar;
    }
}
