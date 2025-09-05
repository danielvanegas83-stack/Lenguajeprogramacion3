import java.util.Scanner;

public class funciones4 {

    public static String operciones(int numero1, int numero2) {
        int Suma = numero1 + numero2;
        int Resta = numero1 - numero2;
        int Multiplicacion = numero1 * numero2;
        double Division = (double) numero1 / numero2;

        return "De los numeros ingresados: " + numero1 + " y " + numero2 + " :  \n La suma es: " + Suma
                + "\n la resta es: " + Resta
                + "\n la multiplicacion es: " + Multiplicacion + "\n la division es: " + Division;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese dos numeros número para operarlos : ");
        System.out.print("Digite el primer número : ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite el segundo número : ");
        int numero2 = scanner.nextInt();
        System.out.println(operciones(numero1, numero2));

    }

}
