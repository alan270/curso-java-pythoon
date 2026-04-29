package Clase9.Agenda_Java;



public class Errores {

    public static void main(String[] var0) {
        try {
            int numero = Integer.parseInt("abc");
        }   catch (NumberFormatException e) {
            System.out.println("Número inválido." + e);
        }



    }
 


}
