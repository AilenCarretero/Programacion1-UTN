import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filas, columnas;

        // Solicitar el tamaño de la matriz
        do {
            System.out.println("Ingrese el número de filas (mínimo 3): ");
            filas = scanner.nextInt();
        } while (filas < 3);

        do {
            System.out.println("Ingrese el número de columnas (mínimo 2): ");
            columnas = scanner.nextInt();
        } while (columnas < 2);

        // Crear la matriz de tamaño filas x columnas
        double[][] matriz = new double[filas][columnas];

        // Solicitar los valores para llenar la matriz
        System.out.println("Ingrese los valores para la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Valor en la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        // Generar la matriz de sumatorias (N filas x 1 columna)
        double[][] sumatorias = new double[filas][1];

        // Calcular la sumatoria de cada fila y almacenarla en la matriz de sumatorias
        for (int i = 0; i < filas; i++) {
            double sumaFila = 0;
            for (int j = 0; j < columnas; j++) {
                sumaFila += matriz[i][j];
            }
            sumatorias[i][0] = sumaFila;
        }

        // Crear una nueva matriz para almacenar los resultados ordenados
        double[][] matrizOrdenada = new double[filas][2];

        // Rellenar la matriz con sumatorias y los índices originales (filas)
        for (int i = 0; i < filas; i++) {
            matrizOrdenada[i][0] = sumatorias[i][0]; // valor de la sumatoria
            matrizOrdenada[i][1] = i;                // índice de la fila original
        }

        // Ordenar la matrizOrdenada por la primera columna (sumatorias) de mayor a menor
        Arrays.sort(matrizOrdenada, (a, b) -> Double.compare(b[0], a[0]));

        // Mostrar la matriz ordenada
        System.out.println("\nLa nueva matriz ordenada es (sumatoria | índice original):");
        for (int i = 0; i < filas; i++) {
            System.out.println(matrizOrdenada[i][0] + "\t" + (int)matrizOrdenada[i][1]);
        }

        // Sumar los elementos de la columna 1 de la matriz ordenada
        double sumaTotal = 0;
        for (int i = 0; i < filas; i++) {
            sumaTotal += matrizOrdenada[i][0];
        }

        // Mostrar el resultado de la sumatoria
        System.out.println("\nLa sumatoria de los elementos de la columna 1 es: " + sumaTotal);

        scanner.close();
    }
}
