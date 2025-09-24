/*
 * Crie um programa para gerar um número aleatório entre 1 e 100.
 * O usuário deve tentar adivinhar o número.
 * O programa deve informar se a tentativa de acerto é muito alto ou muito baixo,
 * até que o usuário acerte.
 * 
 */

import java.util.Random;
import java.util.Scanner;

public class L2_Exe603 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int min = 1, max = 100;
        int rand = random.nextInt(max - min + 1) + min;
        int palpite = -1;
        int i = 1;

        System.out.print("\nJogo da ADVINHAÇÃO! Número de 1 a 100.\nVocê tem 5 TENTATIVAS\n\n");

        while (true){
            System.out.print("[#"+i+"] Qual seu palpite? ");
            palpite = sc.nextInt();

            if (palpite == rand) {
                System.out.println("PARABÉNS! Você acertou!\n");
                break;
            } else if (palpite < rand){
                System.out.println("ERROU, é MAIOR. Tente de novo!\n");
            } else if (palpite > rand) {
                System.out.println("ERROU, é MENOR. Tente novamente!\n");
            }

            if (i == 5) {
                System.out.println("Tentativas esgotadas! Número era "+rand+"\n");
                break;
            }

            i++;
        }
        sc.close();
    }
}
