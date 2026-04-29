from Contact import Contact

FILE_NAME = "contacts.txt"

def load_contacts():
    contacts = []
    try: #Intenta esto
        with open(FILE_NAME, "r") as file: #abra un archivo en modo "r" que es modo escritura, hay varios tipos.
            for line in file:
                data = line.strip().split(";") #strip es para quitar espacios y split es un delimitador
                if len(data) == 3:
                    contacts.append(Contact(data[0], data[1], data[2]))
    except FileNotFoundError:
        pass  # Si el archivo no existe, lo ignoramos
    return contacts



def save_contacts(contacts):
    with open(FILE_NAME, "w") as file: #"W" Write con permisos de escritura
        for contact in contacts:
            file.write(f"{contact.name};{contact.phone};{contact.email}\n")



def get_non_empty_input(prompt):
    while True:
        value = input(prompt).strip()
        if value:
            return value
        else:
            print("Este campo no puede estar vacío.")


def get_valid_phone(prompt):
    while True:
        phone = input(prompt).strip()
        if phone.isdigit():
            return phone
        else:
            print("El teléfono solo debe contener números.")            




def main():
    contacts = load_contacts()

    while True:
        print("\n1. Agregar contacto")
        print("2. Ver todos los contactos")
        print("3. Buscar por nombre")
        print("4. Eliminar contacto")
        print("5. Salir")

        choice = input("Elige una opción: ")

        if choice == "1":
            name = get_non_empty_input("Nombre: ")
            phone = get_valid_phone("Teléfono: ")
            email = get_non_empty_input("Correo: ")
            contacts.append(Contact(name, phone, email))
            save_contacts(contacts)

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
            save_contacts(contacts)

        elif choice == "5":
            print("¡Adiós!")
            break

        else:
            print("Opción no válida")


if __name__ == "__main__":
    main()
