##1. Hacer un programa que imprima la tabla de multiplicar del 1 al 10 usando for.

numero = int(input('que numero quieres multiplicar del 1 al 10: '))

for i in range(1,11):
    print(f'{i} * {numero}= {i * numero}')


## 2. Crear una calculadora simple con while que repita operaciones (suma,resta,multiplicación) y division hasta que el usuario decida salir.    
numero1 = float(input("Introduce un numero: "))
numero2 = float(input("Introduce un numero: "))

operacion= input("Que operación quieres realizar (suma,resta,multiplicación o división):")

resultado = 0

if operacion == 'suma':
    resultado = numero1 + numero2
elif operacion == 'resta':
    resultado = numero1 - numero2
elif operacion == 'multiplicacion':
    resultado = numero1 * numero2
elif operacion == 'division':
    resultado = numero1 / numero2
print("El resultado es", resultado)

##Tarea con while
while True:
  print("Que operación quieres hacer")
  print("1. Suma")
  print("2. Resta")
  print("3. Multiplicación")
  print("4. División")
  print("5. Salir")

  operacion = input("Ingrese una opción con numero: ")

  if operacion == '1':
    print("Eligio suma")
    numero1 = int(input("Ingrese el primer numero: "))
    numero2 = int(input("Ingrese el segundo numero: "))
    print(numero1 + numero2)
    break
  elif operacion == '2':
    print("Eligio resta")
    numero1 = int(input("Ingrese el primer numero: "))
    numero2 = int(input("Ingrese el segundo numero: "))
    print(numero1 - numero2)
    break
  elif operacion == '3':
    print("Eligio multiplicacion")
    numero1 = int(input("Ingrese el primer numero: "))
    numero2 = int(input("Ingrese el segundo numero: "))
    print(numero1 * numero2)
    break
  elif operacion == '4':
    print("Eligio division")
    numero1 = int(input("Ingrese el primer numero: "))
    numero2 =int(input("Ingrese el segundo numero: "))
    if numero2 == 0:
      numero2 = int(input("No se puede dividir por 0 ingrese otro numero"))
    elif numero2 > 0:
      print(numero1/numero2)
      break
  elif operacion == '5':
    print("Saliendo del programa")
    break
  elif operacion != '1'or operacion != '2'or operacion != '3'or operacion != '4'or operacion != '5':
    print("Debe elegir un numero entre 1 y 5")