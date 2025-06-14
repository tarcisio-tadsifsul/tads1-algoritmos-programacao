
/**
 * Lista 05 - Switch
 * 
 * 2) Dada uma letra, escreva na tela se essa letra é uma vogal ou consoante
 *    (considerar apenas letras minúsculas).
 * 
 */

import java.util.Scanner;

public class Exe502 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra;

        System.out.print("\n--- Consoante ou Vogal ---\n\n");
        System.out.print("Digite uma letra: ");
        letra = sc.next().toLowerCase().charAt(0);
        sc.close();

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("\nA letra '%s' que você informou é uma vogal!");
                break;
            default:
                System.out.println("\nA letra que você informou é uma consoante!");
        }
    }
}
