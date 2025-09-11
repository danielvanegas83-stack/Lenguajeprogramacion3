package taller1;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Crear el objeto Scanner

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt(); // Leer un número entero
        int resultado = 0;
        System.out.println("la a tabla del numero : " + numero + " es:");
        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);

        }

    }

}
