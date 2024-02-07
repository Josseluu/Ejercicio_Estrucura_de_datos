public class Ejercicio_1 {
    public static void main(String[] args) {

        int diasEnAnio = 365;
        int horasEnDia = 24;
        int minutosEnHora = 60;
        int segundosEnMinuto = 60;


        int segundosEnAnio = calcularSegundosEnAnio(diasEnAnio, horasEnDia, minutosEnHora, segundosEnMinuto);


        System.out.println("El número de segundos en un año es: " + segundosEnAnio);
    }

    public static int calcularSegundosEnAnio(int dias, int horas, int minutos, int segundos) {

        int segundosEnAnio = dias * horas * minutos * segundos;
        return segundosEnAnio;
    }
}
