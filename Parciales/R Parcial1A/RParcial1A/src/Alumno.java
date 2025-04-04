public class Alumno {
    // Declaración de atributos de la clase alumno
    String apellido;
    String nombre;
    long legajo;
    double[] notas;
    double promedioNotas;

    // inicializamos los atributos
    public Alumno(String apellido, String nombre, long legajo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.legajo = legajo;
    }

    // metodo para calcular el promedio de los alumnos
    public void calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        this.promedioNotas = suma / notas.length;
    }
}
