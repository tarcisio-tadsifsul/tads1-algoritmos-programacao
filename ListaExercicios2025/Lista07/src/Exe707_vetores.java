/**
 * 07 - Crie um vetor de 10 posições com números inteiros: 1, 2, 5, 8, 10, 13, 16, 21, 22, 25.
 * Conte e imprima quantos números são pares e quantos são ímpares.
 */

import java.util.Arrays;
public class Exe707_vetores {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 5, 8, 10, 13, 16, 21, 22, 25};
        int par = 0, imp = 0;

        for (int n : numeros){
            if (n % 2 == 0) par++;
            else imp++; 
        }

        System.out.println("Vetor: " + Arrays.toString(numeros));
        System.out.println("Total de números pares: " + par);
        System.out.println("Total de números ímpares: " + imp);
    }
}
