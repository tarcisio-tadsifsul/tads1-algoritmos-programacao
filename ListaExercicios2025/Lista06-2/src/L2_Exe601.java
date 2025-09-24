/**
 * Construa um laço de repetição com while que
 * solicite números inteiros várias vezes e
 * a cada leitura imprima se é par ou ímpar.
 * A condição para sair deve ser a leitura do número 0.
 */

 import java.util.Scanner;
public class L2_Exe601 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = -1;

        System.out.print("\n");

        while (i != 0) {
            System.out.print("Digite um número inteiro: ");
            i = sc.nextInt();

            if (i == 0) break;
            
            if (i % 2 == 0) {
                System.out.println("-> " + i + " é par \n");       
            } else {
                System.out.println("-> " + i + " é ímpar \n");       
            }
        }
        sc.close();
    }
}
