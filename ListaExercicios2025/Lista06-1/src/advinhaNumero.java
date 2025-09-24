import java.util.Random;
import java.util.Scanner;

public class advinhaNumero {
    public static void main(String[] args){
        Random random = new Random();
        int numeroSecreto = random.nextInt(10) + 1;

        Scanner sc = new Scanner(System.in);
        int palpite = 0;

        System.out.println("Tente advinhar um número de 1 a 10!");

        while (palpite != numeroSecreto) {
            System.out.print("Qual seu palpite: ");
            palpite = sc.nextInt();

            if (palpite != numeroSecreto){
                System.out.println("Você errou! Tente novamente.\n");
            }
        }

        System.out.println("Parabéns! Você acertou!");
        sc.close();
    }
}
