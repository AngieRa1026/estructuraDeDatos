import java.util.Scanner;

public class Ejercicio1DatosAcademicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notas[] = new double [10];

        for (byte i = 1; i < notas.length; i++) {
            System.out.println("Ingrese la nota del estudiante " + i);
            notas[i] = scanner.nextDouble();

            if (notas[i] < 0 || notas[i] > 10) {
                System.out.println("La nota debe estar entre 0 y 10. Ingrese nuevamente.");
                i--;
                continue;
            }
        }
        
        System.out.println("El promedio de las notas es: " + promedio(notas));
        System.out.println("La nota mayor es: " + notaMayor(notas));
        System.out.println("La nota menor es: " + notaMenor(notas));
        System.out.println("La cantidad de estudiantes aprobados es: " + estudiantesAprobados(notas));
    }
    public static double promedio(double []notas){
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }
    public static double notaMayor(double []notas){
        double mayor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
        }
        return mayor;
    }
    public static double notaMenor(double []notas){
        double menor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        return menor;
    }
    public static byte estudiantesAprobados(double []notas){
        byte aprobados = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 6) {
                aprobados++;
            }
        }
        return aprobados;
    }
}
