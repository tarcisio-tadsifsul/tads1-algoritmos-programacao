/*
 * Lista 06 Exe604
 * Desenvolva um programa que peça um número ao usuário
 * e imprima a tabuada desse número, de 1 a 10.
 */

import java.util.Scanner;
public class Exe604_2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        
        System.out.print("Digite um número para calcular a tabuada: ");
        int n = sc.nextInt();
        sc.close();
        do {
            System.out.println(i + " x " + n + " = " + i*n);
            i++;
        } while (i <= 10);
    }
}
