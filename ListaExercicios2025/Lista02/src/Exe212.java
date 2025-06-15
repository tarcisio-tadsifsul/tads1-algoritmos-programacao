
/**
 * Lista de Exercicio 02
 * 
 * Exercicio 11
 * 
 * Enunciado:
 * 12) Trabalhando 8 horas por dia, 10 arados preparam um terreno de 2000m²
 *     quadrados em 7 dias. Quantos arados são necessários para preparar
 *     um terreno de 3000m² em 14 dias, trabalhando 6 horas por dia?
 *     Desenvolva a leitura de dados, cálculos e imprima no console a resposta.
 * 
 */

import java.util.Scanner;

public class Exe212 {
    public static void main(String[] args) {
        // Declaraçao Variaveis
        Scanner entrada = new Scanner(System.in);
        int aradosQuant1, aradosQuant2, terreno1, terreno2;
        int totalHoras1, totalHoras2, dias, horas;

        // Entrada de Dados
        System.out.print("Horas: ");
        horas = entrada.nextInt();
        System.out.print("Arados: ");
        aradosQuant1 = entrada.nextInt();
        System.out.print("Terreno: ");
        terreno1 = entrada.nextInt();
        System.out.print("Dias: ");
        dias = entrada.nextInt();

        totalHoras1 = dias * horas;

        System.out.print("Terreno: ");
        terreno2 = entrada.nextInt();
        System.out.print("Estimativa Horas: ");
        horas = entrada.nextInt();
        System.out.print("Estimativa Dias: ");
        dias = entrada.nextInt();

        totalHoras2 = dias * horas;

        // Calculos
        aradosQuant2 = (aradosQuant1 * (totalHoras1 * terreno2)) / (totalHoras2 * terreno1);
        // Saida de dados
        // System.out.print(aradosQuant2);
        System.out.println("\nTrabalhando " + totalHoras1 + " horas por dia, com " + aradosQuant1
                + " arados\n um terreno de " + terreno1 + " metros pode ser preparado.");
        System.out.println("\nLogo, para preparar um terreno de " + terreno2 + " metros\n sera preciso um total de "
                + totalHoras2 + " horas por dia\n e " + aradosQuant2 + " arados. no total.");

        // Fecha a classe Scanner
        entrada.close();
    }
}
