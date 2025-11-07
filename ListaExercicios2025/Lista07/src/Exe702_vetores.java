import java.util.Arrays;
import java.util.Scanner;

/**
 * 02 - Crie um vetor de String chamado frutas com 4 posições.
 * Peça ao usuário que digite o nome de uma fruta para cada posição e armazene no vetor.
 * Em seguida, imprima o vetor completo.
 */

public class Exe702_vetores {
    public static void main (String[] args){
        String[] frutas = new String[4];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome de 4 frutas:");
        for(int i = 0; i <= 3;i++){
            System.out.print("Fruta na posição " + i +": ");
            frutas[i] = sc.nextLine();
        }

        sc.close();
        
        System.out.println("O vetor completo é: ");
        String arrFrutas = Arrays.toString(frutas);
        System.out.println(arrFrutas);
        
        // String vFrutas = String.join(", ", frutas);
        // System.out.println("["+ arrFrutas +"]");
    }
}
