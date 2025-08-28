package Parte1;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        Scanner sc = new Scanner(System.in);

        System.out.println("========== MENÚ PRINCIPAL ==========" +
                "\n" +
                "\n1.  Casteando un decimal" +
                "\n2.  ¿Qué pasaría si asignamos un valor fuera de rango?" +
                "\n3.  Sumando todos los dígitos" +
                "\n4.  ¿Qué billetes dar de cambio?" +
                "\n5.  Jugando con una cadena de texto" +
                "\n6.  ¿Son estas palabras iguales?" +
                "\n7.  ¿Se encuentra esta cadena dentro de otra?" +
                "\n8.  Diferencia entre un dato primitivo y uno de por valor" +
                "\n9.  Suma de todos los números entre el número ingresado y 1 (recursividad)" +
                "\n10. Sumando todos los dígitos (recursividad)" +
                "\n11. Invertir una palabra o cadena (recursividad)" +
                "\n" +
                "\n0.  Salir del programa");

        System.out.print("Seleccione una opción (0-14): ");
        int opcion = sc.nextInt();
        sc.nextLine();
        System.out.println();

        switch (opcion) {
            case 1:
                Structure.casteoDecimal();
                break;
            case 2:
                Structure.valorFueraDeRango();
                break;
            case 3:
                Structure.sumaDeDigitos();
                break;
            case 4:
                Structure.cajaRegistradora();
                break;
            case 5:
                Structure.cadenaDeTexto();
                break;
            case 6:
                Structure.palabrasGemelas();
                break;
            case 7:
                Structure.fraseInception();
                break;
            case 8:
                Structure.primitivoVsPorValor();
                break;
            case 9:
                Structure.sumaRecursiva();
                break;
            case 10:
                Structure.sumaDeDigitosRecursiva();
                break;
            case 11:
                Structure.invertirCadenaRecursiva();
                break;
            case 0:
                System.out.println("Saliendo del programa, esperamos volver a verte pronto.");
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción del 0 al 14.");
        }
    }
}
