package Atividade_For;

public class Ativ_26 {
        public static void main(String[] args) {
            int base = 5;

            for (int i = 1; i <= base; i++) {
                for (int j = 1; j <= base - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print(i);
                }
                System.out.println();
            }

            for (int i = base - 1; i >= 1; i--) {
                for (int j = 1; j <= base - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }

