import java.util.ArrayList;

public class Alumno {
    private String  nombreCompleto;
    private long  legajo;
    private ArrayList<Nota> nota = new ArrayList<>();


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public ArrayList<Nota> getNota() {
        return nota;
    }

    public void setNota(ArrayList<Nota> nota) {
        this.nota = nota;
    }

    public static void calcularPromedio(ArrayList<Nota> nota){
        double total = 0; int cantidadNotas = 0;
        for(Nota n : nota) {
            total += n.getNotaExamen();
            cantidadNotas++;
        }
        System.out.println("Promedio: "+total/cantidadNotas);
    }
}
