
/**
 * Lista de Exercicio 02
 * 
 * Exercicio 11
 * 
 * Enunciado:
 * 13) 45 operários fazem uma obra em 16 dias, trabalhando 7 horas por dia.
 *     Quantos operários serão necessários para fazer a mesma obra em 12 dias,
 *     trabalhando 10 horas por dia?
 *     Desenvolva a leitura de dados, cálculos e imprima no console a resposta.
 */

import java.util.Scanner;

public class Exe213 {
    public static void main(String[] args) {
        // Declaraçao Variaveis
        Scanner entrada = new Scanner(System.in);
        int operarios1, operarios2, dias1, horas1, dias2, horas2;

        // Entrada de Dados
        System.out.print("Operarios: ");
        operarios1 = entrada.nextInt();
        System.out.print("Dias: ");
        dias1 = entrada.nextInt();
        System.out.print("Horas: ");
        horas1 = entrada.nextInt();

        System.out.print("Estimativa Dias: ");
        dias2 = entrada.nextInt();
        System.out.print("Estimativa Horas: ");
        horas2 = entrada.nextInt();

        // Calculos
        operarios2 = (operarios1 * (dias1 * horas1)) / (dias2 * horas2);
        // Saida de dados
        // System.out.print(aradosQuant2);
        System.out.println("\n" + operarios1 + " Operarios fazem uma obra\n em " + dias1 + " trabalhando " + horas1
                + " horas por dia.");
        System.out.println("\nLogo, a obra pode ser finalizada se " + operarios2 + " operarios\n trabalharem " + horas2
                + " horas por dia durante " + dias2 + " dias.");

        // Fecha a classe Scanner
        entrada.close();
    }
}
