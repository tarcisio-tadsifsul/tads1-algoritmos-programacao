
/**
 * Lista 05 - Switch
 * 
 * 1) Escreva um programa que leia o código de um determinado produto
 *    e mostre a sua classificação. Utilize a tabela abaixo como referência.
 * 
 *    Código - Descrição
 *    1 - Alimento não perecível
 *    2 - Alimento perecível
 *    3 - Vestuário
 *    4 - Limpeza
 */

import java.util.Scanner;

public class Exe501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo;

        System.out.print("Categoria de Produto");
        System.out.print("\n 1 - Alimento Não Perecível\r\n" + //
                " 2 - Alimento Perecível\r\n" + //
                " 3 - Vestuário\r\n" + //
                " 4 - Limpeza");
        System.out.print("\n\nInforme um dos códigos: ");
        codigo = sc.nextInt();
        sc.close();

        switch (codigo) {
            case 1:
                System.out.print("Você selecionou a categoria Alimento Não Perecível");
                break;
            case 2:
                System.out.print("Você selecionou a categoria Alimento Perecível");
                break;
            case 3:
                System.out.print("Você selecionou a categoria Vestuário");
                break;
            case 4:
                System.out.print("Você selecionou a categoria Limpeza");
                break;
            default:
                System.out.print("Categoria não cadastrada!\nEncerrando programa.");
                break;
        }
    }
}
