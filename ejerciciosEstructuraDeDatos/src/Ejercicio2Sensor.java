import java.util.Scanner;

public class Ejercicio2Sensor {
    static Scanner scanner = new Scanner(System.in);
    static double[][] temperatura = new double[3][3];

    public static void main(String[] args) {
        cargarTemperatura();
        System.out.println("\n--- Resultados por Zona ---");
        promedioPorZona();
        System.out.println("\n--- Resultado General ---");
        System.out.println("Promedio General de la planta: " + promedioGeneral());
    }

    public static void cargarTemperatura() {
        for (int i = 0; i < temperatura.length; i++) {
            for (int j = 0; j < temperatura[i].length; j++) {
                System.out.print("Zona " + (i + 1) + " - Sensor " + (j + 1) + ": ");
                temperatura[i][j] = scanner.nextDouble();
            }
        }
    }

    public static void promedioPorZona() {
        for (int i = 0; i < temperatura.length; i++) {
            double suma = 0;
            for (int j = 0; j < temperatura[i].length; j++) {
                suma += temperatura[i][j];
            }
            double promedio = suma / temperatura[i].length;
            System.out.println("Promedio de la Zona " + (i + 1) + ": " + promedio);
        }
    }

    public static double promedioGeneral() {
        double suma = 0;
        for (int i = 0; i < temperatura.length; i++) {
            for (int j = 0; j < temperatura[i].length; j++) {
                suma += temperatura[i][j];
            }
        }
        return suma / (temperatura.length * temperatura[0].length);
    }
}