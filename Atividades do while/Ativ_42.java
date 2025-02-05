package AtividadesFOR;

import java.util.Scanner;

public class Ativ_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String str = sc.nextLine();

        int tamanho = str.length();
        int i = tamanho - 1;

        do {
            System.out.print(str.charAt(i));
            i--;
        } while (i >= 0);

        sc.close();
    }
}
