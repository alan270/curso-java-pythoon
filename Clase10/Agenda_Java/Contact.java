package Clase10.Agenda_Java;

public class Contact {
    private Integer id;
    private String name;
    private String phone;
    private String email;

    public Contact(Integer id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Contact(String name, String phone, String email) {
        this(null, name, phone, email);
    }

    public Integer getId() { return id; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }

    @Override //metdo para imprimir tu contacto en consola
    public String toString() {
        return (id != null ? id : "-") + " | " + name + " | " + phone + " | " + email;
    }
}
