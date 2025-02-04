package Atividades;

import java.util.Scanner;

public class Ativ_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("digite um valor");
        a = sc.nextInt();
        System.out.println("digite outro valor");
        b = sc.nextInt();
        int soma = 0;
        for (int i = 1; i <= b; i++) {
            soma++;
        }

        for (int i = 1; i <= a; i++) {
            soma++;
        }
        System.out.println("A soma de " + a + " e " + b + " é: " + soma);
        }
    }

