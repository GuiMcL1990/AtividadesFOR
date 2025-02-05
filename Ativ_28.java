package Atividade_For;

public class Ativ_28 {
        public static void main(String[] args) {
            int[] numeros = {5, 10, 15, 20, 25};
            int soma = 0;

            for (int num : numeros) {
                soma += num;
            }

            double media = (double) soma / numeros.length;
            System.out.println("A média é: " + media);
        }
    }

