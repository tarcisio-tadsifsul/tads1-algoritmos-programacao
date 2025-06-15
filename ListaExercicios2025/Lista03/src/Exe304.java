
/**
 * 4) As organizações QWERT resolveram dar um aumento de salário aos seus colaboradores
 *    e lhe contrataram para desenvolver o programa que calcula os reajustes. 
 *    Faça um programa que recebe o salário de um colaborador e o reajuste
 *    conforme os seguintes critérios, baseado no salário informado;    
 *      a. Salários até   R$ 1600,00 (incluindo):  aumento de 20%;
 *      b. Salários entre R$ 1600,01 e R$ 1999,99: aumento de 15%;
 *      c. Salários entre R$ 2000,00 e R$ 2450,00: aumento de 10%;
 *      d. Salários de    R$ 2450,01 em diante:    aumento de 5%.
 * 
 *    Após o aumento ser realizado, informe na tela;
 *      a. O salário antes do reajuste;
 *      b. O percentual de aumento aplicado;
 *      c. O valor do aumento;
 *      d. O novo salário, após o aumento.
 */

import java.util.Scanner;

public class Exe304 {
    public static void main(String[] args) {

        double salario, percentAjuste, valorAumento, salarioReajustado;
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o salário atual: R$ ");
        salario = input.nextDouble();
        input.close();

        if (salario > 2450) {
            percentAjuste = 0.05;
        } else if (salario > 1999.99) {
            percentAjuste = 0.10;
        } else if (salario > 1600) {
            percentAjuste = 0.15;
        } else {
            percentAjuste = 0.20;
        }

        valorAumento = salario * percentAjuste;
        salarioReajustado = salario + valorAumento;

        System.out.println("\n--- REAJUSTE SALARIAL ---");
        System.out.printf("\nSalario atual: R$%.2f", salario);
        System.out.printf("\nPercentual de Reajuste: %.0f%%", percentAjuste * 100);
        System.out.printf("\nValor de aumento salarial: R$%.2f", valorAumento);
        System.out.printf("\nNovo Salário reajustado: R$%.2f \n\n", salarioReajustado);
    }
}
