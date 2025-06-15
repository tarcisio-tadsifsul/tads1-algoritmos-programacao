
/**
 * Lista de Exercicio 01
 * 
 * Exercicio 15
 * 
 * Enunciado:
 * 15)Crie um programa que pegue um valor principal
 * e calcule uma aplicação em juros simples e compostos
 * durante 01 ano(t) com uma taxa mensal de 1.55%(i).
 * Siga as fórmulas:
 * J = C ∙ i ∙ t (juros simples)
 * M = C x (1 + i) ^ t (juros compostos)
 * 
 */

public class Exe115 {
    public static void main(String[] args) {
        // Declaraçao Variaveis
        double c = 0.0; // Capital
        double i = 0.0; // Taxa de Juro
        short t = 0; // Tempo
        double juroSimples = 0.0;
        double juroComposto = 0.0;

        // Atribuiçao Variaveis
        c = 1000.00;
        i = 0.0155;
        t = 12;

        // Calculos
        juroSimples = c * i * t;
        juroComposto = c * Math.pow((1 + i), t);

        // Saida de dados
        System.out.printf("Capital = %.2f\n", c);
        System.out.printf("Juro Simples = %.2f\n", juroSimples);
        System.out.printf("Juro Composto = %.2f\n", juroComposto);

    }
}
