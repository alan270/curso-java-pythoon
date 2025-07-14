package Clase8;

public class persona {
    
    private String nombre;   // atributo privado
    private int edad;

    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public int getEdad(){
        return edad;
    }
    
}
// Herencia
class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hablar() {
        System.out.println("El animal hace un sonido.");
    }
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hablar() {
        System.out.println(nombre + " dice: ¡Guau!");
    }
}


