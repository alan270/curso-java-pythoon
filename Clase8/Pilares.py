#Encapsulamiento
class Persona:
    def __init__(self, nombre, edad):
        self.__nombre = nombre      # atributo privado
        self.__edad = edad

    def get_nombre(self):
        return self.__nombre

    def set_nombre(self, nuevo_nombre):
        self.__nombre = nuevo_nombre

##Herencia

class Animal:
    def __init__(self, nombre):
        self.nombre = nombre

    def hablar(self):
        print("El animal hace un sonido.")

class Perro(Animal):
    def hablar(self):
        print(f"{self.nombre} dice: ¡Guau!")

##Polimorfismo
animales = [Perro("Fido"), Animal("Genérico")]
for a in animales:
    a.hablar()