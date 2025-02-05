package AtividadesFOR;

public class Ativ_52 {
    public static void main(String[] args) {
        int count = 0;
        int numero = 2;
        int limite = 10;

        do {
            boolean isPrimo = true;

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if (isPrimo) {
                System.out.println(numero);
                count++;
            }

            numero++;

        } while (count < limite);
    }
}
