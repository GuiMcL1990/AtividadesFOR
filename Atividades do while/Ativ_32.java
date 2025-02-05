package AtividadesFOR;

import java.util.Scanner;

public class Ativ_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int numero;

        do {
            System.out.print("Digite um número (ou 0 para encerrar): ");
            numero = sc.nextInt();
            soma += numero;
        } while (numero != 0);

        System.out.println("A soma dos números digitados é: " + soma);

        sc.close();
    }
}