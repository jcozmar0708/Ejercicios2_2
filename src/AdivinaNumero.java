import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero_random = (int) (Math.random()*100 + 1);
        int n;

        for (int i = 0; i < 10; i++) {
            System.out.println("Escribe un número:");
            n = sc.nextInt();
            if (n == numero_random) {
                System.out.println("Has acertado");
                break;
            } else System.out.println("Has fallado");
        }
        System.out.println("El número era: " + numero_random);
    }
}
