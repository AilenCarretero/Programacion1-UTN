package Parte3;

import java.util.Scanner;

// Punto 19: Crea una clase llamada "Calculo" que contenga el main y haga uso de los métodos de la clase "OperacionMatematica".
public class Calculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OperacionMatematica operacionMatematica = new OperacionMatematica();

        System.out.print("Ingrese el primer número: ");
        double valor1 = sc.nextDouble();
        operacionMatematica.setValor1(valor1);

        System.out.print("Ingrese el segundo número: ");
        double valor2 = sc.nextDouble();
        operacionMatematica.setValor2(valor2);

        System.out.print("Ingrese la operación (+, -, *, /): ");
        String operacion = sc.next();
        operacionMatematica.setOperacion(operacion);

        while (operacion.equals("/") && valor2 == 0) {
            System.out.println("Error: No se puede dividir por cero. Por favor, ingrese un segundo número diferente de cero.");
            System.out.print("Ingrese el segundo número: ");
            valor2 = sc.nextDouble();
            operacionMatematica.setValor2(valor2);
        }

        double resultado = operacionMatematica.aplicarOperacion(operacion);
        System.out.println("El resultado de la operación es: " + resultado);
    }
}
