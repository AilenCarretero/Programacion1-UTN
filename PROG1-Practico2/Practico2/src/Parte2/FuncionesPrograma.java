package Parte2;

import java.util.Date;

public class FuncionesPrograma {
    // Punto 17: Función que recibe 1 fecha y devuelve la misma en una cadena.
    public static String getFechaString(Date fecha) {
        System.out.println(fecha.toString());
        return fecha.toString();
    }

    // Punto 18: Función que recibe 3 parámetros y devuelve la fecha.
    public static String getFechaDate(int dia, int mes, int anio) {
        System.out.println(dia + "/" + mes + "/" + anio);
        return dia + "/" + mes + "/" + anio;
    }


}
