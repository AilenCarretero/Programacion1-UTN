import java.util.Scanner;

public class GeneraPC {
    static String[][] componentesPc = {
            {"AAA", "Placa Madre", "20000", "S"},
            {"BBB", "Procesador", "25000", "S"},
            {"CCC", "Memoria RAM", "5000", "S"},
            {"DDD", "Placa de Red", "3000", "N"},
            {"EEE", "Disco Rigido SSD", "22000", "S"},
            {"FFF", "Placa de Video", "42000", "N"},
            {"GGG", "Monitor Led 21", "32000", "N"},
            {"HHH", "Monitor Led 25", "41000", "N"},
            {"JJJ", "Kit Teclado - Mouse", "9000", "N"},
            {"KKK", "Gabinete", "6500", "S"},
            {"LLL", "Fuente Alimentación", "6500", "S"},
            {"MMM", "Placa de Sonido", "16500", "N"}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Generamos una instancia de la clase Computadora
        Computadora computadora = new Computadora();

        // Solicitamos al usuario el ingreso de algunos atributos.
        System.out.print("Ingrese la marca: ");
        computadora.setMarca(sc.nextLine());

        System.out.print("Ingrese el modelo: ");
        computadora.setModelo(sc.nextLine());

        long codigoBarras;
        do {
            System.out.print("Ingrese el código de barras (7-15 caracteres): ");
            codigoBarras = sc.nextLong();
        } while (String.valueOf(codigoBarras).length() < 7 || String.valueOf(codigoBarras).length() > 15);
        computadora.setCodigoBarras(codigoBarras);

        // Solicitar cantidad de componentes
        int cantidadComponentes;
        do {
            System.out.print("Ingrese la cantidad de componentes (5-12): ");
            cantidadComponentes = sc.nextInt();
        } while (cantidadComponentes < 5 || cantidadComponentes > 12);

        // Inicializar componentes
        String[][] componentesSeleccionados = new String[cantidadComponentes][4];
        boolean[] componentesObligatorios = new boolean[5]; // Para verificar componentes obligatorios
        int index = 0;

        // Ingreso de componentes
        while (index < cantidadComponentes) {
            System.out.println("Componentes de la Computadora");
            System.out.print("Ingrese el código del componente: ");
            String codigo = sc.next();

            boolean encontrado = false;
            boolean yaAgregado = false;

            for (String[] componente : componentesPc) {
                if (componente[0].equals(codigo)) {
                    encontrado = true;
                    // Verificar si ya fue agregado
                    for (int i = 0; i < index; i++) {
                        if (componentesSeleccionados[i][0].equals(codigo)) {
                            yaAgregado = true;
                            break;
                        }
                    }
                    if (!yaAgregado) {
                        componentesSeleccionados[index] = componente;
                        if (componente[3].equals("S")) {
                            componentesObligatorios[0] = true; // Marcar como agregado
                        }
                        index++;
                    } else {
                        System.out.println("El componente ya fue agregado anteriormente");
                    }
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("El código ingresado es incorrecto");
            }
        }

        // Verificar componentes obligatorios
        boolean todosObligatorios = true;
        for (boolean obligatorio : componentesObligatorios) {
            if (!obligatorio) {
                todosObligatorios = false;
                break;
            }
        }

        if (!todosObligatorios) {
            System.out.println("Atención, 1 o más de los componentes obligatorios no fueron agregados, por este motivo se cobrara un recargo del 20%");
            computadora.setPorcentajeAumento(20);
        }

        // Calcular monto final
        double totalComponentes = 0;
        for (String[] componente : componentesSeleccionados) {
            totalComponentes += Double.parseDouble(componente[2]);
        }
        computadora.setPrecioTotal(totalComponentes);
        double recargo = (computadora.getPorcentajeAumento() / 100) * totalComponentes;
        computadora.setMontoFinal(totalComponentes + recargo);

        // Mostrar resultados
        System.out.println("La computadora especificada es:");
        System.out.println("Marca: " + computadora.getMarca());
        System.out.println("Modelo: " + computadora.getModelo());
        System.out.println("Código de Barras: " + computadora.getCodigoBarras());
        System.out.println("Año: 2023");
        System.out.println("Código Ítem Denominación Precio");
        for (String[] componente : componentesSeleccionados) {
            System.out.println(componente[0] + " " + componente[1] + " " + componente[2]);
        }
        System.out.println("Total Componentes: " + totalComponentes);
        System.out.println("Recargo: " + recargo);
        System.out.println("Monto Final: " + computadora.getMontoFinal());

        sc.close();
    }
}
