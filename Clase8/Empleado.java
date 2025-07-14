/*1. Crear una clase base Empleado con nombre y salario.

2. Crear clases hijas Desarrollador y Gerente que sobrescriban un método trabajar().

3. Usar getters y setters para proteger el salario.

Subir el código a GitHub en el repositorio clase-8. */


package Clase8;

public class Empleado {
    public String Nombre;   // atributo privado
    private int Salario;  // atributo privado

    public Empleado(String Nombre, int Salario) {
        this.Nombre = Nombre;
        this.Salario = Salario;
    }
    
    public void trabajar() {
        System.out.println("El empleado trabaja");
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.Nombre = nuevoNombre;
    }

    public int getSalario(){
        return Salario;

    }

    public void setSalario(int nuevoSalario) {
        this.Salario = nuevoSalario;
    }
}    



