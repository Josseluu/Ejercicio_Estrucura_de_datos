
public class Ejercicio_5 {
    public static void main(String[] args) {
        int N = 10;
        int[][] tablasDeMultiplicar = generarTablasDeMultiplicar(N);

        for (int i = 1; i <= N; i++) {
            System.out.println("Tabla de multiplicar del número " + i + ":");
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + tablasDeMultiplicar[i - 1][j]);
            }
            System.out.println();
        }
    }

    public static int[][] generarTablasDeMultiplicar(int N) {
        int[][] tablas = new int[N][10];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 10; j++) {
                tablas[i][j] = (i + 1) * j;
            }
        }

        return tablas;
    }
}
