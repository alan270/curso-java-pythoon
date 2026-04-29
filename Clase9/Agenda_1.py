agenda = {}

def agregar_contacto():
    nombre = input("Ingrese el nombre del contacto: ")
    telefono = input("Ingrese el número de teléfono: ")
    correo = input("Ingrese el correo electrónico: ")
    agenda[nombre] = {"Teléfono": telefono, "Correo": correo}  ##Esto no se me occurrio y se lo pregunte a Chat
    print(f"Contacto '{nombre}' agregado exitosamente.\n")  ##Esto no se me ocurrio pero me parece un buen validador chat gpt

def mostrar_contactos():
    if not agenda:
        print("No hay contactos guardados.\n")
    else:
        print("\n--- Lista de Contactos ---")
        for nombre, info in agenda.items():
            print(f"Nombre: {nombre}")
            print(f"  Teléfono: {info['Teléfono']}")
            print(f"  Correo: {info['Correo']}\n")

def buscar_contacto():
    nombre = input("Ingrese el nombre del contacto a buscar: ")
    if nombre in agenda:
        print(f"\nContacto encontrado:")
        print(f"Nombre: {nombre}")
        print(f"  Teléfono: {agenda[nombre]['Teléfono']}")
        print(f"  Correo: {agenda[nombre]['Correo']}\n")
    else:
        print(f"El contacto '{nombre}' no se encuentra en la agenda.\n")

def eliminar_contacto():
    nombre = input("Ingrese el nombre del contacto a eliminar: ")
    if nombre in agenda:
        del agenda[nombre]
        print(f"Contacto '{nombre}' eliminado exitosamente.\n")
    else:
        print(f"El contacto '{nombre}' no existe en la agenda.\n")

def menu():
    while True:
        print("=== Agenda de Contactos ===")
        print("1. Agregar un nuevo contacto")
        print("2. Mostrar todos los contactos")
        print("3. Buscar contacto por nombre")
        print("4. Eliminar un contacto")
        print("5. Salir")
        
        opcion = input("Seleccione una opción (1-5): ")
        
        if opcion == '1':
            agregar_contacto()
        elif opcion == '2':
            mostrar_contactos()
        elif opcion == '3':
            buscar_contacto()
        elif opcion == '4':
            eliminar_contacto()
        elif opcion == '5':
            print("Saliendo del programa. ¡Hasta luego!")
            break
        else:
            print("Opción no válida. Intente nuevamente.\n")

menu()
