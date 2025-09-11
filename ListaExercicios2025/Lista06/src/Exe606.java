/**
 * Lista 06 Exe606
 * Construa um programa que receba um número inteiro,
 * mas se for lido um número negativo ou zero
 * deverá seguir lendo até que seja executado um valor igual ou maior que um.
 * Logo, mostre na tela.
 */

 import java.util.Scanner;

public class Exe606 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;

        while(n <= 0){
            System.out.print("\nDigite um número inteiro: ");
            n = sc.nextInt();
            if (n > 0){
                System.out.print("\n" + n + " é maior ou igual a 1!\n");
            }
        }
        

        sc.close();

    }
}
