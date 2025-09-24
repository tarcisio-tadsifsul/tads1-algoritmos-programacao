/*
 * Lista 06 Exe02 - 602
 * Imprima todos os números pares de 1 a 16.
 * E depois, imprima os números ímpares de 17 a 31 na tela usando o dowhile.
 */

public class Exe602_2 {
    public static void main(String[] args) {
        int i = 1;
        
        System.out.println("\n");
        do {
            if (i <= 16) {
                if (i % 2 == 0){
                    System.out.print(i + " ");
                }
            }

            if (i > 16) {
                if (i % 2 == 1) {
                    System.out.print(i + " ");
                }
            }

            i++;
        } while (i <= 31);

        System.out.println("\n");
    }
}
