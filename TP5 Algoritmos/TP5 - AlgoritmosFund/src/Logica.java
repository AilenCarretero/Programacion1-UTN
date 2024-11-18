import java.util.Scanner;
import java.util.Arrays;

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

    public static void opcion1() {
        //Punto 2 y 3
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            int[] array = new int[10];

            //Le solicitamos al usuario que ingrese 10 números.
            System.out.println("Ingrese 10 números: ");
            for (int i = 0; i < 10; i++) {
                array[i] = sc.nextInt();
            }

            System.out.println("");

            System.out.println("Seleccione un método de ordenado: " +
                    "\n" +
                    "\n1.   Insertion Sort." +
                    "\n2.   Bubble Sort" +
                    "\n3.   Selection Sort" +
                    "\n4.   Linear Search" +
                    "\n" +
                    "\n0.   Salir");

            String rta = sc.nextLine();

            switch (rta) {
                case "0":
                    Main.menu();
                    break;
                case "1":
                    insertionSort(array);
                    break;
                case "2":
                    bubbleSort(array);
                    break;
                case "3":
                    selectionSort(array);
                    break;
                case "4":
                    sequentialSearch(array);
                    break;
            }
        }
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Mueve los elementos mayores que el key una posición adelante
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambia arr[j] con arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Intercambia arr[i] con el mínimo encontrado
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    public static int sequentialSearch(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int target;
            if (arr[i] == target) {
                return i; // Devuelve el índice si se encuentra el elemento
            }
        }
        return -1; // Devuelve -1 si no se encuentra el elemento
    }

    public static void opcion2() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];

        // 1. Cargar el array con 20 elementos
        System.out.println("Ingrese 20 números enteros:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Guardamos el array original para mostrarlo después
        int[] arrayOriginal = Arrays.copyOf(array, array.length);

        // 2. Solicitar el tipo de orden (ASC o DESC)
        System.out.println("¿Cómo desea ordenar el array? (ASC o DESC)");
        String orden = scanner.next().toUpperCase();

        // Validar entrada del orden
        while (!orden.equals("ASC") && !orden.equals("DESC")) {
            System.out.println("Opción no válida. Ingrese 'ASC' o 'DESC':");
            orden = scanner.next().toUpperCase();
        }

        // 3. Solicitar el método de ordenamiento (inserción, burbuja, selección)
        System.out.println("¿Qué método de ordenamiento desea usar? (inserción, burbuja, selección)");
        String metodo = scanner.next().toLowerCase();

        // Validar entrada del método
        while (!metodo.equals("inserción") && !metodo.equals("burbuja") && !metodo.equals("selección")) {
            System.out.println("Método no válido. Ingrese 'inserción', 'burbuja' o 'selección':");
            metodo = scanner.next().toLowerCase();
        }

        // 4. Aplicar el método de ordenamiento seleccionado
        switch (metodo) {
            case "inserción":
                insertionSort(array, orden);
                break;
            case "burbuja":
                bubbleSort(array, orden);
                break;
            case "selección":
                selectionSort(array, orden);
                break;
        }

        // 5. Mostrar array original y ordenado
        System.out.println("\nArray original desordenado: " + Arrays.toString(arrayOriginal));
        System.out.println("Array ordenado (" + orden + "): " + Arrays.toString(array));
    }

    public static void opcion3() {
        Scanner scanner = new Scanner(System.in);

        // 1. Solicitar las dimensiones de la matriz (filas y columnas)
        int filas, columnas;

        do {
            System.out.print("Ingrese la cantidad de filas (mayor o igual a 2): ");
            filas = scanner.nextInt();
        } while (filas < 2);

        do {
            System.out.print("Ingrese la cantidad de columnas (mayor o igual a 2): ");
            columnas = scanner.nextInt();
        } while (columnas < 2);

        // 2. Crear la matriz de tamaño [filas, columnas]
        int[][] matriz = new int[filas][columnas];

        // 3. Solicitar al usuario que ingrese los números para cargar la matriz
        System.out.println("Ingrese los números enteros para cargar la matriz:");
        int suma = 0;  // Variable para sumar todos los elementos de la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                suma += matriz[i][j];  // Acumular la suma de los elementos
            }
        }

        // 4. Calcular el promedio entero de los elementos
        int totalElementos = filas * columnas;
        int promedio = suma / totalElementos;

        System.out.println("El promedio entero de los elementos de la matriz es: " + promedio);

        // 5. Determinar si el promedio se encuentra en alguna de las celdas
        boolean encontrado = false;
        System.out.println("Buscando el promedio en la matriz...");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == promedio) {
                    System.out.println("Promedio encontrado en la posición [" + i + "][" + j + "]");
                    encontrado = true;
                }
            }
        }

        // 6. Si no se encontró el promedio, mostrar mensaje
        if (!encontrado) {
            System.out.println("No se encontró ninguna coincidencia.");
        }

        scanner.close();
    }

}
