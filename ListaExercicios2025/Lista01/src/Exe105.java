
/**
 * Lista de Exercicio 01
 * 
 * Exercicio 05
 * 
 * Enunciado:
 * 5) Crie um algoritmo para calcular
 * quanto uma padaria vendeu de pães (em Kg)
 * ate o final de um dia de trabalho.
 * O quilo custa R$14.90. Após, mostre na tela.
 * 
 */

public class Exe105 {
    public static void main(String[] args) {
        // Declaraçao Variaveis
        double kilo_pao = 0.0;
        double quant_vendida = 0.0;
        double total_vendas = 0.0;

        // Atribuiçao Variaveis
        kilo_pao = 14.90;
        quant_vendida = 76.85;

        // Calculos
        total_vendas = kilo_pao * quant_vendida;

        // Saida de dados
        System.out.println("Se uma padaria vende por dia " + quant_vendida + "kg de pao.");
        System.out.printf("E o quilo do pao custa R$ %.2f\n", kilo_pao);
        System.out.printf("O valor total vendido em um dia foi R$ %.2f\n", total_vendas);
    }
}
