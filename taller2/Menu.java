
import java.util.Scanner;

    
    public class Menu {
        public static void main(String[] args) {
            Mascota mascota = new Mascota();
            Calculadora calculadora = new Calculadora();
            Scanner sc = new Scanner(System.in);
            int opc=1;
           
    
            while (opc!=7) {
               System.out.print("Ingrese la opcion del menu al que quieres ingresar: \n " +
                        "1. Saludo Mascota \n " +
                        "2. Baile Mascota \n " +
                        "3. Suma \n " +
                        "4. Resta \n " +
                        "5. Multiplicacion \n " +
                        "6. Division \n " +
                        "7. Salir \n " +
                        "Seleccione la Opcion que desea consultar : "
                        );

                                
                     opc = sc.nextInt();
                     sc.nextLine();
                      
                
    
                switch (opc) {
                    case 1:
                        
                        mascota.pintarConejo();
                        break;
                    case 2:
                        mascota.baile();
                        break;
                    case 3:
                        double num1 = 0;
                        double num2 = 0;
                        boolean entradaValida = false;

                        // Validar primer número
                        while (!entradaValida) {
                            System.out.print("Ingrese el primer número: ");
                            String input = sc.nextLine();
                            try {
                                num1 = Double.parseDouble(input);
                                entradaValida = true;
                            } catch (NumberFormatException e) {
                                System.out.println("parametro no permitido, ingrese un número válido.");
                            }
                        }

                        entradaValida = false;

                        // Validar segundo número
                        while (!entradaValida) {
                            System.out.print("Ingrese el segundo número: ");
                            String input = sc.nextLine();
                            try {
                                num2 = Double.parseDouble(input);
                                entradaValida = true;
                            } catch (NumberFormatException e) {
                                System.out.println(" parametro no permitido,  ingrese un número válido.");
                            }
                        }
                        double Resultado = calculadora.suma(num1, num2);
                        mascota.Conejosuma(Resultado);
                        break;
                    case 4:
                        num1 = 0;
                        num2 = 0;
                         entradaValida = false;

                        // Validar primer número
                        while (!entradaValida) {
                            System.out.print("Ingrese el primer número: ");
                            String input = sc.nextLine();
                            try {
                                num1 = Double.parseDouble(input);
                                entradaValida = true;
                            } catch (NumberFormatException e) {
                                System.out.println("parametro no permitido, ingrese un número válido.");
                            }
                        }

                        entradaValida = false;

                        // Validar segundo número
                        while (!entradaValida) {
                            System.out.print("Ingrese el segundo número: ");
                            String input = sc.nextLine();
                            try {
                                num2 = Double.parseDouble(input);
                                entradaValida = true;
                            } catch (NumberFormatException e) {
                                System.out.println("parametro no permitido, ingrese un número válido.");
                            }
                        }
                        double Res = calculadora.resta(num1,num2);
                        mascota.ConejosResta(Res);
                        
                        break;
                    case 5:
                        num1 = 0;
                        num2 = 0;
                        entradaValida = false;

                        // Validar primer número
                        while (!entradaValida) {
                            System.out.print("Ingrese el primer número: ");
                            String input = sc.nextLine();
                            try {
                                num1 = Double.parseDouble(input);
                                entradaValida = true;
                            } catch (NumberFormatException e) {
                                System.out.println("parametro no permitido, ingrese un número válido.");
                            }
                        }

                        entradaValida = false;

                        // Validar segundo número
                        while (!entradaValida) {
                            System.out.print("Ingrese el segundo número: ");
                            String input = sc.nextLine();
                            try {
                                num2 = Double.parseDouble(input);
                                entradaValida = true;
                            } catch (NumberFormatException e) {
                                System.out.println("parametro no permitido,  ingrese un número válido.");
                            }
                        }
                        double Multi = calculadora.multiplicacion(num1,num2);
                        mascota.conejoMulti(Multi);
                        break;
                    case 6:
                        num1 = 0;
                        num2 = 0;
                        entradaValida = false;

                        // Validar primer número
                        while (!entradaValida) {
                            System.out.print("Ingrese el primer número: ");
                            String input = sc.nextLine();
                            try {
                                num1 = Double.parseDouble(input);
                                entradaValida = true;
                            } catch (NumberFormatException e) {
                                System.out.println("parametro no permitido, ingrese un número válido.");
                            }
                        }

                        entradaValida = false;

                        // Validar segundo número
                        while (!entradaValida) {
                            System.out.print("Ingrese el segundo número: ");
                            String input = sc.nextLine();
                            try {
                                num2 = Double.parseDouble(input);
                                entradaValida = true;
                            } catch (NumberFormatException e) {
                                System.out.println("parametro no permitido, ingrese un número válido.");
                            }
                        }

                        double Divi = calculadora.division(num1, num2);
                        mascota.ConejosDivi(Divi);

                        break;
                        
                    case 7:

                        System.out.println("¡Decidiste salir! Hasta luego!");
                        break;
                    
                }
                if (opc < 1 || opc > 7) {
                    mascota.error();
                }   
            }
            sc.close();
        }
    
       
    }
    

