import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        int contadorPositivo = 0;
        int contadorNegativo = 0;
        int contadorCero = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un número: ");
            n = sc.nextInt();
            if (n > 0) contadorPositivo++;
            else if (n < 0) contadorNegativo++;
            else contadorCero++;
        }
        System.out.printf("%d Números negativos\n", contadorNegativo);
        System.out.printf("%d Ceros\n", contadorCero);
        System.out.printf("%d Números positivos\n", contadorPositivo);
    }
}
