import java.util.Scanner;

public class Ejercicio2Sensor {
    Scanner scanner = new Scanner(System.in);
    double[][] temperatura;
    
    public void cargarTemperatura() {
        for (int i = 0; i < temperatura.length; i++) {
            for (int j = 0; j < temperatura[i].length; j++) {
                System.out.print("Zona " + (i + 1) + " - Sensor " + (j + 1) + ": ");
                temperatura[i][j] = scanner.nextDouble();
            }
        }
    }
    public void promedioPorZona() {
        for (int i = 0; i < temperatura.length; i++) {
            double suma = 0;
            for (int j = 0; j < temperatura[i].length; j++) {
                suma += temperatura[i][j];
            }
            double promedio = suma / temperatura[i].length;
            System.out.println("Promedio de la Zona " + (i + 1) + ": " + promedio);
        }
    }
    public double promedioGeneral(){
        double suma = 0;
        for (int i = 0; i < temperatura.length; i++) {
            for (int j = 0; j < temperatura[i].length; j++) {
                suma += temperatura[i][j];
    
    }
        }
        return suma / (temperatura.length * temperatura[0].length);
    }
}
    

