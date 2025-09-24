/*
 * Lista 06 Exe03 - 603
 * Crie um programa que peça ao usuário para digitar números inteiros.
 * O programa deve somar todos os números digitados
 * e parar quando o usuário digitar o número 0. Logo, mostre a soma na tela.
 */

import java.util.Scanner;

public class Exe603_2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int i = -1, soma = 0;
        
        do {
            System.out.print("Informe um número inteiro: ");
            i = sc.nextInt();
            soma += i;
        } while(i != 0);

        sc.close();
        System.out.println("Soma dos números digitados é " + soma);
    }
}
