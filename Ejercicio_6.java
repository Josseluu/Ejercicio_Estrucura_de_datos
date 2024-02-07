
import java.util.Arrays;

public class Ejercicio_6 {
    public static void main(String[] args) {
        int N = 10;
        int[] primerosPrimos = encontrarPrimos(N);

        System.out.println("Los primeros " + N + " números primos son:");
        System.out.println(Arrays.toString(primerosPrimos));
    }

    public static int[] encontrarPrimos(int N) {
        int[] primos = new int[N];
        int count = 0;
        int num = 2;

        while (count < N) {
            if (esPrimo(num)) {
                primos[count] = num;
                count++;
            }
            num++;
        }

        return primos;
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
