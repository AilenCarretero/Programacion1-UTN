public class Catedra {
    private int codigo;
    private String denominacion;
    private int horasCatedra;

    // generamos loa metodos get y set de cada atributo
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }
    
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    public String getDenominacion() {
        return denominacion;
    }
    
    public void setHorasCatedra(int horasCatedra) {
        this.horasCatedra = horasCatedra;
    }
    public int getHorasCatedra() {
        return horasCatedra;
    }

    //creamos un constructor para el arraylist catedras
    public Catedra(int codigo, String denominacion, int horasCatedra) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.horasCatedra = horasCatedra;
    }
    
}