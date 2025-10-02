
/**
 * Crie um programa para solicitar uma frase ao usuário.
 * Conte e imprima quantas vogais e consoantes ela possui.
 * 
 */
import java.util.Scanner;

public class L2_Exe605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCaracteres = 0, somaVogais = 0, somaConsoantes = 0, somaEspacos = 0;
        String vogais = "aeiou";
        char caracter;

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        sc.close();

        numCaracteres = frase.length() - 1;
        System.out.println("Total de caracteres: " + (numCaracteres + 1));

        while (numCaracteres >= 0) {
            caracter = frase.charAt(numCaracteres);

            if (vogais.indexOf(Character.toLowerCase(caracter)) != -1) {
                somaVogais += 1;
            } else if (caracter == ' ' || caracter == ',') {
                somaEspacos += 1;
            } else if (vogais.indexOf(Character.toLowerCase(caracter)) == -1) {
                somaConsoantes += 1;
            }

            numCaracteres--;
        }
        System.out.println("A frase tem " + somaVogais + " vogais");
        System.out.println("A frase tem " + somaConsoantes + " consoantes");
        System.out.println("A frase tem " + somaEspacos + " não-caracteres");
    }
}
