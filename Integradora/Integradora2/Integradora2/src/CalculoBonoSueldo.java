import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;

public class CalculoBonoSueldo {
    public static void main(String[] args) {

        // Generamos los atributos de la clase CalculoBonoSueldo.
        String[][] haberes = {
                {"100", "Presentismo", "9"},
                {"101", "Titulo Profesional", "9"},
                {"102", "Horas Extraordinarias", "M"},
                {"103", "Horas Nocturnas", "M"},
                {"104", "Otros Haberes", "M"}
        };

        String[][] deducciones = {
                {"200", "Obra Social", "3"},
                {"201", "Jubilacion", "11"},
                {"202", "Sindicato", "2"},
                {"203", "Seguro", "1.5"},
                {"204", "Otros", "M"}
        };

        List<Integer> codigosIngresados = new ArrayList<>();

        // Generamos una instancia de la clase Empleado y BonoSueldo.
        Empleado empleado = new Empleado();
        BonoSueldo bonoSueldo = new BonoSueldo();

        // Invocamos los métodos.
        ingresoDatos(empleado, bonoSueldo);
        ingresoValores(haberes, deducciones, codigosIngresados, empleado, bonoSueldo);

    }

    public static void ingresoDatos(Empleado empleado, BonoSueldo bonoSueldo) {
        Scanner sc = new Scanner(System.in);

        // Solicitamos el nombre completo del empleado.
        System.out.print("Ingrese el nombre completo del empleado: ");
        empleado.setNombreEmpleado(sc.nextLine());

        // Solicitamos el cuil del empleado.
        System.out.print("Ingrese el cuil del empleado: ");
        empleado.setCuil(sc.nextLong());

        // Solicitamos el sueldo básico del empleado.
        System.out.print("Ingrese el sueldo básico del empleado: ");
        empleado.setSueldoBasico(sc.nextDouble());

        // Declaramos la variable que vamos a utilizar.
        int anioActual = LocalDate.now().getYear();
        int mesActual = LocalDate.now().getMonthValue();

        // Solicitamos el año de ingreso del empleado.
        System.out.print("Ingrese el año de ingreso del empleado: ");
        int anioIngresado = sc.nextInt();

        do {
            if (anioIngresado > anioActual) {
                System.out.println("Error, el año ingresado no puede ser superior a " + anioActual + ", intente nuevamente: ");
                anioIngresado = sc.nextInt();
            }
        } while (anioIngresado > anioActual);

        empleado.setAnioIngreso(anioIngresado);

        // Solicitamos la fecha de la que se desea hacer liquidación.
        System.out.print("Ingrese el año del que se desea liquidar: ");
        anioIngresado = sc.nextInt();
        if (anioIngresado >= empleado.getAnioIngreso()) {
            bonoSueldo.setAnioLiquidacion(anioIngresado);
        } else {
            System.out.println("El año que se quiere liquidar no puede ser menor que el año de ingreso del empleado.");
        }

        System.out.print("Ingrese el número del mes que se desea liquidar: ");
        int mesIngresado = sc.nextInt();

        if ((bonoSueldo.getAnioLiquidacion() <= anioActual) && (mesIngresado <= mesActual)) {
            bonoSueldo.setMesLiquidacion(mesIngresado);
        }

        // Calculamos el monto por antiguedad del empleado.
        int antiguedad = anioActual - anioIngresado;
        empleado.setMontoAntiguedad(empleado.getSueldoBasico() * 0.02 * antiguedad);
    }

