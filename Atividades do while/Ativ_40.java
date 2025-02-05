package AtividadesFOR;

import java.util.Scanner;

public class Ativ_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int numero;

        do {
            System.out.print("Digite um número (ou 0 para encerrar): ");
            numero = sc.nextInt();
            if (numero != 0) {
                contador++;
            }
        } while (numero != 0);

        System.out.println("Você digitou " + contador + " números.");

        sc.close();
    }
}
