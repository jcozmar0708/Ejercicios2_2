import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una cadena:");
        String cadena = sc.nextLine();

        System.out.println("Escribe un entero:");
        int entero = sc.nextInt();

        System.out.println("Escribe un carácter I (Izquierda), D (Derecha)");
        char direccion = sc.next().charAt(0);

        int caracteres_restantes = entero - cadena.length();

        switch (direccion) {
            case 'I':
                for (int i = 0; i < caracteres_restantes; i++) {
                    System.out.print('.');
                }
                System.out.print(cadena);
                break;
            case 'D':
                System.out.print(cadena);
                for (int i = 0; i < caracteres_restantes; i++) {
                    System.out.print('.');
                }
                break;
        }
    }
}
