
/**
 * Lista de Exercicio 01
 * 
 * Exe03
 * 
 * Enunciado:
 * 30) Desenvolva um algoritmo que receba dois números (25.45 e 36.95)
 * para as variáveis A e B e efetue a troca dos valores de forma
 * que a variável A passe a possuir o valor da variável B e a variável B
 * passe a possuir o valor da variável A.
 * Apresente os valores trocados.
 * 
 */

public class Exe103 {
    public static void main(String[] args) {
        float A = 0.0f;
        float B = 0.0f;
        float C = 0;

        A = 25.45f;
        B = 36.95f;
        C = 0;

        C = B;
        B = A;
        A = C;

        System.out.println("Valor Inicial de A = " + B);
        System.out.println("Valor Inicial de B = " + A);
        System.out.println("Valor Atual de A = " + A);
        System.out.println("Valor Atual de B = " + B);
    }
}
