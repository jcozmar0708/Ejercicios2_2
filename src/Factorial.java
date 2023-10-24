import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 1;

        do {
            System.out.println("Escribe un número: (-1 = FIN)");
            numero = sc.nextInt();
            if (numero != -1) {
                for (int i = 1; i <= numero; i++) {
                    suma *= i;
                }
                System.out.printf("El factorial de %d es: %d\n",numero,suma);
            }
            suma = 1;
        } while (numero != -1);
    }
}
