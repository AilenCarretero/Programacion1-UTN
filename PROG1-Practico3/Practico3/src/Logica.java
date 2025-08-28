import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Logica {

    private static boolean regresarMenu() {
        //Creamos un método para invocar la salida al menú principal.
        Scanner sc = new Scanner(System.in);
        System.out.println("" +
                "\n¿Desea regresar al menú principal?" +
                "\n* Sí" +
                "\n* No");
        String rta = sc.nextLine();
        System.out.println("");
        Main.delay();
        return rta.equalsIgnoreCase("si");
    }

    // Punto 2: Creación y llenado de un Array.
    public static void opcion1() {
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            int [] array = new int[5];

            System.out.println("Ingrese 5 números: ");

            for (int i=0; i < array.length; i++){
                System.out.print((i + 1) + ". ");
                array[i] = sc.nextInt();
            }

            System.out.println("");

            System.out.println(Arrays.toString(array));

            esc = regresarMenu();
        }
    }

    // Punto 3: Llenando un Array con múltiplos.
    public static void opcion2() {
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            System.out.println("Ingrese el tamaño para el Array: ");
            int tamano = sc.nextInt();
            int [] array = new int[tamano];

            System.out.println("");

            System.out.println("Ingrese un número entero para calcular los múltiplos: ");
            int num = sc.nextInt();

            for (int i = 0; i < array.length; i++){
                array[i] = num * (i + 1);
            }
            System.out.println("");

            System.out.println("Los múltiplos de " + num + " son: "+ Arrays.toString(array));

            esc = regresarMenu();
        }

    }

    // Punto 4: Buscar el decimal mayor y el menor.
    public static void opcion3() {
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            Double[] array = new Double[20];
            double mayor = 0, menor = 0, rango;

            System.out.println("Ingrese 20 número decimales: ");

            for (int i = 0; i < array.length; i++ ) {
                System.out.print((i + 1) + ". ");
                array[i] = sc.nextDouble();

                if (array[i] > mayor){
                    mayor = array[i];
                    menor = mayor;
                }
            }

            for (int i = 0; i < array.length; i++) {
                if (array[i] < menor){
                    menor = array[i];
                }
            }

            rango = mayor - menor;

            System.out.println("El mayor numero de los ingresados es:   " + mayor);
            System.out.println("El menor numero de los ingresados es:   " + menor);
            System.out.println("El rango entre los números " + mayor + " y " + menor + " es:    " + rango);

            esc = regresarMenu();
        }
    }

    // Punto 5: Promedios de los números pares en el Array.
    public static void opcion4() {
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            int[] array = new int[20];
            int suma = 0;

            for (int i = 0; i < array.length; i++) {
                int numRandom = (int) (Math.random() * 100) + 1;

                if(numRandom % 2 == 0){
                    array[i] = numRandom;
                }else {
                    array[i] = numRandom + 1;
                }
                suma += array[i];
            }

            int promedio = suma / array.length;

            int igualPromedio = 0;
            int mayorPromedio = 0;
            int menorPromedio = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] == promedio) {
                    igualPromedio++;
                } else if (array[i] > promedio) {
                    mayorPromedio++;
                } else {
                    menorPromedio++;
                }
            }

            System.out.println("");

            System.out.println("Array:          "+ Arrays.toString(array) +
                    "\n" +
                    "\nPromedio:    " + promedio +
                    "\n" +
                    "\nMayor que el promedio:   " + mayorPromedio +
                    "\nIgual que el promedio:   " + igualPromedio +
                    "\nMenor que el promedio:   " + menorPromedio);

            esc = regresarMenu();
        }
    }

    // Punto 6: Búsqueda de un número en el Array.
    public static void opcion5() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean esc = false;

        while (!esc) {
            int [] array = new int [50];

            for(int i = 0; i<array.length; i++){
                array[i]= random.nextInt(100);
            }

            System.out.println(Arrays.toString(array));

            System.out.println("");

            System.out.println("Ingrese el número que desee buscar: ");
            int num = sc.nextInt();

            System.out.println("");

            boolean encon = false;

            for(int i = 0; i < array.length; i++){
                if (num == array[i]){
                    System.out.println("El número " + num + " se encuentra en la posición: " + i);
                    encon = true;
                }
            }

            if(!encon){
                System.out.println("El número ingresado no se encuentra en el Array.");
            }

            esc = regresarMenu();
        }
    }

    // Punto 7: Suma de pares e impares del Array.
    public static void opcion6() {
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            int [] array = new int[20];
            int par = 0;
            int impar = 0;

            System.out.println("Ingrese 20 números: ");

            for(int i = 0; i < array.length; i++) {
                System.out.print((i + 1) + ". ");
                array[i]=sc.nextInt();

                if(array[i]%2==0){
                    par += array[i];
                }else{
                    impar += array[i];
                }
            }

            System.out.println("" +
                    "\nArray:   " + Arrays.toString(array) +
                    "\n" +
                    "\nTotal de la suma de los n° pares:        " + par +
                    "\nTotal de la suma de los n° impares:      " + impar);

            esc = regresarMenu();
        }
    }

    // Punto 8: Ordenando un Array de diferentes maneras.
    public static void opcion7() {
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            int dim = 10;
            int [] array = new int[dim];

            System.out.println("Ingrese 10 numeros enteros: ");
            for(int i = 0; i < array.length; i++) {
                System.out.print((i + 1) + ". ");
                array[i] = sc.nextInt();

            }

            int [] desc = new int[dim];
            int [] asc;

            asc = array;

            for(int i = 0; i < array.length; i++){
                desc[(dim-1)-i] = asc[i];
            }

            System.out.println("Ascendente:     " + Arrays.toString(asc) +
                    "\nDescendente:     " + Arrays.toString(desc));

            esc = regresarMenu();
        }
    }

    // Punto 9: Covertir una cadena en arreglo y calcular promedio.
    public static void opcion8() {
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            System.out.println("Ingrese una cadena de números separadas por guiones: ");
            String str = sc.nextLine();

            String [] numStr = str.split("-");
            int [] numInt = new int [numStr.length];
            int suma = 0;
            double promedio = 0;


            for(int i = 0; i < numStr.length;i++){
                numInt[i] = Integer.parseInt(numStr[i]);
                suma+= numInt[i];
            }
            promedio = suma / numInt.length;

            System.out.println("");

            System.out.println("La suma total es:            " + suma +
                    "\nEl promedio total es:        " + promedio);

            esc = regresarMenu();
        }
    }

    // Punto 10: Buscar la letra del DNI.
    public static void opcion9() {
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            System.out.println("Ingrese su DNI: ");
            long dni = sc.nextLong();

            char [] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
            int resto = (int) dni % 23;
            String dniToString = String.valueOf(dni);

            String dniLetras = obtenerLetra(resto, letras, dniToString);
            System.out.println("DNI con letra: " + dniLetras);

            esc = regresarMenu();
        }

    }
    public static String obtenerLetra (int resto, char[]letras, String dniToString) {

        char letra = letras[resto];
        String letraToString = String.valueOf(letra);
        return dniToString + letraToString;
    }

    // Punto 11: Sumar los elementos de dos Arrays.
    public static void opcion10() {
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            int[] array1 = new int[5];
            System.out.println("Ingrese 5 números: ");
            for(int i = 0; i < array1.length; i++){
                System.out.print((i + 1) + ". ");
                array1[i] = sc.nextInt();
            }

            int[] array2 = new int[10];
            System.out.println("Ingrese 10 números: ");
            for(int i = 0; i < array2.length; i++){
                System.out.print((i + 1) + ". ");
                array2[i] = sc.nextInt();
            }

            int[] array3 = new int[5];
            for(int i = 0; i < array1.length; i++){
                array3[i] = 0;
                for(int j = 0; j < array2.length; j++){
                    array3[i] += array1[i] * array2[j];
                }
            }

            System.out.println();
            System.out.println("Primer array:       " + Arrays.toString(array1));
            System.out.println("Segundo array:      " + Arrays.toString(array2));
            System.out.println("Resultado final:    " + Arrays.toString(array3));

            esc = regresarMenu();
        }

    }

    // Punto 12: Eliminar un elemento del Array.
    public static void opcion11() {
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            int[] array = new int[10];

            System.out.println("Ingrese 10 números: ");

            for(int i = 0; i < array.length; i++){
                System.out.print((i + 1) + ". ");
                array[i] = sc.nextInt();
            }

            System.out.println();

            System.out.println(Arrays.toString(array));

            System.out.println();

            System.out.println("Ingrese un número que desee eliminar: ");
            int supr = sc.nextInt();

            int cont = 0;

            for(int i = 0; i < array.length; i++){
                if(array[i] != supr){
                    cont++;
                }
            }

            int[] array2 = new int[cont];
            int index = 0;

            for(int i = 0; i < array.length; i++){
                if(array[i] != supr){
                    array2[index++] = array[i];
                }
            }

            System.out.println("");

            System.out.println(Arrays.toString(array2));

            esc = regresarMenu();
        }
    }
}