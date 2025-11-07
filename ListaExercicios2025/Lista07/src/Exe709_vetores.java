import java.util.Arrays;

/**
 * 09 - Crie um vetor A de 5 posições: 1, 2, 3, 4, 5.
 * Crie um segundo vetor `B` de 5 posições onde cada elemento seja o quadrado do elemento correspondente em A.
 * Imprima os dois vetores.
 */

public class Exe709_vetores {
    public static void main(String[] args) {
        int[] vetorA = {1,2,3,4,5};
        int[] vetorB = new int[vetorA.length];
    
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i] * vetorA[i];
        }

        System.out.println(
            "\nVetor A: \n" +
            Arrays.toString(vetorA) + "\n" +
            "\nVetor B: \n" +
            Arrays.toString(vetorB)
        );
    }
}
