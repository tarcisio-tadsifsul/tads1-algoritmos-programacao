/* 
 * Lista 06 Exe605
 * Crie um programa que receba um número inteiro que defina a condição de vezes
 * que um laço de repetição irá executar.
 * Logo após, mostre apenas os números pares.
 */

import java.util.Scanner;

public class Exe605 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDigite um número inteiro: ");
        int n = sc.nextInt();
        sc.close();
        int i = 0;
        while (i <= n) {
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }

    }
}
