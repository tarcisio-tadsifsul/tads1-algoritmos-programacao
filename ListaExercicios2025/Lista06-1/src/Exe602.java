/*
 * Lista 06 Exe02 - 602
 * Imprima todos os números pares de 1 a 100.
 * E depois, imprima os números ímpares de 101 a 200 na tela usando o while.
 */

public class Exe602 {
    public static void main(String[] args){
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
        while (i <= 200) {
            if (i % 2 == 1){
                System.out.println(i);
            }
            i = i + 1;
        }
    }
}
