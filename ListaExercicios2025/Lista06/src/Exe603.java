/*
 * Lista 06 Exe03 - 603
 * Crie um programa que peça ao usuário para digitar números inteiros.
 * O programa deve somar todos os números digitados
 * e parar quando o usuário digitar o número 0. Logo, mostre na tela.
 */
import java.util.Scanner;

public class Exe603 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = -1, soma = 0;
        while (n != 0) {
            System.out.print("Digite o n: ");
            n = sc.nextInt();

            soma = soma + n;
        }
        sc.close();
        System.out.println("Soma = " + soma);
    }
}
