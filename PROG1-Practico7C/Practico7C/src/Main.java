import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) { menu(); }

    public static void menu() {
        boolean quit = false;

        //Generamos el menú principal.
        while(!quit) {
            System.out.println(" ====== Menú Principal ====== " +
                    "\n" +
                    "\n1.   Creación y rellenado de una colección." +
                    "\n2.   Búsqueda de elementos mayores y menores." +
                    "\n3.   Calculando el promedio de una colección." +
                    "\n4.   Búsqueda de un valor en una colección." +
                    "\n5.   Ordenar una colección de forma ascendente/descendente." +
                    "\n6.   Creación y rellenado de una matriz cuadrada." +
                    "\n" +
                    "\n0.   Salir");

            int opcionMenu = sc.nextInt();
            System.out.println("");

            switch(opcionMenu) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    Logica.opcion1();
                    break;
                case 2:
                    Logica.opcion2();
                    break;
                case 3:
                    Logica.opcion3();
                    break;
                case 4:
                    Logica.opcion4();
                    break;
                case 5:
                    Logica.opcion5();
                    break;
                case 6:
                    Logica.opcion6();
                    break;
                default:
                    System.out.println("La opción ingresada no es válida, intente nuevamente.");
                    System.out.println("");
            }
        }
    }
}