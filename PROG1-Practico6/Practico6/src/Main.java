import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        startMenu();
    }

    public static void delay() {
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void startMenu() {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while(!exit) {
            System.out.println(" ====== MENÚ PRINCIPAL ====== " +
                    "\n" +
                    "\n1.   Ordenamiento de algoritmos" +
                    "\n2.   Ordenamiento y comparación" +
                    "\n3.   Calculando el promedio de una matriz dinámica" +
                    "\n" +
                    "\n0.   Salir" +
                    "\n");

            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            System.out.println("");

            switch(opcion) {
                case 0:
                    exit = true;
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
                default:
                    System.out.println("El número ingresado no es válido, intente nuevamente.");
            }
        }
    }
}