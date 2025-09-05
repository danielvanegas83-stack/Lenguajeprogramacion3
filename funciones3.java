import java.util.Scanner;

public class funciones3 {

    public static int mayor(int[] lista) {
        int max = lista[0];
        for (int num : lista) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] lista = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un número: " + (i + 1) + " ");
            lista[i] = scanner.nextInt();

        }
        System.out.println("el numero mayor es: " + mayor(lista));
        scanner.close();

    }

}
