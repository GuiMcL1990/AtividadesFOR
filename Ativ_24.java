package Atividade_For;

public class Ativ_24 {
    public static void main(String[] args) {
                int termos = 10;
                int soma = 0;

                System.out.println("Sequência de números triangulares até o décimo termo:");

                for (int i = 1; i <= termos; i++) {
                    soma += i;
                    System.out.println(soma);
                }
            }
        }