/*Crea un programa que gestione un menú de opciones para una pequeña agenda personal. El programa debe:
1.-Mostrar un menú con opciones:
    Agregar contacto
    Listar contactos
    Buscar por nombre
    Salir
2.-Al agregar un contacto, solicitar: nombre, edad, email y ciudad.
3.-Guardar los contactos usando una lista de mapas (ArrayList<Map<String, String>>)
4.-Validar edad con condiciones (if/else) y clasificar la etapa de vida.
5.-Usar funciones para:
    Mostrar el menú
    Agregar contacto
    Mostrar contacto(s)
6.-El programa debe repetir el menú hasta que el usuario decida salir. */



package tareas_de_repaso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class tarea_de_repaso {

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
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Agregar un nuevo contacto
    public static void agregarContacto(Scanner sc, ArrayList<Map<String, String>> contactos) {
        Map<String, String> contacto = new HashMap<>();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Ciudad: ");
        String ciudad = sc.nextLine();

        String etapa = clasificarEtapa(edad);

        contacto.put("Nombre", nombre);
        contacto.put("Edad", String.valueOf(edad));
        contacto.put("Etapa", etapa);
        contacto.put("Email", email);
        contacto.put("Ciudad", ciudad);

        contactos.add(contacto);
        System.out.println("Contacto agregado exitosamente.");
    }

    // Clasificar etapa de vida según la edad
    public static String clasificarEtapa(int edad) {
        if (edad < 13) {
            return "Niño";
        } else if (edad < 18) {
            return "Adolescente";
        } else if (edad < 60) {
            return "Adulto";
        } else {
            return "viejo";
        }
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

    // Mostrar un contacto individual
    public static void mostrarContacto(Map<String, String> contacto) {
        System.out.println("----------------------------");
        for (Map.Entry<String, String> entry : contacto.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}