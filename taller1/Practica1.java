package taller1;

import java.util.Scanner;

public class Practica1 {

public void triangulo(Integer size){
    for (int Filas = 1;Filas <= size;Filas++) {
        for (int Columnas = 1; Columnas <= Filas; Columnas++) {
            System.out.print("* ");
        }
        System.out.println("");
    }
}

public static void main(String[] args) {
    System.out.println("Hola Mundo");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el tamaño del triángulo: ");
    Integer size = scanner.nextInt();

    Practica1 p1 = new Practica1();
    p1.triangulo(size);
}
}