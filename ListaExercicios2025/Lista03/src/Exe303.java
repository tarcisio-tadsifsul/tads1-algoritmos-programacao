
/**
 * 3) A nota final de um estudante é calculada a partir de três notas notas de [0..10], 
 *    respectivamente, a um trabalho prático, a uma prova 1 e 2.
 *    A média ponderada das três notas mencionadas anteriormente obedece aos pesos:
 *      Trabalho prático: peso 2;
 *      Prova 1: peso 3;
 *      Prova 2: peso 5.
 * 
 *    Leia as notas do aluno e imprima na tela se ele atingiu a média maior ou igual a 6.00 
 *    e foi aprovado ou se ele foi reprovado no semestre.
 */

import java.util.Scanner;

public class Exe303 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a nota do Trabalho: ");
        double trabalho = input.nextDouble();
        System.out.print("Informe a nota da Prova #1: ");
        double prova1 = input.nextDouble();
        System.out.print("Informe a nota da Prova #2: ");
        double prova2 = input.nextDouble();

        input.close();

        double media = ((trabalho * 2) + (prova1 * 3) + (prova2 * 5)) / (2 + 3 + 5);
        System.out.printf("\nMedia do Aluno: %.2f", media);

        if (media > 6) {
            System.out.println("\nAluno Aprovado!");
        } else {
            System.out.println("\nAluno Reprovado!");
        }
    }
}
