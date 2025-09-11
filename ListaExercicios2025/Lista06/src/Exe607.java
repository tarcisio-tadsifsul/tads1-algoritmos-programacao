/*
 * Lista 06 Exe607
 * Desenvolva um laço de repetição com while que conte de 1 a 20
 * e mostre na tela todos os números exceto o número 15.
 */

public class Exe607 {
    public static void main(String[] arg){
        int i = 1;
        
        System.out.println("\n");
        while (i <=20) {
            if (i == 15){
                i++;
                System.out.print("-- ");
                continue;
            }
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");
    }
}
