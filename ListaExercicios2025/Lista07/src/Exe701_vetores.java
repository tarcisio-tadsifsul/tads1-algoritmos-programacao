/**
 * 01. Declare um vetor de inteiros chamado números com 5 posições: 10, 20, 30, 40, 50. Imprima todos os elementos.
 */

public class Exe701_vetores {
    public static void main(String[] args) {
        //int[] numeros = new int[5];
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Elementos do vetor Números: ");
        for(int i = 0; i <= 4;i++){
            numeros[i] = (i + 1) * 10;
            System.out.println("Posição "+i+": " + numeros[i]);
        }
    }
}
