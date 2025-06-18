/**
 * Lista 05 - Switch
 * 
 * 6) O cardápio de uma lancheria é o seguinte:
 * 
 *    Especificação         Código      Preço
 *    Cachorro Quente       100         1.20
 *    Bauru Simples         101         1.30
 *    Bauru com Ovo         102         1.50 
 *    Hamburguer            103         1.20 
 *    Chessburguer          104         1.30 
 *    Refrigerante          105         1.00 
 * 
 *    
 *    Implemente um programa que leia o código do item pedido,
 *    a quantidade e calcule o valor a ser pago por aquele lanche.
 *     
 *    Considere que a cada execução somente será calculado um item.
 *    Use o comando switch.
 * 
 * 
 */


import java.util.Scanner;
public class Exe506 {
    public static void main(String[] args){
        int id, quant;
        float preco = 0, totalPedido = 0;
        String produto = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- LANCHERIA DO XIS ---\n");
        System.out.print("Escolha o seu lanche pelo código: \n" +
                            "\n100. Cachorro Quente....R$ 1,20" +
                            "\n101. Bauru Simples......R$ 1,30" +
                            "\n102. Bauru com Ovo......R$ 1,50" +
                            "\n103. Hamburguer.........R$ 1,20" +
                            "\n104. Chessburguer.......R$ 1,30" +
                            "\n105. Refrigerante.......R$ 1,00\n" +
                            "\nCódigo do Produto: "        
        );
        id = sc.nextInt();
        System.out.print("Quantidade: ");
        quant = sc.nextInt();

        sc.close();

        switch (id){
            case 100:
                preco = 1.20f;
                produto = "Cachorro Quente";
                break;
            case 101:
                preco = 1.30f;
                produto = "Bauru Simples";
                break;
            case 102:
                preco = 1.50f;
                produto = "Bauru com Ovo";
                break;
            case 103:
                preco = 1.20f;
                produto = "Hamburguer";
                break;
            case 104:
                preco = 1.30f;
                produto = "Chessburguer";
                break;
            case 105:
                preco = 1.00f;
                produto = "Refrigerante";
                break;                
            default:
                System.out.println("Código inválido!");
                System.exit(0);
                break;
        }

        totalPedido = quant * preco;

        System.out.println("\n[ PEDIDO ]");
        System.out.printf("\nProduto:       %s", produto);
        System.out.printf("\nQuantidade:    %d", quant);
        System.out.printf("\nTotal a Pagar: R$ %.2f", totalPedido);
        System.out.println("");
    }
}
