import java.util.Random;
import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la dimensión de la matriz cuadrada: ");
        int dimension = scanner.nextInt();

        int[][] matriz = generarMatrizSimetrica(dimension);

        System.out.println("La matriz simétrica generada es:");
        imprimirMatriz(matriz);

        scanner.close();
    }

    public static int[][] generarMatrizSimetrica(int dimension) {
        Random random = new Random();
        int[][] matriz = new int[dimension][dimension];


        for (int i = 0; i < dimension; i++) {
            matriz[i][i] = random.nextInt(10);
        }


        for (int i = 0; i < dimension; i++) {
            for (int j = i + 1; j < dimension; j++) {
                matriz[i][j] = matriz[j][i];
            }
        }

        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
