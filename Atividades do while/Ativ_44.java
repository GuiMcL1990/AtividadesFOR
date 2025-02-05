package AtividadesFOR;

import java.util.Scanner;

public class Ativ_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        int i = 1;

        System.out.println("Divisores de " + n + ":");
        do {
            if (n % i == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= n);

        sc.close();
    }
}
