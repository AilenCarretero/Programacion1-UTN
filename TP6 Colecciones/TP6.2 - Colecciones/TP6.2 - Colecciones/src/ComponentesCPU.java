import java.util.*;

public class ComponentesCPU {
    // Creamos los atributos para la clase ComponentesCPU
    private String componente;
    private String marca;
    private int cantidad;
    private double precio;

    // Generamos los getters y setters
    public String getComponentes() {
        return componente;
    }
    public void setComponente(String componente) {
        this.componente = componente;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Creamos un metodo para cargar los componentes del objeto/computadora creada.
    public static ComponentesCPU cargarComponente(){
        Scanner sc = new Scanner(System.in);
        ComponentesCPU nuevoComponente = new ComponentesCPU();
        System.out.println();
        System.out.println("----- CARGA DE COMPONENTES -----");
        System.out.println();
        System.out.println("Ingrese nombre del componente: ");
        nuevoComponente.setComponente(sc.nextLine());
        System.out.println("Ingrese marca del componente: ");
        nuevoComponente.setMarca(sc.nextLine());
        System.out.println("Ingrese cuantos componentes tiene: ");
        nuevoComponente.setCantidad(sc.nextInt());
        System.out.println("Ingrese precio del componente: ");
        nuevoComponente.setPrecio(sc.nextDouble());
        return nuevoComponente;
    }
}