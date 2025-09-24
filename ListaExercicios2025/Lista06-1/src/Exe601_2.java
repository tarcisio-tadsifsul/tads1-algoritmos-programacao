/*
 * Lista 06 Exe01 - 601
 * Escreva um programa que imprima uma contagem regressiva de 10 até 1.
 * E depois, imprima os números de 1 a 10 na tela usando o dowhile.
 * 
 */


public class Exe601_2 {
    public static void main(String[] args) {
        System.out.println("\n");

        int i = 10;
        do {
            System.out.print(i + " ");
            i--;
        } while (i > 0);

        System.out.println("\n---------------------");

        do {
            System.out.print(i+1 + " ");
            i++;
        } while (i < 10);

        System.out.println("\n");
    }
}
