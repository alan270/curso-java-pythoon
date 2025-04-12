/*public class Variables {
    public static void main(String[] args) {
        //Ejemplo de varuables
        Comentario de Bloque 
        String nombre = "Luis";
        int edad = 25;
        double altura = 1.75;
        boolean esEstudiante = true; 

        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(altura);
        System.out.println(esEstudiante);
    }
}
*/

public class DatosPersonales {
    public static void main(String[] args) {
        String nombre = "Ana";
        int edad = 28 + 5;
        int año_actual = 2025;
        double altura = 1.68;
        boolean esEstudiante = false;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + (edad+10));
        System.out.println("Altura: " + altura);
        System.out.println("Estudiante: " + esEstudiante);
        System.out.println("Año_nacimiento: " + (año_actual- edad));
    }
}