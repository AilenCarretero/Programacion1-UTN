public class Celda {
    int fila;
    int columna;
    String valor;

    //Creamos el constructor de la instancia de la clase.
    public Celda(int fila, int columna, String valor) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
    }

    public String toString() {
        return "Celda [F = " + fila + ", C = " + columna + ", V = " + valor + "]";
    }
}