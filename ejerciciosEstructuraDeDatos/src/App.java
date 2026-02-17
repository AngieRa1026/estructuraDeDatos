import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notas[] = new double [10];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota del estudiante" + i);
            notas[i] = scanner.nextDouble();
        }
        System.out.println("El promedio de las notas es: " + promedio(notas));
    }
    public static double promedio(double []notas){
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }
}
