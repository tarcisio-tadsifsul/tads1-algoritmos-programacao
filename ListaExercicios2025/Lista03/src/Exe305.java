
/**
 * 5) Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são:
 * 
 *      Rendimento mensal (RS)      Base de cálculo (RS)        Alíquota do IR (%)  Parcela a deduzir (R$)
 *        Até 3036.00                 Até 2428.80                 0                   0
 *        De 3036.00 até 3533.31      De 2428.81 até 2826.65      7.5                 182.16
 *        De 3533.31 até 4688.85      De 2826.66 até 3751.05      15                  394.16
 *        De 4688.85 até 5830.85      De 3751.06 até 4664.68      22.5                675.49
 *        Acima de 5830.85            Acima de 4664.68            27.5                908.73
 * 
 *    Leia o rendimento mensal, desconte 20% do desconto simplificado, 11% de INSS
 *    e após veja a base de cálculo e encontre a parcela a deduzir.
 *    Após multiplique o que restar pela alíquota correspondente.
 *    Mostre na tela o valor do rendimento mensal, base de cálculo e o IRRF a pagar.
 */

import java.util.Scanner;

public class Exe305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rendimentoMensal, baseCalculo, aliquota, parcelaDeduzir, irrf;

        System.out.print("\nInforme o seu rendimento mensal: R$");
        rendimentoMensal = sc.nextDouble();
        sc.close();

        // baseCalculo = rendimentoMensal - (rendimentoMensal * 0.2) + (rendimentoMensal
        // * 0.11);
        baseCalculo = rendimentoMensal * (1 - 0.20 - 0.11);

        if (baseCalculo > 4664.68) {
            aliquota = 0.275;
            parcelaDeduzir = 908.73;
        } else if (baseCalculo > 3751.05) {
            aliquota = 0.225;
            parcelaDeduzir = 675.49;
        } else if (baseCalculo > 2826.65) {
            aliquota = 0.15;
            parcelaDeduzir = 394.16;
        } else if (baseCalculo > 2428.80) {
            aliquota = 0.075;
            parcelaDeduzir = 182.16;
        } else {
            aliquota = 0;
            parcelaDeduzir = 0;
        }

        irrf = (baseCalculo * aliquota) - parcelaDeduzir;

        System.out.print("\n--- IRRF ---");
        System.out.printf("\nRendimento Mensal: R$ %.2f", rendimentoMensal);
        System.out.printf("\nBase de Cálculo IRRF: R$ %.2f", baseCalculo);
        System.out.printf("\nValor do IRRF a pagar: R$ %.2f\n\n", irrf);

    }
}
