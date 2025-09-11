package taller1;
import java.util.Scanner;

public class funciones2 {

    public static String factorial(int numero) {
        int resultado = 1;
        for (int i = numero; i > 0; i--) {
            resultado = resultado * i;
        }
        return "el factorial de " + numero + " es: " + resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        System.out.println(factorial(5));

    }
}
