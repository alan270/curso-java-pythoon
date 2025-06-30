package Clase7;

public class tarea_clase7_libro {
    String titulo;
    String autor;
    int año;

    // Constructor
    public tarea_clase7_libro(String titulo, String autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }

    // Método
    public void mostrar_info() {
        
        System.out.println("Este es el titulo: " + titulo + " autor: " + autor + " y año de educicion:" + año);
    }

}
