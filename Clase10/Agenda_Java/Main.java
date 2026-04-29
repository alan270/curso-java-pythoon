package Clase10.Agenda_Java;


import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes.Name;



public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static final ContactDao dao = new ContactDao(); 
    
    public static void main(String[] args) {
        Db.ensureSchema();
        
        while (true) {
            System.out.println("1. Agregar contacto");
            System.out.println("2. Listar contacto");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Modificar contacto");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Salir");

            System.out.print("Elige una opción: ");
            String opcion = sc.nextLine().trim();

            switch (opcion) {
                case "1":
                    add();
                    
                    break;

                case "2":
                    list_all();
                                        
                    break;
                
                case "3":
                    select_name();
                    
                    break;

                case "4":
                    update();
                    
                    break;
                
                    case "5":
                    erase();
                    
                    break;
                
                
                case "6":
                    System.out.println("¡Adiós!");
                    sc.close();
                    return;

                default:
                    System.out.println("Opción no válida");
                    break;               


                
            }
        }
        
    }

    public static void add(){
        System.out.print("Nombre: ");  String name  = nonEmpty(sc.nextLine());
        System.out.print("Teléfono: ");String phone = nonEmpty(sc.nextLine());
        System.out.print("Correo: ");  String email = nonEmpty(sc.nextLine());
        dao.insert(new Contact(name, phone, email));



    }
    
    public static void list_all() {
        List<Contact> lista = dao.list_all();
        if (lista.isEmpty()) System.out.print("No Hay contactos: ");
        else lista.forEach(System.out::println);
      
     
    }

    public static void select_name(){
        System.out.print("Cual es el nombre que buscas: ");  String name  = nonEmpty(sc.nextLine());
        List<Contact> lista = dao.list_contact(name);
        if (lista.isEmpty()) System.out.print("No Hay contactos: ");
        else lista.forEach(System.out::println);
    }

    public static void update(){
        System.out.print("Ingrese el Id a Modificar del contacto: ");  int id  = sc.nextInt();
        System.out.print("Ingresa el nuevo Nombre: ");  String name  = nonEmpty(sc.nextLine());
        System.out.print("Ingresa el nuevo Teléfono: ");String phone = nonEmpty(sc.nextLine());
        System.out.print("Ingresa el nuevo Correo: ");  String email = nonEmpty(sc.nextLine());
        dao.update(new Contact(id,name, phone, email));
    }

        public static void erase(){
        System.out.print("Ingrese el Id a Modificar del contacto: ");  int id  = sc.nextInt();
        dao.erase(id);
    }






            
    private static String nonEmpty(String s) {
        s = s.trim();
        while (s.isEmpty()) {
            System.out.print("No puede estar vacío. Ingresa nuevamente: ");
            s = sc.nextLine().trim();
        }
        return s;
    }

}

    
   



        








