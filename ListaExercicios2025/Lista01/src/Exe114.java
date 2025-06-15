
/**
 * Lista de Exercicio 01
 * 
 * Exercicio 14
 * 
 * Enunciado:
 * 14)Desenvolva um algoritmo que calcule a média ponderada de um aluno
 * com os seguintes pesos:
 * # prova 01 peso 4.0
 * # prova 02 peso 3.0
 * # trabalhos 01 e 02 peso 1.5 cada
 * 
 */

public class Exe114 {
    public static void main(String[] args) {
        // Declaraçao Variaveis
        float notaProva1 = 0.0f;
        float notaProva2 = 0.0f;
        float notaTrabalho1 = 0.0f;
        float notaTrabalho2 = 0.0f;
        double mediaPonderada = 0.0;

        // Atribuiçao Variaveis
        notaProva1 = 7.5f;
        notaProva2 = 9.3f;
        notaTrabalho1 = 1.5f;
        notaTrabalho2 = 0.9f;

        // Calculos
        mediaPonderada = ((notaProva1 * 4.0) + (notaProva2 * 3.0) + (notaTrabalho1 * 1.5) + (notaTrabalho2 * 1.5))
                / (4 + 3 + 1.5 + 1.5);

        // Saida de dados
        System.out.println("Nota Prova #1: " + notaProva1);
        System.out.println("Nota Prova #2: " + notaProva1);
        System.out.println("Nota Trabalho #1: " + notaTrabalho1);
        System.out.println("Nota Trabalho #2: " + notaTrabalho2);
        System.out.printf("A media ponderada: %.2f\n", mediaPonderada);

    }
}
