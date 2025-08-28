import java.util.ArrayList;
import  java.util.Scanner;

public class Plato {
    private String nombreCompleto;
    private double precio;
    private boolean esBebida;
    private ArrayList<Ingrediente> ingrediente = new ArrayList<>();

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEsBebida() {
        return esBebida;
    }

    public void setEsBebida(boolean esBebida) {
        this.esBebida = esBebida;
    }

    public ArrayList<Ingrediente> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(ArrayList<Ingrediente> ingrediente) {
        this.ingrediente = ingrediente;
    }

    //se ingresan los detalles del plato y se agrega el ingrediente si no es bebida.
    public static Plato ingresarPlato(){
        Plato plato = new Plato();
        System.out.print("Ingrese el nombre del plato: ");
        plato.setNombreCompleto(new Scanner(System.in).nextLine());
        System.out.print("Ingrese el precio: ");
        plato.setPrecio(new Scanner(System.in).nextDouble());
        System.out.println("Es una bebida?\nSI\n"+"NO");
        if(new Scanner(System.in).nextLine().equalsIgnoreCase("SI")){
            plato.setEsBebida(true);
        } else {
            plato.setEsBebida(false);
            System.out.println();
            System.out.println("----- AGREGAR INGREDIENTE -----");
            System.out.println();
            plato.setIngrediente(agregarIngredientes());
        }
        return plato;
    }

    //recibe el ingrediente ingresado y lo agrega al ArrayList ingrediente.
    public static ArrayList agregarIngredientes(){
        ArrayList<Ingrediente> ingrediente = new ArrayList<>();
        while(true){
            System.out.println("Agregar ingrediente?\n SI - NO");
            String agregar=new Scanner(System.in).nextLine().toUpperCase();
            if(agregar.equals("SI")){
                ingrediente.add(Ingrediente.ingresarIngrediente());
            } else if (agregar.equals("NO") && (!ingrediente.isEmpty())) {
                break;
            } else if (agregar.equals("NO") && ingrediente.isEmpty()) {
                System.out.println("----- Debe ingresar al menos un ingrediente. -----");
            } else {
                System.out.println("----- Opción incorrecta. Intente de nuevo... -----");
            }
        }
        return ingrediente;
    }
}