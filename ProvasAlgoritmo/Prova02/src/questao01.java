import java.util.Scanner;

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

public class questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String estacao = "";

        System.out.print("Digite um mês [1-12]: ");
        int mes = sc.nextInt();
        
        System.out.print("Digite um dia [1-31]: ");
        int dia = sc.nextInt();

        sc.close();

        switch (mes) {
            case 1:
            case 2:
            case 3:
                if (mes == 3 && dia > 19) {
                    estacao = "Outono";
                } else {
                    estacao = "Verão";
                }
                break;
        
            case 4:
            case 5:
            case 6:
                if (mes == 6 && dia > 20) {
                    estacao = "Inverno";
                } else {
                    estacao = "Outono";
                }
                break;

            case 7:
            case 8:
            case 9:
                if (mes == 9 && dia > 21) {
                    estacao = "Primavera";
                } else {
                    estacao = "Inverno";
                }
                break;

            case 10:
            case 11:
            case 12:
                if (mes == 12 && dia > 20) {
                    estacao = "Verão";
                } else {
                    estacao = "Primavera";
                }
                break;
            default:
                System.out.println("Mês inválido!");
                break;
        }

        System.out.println("Mês: " + mes
                            + "\n" + "Dia: " + dia
                            + "\n" + "Estação: " + estacao);
        
    }
}
