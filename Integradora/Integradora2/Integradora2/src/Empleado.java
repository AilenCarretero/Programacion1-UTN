import java.util.List;

public class Empleado {
    // Generamos los atributos de la clase Empleado
    String nombreEmpleado;
    long cuil;
    int anioIngreso;
    double montoAntiguedad;
    double sueldoBasico;
    List<BonoSueldo> bonos;

    // Creamos los métodos getters y setters
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setCuil(long cuil) {
        this.cuil = cuil;
    }
    public long getCuil() {
        return cuil;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }
    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setMontoAntiguedad(double montoAntiguedad) {
        this.montoAntiguedad = montoAntiguedad;
    }
    public double getMontoAntiguedad() {
        return montoAntiguedad;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setBonos(List<BonoSueldo> bonos) {
        this.bonos = bonos;
    }
    public List<BonoSueldo> getBonos() {
        return bonos;
    }
}
