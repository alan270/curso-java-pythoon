##Tarea Python
##1. Crea una jerarquía de clases:
##Clase base: Vehiculo con método moverse()
##Clases hijas: Carro, Bicicleta, Avion
##Cada una sobrescribe moverse() con su propia implementación
##Instanciar objetos y llamar moverse() desde una lista o arreglo.

class vehiculo:
    def __init__(self, vehiculo):
        self.vehiculo = vehiculo     ##Porque me marca este error y asi si corre

    def moverse(self):
        print("El Vehiculo se mueve")

    # Clases hijas
class coche(vehiculo):
        def moverse(self):
            print(f"El carro {self.vehiculo} se mueve por autopistas")

class Bicicleta(vehiculo):
        def moverse(self):
            print("La bicicleta se mueve por ciclovias")

class Avion(vehiculo):
        def moverse(self):
            print("El avión vuela en el aire")

# Crear una lista de objetos
vehiculos = [coche("mazda"), Bicicleta("troncoso"), Avion("boeing")]

# Llamar al método moverse() para cada uno
for a in vehiculos:
    a.moverse()