
/**
 * Lista de Exercicio 01
 * 
 * Exercicio 13
 * 
 * Enunciado:
 * 12) Faça um programa que receba a altura e o sexo de uma pessoa,
 *     calcule e mostre seu peso ideal, utilizando as seguintes fórmulas
 *     (onde h corresponde à altura):
 *     Homens: (72,7 * h) - 58
 *     Mulheres: (62,1 * h) – 44,7
 */

// Import da classe Scanner
import java.util.Scanner;

public class Exe113 {
    public static void main(String[] args) {
        // Cria o objeto entrada a partir da classe Scanner
        Scanner entrada = new Scanner(System.in);

        entrada.useLocale(java.util.Locale.US);

        // Declaraçao Variaveis
        char sexo = ' ';
        float h = 0.00f;
        double pesoIdeal = 0.00;

        // Entrada e Atribuicao Dados
        System.out.println("Informe o sexo (M/F): ");
        sexo = entrada.next().charAt(0);
        System.out.println("Informe sua altura: ");
        h = entrada.nextFloat();

        entrada.close();

        // Calculos
        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (62.1 * h) - 44.7;
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (72.7 * h) - 58;
        } else {
            System.out.printf("Informe o sexo correto");
            return;
        }
        ;

        // Saida de dados
        System.out.printf("Peso ideal: %.2f\n", pesoIdeal);

    }
}
