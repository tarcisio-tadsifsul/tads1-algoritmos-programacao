
/**
 * Lista 05 - Switch-Case
 * 
 * 12) Crie um programa que simule o processamento de um pedido em uma loja.
 * O usuário deve escolher um item do menu (Ex: 1. Camiseta, 2. Calça, 3. Tênis) e a quantidade.
 * 
 * Utilize `switch` para determinar o preço unitário do item e calcular o total.
 * Se o item não existir, informe uma mensagem de erro.
 */

import java.util.Scanner;

public class Exe512 {
    public static void main(String[] args) {
        // Inicia atribuições e variáveis
        Scanner sc = new Scanner(System.in);
        int quant = 0;
        float precoUnit = 0f, valorTotal = 0f;
        String itemNome = "", op = "123";
        char itemMenu;

        // Exibe o menu e lê a opção do usuário
        System.out.println("\n--- PROCESSAMENTO DE PEDIDO ---");
        System.out.print("\nMENU PRODUTOS ------------"
                + "\n[1] Camisetas....R$ 49,99"
                + "\n[2] Calças.......R$ 69,99"
                + "\n[3] Tênis........R$129,99"
                + "\n\nEscolha uma opção: ");
        itemMenu = sc.next().charAt(0);

        // Verifica se a opção é válida
        if (op.indexOf(itemMenu) == -1) {
            System.out.println("[ERRO - Opção inválida] Encerrando programa.");
            System.exit(0);
        }

        // Lê a quantidade do item
        System.out.print("Quantidade do item: ");
        // Verifica se a entrada é um número inteiro
        if (sc.hasNextInt()) {
            quant = sc.nextInt();
        } else {
            System.out.println("[ERRO - Opção inválida] Encerrando programa.");
            System.exit(0);
        }

        // Fecha o scanner
        sc.close();

        // Determina o nome do item e o preço unitário com base na opção escolhida
        switch (itemMenu) {
            case '1':
                itemNome = quant > 1 ? "Camisetas" : "Camiseta";
                precoUnit = 49.99f;
                break;
            case '2':
                itemNome = quant > 1 ? "Calças" : "Calça";
                precoUnit = 69.99f;
                break;
            case '3':
                itemNome = "Tênis";
                precoUnit = 129.99f;
                break;
            default:
                System.out.println("[ERRO - Item inválido] Encerrando programa.");
                System.exit(0);
                break;
        }

        // Calcula o valor total do pedido
        valorTotal = quant * precoUnit;

        // Exibe o resumo do pedido
        System.out.println("\nRESUMO PEDIDO -------------");
        System.out.printf("Produto:          %s", itemNome);
        System.out.printf("\nQuantidade:       %d", quant);
        System.out.printf("\nPreço Unitario:   R$ %.2f", precoUnit);
        System.out.println("\n---------------------------");
        System.out.printf("Valor Total:      R$ %.2f", valorTotal);
        System.out.println();
    }
}
