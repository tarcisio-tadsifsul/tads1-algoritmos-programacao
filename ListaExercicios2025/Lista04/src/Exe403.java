
/**
 * Lista Exercícios 4
 * 
 * Exercício 03
 * 
 * 3) Um posto está vendendo combustíveis com a seguinte tabela de descontos:
 * 
 *      Álcool      | Até 20 litros, desconto de 3% por litro;
 *                  | Acima de 20 litros, desconto de 5% por litro;
 *      
 *      Gasolina    | Até 20 litros, desconto de 4% por litro;
 *                  | Acima de 20 litros, desconto de 6% por litro;
 * 
 *    Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível,
 *    codificado da seguinte forma:
 * 
 *      A = álcool
 *      G = gasolina
 * 
 *    Utilize constantes, calcule e imprima o valor a ser pago pelo cliente
 *    sabendo-se que o preço do litro da gasolina é R$6,10
 *    e o preço do litro do álcool é R$4,65.
 */

import java.util.Scanner;

public class Exe403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char tipoComb;
        float litros, totalPagar = 0.0f, desconto = 0.0f;
        final float GAS = 6.10f, ALC = 4.65f;

        System.out.println("\n--- POSTO DE COMBUSTIVEL ---\n");

        System.out.print("Quantos litros de Combustível quer comprar: ");
        litros = sc.nextFloat();

        if (litros > 0) {
            System.out.println("Qual o tipo de combustível? \n\n [A] Álcool \n [G] Gasolina \n");
            System.out.print("Digite uma das opções: ");
            tipoComb = sc.next().toUpperCase().charAt(0);
            sc.close();
            if (tipoComb == 'A') {
                // Operado ternário avalia valor de litros para preencher valor de desconto
                desconto = (litros > 20) ? 0.05f : 0.03f;
                totalPagar = (litros * ALC) * (1 - desconto);

            } else if (tipoComb == 'G') {
                desconto = (litros > 20) ? 0.06f : 0.04f;
                totalPagar = (litros * GAS) * (1 - desconto);

            } else {
                System.out.println("Opção inválida! Encerrando programa.");
                return;
            }
        } else {
            // false para litros > 0
            System.out.println("Valor inválido! Encerrando programa.");
            sc.close();
            return;
        }
        System.out.printf("\nTotal a pagar: R$%.2f", totalPagar);
    }
}
