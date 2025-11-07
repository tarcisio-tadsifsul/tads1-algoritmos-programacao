import java.util.Arrays;

/**
 * 08 - Crie um vetor de 7 números inteiros: 4, 12, 6, 99, 15, 3, 20.
 * Encontre e imprima o maior valor presente no vetor.
 */

public class Exe708_vetores {
    public static void main(String[] args) {
        int[] vetor = {4,12,6,99,68,15,3,20,18,0};
        int maiorNumero = 0;

        for (int v : vetor){
            if (v > maiorNumero) maiorNumero = v;
        }

        System.out.println("Vetor: " + Arrays.toString(vetor));
        System.out.println("O maior número do vetor é " + maiorNumero);
    }
}
