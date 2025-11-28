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
        byte dia = -1;

        System.out.println("\n\nDias da Semana\n");

        while (dia != 0) {
            System.out.print("Digite de [1 a 7] ou [0 - Sair]: ");
            dia = sc.nextByte();
            if (dia == 0) {
                sc.close();
                System.out.println("Saindo...\n");
                break;
            } else if (dia < 0 || dia > 7){
                System.out.println("Erro: valor inválido!");
            } else {
                System.out.println("O dia correspondente é: " + diasSemana[dia - 1]+"\n");
            }
        }
    }
}
