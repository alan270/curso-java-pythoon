package Clase4.Tarea;
import java.util.Scanner;

public class tarea4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero del 1-7: -");
        int no_dia=sc.nextInt();
        
        switch (no_dia) {
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
       
        



    }   
}

