package AtividadesFOR;

import java.util.Scanner;

public class Ativ_48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número (ou 0 para encerrar): ");
            numero = scanner.nextInt();

            if (numero != 0) {

                if (numero % 2 == 0) {
                    System.out.println("O número " + numero + " é PAR.");
                } else {
                    System.out.println("O número " + numero + " é ÍMPAR.");
                }
            }

        } while (numero != 0);

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
