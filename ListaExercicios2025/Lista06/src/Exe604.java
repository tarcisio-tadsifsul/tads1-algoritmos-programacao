/*
 * Lista 06 Exe604
 * Desenvolva um programa que peça um número ao usuário
 * e imprima a tabuada desse número, de 1 a 10.
 */

import java.util.Scanner;

public class Exe604 {
    public static void main(String[] args){
        byte i = 1; // byte apenas para testar pois tbm se aplica
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        sc.close();

        while(i <= 10){
            System.out.println(n + " x " + i + " = " + (n*i));
            i++;
        }
    }
}
