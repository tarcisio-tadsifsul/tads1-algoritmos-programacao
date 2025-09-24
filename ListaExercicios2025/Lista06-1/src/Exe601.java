/*
 * Lista 06 Exe01 - 601
 * Escreva um programa que imprima uma contagem regressiva de 10 até 1.
 * E depois, imprima os números de 1 a 10 na tela usando o while.
 * 
 */

public class Exe601 {
    public static void main(String[] args){
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
        i++;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}
