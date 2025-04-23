public class Operadores_logicos {
    public static void main(String[] args) {

        String nombre = "alan";
        int edad = 20;
        System.out.println("Hola " + nombre);
        System.out.printf("Hola %s, tienes %d años\n", nombre, edad);

        boolean mayorDeEdad = edad >= 18;
        boolean esEstudiante = true;
        
        if (mayorDeEdad && esEstudiante) {
            System.out.println("Es mayor de edad y estudiante");
        }
    }
}

