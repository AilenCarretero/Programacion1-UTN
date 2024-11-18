public class Docente {
    //asignamos los atributos a la clase docente
    private String nombreCompleto;
    private int legajo;
    private double antiguedad;
    private Catedra catedra;

    // generamos loa metodos get y set de cada atributo
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    public int getLegajo() {
        return legajo;
    }

    public void setAntiguedad(double antiguedad) {
        this.antiguedad = antiguedad;
    }
    public double getAntiguedad() {
        return antiguedad;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }
    public Catedra getCatedra() {
        return catedra;
    }

    //agregamos el metodo para calcular el salario docebte
    public double salarioDocenteCalculado(double valorHoraCatedraBase) {
        return (valorHoraCatedraBase * catedra.getHorasCatedra()) +
                (((valorHoraCatedraBase * catedra.getHorasCatedra()) * antiguedad) / 100);
    }
}