package brandon;

public class Main{
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Brandon Cordero");
        persona.setEdad(19);
        persona.setTelefono(809747035);

        System.out.println("nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Telefono: " + persona.getTelefono());

    }
} 

class Persona{
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre){
        this.nombre = nombre;
    } 
    
    public String getNombre(){
        return nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    } 
    
    public int getEdad(){
        return edad;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    } 
    
    public int getTelefono(){
        return telefono;
    }
}