    public static void ingresoValores(String[][] haberes, String[][] deducciones, List codigosIngresados, Empleado empleado, BonoSueldo bonoSueldo) {
        Scanner sc = new Scanner(System.in);
        boolean codigoValido;

        // Generamos un Array bidimensional para almacenar los valores.
        String[][] bonosCalculados = new String[10][4];

        System.out.println("");

        // Le solicitamos al usuario el ingreso de haberes.
        System.out.println("INGRESE LOS HABERES DEL EMPLEADO" +
                "\n100. Presentismo" +
                "\n101. Titulo Profesional" +
                "\n102. Horas Extraordinarias" +
                "\n103. Horas Nocturnas" +
                "\n104. Otros Haberes" +
                "\n");
        while (true) {
            System.out.print("Ingrese el código del ítem: ");
            String codigo = sc.nextLine();

            if (codigo.equals("000")) {
                if (codigosIngresados.isEmpty()) {
                    System.out.println("Debe ingresar al menos 1 haber.");
                    continue;
                } else {
                    break;
                }
            }

            // Comprobamos que el código es válido y no duplicado
            codigoValido = esValido(codigo, haberes) && !comprobacionCodigo(Integer.parseInt(codigo), codigosIngresados);

            if (!codigoValido) {
                System.out.println("El código ingresado es incorrecto o ya ha sido cargado. Ingrese otro código.");
                continue;
            }

            for (int i = 0; i < haberes.length; i++) {
                if (haberes[i][0].equals(codigo)) {
                    if (haberes[i][2].equals("M")) {
                        System.out.print("Ingrese el valor de " + haberes[i][1] + ": ");
                        String valor = sc.nextLine();
                        bonosCalculados[i][0] = codigo;
                        bonosCalculados[i][1] = haberes[i][1];
                        bonosCalculados[i][2] = valor;
                    } else {
                        int porcentaje = Integer.parseInt(haberes[i][2]);
                        double total = empleado.getSueldoBasico() * (porcentaje / 100.0);
                        bonosCalculados[i][0] = codigo;
                        bonosCalculados[i][1] = haberes[i][1];
                        bonosCalculados[i][2] = String.valueOf(total);
                    }
                    codigosIngresados.add(Integer.parseInt(codigo));
                }
            }
        }

        System.out.println("");

        // Le solicitamos al usuario el ingreso de deducciones.
        System.out.println("INGRESE LAS DEDUCCIONES DEL EMPLEADO" +
                "\n200. Obra Social" +
                "\n201. Jubilacion" +
                "\n202. Sindicato" +
                "\n203. Seguro" +
                "\n204. Otros" +
                "\n");
        while (true) {
            System.out.print("Ingrese el código del ítem: ");
            String codigo = sc.nextLine();

            if (codigo.equals("000")) {
                if (codigosIngresados.isEmpty()) {
                    System.out.println("Debe ingresar al menos 1 haber.");
                    continue;
                } else {
                    break;
                }
            }

            // Comprobamos que el código es válido y no duplicado
            codigoValido = esValido(codigo, deducciones) && !comprobacionCodigo(Integer.parseInt(codigo), codigosIngresados);

            if (!codigoValido) {
                System.out.println("El código ingresado es incorrecto o ya ha sido cargado. Ingrese otro código.");
                continue;
            }

            for (int i = 0; i < deducciones.length; i++) {
                if (deducciones[i][0].equals(codigo)) {
                    if (deducciones[i][2].equals("M")) {
                        System.out.print("Ingrese el valor de " + deducciones[i][1] + ": ");
                        String valor = sc.nextLine();
                        bonosCalculados[i][0] = codigo;
                        bonosCalculados[i][1] = deducciones[i][1];
                        bonosCalculados[i][2] = valor;
                    } else {
                        double porcentaje = Double.parseDouble(deducciones[i][2]);
                        double total = empleado.getSueldoBasico() * (porcentaje / 100.0);
                        bonosCalculados[i][0] = codigo;
                        bonosCalculados[i][1] = deducciones[i][1];
                        bonosCalculados[i][2] = String.valueOf(total);
                    }
                    codigosIngresados.add(Integer.parseInt(codigo));

                }
            }
        }

        System.out.println("");

        montoLiquidado(empleado, bonoSueldo, haberes, deducciones, bonosCalculados);
        generarBonoSueldo(empleado, bonoSueldo, haberes, deducciones, bonosCalculados);

        System.out.print("¿Desea generar un nuevo bono de sueldo? ");
        String rta = sc.nextLine();

        if (rta.equalsIgnoreCase("si")) {
            ingresoValores(haberes, deducciones, codigosIngresados, empleado, bonoSueldo);
        }
    }

    public static boolean comprobacionCodigo(int codigo, List codigosIngresados) {
        return codigosIngresados.contains(codigo);
    }

    public static boolean esValido(String codigo, String[][] haberes) {
        for (String[] haber : haberes) {
            if (haber[0].equals(codigo)) {
                return true;
            }
        }
        return false;
    }

    public static double sumaValores(String[][] valores) {
        double suma = 0;
        for (String[] valor : valores) {
            if (!valor[2].equals("M")) { // Evitar convertir "M" a número
                suma += Double.parseDouble(valor[2]);
            }
        }
        return suma;
    }

    public static void montoLiquidado(Empleado empleado, BonoSueldo bonoSueldo, String[][] haberes, String[][] deducciones, String[][] bonoCalculados) {
        double totalHaberes = sumaValores(haberes);
        double totalDeducciones = sumaValores(deducciones);

        bonoSueldo.setMontoLiquidacion((empleado.getSueldoBasico() + empleado.getMontoAntiguedad() + totalHaberes) - totalDeducciones);
    }

    public static void generarBonoSueldo(Empleado empleado, BonoSueldo bonoSueldo, String[][] haberes, String[][] deducciones, String[][] bonoCalculados) {
        System.out.println("\nEl bono de sueldo a Liquidar es:");
        System.out.printf("Nombre: %-20s CUIL: %-15d%n", empleado.getNombreEmpleado(), empleado.getCuil());
        System.out.printf("Mes Liquidación: %-12s Año Liquidación: %-5d%n", mesEnPalabras(bonoSueldo), bonoSueldo.getAnioLiquidacion());
        System.out.printf("Sueldo Básico: %-10.2f Año Ingreso: %-5d%n", empleado.getSueldoBasico(), empleado.getAnioIngreso());

        System.out.println("\nCódigo Ítem       Denominación         Haberes         Deducciones");
        System.out.println("--------------------------------------------------------------");

        // Imprimir haberes
        for (String[] haber : haberes) {
            if (haber[2].equals("M")) {
                System.out.printf("%-15s %-20s %-15s %-15s%n", haber[0], haber[1], haber[2], "-");
            } else {
                System.out.printf("%-15s %-20s %-15.2f %-15s%n", haber[0], haber[1], Double.parseDouble(haber[2]), "-");
            }
        }

        // Imprimir deducciones
        for (String[] deduccion : deducciones) {
            if (deduccion[2].equals("M")) {
                System.out.printf("%-15s %-20s %-15s %-15s%n", deduccion[0], deduccion[1], "-", deduccion[2]);
            } else {
                System.out.printf("%-15s %-20s %-15s %-15.2f%n", deduccion[0], deduccion[1], "-", Double.parseDouble(deduccion[2]));
            }
        }

        // Subtotal y neto
        double totalHaberes = sumaValores(haberes);
        double totalDeducciones = sumaValores(deducciones);
        System.out.printf("%n%-37s %-15.2f %-15.2f%n", "SUB TOTAL", totalHaberes, totalDeducciones);
        System.out.printf("%-37s %-15.2f%n", "NETO", bonoSueldo.getMontoLiquidacion());
    }


    public static String mesEnPalabras(BonoSueldo bonoSueldo) {
        String mes = "";
        switch (bonoSueldo.getMesLiquidacion()) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
        }
        return mes;
    }
}