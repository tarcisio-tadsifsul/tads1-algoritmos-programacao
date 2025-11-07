/**
 * 05 - Crie um vetor valores com 6 números inteiros: 15, 8, 22, 5, 10, 12. = 72
 * Calcule e imprima a soma total de todos os seus elementos.
 */
import java.util.Arrays;
public class Exe705_vetores {
    public static void main(String[] args){
        int[] valores = {15,8,22,5,10,12};
        int soma = 0;

        for (int valor : valores){
            soma += valor;
        }

        System.out.println("Vetor: " + Arrays.toString(valores));
        System.out.println("A soma total dos Elementor é " + soma);
    }
}
