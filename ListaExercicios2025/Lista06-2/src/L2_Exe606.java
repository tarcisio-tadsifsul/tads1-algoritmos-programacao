/**
 * Desenvolva um laço de repetição com while que imprima
 * os primeiros N termos da sequência de Fibonacci.
 * A sequência começa com 0 e 1, e cada termo subsequente é a soma dos dois
 * anteriores
 * (ex: 0, 1, 1, 2, 3, 5, 8...).
 * 
 */

public class L2_Exe606 {
    public static void main(String[] args) {
        int acc = 0, x = 0, y = 1, soma = 0;

        System.out.print(x + ", " + y + ", " + (x + y) + ", ");
        while (acc < 10) {
            soma = x + y;
            x = y;
            System.out.print(x + ", " + y + ", " + soma + ", ");

            acc++;
        }
    }
}
