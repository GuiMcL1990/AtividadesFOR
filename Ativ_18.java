package Atividades;

import java.util.Scanner;

public class Ativ_18 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite uma string: ");
                String texto = scanner.nextLine();

                texto = texto.replace(" ", "").toLowerCase();

                if (ehPalindromo(texto)) {
                    System.out.println("A string é um palíndromo!");
                } else {
                    System.out.println("A string não é um palíndromo.");
                }

                scanner.close();
            }

            public static boolean ehPalindromo(String texto) {
                int inicio = 0;
                int fim = texto.length() - 1;

                while (inicio < fim) {
                    if (texto.charAt(inicio) != texto.charAt(fim)) {
                        return false;
                    }
                    inicio++;
                    fim--;
                }

                return true;
            }
        }