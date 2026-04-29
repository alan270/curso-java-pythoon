from db import get_connection

def create_table():
    conn = get_connection()
    if conn:
        with conn.cursor() as cur:
            cur.execute("""
                CREATE TABLE IF NOT EXISTS contacts (
                    id SERIAL PRIMARY KEY,
                    name VARCHAR(100) NOT NULL,
                    phone VARCHAR(20) NOT NULL,
                    email VARCHAR(100) NOT NULL
                )
            """)
            conn.commit()
        conn.close()
print("✅ Tabla creada (si no existía).")

def add_contact(name, phone, email):
    conn = get_connection()
    if conn:
        with conn.cursor() as cur:
            cur.execute(
                "INSERT INTO contacts (name, phone, email) VALUES (%s, %s, %s)",
                (name, phone, email)
            )
            conn.commit()
        conn.close()
        print("✅ Contacto agregado con éxito.")


def list_contacts():
    conn = get_connection()
    if conn:
        with conn.cursor() as cur:
            cur.execute("SELECT id, name, phone, email FROM contacts ORDER BY id")
            results = cur.fetchall()  ##te da todos los resultados que tiene la tabla, te devuelve una lista
            if results:
                print("\n📒 Lista de contactos:")
                for row in results:
                    print(f"{row[0]} - {row[1]} - {row[2]} - {row[3]}")
            else:
                print("⚠️ No hay contactos aún.")
        conn.close()

def search_contacts(pname):
    conn = get_connection()
    if conn:
        with conn.cursor() as cur: ##%s (String es decir el tipo de dato)lo que te indica es que esa variable se obtendra a través de un parametro
            cur.execute (""" 
                SELECT id, name, phone, email
                FROM contacts
                WHERE LOWER(name) LIKE %s  
                ORDER BY id
            """, (f"%{pname.lower()}%",))
            results = cur.fetchall() ##función que te enlista los resultados  
            if results:
                print("\n📒 resultado de busqueda:")
                for row in results:
                    print(f"{row[0]} - {row[1]} - {row[2]} - {row[3]}")
            else:
                print("⚠️ No se encontraron coincidencias.")
        conn.close()

def delete_contact(contact_id):
    conn = get_connection()
    if conn:
        with conn.cursor() as cur:
            cur.execute("DELETE FROM contacts WHERE id = %s", (contact_id))
            conn.commit()
            print("🗑️ Contacto eliminado.")
        conn.close()


def update_contact(contact_id, new_name, new_phone, new_email):
    conn = get_connection()
    if conn:
        with conn.cursor() as cur:
            cur.execute("""
                UPDATE contacts
                SET name = %s, phone = %s, email = %s
                WHERE id = %s
            """, (new_name, new_phone, new_email, contact_id))
            conn.commit()
            print("✅ Contacto actualizado.")
        conn.close()
            


def main():
    create_table()
    while True:
        print("\n📋 AGENDA CON POSTGRESQL")
        print("1. Agregar contacto")
        print("2. Ver contactos")
        print("3. Buscar contacto")
        print("4. Borrar contacto")
        print("5. Actualizar Contacto")
        print("6. Salir")

        choice = input("Elige una opción: ")
        if choice == "1":
            name = input("Nombre: ")
            phone = input("Teléfono: ")
            email = input("Correo: ")
            add_contact(name, phone, email)

        elif choice == "2":
            list_contacts()

        elif choice == "3":
            search_contacts(input("Buscar por nombre: "))

        elif choice == "4":
            delete_contact(input("Id del contacto a eliminar: "))

        
        elif choice == "5":
            name = input("Nuevo Nombre: ")
            phone = input("Nuevo Teléfono: ")
            email = input("Nuevo Correo: ")
            contact_id= input("Id a actualizar: ")
            update_contact(contact_id, name, phone, email)            
            

        elif choice == "6":
            print("👋 ¡Hasta luego!")
            break
        else:
            print("❌ Opción inválida")

if __name__ == "__main__":
    main()
