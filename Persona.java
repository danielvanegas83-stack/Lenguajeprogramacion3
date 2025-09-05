public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludo() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

}
