
/**
 * 2) Faça um programa que leia as duas notas de [0..10] obtidas por um aluno
 * e calcule a sua média aritmética. A atribuição de conceitos obedece à tabela abaixo:
 * 
 *  Média de aproveitamento     Conceito
 *  9.1 a 10.0                      A
 *  8.1 a 9.0                       B
 *  6.1 a 8.0                       C
 *  4.1 a 6.0                       D
 *  0.0 a 4.0                       E
 * 
 * Mostre na saída da tela: a média do aluno e o conceito correspondente.
 * 
 */

import java.util.Scanner;
// import java.util.Locale;

public class Exe302 {
    public static void main(String[] args) {
        // Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a nota #1: ");
        double nota1 = input.nextDouble();
        System.out.print("Informe a nota #2: ");
        double nota2 = input.nextDouble();
        input.close();

        double media = (nota1 + nota2) / 2;

        System.out.printf("\nMédia do aluno: %.2f", media);

        char conceito;

        if (media > 9) {
            conceito = 'A';
        } else if (media > 8) {
            conceito = 'B';
        } else if (media > 6) {
            conceito = 'C';
        } else if (media > 4) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }

        System.out.printf("\nConceito: %s", conceito);

    }
}
