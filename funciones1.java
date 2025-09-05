import java.util.Scanner;

public class funciones1 {

    public static String esParOImpar(int numero) {

        if (numero % 2 == 0) {

            return "el numero: " + numero + " es Par";

        } else {
            return "el numero: " + numero + " es Impar";
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número a validar: ");
        int numero = scanner.nextInt();
        System.out.println(esParOImpar(numero));

    }

}
