
/**
 * Lista de Exercicio 01
 * 
 * Exercicio 07
 * 
 * Enunciado:
 * 7) Escreva um algoritmo que receba a idade de uma pessoa,
 * e exiba quantos dias de vida ela possui.
 * Considere sempre que um ano possui 365 dias.
 * 
 */

public class Exe107 {
    public static void main(String[] args) {
        // Declaraçao Variaveis
        byte idade_anos = 0;
        int idade_dias = 0;

        // Atribuiçao Variaveis
        idade_anos = 35;

        // Calculos
        idade_dias = idade_anos * 365;

        // Saida de dados
        System.out.println("Uma pessoa de " + idade_anos + " anos");
        System.out.println("Tem " + idade_dias + " dias de vida");

    }
}
