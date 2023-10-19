import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int n1,n2;
        int creciente = 0;
        int decreciente = 0;
        int contador_vez = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        n1 = sc.nextInt();

        do {
            contador_vez++;
            if (contador_vez == 1) {
                System.out.println("Siguiente número: (<0 == FIN)");
                n2 = sc.nextInt();
            } else {
                System.out.println("Siguiente número: (<0 == FIN)");
                n2 = sc.nextInt();
                if (n2 > n1) creciente++;
                else if (n2 < n1 && n2 >= 0) decreciente++;
                else if (n2 == n1) {
                    creciente++;
                    decreciente++;
                }
            }
            n1 = n2;
        } while (n2 >= 0);
        if (creciente > 0 && decreciente == 0) System.out.println("Es creciente");
        if (creciente == 0 && decreciente > 0) System.out.println("Es decreciente");
        if ((creciente > 0 && decreciente > 0) || (creciente == 0 && decreciente == 0)) System.out.println("Ni creciente ni decreciente");
    }
}
