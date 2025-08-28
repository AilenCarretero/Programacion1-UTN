package Parte4;


import java.util.Scanner;

// Punto 20: Crea una clase llamada "OperacionFraccion" que utilice la clase Fraccion para realizar operaciones entre dos fracciones ingresadas por el usuario.
public class OperacionesFraccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numerador de la primera fracción: ");
        int numerador1 = sc.nextInt();
        System.out.print("Ingrese el denominador de la primera fracción: ");
        int denominador1 = sc.nextInt();

        System.out.print("Ingrese el numerador de la segunda fracción: ");
        int numerador2 = sc.nextInt();
        System.out.print("Ingrese el denominador de la segunda fracción: ");
        int denominador2 = sc.nextInt();

        Fraccion fraccion1 = new Fraccion(numerador1, denominador1);
        Fraccion fraccion2 = new Fraccion(numerador2, denominador2);

        Fraccion suma = fraccion1.sumarFracciones(fraccion1, fraccion2);
        System.out.println("Suma: " + suma.getNumerador() + "/" + suma.getDenominador());

        Fraccion resta = fraccion1.restarFracciones(fraccion1, fraccion2);
        System.out.println("Resta: " + resta.getNumerador() + "/" + resta.getDenominador());

        Fraccion multiplicacion = fraccion1.multiplicarFracciones(fraccion1, fraccion2);
        System.out.println("Multiplicación: " + multiplicacion.getNumerador() + "/" + multiplicacion.getDenominador());

        Fraccion division = fraccion1.dividirFracciones(fraccion1, fraccion2);
        System.out.println("División: " + division.getNumerador() + "/" + division.getDenominador());
    }
}
