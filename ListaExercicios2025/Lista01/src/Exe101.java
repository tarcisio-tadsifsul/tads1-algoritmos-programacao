
/**
 * Lista de Exercicio 01
 * 
 * Exercicio 01
 * 
 * Enunciado:
 * 1) Desenvolva um algoritmo que receba dois números, 10.5 e 2.0,
 * (com casa decimal), após efetue as quatro operações básicas (+, -, *, /)
 * dos dois valores e apresente os resultados.
 * 
 */
public class Exe101 {
    public static void main(String[] args) {
        final float NUM_1 = 10.5f;
        final float NUM_2 = 2.0f;
        float adicao = 0.0f;
        float subtracao = 0.0f;
        float multiplicacao = 0.0f;
        float divisao = 0.0f;

        adicao = NUM_1 + NUM_2;
        subtracao = NUM_1 - NUM_2;
        multiplicacao = NUM_1 * NUM_2;
        divisao = NUM_1 / NUM_2;

        System.out.println("Adiçao        => 10.5 + 2.0 = " + adicao);
        System.out.println("Subtraçao     => 10.5 - 2.0 = " + subtracao);
        System.out.println("Multiplicaçao => 10.5 * 2.0 = " + multiplicacao);
        System.out.println("Divisao       => 10.5 / 2.0 = " + divisao);
    }
}
