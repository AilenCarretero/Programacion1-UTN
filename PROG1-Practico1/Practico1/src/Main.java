import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        Scanner sc = new Scanner(System.in);

        System.out.println("========== MENÚ PRINCIPAL ==========" +
                "\n" +
                "\n1.  Saludo personalizado" +
                "\n2.  Saludo personalizado en ventana" +
                "\n3.  Calculadora básica entre 2 números" +
                "\n4.  ¿Cuál de los dos números es mayor?" +
                "\n5.  El siguiente número ¿es divisible por 2?" +
                "\n6.  Calculadora del IVA" +
                "\n7.  Cuenta progresiva del 1 al 100" +
                "\n8.  Cuenta regresiva del 100 al 1" +
                "\n9.  Buscar divisibles por 2 y 3 en un rango de números" +
                "\n10. ¿Es un número positivo, negativo o es 0?" +
                "\n11. Adivina la contraseña en 3 intentos" +
                "\n12. ¿Es un día laborable o es fin de semana?" +
                "\n13. El número ingresado ¿es un número primo?" +
                "\n14. Intenta adivinar el número." +
                "\n" +
                "\n0.  Salir del programa" +
                "\n");

        System.out.print("Seleccione una opción (0-14): ");
        int opcion = sc.nextInt();
        sc.nextLine();
        System.out.println();

        switch (opcion) {
            case 1:
                Logica.saludoPersonalizado();
                break;
            case 2:
                Logica.saludoPersonalizadoPorVentana();
                break;
            case 3:
                Logica.calculadoraBasica();
                break;
            case 4:
                Logica.numeroMayor();
                break;
            case 5:
                Logica.esDivisiblePor2();
                break;
            case 6:
                Logica.calculadoraIVA();
                break;
            case 7:
                Logica.cuentaProgresiva();
                break;
            case 8:
                Logica.cuentaRegresiva();
                break;
            case 9:
                Logica.divisiblesPor2y3();
                break;
            case 10:
                Logica.esPositivoNegativo();
                break;
            case 11:
                Logica.adivinaContrasena();
                break;
            case 12:
                Logica.esDiaLaborableOFinde();
                break;
            case 13:
                Logica.esNumeroPrimo();
                break;
            case 14:
                Logica.adivinaElNumero();
                break;
            case 0:
                System.out.println("Saliendo del programa, esperamos volver a verte pronto.");
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción del 0 al 14.");
        }
    }
}
