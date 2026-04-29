/*class Contact:
    def __init__(self, name, phone, email):
        self.name = name
        self.phone = phone
        self.email = email

    def show_info(self):
        print("Nombre:", self.name)
        print("Teléfono:", self.phone)
        print("Correo:", self.email)
        print("------------------------") */



package Clase9.Agenda_Java;

public class Contact {
    public String nombre;
    public String telefono;
    public String email;

    public Contact(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public void showInfo_1() {
        System.out.println("nombre" + this.nombre);
        System.out.println("telefono" + this.telefono);
        System.out.println("email" + this.email);
    }

    public String getNombre() {
        return nombre;
    }

    public void showInfo() {
        System.out.println(nombre + " - " + telefono + " - " + email);
    }

    public String toFile() {
        return nombre + ";" + telefono + ";" + email;
    }
    
}
