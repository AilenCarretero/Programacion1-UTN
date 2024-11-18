import java.util.ArrayList;
import java.util.Scanner;
public class MenuRestaurant {
    public static void main(String[] args) {
        ArrayList<Plato> platosMenu = new ArrayList<>(); //ArrayList para almacenar los platos del Menú.
        System.out.println("----- INGRESO DE PLATOS Y BEBIDAS -----");
        while (true) {
            System.out.println(("1) Agregar plato.\n2) Salir."));
            String opcion = new Scanner(System.in).nextLine();
            if(opcion.equals("1")) {
                platosMenu.add(Plato.ingresarPlato()); //agrega al Menú cada plato ingresado.
            } else if (opcion.equals("2")) {
                if(!platosMenu.isEmpty()){
                    System.out.println("----------- MENÚ -----------");  //muestra la informacion guardada y termina
                    for(Plato p:platosMenu) {
                        System.out.println(p.getNombreCompleto());
                        System.out.println("Precio: " + p.getPrecio());
                        if (!p.isEsBebida()) {
                            System.out.println("Ingredientes: ");
                            System.out.printf("%-20s %-10s %-15s%n","Nombre","Cantidad","Unidad de Medida");
                            for (Ingrediente i : p.getIngrediente()) {
                                System.out.printf("%-20s %-10.2f %-15s%n",i.getNombre(), i.getCantidad(), i.getUnidad_de_medida());
                            }
                        }
                        System.out.println("---------------------------");
                    }
                }else{
                    System.out.println("----- FIN DEL PROGRAMA -----");
                }
                break;
            }else {
                System.out.println("Opción incorrecta. Intente de nuevo...");
            }
        }
    }
}
