import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        int[] numeros = recibirNumeros();

        if (numeros.length == 0) {
            System.out.println("No se han introducido números.");
            return;
        }

        double media = calcularMedia(numeros);
        int minimo = calcularMinimo(numeros);
        int maximo = calcularMaximo(numeros);

        System.out.println("La media de los números introducidos es: " + media);
        System.out.println("El mínimo de los números introducidos es: " + minimo);
        System.out.println("El máximo de los números introducidos es: " + maximo);
    }

    public static int[] recibirNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce números enteros (introduce 0 para terminar):");

        int capacidadInicial = 10;
        int[] numeros = new int[capacidadInicial];
        int cantidadNumeros = 0;

        while (true) {
            int numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            if (cantidadNumeros == numeros.length) {
                // Si el array se llena, se duplica su capacidad
                numeros = redimensionarArray(numeros);
            }
            numeros[cantidadNumeros] = numero;
            cantidadNumeros++;
        }


        numeros = redimensionarArray(numeros, cantidadNumeros);

        return numeros;
    }

    public static double calcularMedia(int[] numeros) {
        if (numeros.length == 0) {
            return 0;
        }

        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        return (double) suma / numeros.length;
    }

    public static int calcularMinimo(int[] numeros) {
        if (numeros.length == 0) {
            return Integer.MIN_VALUE;
        }

        int minimo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        return minimo;
    }

    public static int calcularMaximo(int[] numeros) {
        if (numeros.length == 0) {
            return Integer.MAX_VALUE;
        }

        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        return maximo;
    }

    public static int[] redimensionarArray(int[] array) {
        int nuevaCapacidad = array.length * 2;
        int[] nuevoArray = new int[nuevaCapacidad];
        System.arraycopy(array, 0, nuevoArray, 0, array.length);
        return nuevoArray;
    }

    public static int[] redimensionarArray(int[] array, int nuevoTamano) {
        int[] nuevoArray = new int[nuevoTamano];
        System.arraycopy(array, 0, nuevoArray, 0, nuevoTamano);
        return nuevoArray;
    }
}
