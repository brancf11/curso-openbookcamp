package  brandon;


public class main1{
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        System.out.println("Datos del Cliente");

        System.out.println("");

        cliente.nombre = "Brandon Cordero";
        cliente.edad = 19;
        cliente.telefono = 809657231;
        cliente.credito = 5000.50;

        System.out.println("EL Nombre del cliente es: " + cliente.nombre);
        System.out.println("La ede  del cliente es: " + cliente.edad);
        System.out.println("EL telefono del cliente es: " + cliente.telefono);
        System.out.println("EL credito del cliente es: " + cliente.credito);

        System.out.println("");

        System.out.println("Datos del trabajador");

        System.out.println("");

        trabajador.nombre = "David Bonillas";
        trabajador.edad = 19;
        trabajador.telefono = 809657231;
        trabajador.salario = 25000;

        System.out.println("EL Nombre del trabajador es: " + trabajador.nombre);
        System.out.println("La edad  del trabajador es: " + trabajador.edad);
        System.out.println("EL telefono del trabajador es: " + trabajador.telefono);
        System.out.println("EL credito del trabajador es: " + trabajador.salario);

    }

}

class Persona{
    int edad;
    int telefono;
    String nombre;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    int salario;
}