no_dia= int(input("Dame numero del 1-7: "))
dia_semana = {
    1: "lunes",
    2: "martes",
    3: "miercoles",
    4: "jueves",
    5: "viernes",
    6: "sabado",
    7: "domingo"   
}
print(dia_semana.get(no_dia, "No existe el día"))




