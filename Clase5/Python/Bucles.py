##For

for i in range(5):
    print("Valor de i:", i)


##Bucle While

i = 0
while i < 5:
    print("i vale:", i)
    i += 1

##sentencias break y continue
for i in range(10):
    if i == 5:
        break
    print(i)

##Continue
for i in range(5):
    if i == 2:
        continue
    print(i)

##

for i in range(1,11):
    print(i)

##1.- Ingresar un numero 2.-Hacer un for que te sume del 1 hasta el numnero que ingreso el usuario 3.-imprimir la suma

n= int(input("Dame un numero: "))
suma=0
for i in range(1,n+1):
    print("i vale:", i)
    suma = suma+i
print('Total es',suma)
#suma = 1, 2da suma= 3, 3ra suma= 6, 4ta=10 5ta=10

