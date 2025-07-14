package Clase8;

public class Desarrollador extends Empleado {

    public Desarrollador(String Nombre, int Salario) {
        super(Nombre, Salario);
        
    }

    @Override
    public void trabajar() {
        System.out.println(Nombre + " Desarrolla");
    }    

}
