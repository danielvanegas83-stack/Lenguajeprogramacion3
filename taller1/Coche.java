package taller1;
import java.util.Scanner;

public class Coche {
    private String marca;
    private String modelo;
    private int año;

    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void mostrarInformacion() {
        System.out.println("Coche: " + marca + " " + modelo + " (" + año + ")");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la marca del coche: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese el modelo del coche: ");
        String modelo = scanner.nextLine();

        System.out.print("Ingrese el año del coche: ");
        int año = Integer.parseInt(scanner.nextLine());

        Coche coche = new Coche(marca, modelo, año);
        coche.mostrarInformacion();

        //scanner.close();    
    }
}