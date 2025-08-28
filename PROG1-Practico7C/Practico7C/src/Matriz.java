import java.util.ArrayList;

public class Matriz {
    ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();

    //Generamos un metodo para ingresar una celda a la lista.
    public void agregarCelda(int fila, int columna, String valor) {
        Celda crearCelda = new Celda (fila, columna, valor);
        matrizCuadrada.add(crearCelda);
    }

    //Generamos un metodo para enseñar todas las celdas cargadas.
    public void mostrarCeldas() {
        for (Celda celda : matrizCuadrada) {
            System.out.println(celda);
        }
    }

    //Generamos un metodo para buscar una celda mediante la fila y la columna.
    public String obtenerValor(int fila, int columna) {
        for (Celda celda : matrizCuadrada) {
            if (celda.fila == fila && celda.columna == columna) {
                return celda.valor;
            }
        }
        return "La celda de la fila y columna ingresada no ha sido asignada.";
    }
}