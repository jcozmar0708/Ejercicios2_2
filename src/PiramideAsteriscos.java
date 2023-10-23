import java.util.Scanner;

public class PiramideAsteriscos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Qué altura quieres que tenga la pirámide?");
        int anchura = sc.nextInt();

        dibujarPiramide(anchura);
    }
    public static void dibujarPiramide(int anchura) {
        int asteriscos = 1;
        int espacios = anchura - 1;

        for (int i = 0; i < anchura; i++) {

            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * asteriscos - 1; j++) {
                System.out.print("*");
            }

            System.out.println();

            asteriscos++;
            espacios--;
        }
    }
}