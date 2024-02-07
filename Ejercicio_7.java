import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        int[] factoresPrimos = descomponerEnFactoresPrimos(numero);

        System.out.println("Los factores primos de " + numero + " son:");
        for (int factor : factoresPrimos) {
            System.out.print(factor + " ");
        }
        scanner.close();
    }
    public static int[] descomponerEnFactoresPrimos(int numero) {
        ArrayList<Integer> factoresPrimos = new ArrayList<>();

        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                factoresPrimos.add(i);
                numero /= i;
            }
        }

        int[] resultado = new int[factoresPrimos.size()];
        for (int i = 0; i < factoresPrimos.size(); i++) {
            resultado[i] = factoresPrimos.get(i);
        }

        return resultado;
    }
}
