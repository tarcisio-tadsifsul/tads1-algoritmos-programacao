/**
 * Lista 06 - Exe610
 * 
 * DESAFIO: Quantas vezes um laço de repetição deve executar
 * a partir do índice 1 até N para uma variável soma chegar no valor 28?
 * 3, 4, 5, 6 ou 7 vezes? TESTE! Logo, mostre na tela.
 */

public class Exe610 {
    public static void main(String[] args) {
        System.out.println("\n");
        int i = 1, soma = 0;
        while (i < 29) {
            soma = soma + i;
            System.out.println(i + " " + soma);
            if (soma == 28){
                break;
            }
            i++;
        }
        System.out.println("O Laço executou "+i+" vezes para soma chegar a "+soma+"!");
        System.out.println("\n");
    }
}
