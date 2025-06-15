
/**
 * Lista 05 - Switch-Case
 * 
 * 5) Um funcionário irá receber um aumento de acordo com o seu plano de trabalho,
 *    de acordo com os dados abaixo:
 * 
 *    Plano Aumento:
 *      A - 10%
 *      B - 15%
 *      C - 20%
 * 
 *    Faça um programa que leia o plano de trabalho e o salário atual de um funcionário
 *    e calcula e imprime o seu novo salário. Use o comando switch.
 * 
 */

import java.util.Scanner;

public class Exe505 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salarioAtual = 0, salarioNovo = 0, percAumento = 0;
        char plano;

        System.out.println("\n--- PLANO DE AUMENTO SALARIAL ---\n");
        System.out.print("Informe o Salário atual do Funcionario: R$ ");
        salarioAtual = sc.nextFloat();
        System.out.print("\nPlanos de Aumento:\n" +
                " [A] 10%\n" +
                " [B] 15%\n" +
                " [C] 20%\n");
        System.out.print("Informe o Plano: ");
        plano = sc.next().toLowerCase().charAt(0);
        sc.close();

        switch (plano) {
            case 'a':
                percAumento = 1 + (10.0f / 100);
                break;
            case 'b':
                percAumento = 1 + (15.0f / 100);
                break;
            case 'c':
                percAumento = 1 + (20.0f / 100);
                break;
            default:
                System.out.println("Plano informado inválido!");
                System.exit(0);
                break;
        }

        salarioNovo = salarioAtual * percAumento;

        System.out.printf("\nO novo salário é R$ %.2f", salarioNovo);
        System.out.println();

    }
}
