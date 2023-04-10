public class Main {

    public static void main(String[] args) {
        int numeroif = 16;

        if (numeroif > 0) {
            System.out.println("La variable numeroIf es:" + numeroif + " Un numero positivo");
        } else if (numeroif < 0) {
            System.out.println("La variable numeroIf es:" + numeroif + " Un numero negativo");
        } else {
            System.out.println("La variable numeroIf es: " + numeroif + " es cero");
        }

        int numerowhile = 1;
        while (numerowhile < 3) {
            System.out.println("Nuestra variable numerowhile ahora es: " + numerowhile);
            numerowhile = numerowhile + 1;
        }

        int numeroDowhile = 6;
        do {
            System.out.println("La variable numeroDowhile ahora es :" + numeroDowhile);
            numeroDowhile = numeroDowhile + 1;
        } while (numeroDowhile < 3);

        for (int numerofor = 0; numerofor <= 3; numerofor = numerofor + 1) {
            System.out.println("La varible numerofor ahora es:" + numerofor);
        }

        String estacion = "primavera";
        switch (estacion) {
            case "otoño":
                System.out.print("Estamos en la estacion otoño y se esta lloviendo mucho");
                break;
            case "primavera":
                System.out.println("Estamos en la estacion primavera y las Flores mas hermosa estan floreciondo");
                break;
            case "Invierno":
                System.out.println("Estamos en la estacion invierno y esta haciendo mucho frio");
                break;
            case "verano":
                System.out.println("Estamos en la estacion verano y ya llegaron las vacaciones");
                break;
            default:
                System.out.println("Esta no es una estacion");
        }
    }

}