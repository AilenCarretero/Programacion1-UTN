public class BonoSueldo {
    // Generamos los atributos de la clase BonoSueldo
    private Empleado empleado;
    private int mesLiquidacion;
    private int anioLiquidacion;
    private double montoLiquidacion;

    // Creamos los métodos getters y setters
    public void setEmpleado (Empleado empleado) {
        this.empleado = empleado;
    }
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setMesLiquidacion (int mesLiquidacion) {
        this.mesLiquidacion = mesLiquidacion;
    }
    public int getMesLiquidacion() {
        return mesLiquidacion;
    }

    public void setAnioLiquidacion (int anioLiquidacion) {
        this.anioLiquidacion = anioLiquidacion;
    }
    public int getAnioLiquidacion() {
        return anioLiquidacion;
    }

    public void setMontoLiquidacion (double montoLiquidacion) {
        this.montoLiquidacion = montoLiquidacion;
    }
    public double getMontoLiquidacion() {
        return montoLiquidacion;
    }
}
