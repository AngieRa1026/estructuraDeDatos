
import java.util.Scanner;

public class Ejercicio3CalificacionesMultidimensionales {
        static Scanner scanner = new Scanner(System.in);
        static double[][] calificaciones = new double[3][3];
        static String[] estudiante = {"Estudiante 1", "Estudiante 2", "Estudiante 3"};

        public static void main(String[] args) {
        cargarCalificaciones();
        mostrarResultados();
        

    }    public static void cargarCalificaciones() {
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("\nIngresando notas para: " + estudiante[i]);
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print("Materia " + (j + 1) + ": ");
                calificaciones[i][j] = scanner.nextDouble();
            }
        }
    }
    public static void mostrarResultados() {
        double mejorPromedio = -1;
        String mejorEstudiante = "";

        System.out.println("\n--- REPORTE ACADÉMICO ---");
        
        for (int i = 0; i < calificaciones.length; i++) {
            double suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
            }
            
            
            double promedio = suma / calificaciones[i].length;
            System.out.println(estudiante[i] + " | Promedio: " + promedio);

            
            if (promedio < 3.0) {
                System.out.println("ALERTA: Riesgo Académico.");
            }

            
            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejorEstudiante = estudiante[i];
            }
        }

        System.out.println("\n El mejor estudiante es: " + mejorEstudiante + " con " + mejorPromedio);
    }
}