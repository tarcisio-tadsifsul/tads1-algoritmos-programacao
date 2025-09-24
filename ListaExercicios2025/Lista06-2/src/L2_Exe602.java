import java.util.Scanner;

/**
 * Desenvolva um laço de repetição com while que calcule a média
 * de uma série de notas informadas pelo usuário.
 * O usuário deve digitar -1 para indicar o fim da entrada de notas
 * e deve imprimir a média aritmética.
 */

public class L2_Exe602 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        float somaNotas = 0.0f, nota = 0.0f, qtdeNota = 0.0f;

        System.out.println("Digite as notas dos Alunos.");
        System.out.println("Para sair digite (-1)");

        while (true) {
            System.out.print("Digite a " + (qtdeNota+1) + "ª nota: ");
            nota = sc.nextFloat();

            if (nota == -1){
                break;
            }

            somaNotas += nota;
            qtdeNota++;
        }
        sc.close();
        
        if (qtdeNota > 0) {
            float media = somaNotas / qtdeNota;
            System.out.println("\nA médias das notas é " + media + "\n");
        } else {
            System.out.println("Nenhuma nota foi inserida!");
        }
        
        
    }
}
