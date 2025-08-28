package Parte1;

import java.util.Scanner;

public class Structure {

    // Punto 1: Casteo de un decimal (double) a: short, int, long, String y float.
    // Punto 5: Convertir un número a String usando String.valueOf.
    public static void casteoDecimal() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un número decimal (double): ");
            double numeroDecimal = sc.nextDouble();

            short numeroShort = (short) numeroDecimal;
            int numeroInt = (int) numeroDecimal;
            long numeroLong = (long) numeroDecimal;
            String numeroString = String.valueOf(numeroDecimal);
            float numeroFloat = (float) numeroDecimal;
            sc.nextLine();

            System.out.println("Número casteado a short:  " + numeroShort);
            System.out.println("Número casteado a int:    " + numeroInt);
            System.out.println("Número casteado a long:   " + numeroLong);
            System.out.println("Número casteado a String: " + numeroString);
            System.out.println("Número casteado a float:  " + numeroFloat);

            System.out.print("¿Deseas volver al menú principal? (si/no): ");
            String salida = sc.nextLine();

            if (salida.equalsIgnoreCase("si")) {
                break;
            }
        }
    }

    // Punto 2: Asiganación de un valor fuera de rango (mayor a lo permitido) y forma de solucionarlo.
    public static void valorFueraDeRango() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese un número:");
            int numero = sc.nextInt();
            sc.nextLine();

            byte numeroByte = (byte) numero;
            System.out.println(numero + " a byte: " + numeroByte);

            System.out.print("¿Deseas volver al menú principal? (si/no): ");
            String salida = sc.nextLine();

            if (salida.equalsIgnoreCase("si")) {
                break;
            }
        }
    }

    // Punto 3: Suma de todos los dígitos de un número entero.
    public static void sumaDeDigitos() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un número entero: ");
            int numero = sc.nextInt();
            sc.nextLine();

            int suma = 0;
            int numeroOriginal = numero;

            while (numero != 0) {
                suma += numero % 10;
                numero /= 10;
            }

            System.out.println("La suma de los dígitos de " + numeroOriginal + " es: " + suma);

            System.out.print("¿Deseas volver al menú principal? (si/no): ");
            String salida = sc.nextLine();

            if (salida.equalsIgnoreCase("si")) {
                break;
            }
        }
    }

    // Punto 4: Caja registradora que indica qué billetes y moneda dar de cambio.
    public static void cajaRegistradora() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese el monto total a pagar: ");
            double montoTotal = sc.nextDouble();

            System.out.print("Ingrese el monto entregado por el cliente: ");
            double montoEntregado = sc.nextDouble();
            sc.nextLine();

            if (montoEntregado < montoTotal) {
                System.out.println("El monto entregado es insuficiente.");
                continue;
            }

            double cambio = montoEntregado - montoTotal;
            System.out.printf("El cambio a devolver es: %.2f\n", cambio);

            int[] billetes = {200, 100, 50, 20, 10, 5, 2, 1};
            double[] monedas = {0.50, 0.25, 0.10, 0.05};

            System.out.println("Billetes y monedas a devolver:");

            for (int billete : billetes) {
                int cantidad = (int) (cambio / billete);
                if (cantidad > 0) {
                    System.out.println(cantidad + " billete(s) de " + billete + "€");
                    cambio -= cantidad * billete;
                }
            }

            for (double moneda : monedas) {
                int cantidad = (int) (cambio / moneda);
                if (cantidad > 0) {
                    System.out.println(cantidad + " moneda(s) de " + moneda + "€");
                    cambio -= cantidad * moneda;
                }
            }

            if (cambio > 0) {
                System.out.printf("Cambio restante no devuelto: %.2f€\n", cambio);
            }

            System.out.print("¿Deseas volver al menú principal? (si/no): ");
            String salida = sc.nextLine();

            if (salida.equalsIgnoreCase("si")) {
                break;
            }
        }
    }

    // Punto 6: Indicar el tamaño de una cadena de texto.
    // Punto 7: Indicar el tamaño y contar las vocales.
    // Punto 8: Reemplazar todas las 'a' por 'e'.
    // Punto 9: Mostrar el valor ASCII de cada carácter.
    // Punto 10: Convertir la cadena a mayúsculas y minúsculas.
    // Punto 12: Extraer la cuarta y quinta letra de la cadena.
    public static void cadenaDeTexto() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese una cadena de texto (o presione Enter para usar 'Hola Mundo'): ");
            String texto = sc.nextLine();
            if (texto.isEmpty()) {
                texto = "La lluvia en Mendoza es escasa";
            }

            System.out.println("========== CADENA DE TEXTO ==========" +
                    "\n" +
                    "\n1. Contar los carácteres" +
                    "\n2. Contar todas las vocales" +
                    "\n3. Cadena inclusiva" +
                    "\n4. Transformamos a ASCII" +
                    "\n5. Convertir todo a mayúsculas" +
                    "\n6. Convertir todo a minúsculas" +
                    "\n7. Extraer cuarto y quinto carácter" +
                    "\n" +
                    "\n0. Salir al menú principal");

            System.out.print("Seleccione una opción (0-7): ");
            int opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("El tamaño de la cadena es: " + texto.length());
                    break;
                case 2:
                    int contadorVocales = 0;
                    for (char c : texto.toLowerCase().toCharArray()) {
                        if ("aeiou".indexOf(c) != -1) {
                            contadorVocales++;
                        }
                    }
                    System.out.println("La cantidad de vocales es: " + contadorVocales);
                    break;
                case 3:
                    String textoModificado = texto.replace('a', 'e').replace('A', 'E');
                    System.out.println("Texto modificado: " + textoModificado);
                    break;
                case 4:
                    StringBuilder asciiValues = new StringBuilder();
                    for (char c : texto.toCharArray()) {
                        asciiValues.append((int) c).append(" ");
                    }
                    System.out.println("Valores ASCII: " + asciiValues.toString().trim());
                    break;
                case 5:
                    System.out.println("Texto en mayúsculas: " + texto.toUpperCase());
                    break;
                case 6:
                    System.out.println("Texto en minúsculas: " + texto.toLowerCase());
                    break;
                case 7:
                    if (texto.length() >= 5) {
                        System.out.println("Cuarta y quinta letra: " + texto.substring(3, 5));
                    } else {
                        System.out.println("La cadena es demasiado corta para extraer la cuarta y quinta letra.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo al menú principal.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Punto 11: Pedir dos palabras y decir si son iguales o no.
    public static void palabrasGemelas() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese la primera palabra: ");
            String palabra1 = sc.nextLine();

            System.out.print("Ingrese la segunda palabra: ");
            String palabra2 = sc.nextLine();

            if (palabra1.equalsIgnoreCase(palabra2)) {
                System.out.println("Las palabras son iguales");
            } else {
                System.out.println("Las palabras no son iguales");
            }

            System.out.print("¿Deseas volver al menú principal? (si/no): ");
            String salida = sc.nextLine();

            if (salida.equalsIgnoreCase("si")) {
                break;
            }
        }
    }

    // Punto 13: Pedir una frase y una palabra, indicar si la palabra se encuentra dentro de la frase.
    public static void fraseInception() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese una frase: ");
            String frase = sc.nextLine().toLowerCase();

            System.out.print("Ingrese una palabra a buscar en la frase: ");
            String palabra = sc.nextLine().toLowerCase();

            if (frase.contains(palabra)) {
                System.out.println("La palabra '" + palabra + "' se encuentra dentro de la frase.");
            } else {
                System.out.println("La palabra '" + palabra + "' no se encuentra dentro de la frase.");
            }

            System.out.print("¿Deseas volver al menú principal? (si/no): ");
            String salida = sc.nextLine();

            if (salida.equalsIgnoreCase("si")) {
                break;
            }
        }
    }

    // Punto 14: Diferencia entre dato primitivo y dato por valor (objeto).
    // Punto 15: ¿Cómo asignar un valor null a un dato por valor?
    public static void primitivoVsPorValor() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Dato primitivo
            int numeroPrimitivo = 10;
            System.out.println("Dato primitivo antes de la función: " + numeroPrimitivo);
            modificarPrimitivo(numeroPrimitivo);
            System.out.println("Dato primitivo después de la función: " + numeroPrimitivo);

            // Dato por valor (objeto)
            Integer numeroObjeto = 10;
            System.out.println("Dato por valor antes de la función: " + numeroObjeto);
            modificarObjeto(numeroObjeto);
            System.out.println("Dato por valor después de la función: " + numeroObjeto);

            // Asignar null a un dato por valor (objeto)
            Integer numeroNull = null;
            System.out.println("Dato por valor asignado a null: " + numeroNull);

            System.out.print("¿Deseas volver al menú principal? (si/no): ");
            String salida = sc.nextLine();

            if (salida.equalsIgnoreCase("si")) {
                break;
            }
        }
    }
    public static void modificarPrimitivo(int num) {
        num += 5;
        System.out.println("Dentro de la función (primitivo): " + num);
    }
    public static void modificarObjeto(Integer num) {
        num += 5;
        System.out.println("Dentro de la función (objeto): " + num);
    }

    // Punto 21: Suma de todos los números entre el número ingresado y 1 (recursividad).
    public static void sumaRecursiva() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un número entero positivo: ");
            int numero = sc.nextInt();
            sc.nextLine();

            if (numero < 1) {
                System.out.println("Por favor, ingrese un número positivo mayor o igual a 1.");
                continue;
            }

            int suma = sumarHastaUno(numero);
            System.out.println("La suma de todos los números entre " + numero + " y 1 es: " + suma);

            System.out.print("¿Deseas volver al menú principal? (si/no): ");
            String salida = sc.nextLine();

            if (salida.equalsIgnoreCase("si")) {
                break;
            }
        }
    }
    public static int sumarHastaUno(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sumarHastaUno(num - 1);
    }

    // Punto 22: Suma de todos los dígitos de un número entero (recursividad).
    public static void sumaDeDigitosRecursiva() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un número entero positivo: ");
            int numero = sc.nextInt();
            sc.nextLine();

            if (numero < 0) {
                System.out.println("Por favor, ingrese un número positivo.");
                continue;
            }

            int suma = sumarDigitos(numero);
            System.out.println("La suma de los dígitos de " + numero + " es: " + suma);

            System.out.print("¿Deseas volver al menú principal? (si/no): ");
            String salida = sc.nextLine();

            if (salida.equalsIgnoreCase("si")) {
                break;
            }
        }
    }
    public static int sumarDigitos(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + sumarDigitos(num / 10);
    }

    // Punto 23: Invertir una palabra o cadena (recursividad).
    public static void invertirCadenaRecursiva() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese una palabra o cadena de texto: ");
            String texto = sc.nextLine();

            String textoInvertido = invertirTexto(texto);
            System.out.println("Texto invertido: " + textoInvertido);

            System.out.print("¿Deseas volver al menú principal? (si/no): ");
            String salida = sc.nextLine();

            if (salida.equalsIgnoreCase("si")) {
                break;
            }
        }
    }
    public static String invertirTexto(String texto) {
        if (texto.isEmpty()) {
            return texto;
        }
        return texto.charAt(texto.length() - 1) + invertirTexto(texto.substring(0, texto.length() - 1));
    }
}