import java.util.Scanner;

/**
 * 04 - Crie um vetor diasSemana com os nomes dos 7 dias da semana:
 * "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado".
 * Solicite ao usuário um número (de 1 a 7) e imprima o dia correspondente
 * (considerando 1 como Domingo, 7 como Sábado e 0 para sair)
 * 
 */

public class Exe704_vetores {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String[] diasSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        int dia = -1;

        System.out.println("Dias da Semana");

        while (dia != 0) {
            System.out.print("Digite um número de 1 a 7 para ver o dia da semana ou 0 para sair: ");
            dia = sc.nextInt();
            if (dia == 0) {
                sc.close();
                System.out.println("Saindo...");
                break;
            } else if (dia < 0 || dia > 7){
                System.out.println("Erro: valor inválido!");
            } else {
                System.out.println("O dia correspondente é: " + diasSemana[dia - 1]);
            }
        }
    }
}
