package AtividadesFOR;

import java.util.Scanner;

public class Ativ_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int i = 1;

        System.out.println("Os primeiros 10 múltiplos de " + numero + " são:");
        do {
            System.out.println(numero * i);
            i++;
        } while (i <= 10);

        sc.close();
    }
}
