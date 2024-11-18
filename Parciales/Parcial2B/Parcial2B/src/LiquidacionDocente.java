import java.util.ArrayList;
import java.util.Scanner;

public class LiquidacionDocente {
    // metodo main|
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // craacion del arraylist que contendra las catedras
        ArrayList<Catedra> catedrasCarrera = new ArrayList<Catedra>();

        // creacion de las catedras
        Catedra cat = new Catedra (10, "Analisis Matematico", 8);
        catedrasCarrera.add(cat);
        cat = new Catedra (20, "Algoritmos", 4);
        catedrasCarrera.add(cat);
        cat = new Catedra (30, "Paradigmas de la Computación", 6);
        catedrasCarrera.add(cat);
        cat = new Catedra (40, "Inteligencia Artificial", 12);
        catedrasCarrera.add(cat);




        // solicitamos al usuario el ingreso de la razon social
        System.out.print("Ingrese la razón social de la Universidad: ");
        String razonSocial = sc.nextLine();
        while (razonSocial.isEmpty()) {
            System.out.print("La razón social no puede estar vacía, intente nuevamente: ");
            razonSocial = sc.nextLine();
        }

        // solicitamose el numero de cuit de la univerdsidad
        System.out.print("Ingrese el número de CUIT de la Universidad (11 dígitos): ");
        String cuit = sc.nextLine();
        while (cuit.length() != 11) {
            System.out.print("El CUIT debe tener 11 dígitos, intente nuevamente: ");
            cuit = sc.nextLine();
        }

        // solicitamos el valor de la hora catedra
        System.out.print("Ingrese el valor de la hora cátedra base: ");
        double valorHoraCatedraBase = sc.nextDouble();
        while (valorHoraCatedraBase <= 0) {
            System.out.print("El valor hora cátedra base tiene que ser mayor a 0, intente nuevamente: ");
            valorHoraCatedraBase = sc.nextDouble();
        }

        // cremaos una instancia de la clase universidad y le asignamos los valores dados anteriormente
        Universidad universidad = new Universidad(cuit, razonSocial, valorHoraCatedraBase);


        // realizamos la carga de los docentes de la universidad
        boolean continuar = true;

        while (continuar) {
            sc.nextLine();

            //solicitamos el nombre del docente
            System.out.print("Ingrese el nombre completo del docente: ");
            String nombreCompleto = sc.nextLine();

            while (nombreCompleto.isEmpty()) {
                System.out.print("El nombre no puede estar vacío, intente nuevamente: ");
                nombreCompleto = sc.nextLine();
            }

            // solicitamos el legajo del docente
            System.out.print("Ingrese el legajo del docente: ");
            int legajo = sc.nextInt();

            while (legajo <= 0) {
                System.out.print("El legajo debe ser mayor a 0, intente nuevamente: ");
                legajo = sc.nextInt();
            }

            // comprobacion sobre si el legajo ya fue agregado
            boolean legajoExistente = false;
            for (Docente docente : universidad.getDocentes()) {
                if (docente.getLegajo() == legajo) {
                    System.out.println("El legajo ingresado ya fue cargado anteriormente, intente nuevamente.");
                    legajoExistente = true;
                    break;
                }
            }
            if (legajoExistente) {
                continue;
            }

            // solicitamos la antiguedad del docente
            System.out.print("Ingrese la antiguedad del docente (entre 0-120): ");
            double antiguedad = sc.nextDouble();

            while (antiguedad < 0 || antiguedad >= 120) {
                System.out.print("La antiguedad debe estar entre 0 y 120,intente nuevamente: ");
                antiguedad = sc.nextDouble();
            }

            // solicitamos la catedra del docente
            Catedra opcionCatedra = null;

            while (opcionCatedra == null) {

                System.out.print("Ingrese el código de la cátedra: ");
                int codigoCatedra = sc.nextInt();
                sc.nextLine();

                for (Catedra catedra : catedrasCarrera) {
                    if (catedra.getCodigo() == codigoCatedra) {
                        opcionCatedra = catedra;
                        break;
                    }
                }
                if (opcionCatedra == null) {
                    System.out.println("El código ingresado no es válido, intente nuevamente.");
                }
            }

            // añadimos el docinte a la unversidda
            Docente nuevoDocente = new Docente();

            universidad.agregarDocente(nuevoDocente);
            nuevoDocente.setNombreCompleto(nombreCompleto);
            nuevoDocente.setLegajo(legajo);
            nuevoDocente.setAntiguedad(antiguedad);
            nuevoDocente.setCatedra(opcionCatedra);
            universidad.agregarDocente(nuevoDocente);

            System.out.print("¿Desea continuar cargando docentes? (Sí / No): ");
            continuar = sc.next().equalsIgnoreCase("Si");
        }

        // Mostrar información
        System.out.println("Universidad: " + universidad.getRazonSocial());
        System.out.println("CUIT: " + universidad.getCuit());
        System.out.println("Valor Base Hora Cátedra: " + universidad.getValorHoraCatedraBase());
        System.out.println("------------------------Docentes------------------------------");
        for (Docente docente : universidad.getDocentes()) {
            System.out.println("Nombre Completo: " + docente.getNombreCompleto());
            System.out.println("Cátedra: " + docente.getCatedra().getDenominacion());
            System.out.printf("Salario: $ %.2f%n", docente.salarioDocenteCalculado(universidad.getValorHoraCatedraBase()));
            System.out.println("---------------------------------------------------------------------");
        }
    }
}