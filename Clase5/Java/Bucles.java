import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Valor de i: " + i);
        }  
        
        int suma=0;
        int i = 0;
        while (i < 5) {
            suma= suma+i;
            System.out.println("i vale: " + i);
            System.out.println("suma vale: " + suma);
            i++;
        }
        System.out.println("total de suma: " + suma);

        for (int a = 0; a < 10; a++) {
            if (a == 5) break;
            System.out.println(a);
        }

        for (int b = 0; b < 5; b++) {
            if (b == 2) continue;
            System.out.println(b);
        }

        Scanner sc=new Scanner(System.in);
        int intento=0;
        while (intento<3) {
            System.out.println("Ingresa la contraseña");
            String contrasena = sc.nextLine();

            if (contrasena.equals("perrito")){
                System.out.println("Contraseña correcta");
                break;
                
            }
            else {
                System.out.println("Contraseña incorrecta");
                intento++;

            }
        }


    }
}

//Validar una  contraseña, ingrese una contraseña, lees y si es correcta le das el acceso, si no lo vuelve a preguntar hasta 3 veces, despues de 3 veces termina



