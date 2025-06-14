
/**
 * Lista 05 - Switch
 * 
 * 3) Escreva um programa que indique o número de dias existentes em um mês.
 *    
 *    Código - Descrição
 *    28 - 02
 *    30 - 04, 06, 09, 11
 *    31 - 01, 03, 05, 07, 08, 10, 12
 * 
 */

import java.util.Scanner;

public class Exe503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMes;
        String mes = "";

        System.out.println("\n--- Quantidade de Dias do Mês ---\n");
        System.out.print("Informe o número do mês: ");
        numMes = sc.nextInt();
        sc.close();

        switch (numMes) {
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
            case 7:
                mes = "Julho";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setembro";
                break;
            case 10:
                mes = "Outubro";
                break;
            case 11:
                mes = "Novembro";
                break;
            case 12:
                mes = "Dezembro";
                break;
            default:
                System.out.println("Número do Mês Inválido!");
        }

        switch (numMes) {
            case 2:
                System.out.printf("\nO mês de %s tem 28 dias", mes);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("\nO mês de %s tem 30 dias", mes);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("\nO mês de %s tem 31 dias", mes);
                break;
            default:
                break;
        }
    }
}
