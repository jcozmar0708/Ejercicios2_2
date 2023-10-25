import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero_random = (int) (Math.random()*100 + 1);
        int n;

        for (int i = 10; i > 0; i--) {
            System.out.println("Escribe un número:");
            n = sc.nextInt();
            if (n == numero_random) {
                System.out.println("Has acertado");
                break;
            } else {
                if (i != 1) System.out.printf("Has fallado el número es %s quedan %d intentos\n",(n>numero_random ? "menor" : "mayor"),i-1);
                else System.out.printf("Has fallado quedan %d intentos\n", i);
            }
        }
        System.out.println("El número era: " + numero_random);
    }
}
