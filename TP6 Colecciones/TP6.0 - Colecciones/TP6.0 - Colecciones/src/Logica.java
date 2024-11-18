import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Logica {

    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();

    public static boolean regresarMenu() {
        //Creamos un metodo para invocar la salida al menú principal.
        //Le solicitamos al usuario que ingrese la opción deseada.
        System.out.println("" +
                "\n¿Desea regresar al menú principal?" +
                "\n* Sí" +
                "\n* No");
        String opcionRegreso = sc.nextLine();

        System.out.println("");

        return opcionRegreso.equalsIgnoreCase("si");
    }

    public static void opcion1() {
        //Punto 1.
        boolean escape = false;
        int numero;

        while (!escape) {
            //Creamos una lista vacía.
            ArrayList<Integer> listaNumerica = new ArrayList<Integer>();

            //Le solicitamos al usuario que ingrese un número.
            System.out.println("Ingrese un número (al ingresar un número menor a cero se saldrá): ");

            do {
                numero = sc.nextInt();
                listaNumerica.add(numero);
            } while (numero != 0);

            sc.nextLine();

            System.out.println("");
            System.out.println(listaNumerica);

            //Invocamos el metodo para regresar al menú principal.
            escape = regresarMenu();
        }
    }

    public static void opcion2() {
        //Punto 2
        boolean escape = false;

        while (!escape) {
            ArrayList<Double> listaDecimales = new ArrayList<Double>();
            int contador = 0;

            //Le solicitamos al usuario que ingrese 20 decimales.
            System.out.println("Ingrese 20 numeros decimales: ");

            while (contador < 20) {
                double numeroIngresado = sc.nextDouble();
                listaDecimales.add(numeroIngresado);

                contador++;
            }

            sc.nextLine();

            //Buscamos el elemento mayor y menor de la colección.
            double numMayor = Double.MIN_VALUE;
            double numMenor = Double.MAX_VALUE;

            for (int i = 0; i < listaDecimales.size(); i++) {

                //Buscamos el elemento mayor.
                if (numMayor < listaDecimales.get(i)) {
                    numMayor = listaDecimales.get(i);
                }

                //Buscamos el elemento menor.
                if (numMenor > listaDecimales.get(i)) {
                    numMenor = listaDecimales.get(i);
                }
            }
            System.out.println("");

            //Imprimimos los resultados al usuario.
            System.out.println(" === Lista de los decimales ingresados === " +
                    "\n" +
                    "\n" + listaDecimales +
                    "\n" +
                    "\n* El elemento mayor es:                  " + numMayor +
                    "\n* El elemento menor es:                  " + numMenor +
                    "\n* El rango entre ambos elementos es:     " + (numMayor - numMenor));

            //Invocamos el metodo para regresar al menú principal.
            escape = regresarMenu();
        }
    }

    public static void opcion3() {
        boolean escape = false;

        while (!escape) {
            //Creamos una lista vacía.
            ArrayList<Integer> numerosPares = new ArrayList<Integer>();
            int contador = 0;

            while (contador < 20) {
                int numPar = rd.nextInt(1, 100);

                //Comprobamos que el número ingresado por el usuario sea un número par.
                if (numPar % 2 == 0) {
                    numerosPares.add(numPar);
                    contador++;
                }
            }

            //Calculamos el promedio.
            int sumaPromedio = 0;

            for (int i = 0; i < numerosPares.size(); i++) {
                sumaPromedio = sumaPromedio + numerosPares.get(i);
            }

            double promedio = sumaPromedio / numerosPares.size();

            //Contamos cuantos números son mayores, iguales y menores que el númeroo promedio.
            int igualPromedio = 0;
            int mayorPromedio = 0;
            int menorPromedio = 0;

            for (int i = 0; i < numerosPares.size(); i++) {
                if (promedio == numerosPares.get(i)) {
                    igualPromedio++;
                } else if (promedio > numerosPares.get(i)) {
                    menorPromedio++;
                } else if (promedio < numerosPares.get(i)) {
                    mayorPromedio++;
                }
            }

            //Imprimimos los resultados al usuario.
            System.out.println(" === Lista de los decimales ingresados === " +
                    "\n" +
                    "\n" + numerosPares +
                    "\n" +
                    "\n* El valor promedio es:                  " + promedio +
                    "\n* Los valores mayores al promedio es:    " + mayorPromedio +
                    "\n* Los valores menores al promedio es:    " + menorPromedio +
                    "\n* Los valores iguales al promedio es:    " + igualPromedio);

            //Invocamos al método de salida.
            escape = regresarMenu();
        }
    }

    public static void opcion4() {
        boolean escape = false;

        while (!escape) {
            //Creamos una colección vacía.
            ArrayList<Integer> valoresAleatorios = new ArrayList<Integer>();
            int contador = 0;

            //Rellenamos la colección con números aleatorios entre 1 y 100.
            while (contador < 50) {
                valoresAleatorios.add(rd.nextInt(1, 100));
                contador++;
            }

            System.out.println(valoresAleatorios);
            System.out.println("");

            //Le solicitamos al usuario que ingrese un número entre 1 y 100.
            System.out.println("Ingrese un numero entre 1 y 100: ");
            int userNum = sc.nextInt();

            sc.nextLine();

            System.out.println("");

            //Buscamos el número ingresado en la colección.
            boolean numEncontrado = false;

            for (int i = 0; i < valoresAleatorios.size(); i++) {
                if (userNum == valoresAleatorios.get(i)) {
                    System.out.println("El valor ingresado " + userNum + " ha sido encontrado en la posición: " + i);
                    numEncontrado = true;
                }
            }

            if (!numEncontrado) {
                System.out.println("El numero ingresado " + userNum + " no se encuentra en la colección.");
            }

            //Invocamos el metodo para regresar al menú principal.
            escape = regresarMenu();
        }
    }

    public static void opcion5() {
        boolean escape = false;

        while (!escape) {
            ArrayList<Integer> numerosIngresados = new ArrayList<Integer>();
            int contador = 0;

            //Le solicitamos al usuario que ingrese 10 números enteros.
            System.out.println("Ingrese 10 números enteros: ");

            while (contador < 10) {
                int userNum = sc.nextInt();
                numerosIngresados.add(userNum);
                contador++;
            }

            sc.nextLine();

            System.out.println("");

            //Imprimimos la colección completa al usuario.
            System.out.println("Colección original: " + numerosIngresados);

            //Ordenamos de manera ascendente la colección e imprimimos.
            Collections.sort(numerosIngresados);
            System.out.println("Orden Ascendente:   " + numerosIngresados);

            //Ordenamos de manera descendente la colección e imprimimos.
            Collections.sort(numerosIngresados, Collections.reverseOrder());
            System.out.println("Orden Descendente:  " + numerosIngresados);

            //Invocamos el metodo para regresar al menú principal.
            escape = regresarMenu();
        }
    }

    public static void opcion6() {
        boolean escape = false;

        while (!escape) {
            Matriz matriz = new Matriz();

            while (true) {
                //Le solicitamos al usuario el ingreso de un valor.
                System.out.println("Ingrese el valor de la celda o escriba 'fin' para salir: ");
                String valor = sc.nextLine();

                //Comprobamos si el usuario quiere finalizar el programa.
                if (valor.equalsIgnoreCase("fin")) {
                    break;
                }

                System.out.println("");

                 //Le solicitamos al usuario el ingreso de la fila.
                 System.out.print("Ingrese la fila: ");
                 int fila = sc.nextInt();

                 //Le solicitamos al usuario el ingreso de la columna.
                 System.out.print("Ingrese la columna: ");
                 int columna = sc.nextInt();

                 System.out.println("");

                 sc.nextLine();

                 matriz.agregarCelda(fila, columna, valor);
            }

             //Imprimimos las celdas que ya han sido almacenadas.
             System.out.println("\nTodas las celdas almacenadas: " +
                     "\n");
             matriz.mostrarCeldas();

             //Le solicitamos al usuario la fila de la celda.
             System.out.print("\nIngrese la fila a buscar: ");
             int buscarFila = sc.nextInt();

             //Le solicitamos al usuario la columna de la celda.
             System.out.print("Ingrese la columna a buscar: ");
             int buscarColumna = sc.nextInt();

             //Le imprimimos al usuario el resultado de la búsqueda.
             String resultado = matriz.obtenerValor(buscarFila, buscarColumna);
             System.out.println("Resultado: " + resultado);

             sc.nextLine();

             //Invocamos el metodo para regresar al menú principal.
             escape = regresarMenu();
        }
    }
}
