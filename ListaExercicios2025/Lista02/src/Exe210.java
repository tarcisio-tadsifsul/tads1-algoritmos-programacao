
/**
 * Lista de Exercicio 02
 * 
 * Exercicio 10
 * 
 * Enunciado:
 * 10) Pedro possui uma tele-entrega de pizzas e resolveu expandir o negócio.
 *     Ele tinha apenas 9 empregados que conseguiam entregar, por noite,
 *     117 pedidos. Entretanto, agora ele adicionou ao seu time mais 14 empregados.
 *     Faça um programa que leia estes dados e calcule a quantidade de pedidos
 *     que a empresa dele terá autonomia a partir de agora.
 * 
 */
import java.util.Scanner;

public class Exe210 {
    public static void main(String[] args) {
        // Declaraçao Variaveis
        Scanner entrada = new Scanner(System.in);
        int funcInicial, funcContratados, pedidosAtual, estimativaPedidos;

        // Entrada de Dados
        System.out.print("Numero Funcionarios Atual: ");
        funcInicial = entrada.nextInt();
        System.out.print("Total Pedidos que consegue produzir: ");
        pedidosAtual = entrada.nextInt();
        System.out.print("Numero Funcionarios Contratados: ");
        funcContratados = entrada.nextInt();

        // Calculos
        estimativaPedidos = ((funcInicial + funcContratados) * pedidosAtual) / funcInicial;

        // Saida de dados
        System.out.println("\nRestaurante do Pedro");
        System.out
                .println("Com " + funcInicial + " funcionarios,\n o restaurante entrega " + pedidosAtual + " pedidos.");
        System.out.println(
                "Se mais " + funcContratados + " funcionarios forem contratados,\n a estimativa de entregas sera de "
                        + estimativaPedidos + " pedidos.");

        // Fecha a classe Scanner
        entrada.close();
    }
}