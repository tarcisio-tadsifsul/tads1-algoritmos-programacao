
/**
 * Lista de Exercicio 02
 * 
 * Exercicio 08
 * 
 * Enunciado:
 * 08) Faça um algoritmo que receba 03 (três) números com ponto flutuante
 *     e aplique a formula de juros compostos, imprimindo na tela
 *     cada um dos valores que foram informados e também os mesmos valores corrigidos.
 *     Juros Compostos: M = C * (1+i)t
 */
import java.util.Scanner;
import java.util.Locale;

public class Exe208 {
    public static void main(String[] args) {
        // Padrao Saida Pt-BR
        Locale.setDefault(Locale.forLanguageTag("pt-BR"));

        // Declaraçao Variaveis
        double valor1, valor2, valor3, mont1, mont2, mont3;
        int tempo;
        float taxa;
        Scanner entrada = new Scanner(System.in);

        // Entrada de Dados
        System.out.println("Informe o valor dos investimento: ");
        System.out.print("Investimento 01: ");
        valor1 = entrada.nextInt();

        System.out.print("Investimento 02: ");
        valor2 = entrada.nextInt();

        System.out.print("Investimento 03: ");
        valor3 = entrada.nextInt();

        System.out.print("Agora, a taxa de juros ao mes: ");
        taxa = entrada.nextFloat();

        System.out.print("Digite o tempo (meses) das aplicaçoes: ");
        tempo = entrada.nextInt();

        // Calculos
        mont1 = valor1 * Math.pow((1 + taxa), tempo);
        mont2 = valor2 * Math.pow((1 + taxa), tempo);
        mont3 = valor3 * Math.pow((1 + taxa), tempo);

        // Saida de dados
        System.out.println("---- INVESTIMENTOS ----\n");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Capital", "Taxa", "Tempo", "Montante");
        System.out.printf("%-10.2f %-10.2f %-10d %-10.2f\n", valor1, taxa, tempo, mont1);
        System.out.printf("%-10.2f %-10.2f %-10d %-10.2f\n", valor2, taxa, tempo, mont2);
        System.out.printf("%-10.2f %-10.2f %-10d %-10.2f\n", valor3, taxa, tempo, mont3);

        // Fecha a classe Scanner
        entrada.close();
    }
}
