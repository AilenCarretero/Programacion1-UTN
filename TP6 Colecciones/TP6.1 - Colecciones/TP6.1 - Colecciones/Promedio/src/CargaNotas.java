import java.util.ArrayList;
import java.util.Scanner;
public class CargaNotas {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Alumno> alumnos = new ArrayList<>();

        while(true){
            System.out.println();
            System.out.println("----- INICIO -----");
            System.out.println();
            System.out.println("1) Cargar alumno\n2) Salir");
            String menu = sc.nextLine();
            if(menu.equals("1")){
                alumnos.add(cargaA());

            } else if (menu.equals("2")) {
                break;
            }else{
                System.out.println("Opcion invalida. Intente de nuevo...");
            }
        }
        for(Alumno alum : alumnos){
            System.out.println("-------------------------------");
            System.out.println("Nombre del alumno: "+alum.getNombreCompleto());
            System.out.println("N° de legajo: "+alum.getLegajo());
            for(Nota nota : alum.getNota()) {
                System.out.println("Catedra: "+nota.getCatedra());
                System.out.println("Nota: "+nota.getNotaExamen());
            }
            Alumno.calcularPromedio(alum.getNota());
        }
    }


    public static Alumno cargaA(){
        Alumno alumno = new Alumno();
        System.out.println("Ingrese el nombre del alumno: ");
        alumno.setNombreCompleto(sc.nextLine().toUpperCase());
        System.out.println("Ingrese el legajo del alumno: ");
        alumno.setLegajo(sc.nextLong());
        sc.nextLine();
        int cantidadDeCargas=0;
        while(true) {
            System.out.println("1)-Cargar Nota\n2)-Salir");
            String carga = sc.nextLine();
            if(carga.equals("1")) {
                cantidadDeCargas++;
                alumno.getNota().add(cargaN());
            }else if (carga.equals("2") && cantidadDeCargas>0) {
                break;
            }else if (carga.equals("2") && cantidadDeCargas==0){
                System.out.println("Debe cargar al menos una nota.");
            }else {
                System.out.println("Opcion invalida. Intente de nuevo...");
            }
        }
        return alumno;
    }

    public static Nota cargaN(){
        Scanner sc = new Scanner(System.in);
        Nota notas = new Nota();
        System.out.println("Ingrese la catedra: ");
        notas.setCatedra(sc.nextLine());
        System.out.println("Ingrese la nota: ");
        notas.setNotaExamen(sc.nextDouble());
        sc.nextLine();
        return notas;
    }

}