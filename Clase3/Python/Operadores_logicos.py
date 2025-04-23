
nombre="luis"
edad= 20

print("Hola", nombre)
print(f"Hola {nombre}, tienes {edad} años")  # f-string

mayor_de_edad = edad >= 18
es_estudiante = True

if mayor_de_edad and es_estudiante:
    print("Es mayor de edad y estudiante")
    print("ya toca el timbre")