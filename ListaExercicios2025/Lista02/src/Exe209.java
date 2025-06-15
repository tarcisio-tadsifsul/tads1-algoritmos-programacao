
/**
 * Lista de Exercicio 02
 * 
 * Exercicio 09
 * 
 * Enunciado:
 * 9) Faça um algoritmo que receba as notas [0 - 10] do primeiro semestre
 *    de um aluno, ele possui duas provas (peso 4.0) e quatro trabalhos
 *    (peso 1.5). Mostre o resultado da média final no console.
 */
import java.util.Scanner;
import java.util.Locale;

public class Exe209 {
    public static void main(String[] args) {
        // Padrao Saida Pt-BR
        Locale.setDefault(Locale.forLanguageTag("pt-BR"));

        // Declaraçao Variaveis
        String nome;
        double prova_1, prova_2, trabalho_1, trabalho_2, trabalho_3, trabalho_4, media;
        Scanner entrada = new Scanner(System.in);

        // Entrada de Dados
        System.out.println("Nome do aluno: ");
        nome = entrada.nextLine();
        System.out.print("Nota da Prova #1: ");
        prova_1 = entrada.nextDouble();
        System.out.print("Nota da Prova #2: ");
        prova_2 = entrada.nextDouble();
        System.out.print("Nota do Trabalho #1: ");
        trabalho_1 = entrada.nextDouble();
        System.out.print("Nota do Trabalho #2: ");
        trabalho_2 = entrada.nextDouble();
        System.out.print("Nota do Trabalho #3: ");
        trabalho_3 = entrada.nextDouble();
        System.out.print("Nota do Trabalho #4: ");
        trabalho_4 = entrada.nextDouble();

        // Calculos
        media = ((prova_1 * 4) + (prova_2 * 4) + (trabalho_1 * 1.5) + (trabalho_2 * 1.5) + (trabalho_3 * 1.5)
                + (trabalho_4 * 1.5)) / ((2 * 4.0) + (4 * 1.5));

        // Saida de dados
        System.out.println("\nMEDIA 1º SEMESTRE\n");
        System.out.println("Aluno: " + nome);
        System.out.println("---------------------------");
        System.out.printf("%-10s   %-10s %-10s\n", "Avaliaçao", "Nota", "Peso");
        System.out.printf("%-10s   %-10.1f %-10s\n", "Prova #1", prova_1, "4,0");
        System.out.printf("%-10s   %-10.1f %-10s\n", "Prova #2", prova_2, "4,0");
        System.out.printf("%-10s  %-10.1f %-10s\n", "Trabalho #1", trabalho_1, "1,5");
        System.out.printf("%-10s  %-10.1f %-10s\n", "Trabalho #2", trabalho_2, "1,5");
        System.out.printf("%-10s  %-10.1f %-10s\n", "Trabalho #3", trabalho_3, "1,5");
        System.out.printf("%-10s  %-10.1f %-10s\n", "Trabalho #4", trabalho_4, "1,5");
        System.out.println("---------------------------");
        System.out.printf("Media Final Semestre: %.1f\n", media);
        if (media > 6) {
            System.out.println("Aluno Aprovado");
        } else {
            System.out.println("Aluno Reprovado");
        }

        // Fecha a classe Scanner
        entrada.close();
    }
}
