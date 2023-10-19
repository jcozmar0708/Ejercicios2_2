import java.util.Scanner;

public class Ejercicio2 {
    static final int PERSONAS_AUTOBUSES = 55;
    public static void main(String[] args) {
        int personas;
        int suma_personas = 0;

        Scanner sc = new Scanner(System.in);

         do {
             System.out.println("Personas del grupo (0 = FIN): ");
             personas = sc.nextInt();

            if (personas > 0) System.out.println("Van: " + (suma_personas += personas));
            else if (personas < 0) System.out.println("No puede ser negativo");

        } while (personas != 0);

        if (suma_personas % PERSONAS_AUTOBUSES == 0) System.out.printf("Vamos a necesitar %d autobuses", suma_personas/PERSONAS_AUTOBUSES);
        else System.out.printf("Vamos a necesitar %d autobuses", (suma_personas/PERSONAS_AUTOBUSES) + 1);
    }
}
