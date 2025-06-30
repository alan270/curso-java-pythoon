def saludar(nombre):
    return f"Hola, {nombre}!"

print(saludar("Luis"))


###Listas y areglos:
frutas = ["manzana", "banana", "cereza"]
print(frutas[1])            # banana
frutas.append("naranja")    # agrega
frutas[0] = "pera"           # modifica

a = frutas[0]
a = frutas[1]
for fruta in frutas:
    print(fruta)

##Diccionarios de Python

persona = {
    "nombre": "Luis",
    "edad": 30
}
print(persona["nombre"])
persona["edad"] = 31
persona["ciudad"] = "Guatemala"

for clave, valor in persona.items():
    print(clave, ":", valor)
    