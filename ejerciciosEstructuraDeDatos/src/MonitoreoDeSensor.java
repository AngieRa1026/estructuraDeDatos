
import java.util.Scanner;

public class MonitoreoDeSensor {
    Scanner scanner = new Scanner(System.in);
    
    double [][] temperatura = new double[3][3];
    public void cargarTemperatura(){
        for (int i = 0; i < temperatura.length; i++) {
            for (int j = 0; j < temperatura[i].length; j++) {
                System.out.println("Ingrese la temperatura de la zona " + (i+1) + " Ingrese la temperatura del sensor " + (j+1));
                temperatura[i][j] = scanner.nextDouble();
            }
        }

    System.out.println("el promedio por zona es: " + promedioZona());.
    System.out.println("El promedio general es: " + promedioGeneral());
    }
    public double promedioZona(){
        double suma = 0;
        for (int i = 0; i < temperatura.length; i++) {
            

            }
        }
        
    }

    

    public double promedioGeneral(){
        double suma = 0;
        for (int i = 0; i < temperatura.length; i++) {
            for (int j = 0; j < temperatura[i].length; j++) {
                suma += temperatura[i][j];
    
    }
        return suma / (temperatura.length * temperatura[0].length);
    }
}
    




















