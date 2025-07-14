package Clase8;

public class tarea_Empleado {
    public static void main(String[] var0) {
      Desarrollador des = new Desarrollador("luis",  100);
      Gerente gen = new Gerente("carlos", 1000);
      
        System.out.println(des.getNombre() +" "+ des.getSalario());
        System.out.println(gen.getNombre() +" "+ gen.getSalario());

      des.setSalario(500);
      des.trabajar();
      gen.trabajar();  


      System.out.println(des.getNombre() +" "+ des.getSalario());
   
    }



}
