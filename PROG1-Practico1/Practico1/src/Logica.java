import javax.swing.*;
import java.util.Scanner;

public class Logica {
    // Punto 1: Saludo personalizado usando Scanner.
    public static void saludoPersonalizado() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Por favor, ingresa tu nombre: ");
            String nombre = sc.nextLine();
            System.out.println("¡Bienvenido " + nombre + "!");
            System.out.println();

            System.out.print("¿Deseas volver al menú principal? (si/no): ");
            String salida = sc.nextLine();

            if (salida.equalsIgnoreCase("si")) {
                break;
            }
        }
    }

    // Punto 2: Saludo personalizado usando JOPtionPane.
    public static void saludoPersonalizadoPorVentana() {
        while (true) {
            String nombre = JOptionPane.showInputDialog(null, "Por favor, ingresa tu nombre: ", "Saludo Personalizado", JOptionPane.QUESTION_MESSAGE);
            if (nombre == null) {
                return;
            }
            JOptionPane.showMessageDialog(null, "¡Bienvenido " + nombre + "!", "Saludo Personalizado", JOptionPane.INFORMATION_MESSAGE);

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas volver al menú principal?", "Salir", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                break;
            }
        }
    }

    // Punto 3: Calculadora básica que solicite dos números y una operación.
    public static void calculadoraBasica() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese el primer número: ");
            double num1 = sc.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = sc.nextDouble();
            sc.nextLine();

            System.out.print("Ingrese la operación deseada (+, -, *, /, %): ");
            String operacion = sc.nextLine();
            System.out.println();

            switch (operacion) {
                case "+":
                    System.out.println("El resultado de la suma: " + num1 + " + " + num2 + " es: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("El resultado de la resta: " + num1 + " - " + num2 + " es: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("El resultado de la multiplicación: " + num1 + " * " + num2 + " es: " + (num1 * num2));
                    break;
                case "/":
                    if (num2 != 0) {
                        System.out.println("El resultado de la división: " + num1 + " / " + num2 + " es: " + (num1 / num2));
                        break;
                    } else {
                        System.out.println("Error: No es posible dividir por cero.");
                    }
                case "%":
                    if (num2 != 0) {
                        System.out.println("El resultado del resto: " + num1 + " % " + num2 + " es: " + (num1 % num2));
                        break;
                    } else {
                        System.out.println("No es posible calcular el resto con divisor cero.");
                    }
                default:
                    System.out.println("La opción ingresada no es válida, intente nuevamente.");
            }

            System.out.print("¿Deseas realizar otra operación? (si/no): ");
            String salida = sc.nextLine();

            if (salida.equalsIgnoreCase("no")) {
                break;
            }
        }
    }

    // Punto 4: Solicitar dos números e indicar cuál es el mayor.
    public static void numeroMayor() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese el primer número: ");
            double num1 = sc.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = sc.nextDouble();
            sc.nextLine();

            if (num1 > num2) {
                System.out.println("El número mayor es: " + num1);
            } else if (num2 > num1) {
                System.out.println("El número mayor es: " + num2);
            } else {
                System.out.println("Ambos números son iguales.");
            }
            System.out.println();

            System.out.print("¿Deseas comparar otros números? (si/no): ");
            String salida = sc.nextLine();

            if (salida.equalsIgnoreCase("no")) {
                break;
            }
        }
    }

    // Punto 5: Solicitar un número e indicar si es divisible por 2.
    public static void esDivisiblePor2() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un número: ");
            int num = sc.nextInt();
            sc.nextLine();

            if (num % 2 == 0) {
                System.out.println("El número " + num + " es divisible por 2.");
            } else {
                System.out.println("El número " + num + " no es divisible por 2.");
            }
            System.out.println();

            System.out.print("¿Deseas verificar otro número? (si/no): ");
            String salida = sc.nextLine();

            if (salida.equalsIgnoreCase("no")) {
                break;
            }
        }
    }

    // Punto 6: Solicitar un precio y calcular el preci con IVA.
    public static void calculadoraIVA() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese el precio sin IVA: ");
            double precioSinIVA = sc.nextDouble();
            sc.nextLine();

            double precioConIVA = precioSinIVA + (precioSinIVA * (21 / 100));
            System.out.printf("El precio con IVA incluido es: %.2f%n", precioConIVA);
            System.out.println();

            System.out.print("¿Deseas calcular otro precio con IVA? (si/no): ");
            String salida = sc.nextLine();

            if (salida.equalsIgnoreCase("no")) {
                break;
            }
        }
    }

    // Punto 7: Mostrar los números del 1 al 100 usando un bucle While.
    public static void cuentaProgresiva() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int numero = 1;

            while (numero <= 100) {
                System.out.println(numero);
                numero++;

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println();

            System.out.print("¿Deseas volver al menú principal? (si/no): ");
            String salida = sc.nextLine();

            if (salida.equalsIgnoreCase("no")) {
                break;
            }
        }
    }

    // Punto 8: Mostrar los números del 100 al 1 usando un bucle For.
    public static void cuentaRegresiva() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            for (int numero = 100; numero >= 1; numero--) {
                System.out.println(numero);

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println();

            System.out.print("¿Deseas volver al menú principal? (si/no): ");
            String salida = sc.nextLine();

            if (salida.equalsIgnoreCase("no")) {
                break;
            }
        }
    }

    // Punto 9: Solicitar un rango de números e imprimir todos los números dentro de ese rango que sean divisibles por 2 y 3.
    public static void divisiblesPor2y3() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese el número mínimo del rango: ");
            int min = sc.nextInt();

            System.out.print("Ingrese el número máximo del rango: ");
            int max = sc.nextInt();
            sc.nextLine();

            System.out.println("Números divisibles por 2 y 3 en el rango de " + min + " a " + max + ":");
            for (int i = min; i <= max; i++) {
                if (i % 2 == 0 && i % 3 == 0) {
                    System.out.println(i);
                }
            }
            System.out.println();

            System.out.print("¿Deseas verificar otro rango? (si/no): ");
            String salida = sc.nextLine();

            if (salida.equalsIgnoreCase("no")) {
                break;
            }
        }
    }

    // Punto 10: Solicitar un número e indicar si es positivo, negativo o es 0.
    public static void esPositivoNegativo() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num;

            do {
                System.out.print("Ingrese un número (0 para salir): ");
                num = sc.nextInt();
                sc.nextLine();

                if (num > 0) {
                    System.out.println("El número " + num + " es positivo.");
                } else if (num < 0) {
                    System.out.println("El número " + num + " es negativo.");
                } else {
                    System.out.println("Has ingresado 0, saliendo del programa.");
                }
            } while (num != 0);
            System.out.println();

            System.out.print("¿Deseas volver al menú principal? (si/no): ");
            String salida = sc.nextLine();

            if (salida.equalsIgnoreCase("no")) {
                break;
            }
        }
    }

    // Punto 11: Definir una contraseña y que el usuario intente adivinarla en 3 intentos.
    public static void adivinaContrasena() {
        Scanner sc = new Scanner(System.in);
        final String CONTRASENA = "java123";

        while (true) {
            int intentos = 3;
            boolean acertado = false;

            while (intentos > 0) {
                System.out.print("Ingresa la contraseña (tienes " + intentos + " intentos): ");
                String intento = sc.nextLine();

                if (intento.equals(CONTRASENA)) {
                    System.out.println("¡Contraseña correcta! Has accedido.");
                    acertado = true;
                    break;
                } else {
                    intentos--;
                    System.out.println("Contraseña incorrecta.");
                }
            }

            if (!acertado) {
                System.out.println("Has agotado todos los intentos. La contraseña era: " + CONTRASENA);
            }
            System.out.println();

            System.out.print("¿Deseas intentar adivinar la contraseña nuevamente? (si/no): ");
            String salida = sc.nextLine();

            if (salida.equalsIgnoreCase("no")) {
                break;
            }
        }
    }

    // Punto 12: Solicitar un día de la semana (1-7) y mostrar si es un día laborable o no.
    public static void esDiaLaborableOFinde() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un día de la semana (1-7, donde 1=Lunes y 7=Domingo): ");
            int dia = sc.nextInt();
            sc.nextLine();

            switch (dia) {
                case 1:
                    System.out.println("Es un día laborable.");
                    break;
                case 2:
                    System.out.println("Es un día laborable.");
                    break;
                case 3:
                    System.out.println("Es un día laborable.");
                    break;
                case 4:
                    System.out.println("Es un día laborable.");
                    break;
                case 5:
                    System.out.println("Es un día laborable.");
                    break;
                case 6:
                    System.out.println("Es fin de semana.");
                    break;
                case 7:
                    System.out.println("Es fin de semana.");
                    break;
                default:
                    System.out.println("Número inválido. Por favor, ingrese un número entre 1 y 7.");
            }
            System.out.println();

            System.out.print("¿Deseas verificar otro día? (si/no): ");
            String salida = sc.nextLine();

            if (salida.equalsIgnoreCase("no")) {
                break;
            }
        }
    }

    // Punto 13: Solicitar un número e indicar si es un número primo o no.
    public static void esNumeroPrimo() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un número entero positivo: ");
            int num = sc.nextInt();
            sc.nextLine();

            if (num <= 1) {
                System.out.println("El número debe ser mayor que 1.");
            } else {
                boolean esPrimo = true;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    System.out.println("El número " + num + " es primo.");
                } else {
                    System.out.println("El número " + num + " no es primo.");
                }
            }
            System.out.println();

            System.out.print("¿Deseas verificar otro número? (si/no): ");
            String salida = sc.nextLine();

            if (salida.equalsIgnoreCase("no")) {
                break;
            }
        }
    }

    // Punto 14: Generar un número aleatorio, y permitir al usuario adivinarlo.
    public static void adivinaElNumero() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int numeroAdivinar = (int) (Math.random() * 100) + 1;
            int intento = 0;

            System.out.println("He generado un número entre 1 y 100. ¡Intenta adivinarlo!");

            while (intento != numeroAdivinar) {
                System.out.print("Ingresa tu intento: ");
                intento = sc.nextInt();
                sc.nextLine();

                if (intento < numeroAdivinar) {
                    System.out.println("El número es mayor.");
                } else if (intento > numeroAdivinar) {
                    System.out.println("El número es menor.");
                } else {
                    System.out.println("¡Felicidades! Has adivinado el número " + numeroAdivinar + ".");
                }
            }
            System.out.println();

            System.out.print("¿Deseas jugar nuevamente? (si/no): ");
            String salida = sc.nextLine();

            if (salida.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}
