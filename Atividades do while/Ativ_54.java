package AtividadesFOR;

import java.util.Scanner;

public class Ativ_54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;

        do {
            System.out.print("Digite um número (negativo para encerrar): ");
            numero = scanner.nextDouble();

            if (numero >= 0) {
                System.out.println("A raiz quadrada de " + numero + " é: " + Math.sqrt(numero));
            } else {
                System.out.println("Número negativo digitado, encerrando o programa.");
            }

        } while (numero >= 0);

        scanner.close();
    }
}
