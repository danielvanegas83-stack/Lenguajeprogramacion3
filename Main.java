import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc2 = 1;
        while (opc2 != 0) {

            System.out.print(
                    "Ingrese la opcion del menu al que quieres ingresar: \n " +
                            "1. Ejercicio 1 Lista de 1-10 \n " +
                            "2. Ejercicio 2 Suma De Numeros De 1-100 \n " +
                            "3. Ejercicio 3 Tabla Multiplicar\n " +
                            "4. Funcion 1 Par/Impar \n " +
                            "5. Funcion 2 Factorial \n " +
                            "6. Funcion 3 Numero Mayor \n " +
                            "7. Funcion 4 Operiones De Dos Numeros \n " +
                            "8. clase Persona \n " +
                            "9. Clase Rectangulo \n " +
                            "10. Clase Cuenta Bancaria \n " +
                            "11. Clase Coche \n " +
                            "Seleccione la Opcion que desea consultar : ");

            int opc = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opc) {
                case 1:
                    ejercicio1.main(args);
                    break;
                case 2:
                    ejercicio2.main(args);

                    break;
                case 3:
                    ejercicio3.main(args);

                    break;
                case 4:
                    funciones1.main(args);

                    break;
                case 5:
                    funciones2.main(args);

                    break;
                case 6:
                    funciones3.main(args);

                    break;
                case 7:
                    funciones4.main(args);

                    break;
                case 8:
                    System.out.print("generaremos un saludo: ");
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese edad: ");
                    int edad = Integer.parseInt(scanner.nextLine());
                    Persona persona = new Persona(nombre, edad);
                    persona.saludo();

                    break;
                case 9:
                    System.out.print("Ingrese la Base: ");
                    double base = Double.parseDouble(scanner.nextLine());
                    System.out.print("Ingrese la Altura: ");
                    double altura = Double.parseDouble(scanner.nextLine());
                    Rectangulo rectangulo = new Rectangulo(base, altura);
                    System.out.println("El área del rectángulo es: " + rectangulo.Area());
                    System.out.println("El perímetro del rectángulo es: " + rectangulo.Perimetro());

                    break;
                case 10:
                    CuentaBancaria.main(args);
                    break;
            case 11:
                    Coche.main(args);

                    break;

            }

            if (opc < 0 || opc > 10) {
                System.out.println("Opcion no valida, intente de nuevo");

            }
            System.out.println("\nSi desea salir del programa ingrese 0 continuar con otra opcion ingrese 1");
            opc2 = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer
            /*try {
                System.out.println("\nSi desea salir del programa ingrese 0, continuar con otra opcion ingrese 1");
                
                opc2 = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
            } catch (Exception e) {
                System.out.println("Entrada inválida. Saliendo del programa.");
                break;
            }*/
        }
        System.out.println("\n Saliste del programa.");
        scanner.close();
    }

}
