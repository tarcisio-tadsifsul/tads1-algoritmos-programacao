
/**
 * Lista de Exercicio 01
 * 
 * Exercicio 08
 * 
 * Enunciado:
 * 8) Desenvolva um algoritmo
 * que tenha um valor para uma variável do tipo inteiro
 * e apresente os resultados do quadrado e do cubo do mesmo.
 */

public class Exe108 {
    public static void main(String[] args) {
        // Declaraçao Variaveis
        int valor = 0;
        int valor_quadrado = 0;
        int valor_cubo = 0;

        // Atribuiçao Variaveis
        valor = 523;

        // Calculos
        valor_quadrado = valor * valor;
        valor_cubo = valor * valor * valor;

        // Saida de dados
        System.out.println("Valor = " + valor);
        System.out.println("Valor² = " + valor_quadrado);
        System.out.println("Valor³ = " + valor_cubo);
    }
}
