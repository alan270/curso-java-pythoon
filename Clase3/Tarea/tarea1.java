package Clase3.Tarea;
import java.util.Scanner;

public class tarea1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eres Estudiante: -");
        Boolean estudiante=sc.nextBoolean();
        
        System.out.println("Edad: + ");
        int edad = sc.nextInt();

        if (estudiante && edad>=18) {
            System.out.println("Puedes aplicar al programa");  
        } else {
            System.out.println("Estas bien muerto");
        }
       
        



    }   
}

