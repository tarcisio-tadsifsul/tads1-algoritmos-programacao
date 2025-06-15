
/**
 * Lista de Exercicio 02
 * 
 * Exercicio 11
 * 
 * Enunciado:
 * 11) Seis funcionários em uma empresa de promoção de eventos,
 *     preparam uma festa para 300 convidados em 6 dias.
 *     Em quantos dias 16 funcionários prepararão uma festa para 640 convidados?
 *     Desenvolva a leitura e resolução desta regra de três composta.
 * 
 */

import java.util.Scanner;

public class Exe211 {
    public static void main(String[] args) {
        // Declaraçao Variaveis
        Scanner entrada = new Scanner(System.in);
        int dias, funcInicial, funcFinal, convInicial, convFinal;
        float quantosDias;

        // Entrada de Dados
        System.out.print("Funcionarios: ");
        funcInicial = entrada.nextInt();
        System.out.print("Convidados: ");
        convInicial = entrada.nextInt();
        System.out.print("Dias: ");
        dias = entrada.nextInt();
        System.out.print("Estimativa de Funcionarios: ");
        funcFinal = entrada.nextInt();
        System.out.print("Estimativa de Convidados: ");
        convFinal = entrada.nextInt();

        // Calculos
        quantosDias = (float) (dias * (funcInicial * convFinal)) / (funcFinal * convInicial);
        // Saida de dados
        System.out.println("\nCom " + funcInicial + " funcionarios,\n uma empresa organiza uma festa\n para "
                + convInicial + " convidados em " + dias + " dias.");
        System.out.println("\nLogo, com " + funcFinal + " funcionarios\n sera possivel organizar uma festa\n para "
                + convFinal + " convidados em " + Math.round(quantosDias) + " dias.");

        // Fecha a classe Scanner
        entrada.close();
    }
}
