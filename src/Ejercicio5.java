import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int espacios_total = 12;

        String numero;
        char palo;
        String palo_cadena = null;

        System.out.println("Introduce el número");
        numero = sc.nextLine();

        System.out.println("Introduce el palo");
        palo = sc.next().charAt(0);

        switch (numero) {
            case "1":
                numero = "AS";
                break;
            case "10":
                numero = "SOTA";
                break;
            case "11":
                numero = "CABALLO";
                break;
            case "12":
                numero = "REY";
                break;
        }

        switch (palo) {
            case 'O':
               palo_cadena = "OROS";
               break;
            case 'E':
                palo_cadena = "ESPADAS";
                break;
            case 'B':
                palo_cadena = "BASTOS";
                break;
            case 'C':
                palo_cadena = "COPAS";
                break;
        }

        for (int i = 0; i < 9; i++) {
            if (i == 0 || i == 8) {
                System.out.print('+');
                for (int j = 0; j < 12; j++) {
                    System.out.print('-');
                }
                System.out.println('+');
            } else {
                System.out.print('|');
                for (int k = 0; k < 12; k++) {
                    if (k == 1 && i == 1) {
                        System.out.print(" " + numero);
                        for (int v = 0; v < (espacios_total - numero.length()) - 1; v++) {
                            System.out.print(" ");
                        }
                    } else if (k == 1 && i == 7) {
                        for (int v = 0; v < (espacios_total - numero.length()) - 1; v++) {
                            System.out.print(" ");
                        }
                        System.out.print(numero + " ");
                    } else if (k == 1 && i == 2) {
                        System.out.print(" " + palo_cadena);
                        for (int v = 0; v < (espacios_total - palo_cadena.length()) - 1; v++) {
                            System.out.print(" ");
                        }
                    } else if (i > 2 && i < 7) System.out.print(" ");
                }
                System.out.println('|');
            }
        }
    }
}
