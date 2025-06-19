
/**
 * Lista 05 - Switch
 * 
 * 8) Peça ao usuário para digitar um único caractere.
 *    Usando `switch` , determine se é uma vogal (a, e, i, o, u - maiúsculas e minúsculas), uma consoante ou um dígito.
 *    Se não for nenhum desses, classifique como "Outro caractere".
 * 
 */

import java.util.Scanner;

public class Exe508 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char caracter = ' ';

        System.out.println("\n--- TIPO DE CARACTER --- \n");
        System.out.print("Digite um único caracter: ");
        caracter = sc.next().charAt(0);
        sc.close();

        // Valida se caracter é letra
        if (Character.isLetter(caracter)) {
            switch (caracter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Você digitou a VOGAL '" + caracter + "' minúscula.");
                    break;
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("Você digitou a VOGAL '" + caracter + "' maiúscula.");
                    break;
                default:
                    System.out.println("Você digitou a CONSOANTE '" + caracter + "'.");
                    break;
            }
            // Valida se caracter é numero
        } else if (Character.isDigit(caracter)) {
            switch (caracter) {
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '0':
                    System.out.println("Você digitou o número '" + caracter + "'.");
                    break;
            }
            // Retorna msg outro caracter
        } else {
            System.out.println("Você digitou Outro caractere.");
        }
    }
}
