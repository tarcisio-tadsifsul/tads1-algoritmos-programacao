/**
 * Lista 06 Exe608
 * Crie agora um laço de repetição com while que conte de 1 a 30,
 * mas quando chegar em 21 mostre-o na impressão e encerre o programa.
 */

public class Exe608 {
    public static void main(String[] arg) {
        int i = 1;
        while (i <= 30) {
            if (i == 21) {
                System.out.println(i);
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
