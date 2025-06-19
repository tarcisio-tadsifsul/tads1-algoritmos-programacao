
/**
 * Lista 05 - Switch
 * 
 * 7) Solicite ao usuário o mês (em número) e o dia.
 *    Usando `switch` para o mês, determine e exiba a estação do ano
 *    (Verão, Outono, Inverno, Primavera).
 * 
 *    Considere as seguintes datas de início:
 *    Verão: 21/12 até 19/03
 *    Outono: 20/03 até 20/06
 *    Inverno: 21/06 até 21/09
 *    Primavera: 22/09 até 20/12
 * 
 * 
 */

import java.util.Scanner;

public class Exe507 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes, dia;
        String estacao = "", nomeMes = "";

        System.out.println("\n--- ESTAÇÕES DO ANO ---\n");

        System.out.print("Informe o dia [1-31]: ");
        dia = sc.nextInt();
        System.out.print("Informe o mês [1-12]: ");
        mes = sc.nextInt();
        sc.close();

        // Verifica O mês e atribui o nome do mês
        switch (mes) {
            case 1:
                nomeMes = "Janeiro";
                break;
            case 2:
                nomeMes = "Fevereiro";
                break;
            case 3:
                nomeMes = "Março";
                break;
            case 4:
                nomeMes = "Abril";
                break;
            case 5:
                nomeMes = "Maio";
                break;
            case 6:
                nomeMes = "Junho";
                break;
            case 7:
                nomeMes = "Julho";
                break;
            case 8:
                nomeMes = "Agosto";
                break;
            case 9:
                nomeMes = "Setembro";
                break;
            case 10:
                nomeMes = "Outubro";
                break;
            case 11:
                nomeMes = "Novembro";
                break;
            case 12:
                nomeMes = "Dezembro";
                break;
            default:
                break;
        }

        // Verifica se o mês é válido
        if (dia == 31 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
            System.out.println("\nO mês " + mes + " possui apenas 30 dias.\nEncerrando o programa.");
            System.exit(0);

            // Verifica se o mês é fevereiro
        } else if (mes == 2 && (dia == 29 || dia == 30 || dia == 31)) {
            System.out.println("\nFevereiro possui apenas 28 dias.\nEncerrando o programa.");
            System.exit(0);

            // Verifica se o dia é válido
        } else if (dia > 0 && dia <= 31) {
            // Verifica a estação do ano
            switch (mes) {
                case 1:
                case 2:
                    estacao = "Verão";
                    break;
                case 3:
                    if (dia <= 19) {
                        estacao = "Verão";
                    } else {
                        estacao = "Outono";
                    }
                    break;
                case 4:
                case 5:
                    estacao = "Outono";
                    break;
                case 6:
                    if (dia <= 20) {
                        estacao = "Outono";
                    } else {
                        estacao = "Inverno";
                    }
                    break;
                case 7:
                case 8:
                    estacao = "Inverno";
                    break;
                case 9:
                    if (dia <= 21) {
                        estacao = "Inverno";
                    } else {
                        estacao = "Primavera";
                    }
                    break;
                case 10:
                case 11:
                    estacao = "Primavera";
                    break;
                case 12:
                    if (dia <= 20) {
                        estacao = "Primavera";
                    } else {
                        estacao = "Verão";
                    }
                    break;
                default:
                    System.out.println("Mês inválido!\nEncerrando programa.");
                    System.exit(0);
                    break;
            }

        } else {
            System.out.println("Dia inválido.\nEncerrando o programa.");
            System.exit(0);
        }

        // Exibe a estação do ano
        System.out.printf("\nNessa data de %d de %s a estação é %s!\n", dia, nomeMes, estacao);
        System.out.println("\nFim.");

    }
}
