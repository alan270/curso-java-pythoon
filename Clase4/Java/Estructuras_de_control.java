import java.util.Scanner;

public class Estructuras_de_control {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int edad = 15;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else if (edad >= 13) {
            System.out.println("Eres adolescente");
        } else {
            System.out.println("Eres niño");
        }

        System.out.println("Ingresa no día: -");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Día inválido");
        }

        System.out.println("Ingresa tu nota: -");
        int nota = sc.nextInt();

        if (nota >= 90) {
            System.out.println("Excelente");

        } else if (nota >= 80) {
            System.out.println("Muy bien");

        } else if (nota >= 70) {
            System.out.println("Bien");
           
        } else if (nota >= 60) {
            System.out.println("Suficiente");    
        
        } else {
            System.out.println("Te pareces a Allan");
        }
      

    }
}



