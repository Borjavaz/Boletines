public class Boletin7_2 {
    public static void main(String[] args) {
        axenda("luns", 3);
    }

    public static void axenda(String dia, int hora) {
        String[][] horario = new String[][]{
                {"Matematicas", "Historia", "Deporte", "Piscina", "Deporte"},
                {"Matematicas", "Historia", "Deporte", "Compras", "Historia"},
                {"Compra", "Compras", "Piscina", "Matematicas", "Cmpras"},
                {"Deporte", "Matematicas","Piscina", "Piscina", "Historia"}};

        int numDia;
        switch (dia) {
            case "luns" -> numDia = 0;
            case "martes" -> numDia = 1;
            case "mercoles" -> numDia = 2;
            case "xoves" -> numDia = 3;
            case "venres" -> numDia = 4;
            default -> numDia = -1;
        }
        if (numDia < 0 || numDia >= 5) {
            System.out.println("Introduce un día válido entre luns e venres.");
        } else if (hora < 1 || hora > 5) {
            System.out.println("Introduce una hora válida entre 1 y 5.");
        } else {
            System.out.println("Materia: " + horario[numDia][hora-1]);
        }
    }
}
