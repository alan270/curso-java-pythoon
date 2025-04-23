import java.util.Scanner;

public class tarea {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Nombre: -");
        String nombre=obj.nextLine();
        
        System.out.println("Edad: + ");
        int edad = obj.nextInt();

        System.out.println("Edad proximo año: " + (edad + 1));



        }
}

    



/*int edad = 28 + 5;
        int año_actual = 2025;
        double altura = 1.68;
        boolean esEstudiante = false;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + (edad+10));
        System.out.println("Altura: " + altura);
        System.out.println("Estudiante: " + esEstudiante);
        System.out.println("Año_nacimiento: " + (año_actual- edad));
     */