public class funciones {
    public static String saludar(String nombre) {
        return "Hola, " + nombre + "!";
    }

    public static void main(String[] args) {
        System.out.println(saludar("Luis"));

        String[] frutas = {"manzana", "banana", "cereza"};
        System.out.println(frutas[1]);
        frutas[0] = "pera";

        for (String fruta : frutas) {
            System.out.println(fruta);
        }




    }
    

    
}


