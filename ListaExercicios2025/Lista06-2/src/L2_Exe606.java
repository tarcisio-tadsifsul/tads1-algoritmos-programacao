/**
 * Desenvolva um laço de repetição com while que imprima
 * os primeiros N ter da sequência de Fibonacci.
 * A sequência começa com 0 e 1, e cada termo subsequente é a s dos dois
 * anteriores
 * (ex: 0, 1, 1, 2, 3, 5, 8...).
 * 
 * 
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
 * x, y, x, y, x, y, x, y, x, y, x, y
 */

public class L2_Exe606 {
    public static void main(String[] args) {
        int acc = 0, x = 0, y = 1;

        while (acc < 5) {
            System.out.print(x + ", " + y + (acc == 4 ? "" : ", "));
            x = x + y;
            y = x + y;

            acc++;
        }
        System.out.println();
    }
}
