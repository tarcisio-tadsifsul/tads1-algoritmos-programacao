
/**
 * Lista de Exercicio 02
 * 
 * Exercicio 06
 * 
 * Enunciado:
 * 06) Suponha que você foi ao supermercado e comprou 2 produtos.
 *     Faca um algoritmo que receba o nome do produto e o preço do produto comprado.
 *     Deverão ser mostrados o nome e o preço de cada produto obtido.
 * 
 */
import java.util.Scanner;

public class Exe206 {
    public static void main(String[] args) {
        // Declaraçao Variaveis
        String nomeProduto01, nomeProduto02;
        float precoProduto01, precoProduto02, totalCompra;
        Scanner entrada = new Scanner(System.in);

        // Entrada de Dados
        System.out.println("---- SUPERMERCADO ----");

        System.out.println("Informe o nome do produto comprado: ");
        nomeProduto01 = entrada.nextLine();

        System.out.println("Informe o preco desse produto: ");
        precoProduto01 = entrada.nextFloat();
        entrada.nextLine();

        System.out.println("Informe o nome do produto comprado: ");
        nomeProduto02 = entrada.nextLine();

        System.out.println("Informe o preco desse produto: ");
        precoProduto02 = entrada.nextFloat();
        entrada.nextLine();

        // Calculos soma total
        totalCompra = precoProduto01 + precoProduto02;

        // Saida de dados
        System.out.println("----------------");
        System.out.printf("%-10s %-10s\n", "Produto", "Preco");
        System.out.printf("%-10s %-10.2f\n", nomeProduto01, precoProduto01);
        System.out.printf("%-10s %-10.2f\n", nomeProduto02, precoProduto02);
        System.out.println("----------------");
        System.out.printf("%-10s %-10.2f", "Total", totalCompra);

        // Fecha a classe Scanner
        entrada.close();
    }
}
