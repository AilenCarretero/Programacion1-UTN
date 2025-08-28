package Parte4;

// Punto 20: Crea una clase llamada "Fraccion" que tenga atributos para el numerador y el denominador, y métodos para sumar, restar, multiplicar y dividir fracciones.
public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Fraccion sumarFracciones(Fraccion f1, Fraccion f2){
        int numerador = (f1.getNumerador() * f2.getDenominador()) + (f2.getNumerador() * f1.getDenominador());
        int denominador = f1.getDenominador() * f2.getDenominador();
        return new Fraccion(numerador, denominador);
    }

    public Fraccion restarFracciones(Fraccion f1, Fraccion f2){
        int numerador = (f1.getNumerador() * f2.getDenominador()) - (f2.getNumerador() * f1.getDenominador());
        int denominador = f1.getDenominador() * f2.getDenominador();
        return new Fraccion(numerador, denominador);
    }

    public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2){
        int numerador = f1.getNumerador() * f2.getNumerador();
        int denominador = f1.getDenominador() * f2.getDenominador();
        return new Fraccion(numerador, denominador);
    }

    public Fraccion dividirFracciones(Fraccion f1, Fraccion f2){
        int numerador = f1.getNumerador() * f2.getDenominador();
        int denominador = f1.getDenominador() * f2.getNumerador();
        return new Fraccion(numerador, denominador);
    }
}
