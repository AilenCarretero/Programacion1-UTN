import java.util.Scanner;

public class MejorAlumno {

    // Variable global que va a contener los objetos alumno
    static Alumno[] alumnos;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Generamos un array donde se almacena el legajo, el apellido y nombre de los alumnos
        String[][] alumnosDB = {
                {"70105","Nolasco","Federico"},
                {"71321","Alonso","Damián"},
                {"72987","Oviedo","Hernán"},
                {"73258","Valencia","Diego"},
                {"74741","Aveni","Martin"}
        };

        // Inicialización del array global
        alumnos = new Alumno[alumnosDB.length];

        // Iteración sobre el array de los datos de los alumnos
        for (int i = 0; i < alumnosDB.length; i++) {

            // Generemos una instancia de la clase alumno
            long legajo = Long.parseLong(alumnosDB[i][0]);
            String apellido = alumnosDB[i][1];
            String nombre = alumnosDB[i][2];

            Alumno alumno = new Alumno(apellido, nombre, legajo);

            // Solicitamos al usuatio el ingreso de la cantidad de notas
            int cantidadNotas;
            do {
                System.out.print("Ingrese la cantidad de notas para " + alumno.nombre + " " + alumno.apellido + ": ");
                cantidadNotas = sc.nextInt();
                if (cantidadNotas <= 0) {
                    System.out.println("La cantidad de notas debe ser mayor a 0, intente nuevamente.");
                }
            } while (cantidadNotas <= 0);

            System.out.print("");

            // Solicitamos el ingreso de la notas
            alumno.notas = new double[cantidadNotas];
            for (int j = 0; j < cantidadNotas; j++) {
                double nota;
                do {
                    System.out.print("Ingrese la nota " + (j + 1) + " (0-10): ");
                    nota = sc.nextDouble();
                    if (nota < 0 || nota > 10) {
                        System.out.println("La nota ingresada no es válida, intente nuevamente.");
                    }
                } while (nota < 0 || nota > 10);
                alumno.notas[j] = nota;
            }

            System.out.print("");

            // Calcular promedio y lo asignamos al array
            alumno.calcularPromedio();
            alumnos[i] = alumno;
        }

        // invocamos el metodo para imprimir la lista de los alumnos
        mostrarListaAlumnos();

        // Invocamos el metodo para mostrar el mejor promedio
        mostrarMejorPromedio();
    }

    // Metodo para imprimir la lista de alumnos con el promedio
    public static void mostrarListaAlumnos() {
        System.out.println("\nLa Lista de Alumnos cargados es:");
        System.out.println("Legajo\t\tApellido y Nombre\tPromedio");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.legajo + "\t\t" + alumno.apellido + ", " + alumno.nombre + "\t" + alumno.promedioNotas);
        }
    }

    // Metood para calcular e imprimir el mejor promedio
    public static void mostrarMejorPromedio() {
        Alumno mejorAlumno = alumnos[0];
        for (Alumno alumno : alumnos) {
            if (alumno.promedioNotas > mejorAlumno.promedioNotas) {
                mejorAlumno = alumno;
            }
        }

        // Mostrar información del mejor alumno
        System.out.println("\nEl alumno con mejor promedio es:");
        System.out.println("Apellido:\t" + mejorAlumno.apellido);
        System.out.println("Nombre:\t" + mejorAlumno.nombre);
        System.out.println("Legajo:\t" + mejorAlumno.legajo);
        System.out.print("Notas:\t");
        for (double nota : mejorAlumno.notas) {
            System.out.print(nota + " ");
        }
        System.out.println("\nPromedio: " + mejorAlumno.promedioNotas);
    }
}