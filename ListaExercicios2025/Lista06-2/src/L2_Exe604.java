/**
 * 
 * Construa um laço de repetição com while que calcule
 * o fatorial de um número inteiro positivo informado pelo usuário.
 * O fatorial de um número n (n!) é o produto de todos os inteiros positivos de 1 até o n lido.
 * Ex.: Número 5, seu fatorial será o resultado de 1 * 2 * 3 * 4 * 5.
 * 
 */
import java.util.Scanner;
public class L2_Exe604 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme um número: ");
        int nFatorial = sc.nextInt();
        int resultado = 1, i = 2;

        while (i <= nFatorial) {            
            resultado *= i;
            i++;
        }

        System.out.println("!" + nFatorial + " = " + resultado +"\n");
        sc.close();
    }
}
