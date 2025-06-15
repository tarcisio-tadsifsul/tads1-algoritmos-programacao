
/**
 * Lista 03 - if-else
 * 
 * 1) Uma loja de departamentos está oferecendo diferentes formas de pagamento,
 * conforme opções listadas a seguir.
 * 
 * • Pagamento à vista – conceder desconto de 5%;
 * • Pagamento em 2x – o valor não sofre alterações;
 * • Pagamento em 3x – acréscimo de 2%;
 * • Pagamento em 4x – acréscimo 8%;
 * • Pagamento em 5x – acréscimo 12,50%.
 * 
 * Faça um algoritmo que leia o valor total de uma compra e
 * calcule o valor do pagamento final de acordo com a opção escolhida.
 * Se a escolha for por pagamento parcelado, calcule também o valor de cada
 * parcela.
 * 
 * Ao final, apresente o valor total da compra e o valor das parcelas.
 * 
 */

import java.util.Scanner;

public class Exe301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opPagto = 0;
        float valorCompra = 0, valorParcela = 0, valorTotal = 0, altValor = 0;
        String descOp = "";

        System.out.println("\n--- SISTEMA DE PAGAMENTO ---");
        System.out.print("\nValor da Compra: R$ ");
        valorCompra = sc.nextFloat();
        System.out.print("\nFormas de Pagamento:" +
                "\n [1] Pagamento à vista com 5% off" +
                "\n [2] Parcelado 2x sem juros" +
                "\n [3] Parcelado 3x com 2% juros" +
                "\n [4] Parcelado 4x com 8% juros" +
                "\n [5] Parcelado 5x com 12,5% juros");
        System.out.print("\n\nEscolha uma opção: ");
        opPagto = sc.nextInt();

        sc.close();

        if (opPagto < 1 || opPagto > 5) {
            System.out.println("Opção inválida. Encerrando sistema.");
            System.exit(0);
        } else if (opPagto == 1) {
            altValor = 1 - (5.00f / 100);
            descOp = "À vista com 5% off";
        } else if (opPagto == 2) {
            altValor = 1.0f;
            descOp = "Parcelado em 2x sem juros";
        } else if (opPagto == 3) {
            altValor = 1 + (2.00f / 100);
            descOp = "Parcelado em 3x com 2% juros";
        } else if (opPagto == 4) {
            altValor = 1 + (8.00f / 100);
            descOp = "Parcelado em 4x com 8% juros";
        } else {
            altValor = 1 + (12.50f / 100);
            descOp = "Parcelado em 5x com 12,5% juros";
        }

        // Alternatica com Switch-case
        // switch (opPagto) {
        // case 1:
        // altValor = 1 - (5.00f /100);
        // break;
        // case 2:
        // altValor = 0.0f;
        // break;
        // case 3:
        // altValor = 1 + (2.00f /100);
        // break;
        // case 4:
        // altValor = 1 + (8.00f /100);
        // break;
        // case 5:
        // altValor = 1 + (12.50f /100);
        // break;
        // default:
        // System.out.println("Opção inválida! Encerrando sistema.");
        // System.exit(0);
        // break;
        // }

        valorTotal = valorCompra * altValor;
        valorParcela = valorTotal / opPagto;

        System.out.print("\nRESULTADO:");
        System.out.printf("\n Valor da Compra: R$%.2f", valorCompra);
        System.out.printf("\n Opção Pagamento: %s", descOp);
        if (opPagto != 1) {
            System.out.printf("\n Valor da Parcela: %.2f", valorParcela);
        }
        System.out.printf("\n Valor Total da Compra: %.2f", valorTotal);
    }
}
