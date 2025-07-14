/* 🧩 Descripción del Proyecto python/java
Vamos a crear una Agenda de Contactos, donde puedas:

1. Agregar un nuevo contacto (nombre, teléfono, correo). Clase contacto /Constructor

2. Mostrar todos los contactos guardados. Imprimir todos los atributos

3. Buscar contacto por nombre. Crear un menu con un while true con opción 
En python usar if_else y en java un swich/case

4. Eliminar un contacto.

5. Salir del programa.*/
package Clase9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Map<String, String>> contactos = new ArrayList<>();

        while (true) {
            mostrarMenu();
            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    agregarContacto(sc, contactos);
                    break;
                case 2:
                    listarContactos(contactos);
                    break;
                case 3:
                    buscarPorNombre(sc, contactos);
                    break;
                case 4:
                    eliminarContacto(sc, contactos);
                    break;
                case 5:
                    System.out.println("Salir.");
                    return;
                


                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    // Mostrar el menú de opciones
    public static void mostrarMenu() {
        System.out.println("\n--- AGENDA PERSONAL ---");
        System.out.println("1. Agregar contacto");
        System.out.println("2. Listar contactos");
        System.out.println("3. Buscar por nombre");
        System.out.println("4. Eliminar");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Agregar un nuevo contacto
    public static void agregarContacto(Scanner sc, ArrayList<Map<String, String>> contactos) {
        Map<String, String> contacto = new HashMap<>();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("telefono: ");
        int telefono = Integer.valueOf(sc.nextLine());
        System.out.print("Email: ");
        String email = sc.nextLine();
       

        contacto.put("Nombre", nombre);
        contacto.put("Telefono", String.valueOf(telefono));
        contacto.put("Email", email);
        
        contactos.add(contacto);
        System.out.println("Contacto agregado exitosamente.");
    }

    
    // Mostrar todos los contactos
    public static void listarContactos(ArrayList<Map<String, String>> contactos) {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos registrados.");
            return;
        }

        System.out.println("\n--- Lista de Contactos ---");
        for (Map<String, String> contacto : contactos) {
            mostrarContacto(contacto);
        }
    }

    // Buscar contacto por nombre
    public static void buscarPorNombre(Scanner sc, ArrayList<Map<String, String>> contactos) {
        System.out.print("Ingrese el nombre a buscar: ");
        String nombreBuscado = sc.nextLine();
        boolean encontrado = false;

        for (Map<String, String> contacto : contactos) {
            if (contacto.get("Nombre").equalsIgnoreCase(nombreBuscado)) {
                mostrarContacto(contacto);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        }
    }

        public static void eliminarContacto(Scanner sc, ArrayList<Map<String, String>> contactos) {
        System.out.print("Ingrese el nombre del contacto a eliminar: ");
        String nombreEliminar = sc.nextLine();
        boolean eliminado = false;

        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).get("Nombre").equalsIgnoreCase(nombreEliminar)) {
                contactos.remove(i);
                eliminado = true;
                System.out.println("Contacto eliminado exitosamente.");
                break;
            }
        }

        if (!eliminado) {
            System.out.println("No se encontró un contacto con ese nombre.");
        }
    }


    // Mostrar un contacto individual
    public static void mostrarContacto(Map<String, String> contacto) {
        System.out.println("----------------------------");
        for (Map.Entry<String, String> entry : contacto.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    

}
