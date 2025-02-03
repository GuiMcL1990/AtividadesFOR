package Atividades;

public class Ativ_7 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 100; i+= 2) {
            soma += i;
        }
        System.out.println("A soma dos numeros impares de 0 a 100 é");
        System.out.println(soma);
    }
}
