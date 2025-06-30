##Solicite el nombre, edad, y ciudad de una persona.

##Clasifique su etapa de vida: niño, adolescente, adulto, adulto mayor.

##Permita ingresar una lista de 5 calificaciones y calcule el promedio.

##Use una función para mostrar un saludo personalizado con su nombre y etapa de vida.

##Guarde todos los datos en un diccionario y los imprima uno por uno.

## Pregunte si desea continuar (sí/no). Si no, salir con break.

def etapa_vida(edad):
  if edad < 13:
    return "niño"
  elif edad < 18:
    return "adolescente"
  elif edad < 60:
    return "adulto"
  else:
    return "adulto mayor"


def saludo(nombre, etapa):
    print(f"\nHola {nombre}, estás en la etapa de la vida: {etapa}.")

base_personas=[]

while True:
    nombre= input("Cual es tu nombre: ")
    edad= int(input("Cual es tu edad: "))
    ciudad = input ("¿En que ciudad vives?:")

    etapa = etapa_vida(edad)
    
    # def saludar(nombre):
    #return f"Hola, {nombre}!"
    saludo(nombre,etapa)  

    calificaciones = []
    print("Ingrese 5 calificaciones:")
    for i in range(5):
        nota = float(input(f"Calificación {i + 1}: "))
        calificaciones.append(nota)

    promedio = sum(calificaciones) / len(calificaciones)
    #clase 6
    datos_persona = {
        "Nombre": nombre,
        "Edad": edad,
        "Ciudad": ciudad,
        "Etapa de vida": etapa,
        "Calificaciones": calificaciones,
        "Promedio": promedio
    }
    
    
    base_personas.append(datos_persona)
    
    ##clase 6
    print("\n--- Datos registrados ---")
    for persona in base_personas:
      for clave, valor in persona.items():
        print(f"{clave}: {valor}")
      print("---------------------- \n")
    salir= input("¿Deseas ingresar otra persona? (si/no): ").lower()
    if salir!= "si":
      break 

