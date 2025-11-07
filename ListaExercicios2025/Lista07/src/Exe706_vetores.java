import java.util.Arrays;

/**
 * 06 - Crie um vetor com double chamado notas com 4 notas: 7.5, 8.0, 6.5, 9.0.
 * Calcule e imprima a média aritmética dessas notas.
 */

public class Exe706_vetores {
    public static void main(String[] args){
        double[] notas = {7.5, 8.0, 6.5, 9.0};
        double soma = 0.0f;

        for (double nota : notas){
            soma += nota;
        }

        double media = soma / notas.length;

        System.out.println("Notas: " + Arrays.toString(notas));
        System.out.println("A média das notas é " + media);
    }
}
