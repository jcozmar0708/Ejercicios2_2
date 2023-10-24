import java.util.Scanner;

public class MediaEstadistica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad, altura;
        int suma_edades = 0;
        int suma_alturas = 0;
        int contador_veces = 0;
        int contador_mayores = 0;
        int contador_altos = 0;

        do {
            System.out.println("Escribe la edad (-1 = FIN)");
            edad = sc.nextInt();
            System.out.println("Escribe la altura (cm)");
            altura= sc.nextInt();
            if (edad != -1) {
                suma_edades += edad;
                suma_alturas += altura;
                contador_veces++;
                if (edad >= 18) contador_mayores++;
                if (altura >= 175) contador_altos++;
            }
        } while (edad != -1);

        System.out.println("La media de edad es de: " + suma_edades / contador_veces);
        System.out.println("La media de altura es de: " + suma_alturas / contador_veces);
        System.out.println(contador_mayores + " personas son mayores de 18");
        System.out.println(contador_altos + " personas miden más o igual a 175cm");
    }
}
