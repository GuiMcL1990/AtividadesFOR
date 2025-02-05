package AtividadesFOR;

public class Ativ_30 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int countPares = 0;
        int countImpares = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }
        }

        System.out.println("Números pares: " + countPares);
        System.out.println("Números ímpares: " + countImpares);
    }
}
