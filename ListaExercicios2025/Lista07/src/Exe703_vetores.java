/**
 * 03 - Crie um vetor de inteiros chamado sequencia com 8 posições.
 * Preencha o vetor automaticamente de 1 até 8
 * (ou seja, sequencia[0] deve ser 1, sequencia[1] deve ser 2, e assim por diante).
 * Imprima o vetor.
 */

public class Exe703_vetores {
    public static void main (String[] args){
        int[] sequencia = new int[8];
        String vSequencia = "";
        System.out.println("Vetores de Sequencia (1 a 8):");
        for(int i = 0; i < sequencia.length; i++){
            sequencia[i] = i + 1;
            vSequencia += sequencia[i] + (i < sequencia.length - 1 ? ", " : "");
        }
        
        System.out.println("["+ vSequencia +"]");

    }
}
