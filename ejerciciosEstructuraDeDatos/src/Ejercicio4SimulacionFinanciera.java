
import java.util.Scanner;

public class Ejercicio4SimulacionFinanciera {
    
static double[][] matrizBanco = new double[3][5];
    static String[] clientes = {"Usuario 1", "Usuario 2", "Usuario 3"};
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        cargarDatos();
        analizarResultados();
    }

    public static void cargarDatos() {
        System.out.println("--- Registro de Saldos Diarios ---");
        for (int i = 0; i < matrizBanco.length; i++) {
            System.out.println("Cliente: " + clientes[i]);
            for (int j = 0; j < matrizBanco[i].length; j++) {
                System.out.print("  Día " + (j + 1) + ": ");
                matrizBanco[i][j] = scanner.nextDouble();
            }
        }
    }

    public static void analizarResultados() {
        System.out.println("\n--- REPORTE DE ANÁLISIS BANCARIO ---");

        for (int i = 0; i < matrizBanco.length; i++) {
            double suma = 0;
            double maximo = matrizBanco[i][0];
            
            for (int j = 0; j < matrizBanco[i].length; j++) {
                suma += matrizBanco[i][j];
                if (matrizBanco[i][j] > maximo) {
                    maximo = matrizBanco[i][j];
                }
            }

            double promedio = suma / matrizBanco[i].length;

            double variacion = matrizBanco[i][matrizBanco[i].length - 1] - matrizBanco[i][0];

            System.out.println("\nCliente: " + clientes[i]);
            System.out.println(" > Promedio de saldo: $" + promedio);
            System.out.println(" > Saldo máximo alcanzado: $" + maximo);
            System.out.println(" > Variación neta semanal: $" + variacion);
        }
    }
}