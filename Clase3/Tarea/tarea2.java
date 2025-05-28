package Clase3.Tarea;
import java.util.Scanner;

public class tarea2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu nacionalidad: -");
        String nacionalidad=sc.next();
        
        System.out.println("Edad: + ");
        int edad = sc.nextInt();

        if (nacionalidad.equals("Guatemanteco") && edad>=18) {
            System.out.println("Puedes votar");  
        } else {
            System.out.println("no puedes votar");
        }
       
       
        



    }   
}

