/**
 * Lista de Exercicio 02
 * 
 * Exercicio 15
 * 
 * Enunciado:
 * 15) 18 impressoras possuem autonomia para imprimir uma certa
 *     quantidade de livros em 10 dias, trabalhando 6h/dia.
 *     Tendo apresentado defeito ⅓ dos equipamentos, quanto tempo levarão
 *     as demais para imprimir o dobro da quantidade de livros,
 *     trabalhando 9h/dia?
 *     Leia, calcule e mostre o resultado.
 */

// Importa da classe Scanner para input de Dados
import java.util.Scanner;

public class Exe215 {
    public static void main(String[] args) {

        // Declaraçao Variaveis
        Scanner entrada = new Scanner(System.in);
        int impressoras, diasI, diasF, horasI, horasF;
        entrada.close();

        // Entrada de Dados
        System.out.print("Impressoras: ");
        impressoras = entrada.nextInt();
        System.out.print("Dias Inicial: ");
        diasI = entrada.nextInt();
        System.out.print("Horas disponivel no inicio: ");
        horasI = entrada.nextInt();
        System.out.print("Horas com 1/3 das impressoas: ");
        horasF = entrada.nextInt();

        // Calculos
        diasF = ((diasI * (impressoras * horasI)) / ((impressoras - (impressoras / 3)) * horasF)) * 2;

        // Saida de Dados
        System.out.print("\nSe " + impressoras
                + " impressoras tem autonomia para\n imprimir X quantidade de livros,\n trabalhando " + horasI
                + " horas por " + diasI + " dias,\n");
        System.out.println("logo, " + (impressoras - (impressoras / 3))
                + " impressoras conseguem fazer\n o dobro de impressoes em " + diasF + " dias\n trabalhando " + horasF
                + " horas por dia.");
    }
}
