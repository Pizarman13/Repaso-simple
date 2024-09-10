import java.util.Scanner;

public class Ejercicios {

    //main
    public static void main(String[] args) {

        //Ejercicio 1
        int a = 5;
        int b = 3;

        System.out.println("Ejercicio 1");
        System.out.println("La suma de " + a + " + " + b + " es: " + suma(a, b));
        System.out.println("La resta de " + a + " - " + b + " es: " + resta(a, b));
        System.out.println("La multiplicación de " + a + " * " + b + " es: " + multiplicacion(a, b));
        System.out.println("La división de " + a + " / " + b + " es: " + division(a, b));

        //Ejercicio 2
        System.out.println("\nEjercicio 2");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Bienvenido al modulo M03B " + nombre + "!");

        //Ejercicio 3
        System.out.println("\nEjercicio 3");

        System.out.println("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();

        System.out.println("El área del círculo es: " + areaCirculo(radio));

        //Ejercicio 4
        System.out.println("\nEjercicio 4");

        System.out.println("Ingrese un numero mayor que 0: ");
        int num = sc.nextInt();

        contadorDigitos(num);

        //Ejercicio 5
        System.out.println("\nEjercicio 5");

        int nums = 0;
        int sum = 0;
        int cont = 0;

        do {
            System.out.println("Ingrese un número (0 para acabar): ");
            nums = sc.nextInt();

            sum += nums;
            cont++;

        } while (nums != 0);

        System.out.println("La suma de los números es: " + sum);
        System.out.println("La media de los números es: " + (sum / cont));

    }

    public static int suma(int a, int b){
        return a + b;
    }

    public static int resta(int a, int b){
        return a - b;
    }

    public static int multiplicacion(int a, int b){
        return a * b;
    }

    public static int division(int a, int b){
        if (b == 0){
            System.out.println("No se puede dividir por 0");
            return 0;
        }
        return a / b;
    }

    public static double areaCirculo(double radio){
        return Math.PI * Math.pow(radio, 2);
    }

    public static void contadorDigitos(int num){
        int contador = 0;
        while(num != 0){
            num = num / 10;
            contador++;
        }
        System.out.println("El número tiene " + contador + " dígitos");
    }
}
