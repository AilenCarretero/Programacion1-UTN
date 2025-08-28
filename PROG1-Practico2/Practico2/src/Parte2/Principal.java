package Parte2;

import Parte1.Structure;

import java.util.Date;
import java.util.Scanner;

import static Parte2.FuncionesPrograma.getFechaDate;
import static Parte2.FuncionesPrograma.getFechaString;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== MENÚ PRINCIPAL ====" +
                "\n" +
                "\n1. De String a Date" +
                "\n2. De Date a String" +
                "\n" +
                "\n0. Salir del programa");

        System.out.print("Seleccione una opción (0-14): ");
        int opcion = sc.nextInt();
        sc.nextLine();
        System.out.println();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese una fecha en formato dd/mm/yyyy:");
                Date fechaInput = new Date(sc.nextLine());
                System.out.println();
                getFechaString(fechaInput);
                break;
            case 2:
                System.out.print("Ingrese un día: ");
                int dia = sc.nextInt();
                System.out.print("Ingrese un mes: ");
                int mes = sc.nextInt();
                System.out.print("Ingrese un año: ");
                int anio = sc.nextInt();
                sc.nextLine();
                System.out.println();
                getFechaDate(dia, mes, anio);
                break;
            case 0:
                System.out.println("Saliendo del programa, esperamos volver a verte pronto.");
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción del 0 al 14.");
        }
    }
}
