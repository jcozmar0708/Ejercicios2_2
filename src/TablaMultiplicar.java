import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Escribe un número: (-1 = FIN)");
            numero = sc.nextInt();
            if (numero != -1) {
                for (int i = 1; i < 10; i++) {
                    System.out.printf("%d x %d = %d\n", i, numero, i * numero);
                }
            }
        } while (numero != -1);
    }
}
