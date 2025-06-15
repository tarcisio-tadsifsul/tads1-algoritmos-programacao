
/**
 * Lista de Exercicio 02
 * 
 * Exercicio 06
 * 
 * Enunciado:
 * 06) Peça ao usuário para digitar três valores inteiros e imprima a soma deles.
 * 
 */
import java.util.Scanner;

public class Exe203 {
    public static void main(String[] args) {
        // Declaraçao Variaveis
        int n1, n2, n3, soma;
        Scanner entrada = new Scanner(System.in);

        // Entrada de Dados
        System.out.print("Digite o primeiro numero: ");
        n1 = entrada.nextInt();
        System.out.print("Digite o primeiro numero: ");
        n2 = entrada.nextInt();
        System.out.print("Digite o primeiro numero: ");
        n3 = entrada.nextInt();

        // Calculos
        soma = n1 + n2 + n3;

        // Saida de dados
        System.out.println("------------------------------");
        System.out.println("A soma dos numero digitados e " + soma);

        // Fecha a classe Scanner
        entrada.close();
    }
}
