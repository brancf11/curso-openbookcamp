public class main {

    public static void main(String[] args) {
        
    int resultado = 0;
    resultado = suma(10, 15, 25);
    System.out.println(resultado);
    

    coche Micoche = new coche();
    Micoche.agrgarpuerta();

    System.out.println(Micoche.puertas);
  }

  public static int suma(int a, int b, int c) {
    return a+b+c;

  }


}

class coche{
  public int puertas = 4;

  public void agrgarpuerta() { 
    this.puertas++;
  }
} 