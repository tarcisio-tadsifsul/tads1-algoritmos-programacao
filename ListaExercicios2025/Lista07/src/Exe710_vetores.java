/**
 * 10 - Crie um vetor letras com 6 caracteres com o tipo char: "A", "B", "C", "D", "E", "F".
 * Imprima os elementos do vetor na ordem inversa (do último ao primeiro).
 */

public class Exe710_vetores {
    public static void main(String[] args) {
        char[] letras = {'A', 'B', 'C', 'D', 'E', 'F'};
        
        int totalLetras = letras.length - 1;

        System.out.print("\nVetor Caracteres Ordem Normal:  ");
        for(int i = 0; i <= totalLetras; i++){
            System.out.print(i == totalLetras ? letras[i] : letras[i] + ", ");
        }

        System.out.print("\nVetor Caracteres Ordem Inversa: ");
        for(int i = totalLetras; i >= 0; i--){
            System.out.print(i == 0 ? letras[i] + "\n\n" : letras[i] + ", ");
        }
        
    }
}
