import java.util.Scanner;
public class Ingrediente {
    private String nombre;
    private double cantidad;
    private String unidad_de_medida;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidad_de_medida() {
        return unidad_de_medida;
    }

    public void setUnidad_de_medida(String unidad_de_medida) {
        this.unidad_de_medida = unidad_de_medida;
    }

    //se ingresan los detalles del ingrediente del plato.
    public static Ingrediente ingresarIngrediente(){
        Ingrediente ingrediente = new Ingrediente();
        System.out.print("Ingrese el nombre del ingrediente: ");
        ingrediente.setNombre(new Scanner(System.in).nextLine());
        System.out.print("Ingrese la cantidad: ");
        ingrediente.setCantidad(new Scanner(System.in).nextDouble());
        System.out.print("Ingrese la unidad de medida: ");
        ingrediente.setUnidad_de_medida(new Scanner(System.in).nextLine());
        return ingrediente;
    }
}