import java.util.Scanner;
import java.util.Random;

public class Main {

    //Iniciamos el programa e invocamos inmediatamente el metodo para crear una matriz.
    public static void main(String[] args) {
        creacionMatriz();
    }

    //Punto 1
    public static void creacionMatriz() {
        //Instanciamos la clase Scanner y la asignamos a una variable llamada sc, que leerá los datos ingresados por la consola.
        Scanner sc = new Scanner(System.in);

        //Dec
        int x;
        int [][] matriz;

        do {
            //Le solicitamos al usuario que ingrese un número.
            System.out.print("Ingrese un número entre 3 y 15: ");
            x = sc.nextInt();
        } while (x < 3 || x > 15);

        //Creamos el array con el tamaño elegido por el usuario.
        matriz = new int[x][x];

        System.out.println("");

        //Punto 2
        Random rd = new Random();

        //Rellenamos la matriz.
        for(int i = 0; i < matriz.length -1; i++){
            for(int j = 0; (j < x) ; j++){
                matriz[i][j] = rd.nextInt(10,99) ;
            }
        }

        int ultimaFila = matriz.length - 1;

        for(int j = 0; (j < x) ; j++){
            int num;
            do {
                System.out.print("Ingrese un número para la ultima fila, posición " + j + ": ");
                num = sc.nextInt();
            } while (num < 10 || num > 99);
            matriz[ultimaFila][j] = num;
        }

        //Punto 3
        //Imprimimos la matriz.
        for(int i = 0; i < matriz.length; i++){
            System.out.println("");
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
        }

        System.out.println("");
        int[] valoresCentrales = obtenerValoresCentrales(matriz);

        for (int i = 0; i < valoresCentrales.length; i++) {
            System.out.print(valoresCentrales[i] + " ");
        }
    }

    //Punto 4
    public static int[] obtenerValoresCentrales(int[][] matriz){

        //Ubicamos el centro de la matriz,
        int centroMatriz = (int) matriz.length / 2;
        System.out.println(matriz[centroMatriz] [centroMatriz]);
        int [] array = new int[9];
        int arrayIndex = 0;

        for (int i = centroMatriz - 1; i < centroMatriz + 2; i++) {
            for (int j = centroMatriz - 1; j < centroMatriz + 2; j++) {
                int valor = matriz[i][j];
                array[arrayIndex++] = valor;
            }
        }

        return array;
    }
}