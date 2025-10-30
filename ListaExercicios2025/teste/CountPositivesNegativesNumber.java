/**
 * Escreva um programa que peça ao usuário para digitar números inteiros repetidamente.
 * O programa deve contar quantos números positivos e quantos números negativos foram digitados.
 * O laço de repetição deve parar quando o usuário digitar o número 0.
 * Ao final, o programa deve imprimir o total de números positivos e o total de números negativos.
 */

 import java.util.Scanner;

public class CountPositivesNegativesNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0, qtdNumPos = 0, qtdNumNeg = 0, acc = 0;
        Boolean test = true;

        while (test){
            System.out.print("\nDigite um número inteiro positivo ou negativo: ");
            num = sc.nextInt();

            if (num > 0){
                qtdNumPos++;
            } else if(num < 0){
                qtdNumNeg++;
            } else if(num == 0){
                test = false;
            }

            acc++;
        }
        sc.close();

        System.out.println("Total Números Digitados: " + (acc - 1));
        System.out.println("Total Positivos: " + qtdNumPos);
        System.out.println("Total Negativos: " + qtdNumNeg);

    }
}
