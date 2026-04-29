/*def main():
    contacts = []

    while True:
        print("\n1. Agregar contacto")
        print("2. Ver todos los contactos")
        print("3. Buscar por nombre")
        print("4. Eliminar contacto")
        print("5. Salir")

        choice = input("Elige una opción: ")

        if choice == "1":
            name = input("Nombre: ")
            phone = input("Teléfono: ")
            email = input("Correo: ")
            contacts.append(Contact(name, phone, email))

        elif choice == "2":
            for contact in contacts:
                contact.show_info()

        elif choice == "3":
            search = input("Buscar nombre: ")
            for contact in contacts:
                if contact.name.lower() == search.lower():
                    contact.show_info()
                    

        elif choice == "4":
            delete_name = input("Nombre a eliminar: ")
            contacts = [c for c in contacts if c.name.lower() != delete_name.lower()]

        elif choice == "5":
            print("¡Adiós!")
            break

        else:
            print("Opción no válida")


if __name__ == "__main__":
    main() */


package Clase9.Agenda_Java;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    private static final String FILE_NAME = "contacts.txt";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contacts = loadContacts();

        while (true) {
            System.out.println("1. Agregar contacto");
            System.out.println("2. Ver todos los contactos");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Salir");

            System.out.print("Elige una opción: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = sc.nextLine();
                    System.out.print("Correo: ");
                    String email = sc.nextLine();
                    contacts.add(new Contact(nombre, telefono, email));
                    saveContacts(contacts);
                    break;

                case "2":
                    for (Contact c : contacts) {
                        c.showInfo();
                    }
                    break;
                
                case "3":
                    System.out.print("Buscar nombre: ");
                    String buscar_contacto = sc.nextLine();
                    for (Contact c : contacts) {
                        if (c.nombre.toLowerCase().equals(buscar_contacto.toLowerCase())) {
                            c.showInfo();
                        }
                    }
                    break;

                case "4":
                    System.out.print("Nombre a eliminar: ");
                    String deleteName = sc.nextLine();
                    contacts.removeIf(c -> c.nombre.equalsIgnoreCase(deleteName));
                    saveContacts(contacts);
                    break;
                
                case "5":
                    System.out.println("¡Adiós!");
                    sc.close();
                    return;

                default:
                    System.out.println("Opción no válida");
                    break;               


                
            }
        }
        
    }

    private static ArrayList<Contact> loadContacts() {
        ArrayList<Contact> contacts = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                if (data.length == 3) contacts.add(new Contact(data[0], data[1], data[2]));
            }
        } catch (IOException e) {
        // Si el archivo no existe, no hacemos nada
        }
        return contacts;
    }
            
    
    private static void saveContacts(ArrayList<Contact> contacts) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Contact c : contacts) bw.write(c.toFile() + "\n");
        } catch (IOException e) {
            System.out.println("Error al guardar contactos: " + e.getMessage());
        }
    }

}

    
   



        








