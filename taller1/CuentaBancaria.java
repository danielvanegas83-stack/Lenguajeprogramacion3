package taller1;
import java.util.Scanner;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("El Nuevo saldo de " + titular + " es: " + saldo);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del titular: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = Double.parseDouble(scanner.nextLine());
        CuentaBancaria cuenta = new CuentaBancaria(nombre, saldoInicial);
        int opc2=1;
        while (opc2 != 0) {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Depositar");     
        System.out.println("2. Retirar");
        int opc = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        
        switch (opc) {
             
        case 1:
        cuenta.mostrarSaldo();
        System.out.print("¿Cuánto desea depositar?: ");
        double deposito = Double.parseDouble(scanner.nextLine());
        cuenta.depositar(deposito);
        System.out.println("Depósito exitoso.");
        cuenta.mostrarSaldo();
            break;
        case 2:
        cuenta.mostrarSaldo();
        System.out.print("¿Cuánto desea retirar?: ");
        double retiro = Double.parseDouble(scanner.nextLine());
        cuenta.retirar(retiro);
        System.out.println("Retiro exitoso.");
        cuenta.mostrarSaldo();
         break;
        
        }
         if (opc < 0 || opc > 2) {
                System.out.println("Opcion no valida, intente de nuevo");

            }
            System.out.println("\n Si desea salir de la transacciones ingrese 0, continuar ingrese 1");
            opc2 = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
        }
        System.out.println("\n Saliste de la de las transacciones bancarias.");
        //scanner.close();
    }
}