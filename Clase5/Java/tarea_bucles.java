import java.util.Scanner;

public class tarea_bucles {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int operacion;
        double numero1;
        double numero2;

        do {
            System.out.println("seleccione una operación: ");
            System.out.println("1. Suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicacion");
            System.out.println("4. division");
            System.out.println("5. Salir");
            System.out.print("seleccione una opcion:");
            operacion = sc.nextInt();

            if (operacion >=1 && operacion <= 4) {
                System.out.print("Ingrese el primer numero:");
                numero1 = sc.nextDouble();
                System.out.print("Ingrese el segundo numero:");
                numero2 = sc.nextDouble();

                switch (operacion) {
                    case 1:
                        System.out.println("Resultado de la suma:" + (numero1 + numero2));
                        break;
                    case 2:
                        System.out.println("Resultado de la resta:" + (numero1 - numero2));
                        break;
                    case 3:
                        System.out.println("Resultado de la multiplicacion:" + (numero1 * numero2));
                        break;
                    case 4:
                        if (numero2 !=0){
                        System.out.println("Resultado de la division:" + (numero1 / numero2));
                        } else {
                            System.out.println("Error: No se puede dividir por cero");
                        }
                        break;
                
                    default:
                        break;
                }          

            } else if (operacion == 5){
                System.out.println("Gracias por usar la calculadora");
            }

        } while (operacion != 5);
        sc.close();
        

    }
}



