public class Mascota {

    private String orejas = "(|___/)";
    private String cara = "(='.'=)";
    private String patas = "(''|_/'')";

    public void pintarConejo(String nombre){

        System.out.println(this.orejas);
        System.out.println(this.cara+"    Hola "+ nombre);
        System.out.println(this.patas);
    }

    public void cambiarCara(String newface){
        this.cara = newface;
    }

    public void saludo(String nombre){
        String cara = this.cara;
        String saludo = cara +  "    Hola " + nombre;
        this.cara = saludo;
    }

    public void baile()  {
        for (int i = 0; i < 10; i++) {
           
            System.err.println(" /^ ^\\\n/ 0 0 \\\nV\\ Y /V\n / - \\\n |    \\\n || (__V");
        try {
            Thread.sleep(500); // pausa entre impresion
        } catch (InterruptedException e) {
            System.out.println("¡El baile fue interrumpido!");
        }
        //System.out.println("");
        System.out.println("  /^ ^\\\n / 0 0 \\\n V\\ Y /V\n  / - \\\n /    |\nV__) ||");
        try {
            Thread.sleep(500); // pausa entre impresion
        } catch (InterruptedException e) {
            System.out.println("¡El baile fue interrumpido!");
        }
    
            
        }
        
    }

    public void Conejosuma(double Resultado) {
        double resultado = Resultado;
        String sumcara = this.cara +"  la suma es "+ resultado ;
        System.out.println(this.orejas);
        System.err.println(sumcara);
        System.out.println(this.patas);
    }
    public void ConejosResta(double Resultado) {
        double resultado = Resultado;
        String sumcara = this.cara +"  la Resta es "+ resultado ;
        System.out.println(this.orejas);
        System.err.println(sumcara);
        System.out.println(this.patas);
    }
    public void conejoMulti(double Resultado) {
        double resultado = Resultado;
        String sumcara = this.cara +"  la Multiplicacion es "+ resultado ;
        System.out.println(this.orejas);
        System.err.println(sumcara);
        System.out.println(this.patas);
    }
    public void ConejosDivi(double Resultado) {
        double resultado = Resultado;
        String sumcara = this.cara +"  la Division es  "+ resultado ;
        System.out.println(this.orejas);
        System.err.println(sumcara);
        System.out.println(this.patas);
    }

    public void error(){
        System.out.println("Opcion no valida");
        String sumcara = this.cara +"  Opcion no valida  ";
        System.out.println(this.orejas);
        System.err.println(sumcara);
        System.out.println(this.patas);
    }
    
}
