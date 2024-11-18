import java.util.ArrayList;

public class Universidad {
    private String cuit;
    private String razonSocial;
    private double valorHoraCatedraBase;
    private ArrayList<Docente> docentes;

    // generamos loa metodos get y set de cada atributo
    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
    public String getCuit() {
        return cuit;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setValorHoraCatedraBase(double valorHoraCatedraBase) {
        this.valorHoraCatedraBase = valorHoraCatedraBase;
    }
    public double getValorHoraCatedraBase() {
        return valorHoraCatedraBase;
    }

    public void setDocentes(ArrayList<Docente> docentes) {
        this.docentes = docentes;
    }
    public ArrayList<Docente> getDocentes() {
        return docentes;
    }


    public Universidad(String cuit, String razonSocial, double valorHoraCatedraBase) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.valorHoraCatedraBase = valorHoraCatedraBase;
        this.docentes = new ArrayList<>();
    }

    public void agregarDocente(Docente docente) {
        docentes.add(docente);
    }
}
