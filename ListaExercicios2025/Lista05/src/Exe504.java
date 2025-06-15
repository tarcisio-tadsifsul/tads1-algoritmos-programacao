
/**
 * Lista 05 - Switch-Case
 * 
 * 4) Codifique um programa que faça a leitura de dois número reais.
 *    A seguir o programa lê um caractere matemático que deve ser: +, -, ou /,
 *    e realiza a operação indicada pelo caractere sobre os valores lidos.
 * 
 *    O programa deve imprimir o resultado da operação realizada sobre eles,
 *    como mostra o exemplo a seguir (exibindo exatamente duas casas decimais).
 * 
 *    Resultado: 4.50 + 5.00 = 9.50
 * 
 *    Seu programa deve usar o comando switch.
 * 
 */

import java.util.Scanner;

public class Exe504 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, result = 0;
        char op;

        System.out.println("\n--- OPERAÇÃO MATEMÁTICA BÁSICA ---");
        System.out.println("\nInforme dois números: ");
        System.out.print("A: ");
        n1 = sc.nextFloat();
        System.out.print("B: ");
        n2 = sc.nextFloat();

        System.out.println("Qual operação você quer fazer? [+] [-] [/] [*] ");
        System.out.print("Operação: ");
        op = sc.next().charAt(0);
        sc.close();

        switch (op) {
            case '+':
                result = (float) n1 + n2;
                break;
            case '-':
                result = (float) n1 - n2;
                break;
            case '/':
                result = (float) n1 / n2;
                break;
            case '*':
                result = (float) n1 * n2;
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }

        System.out.printf("Resultado: %.2f %s %.2f = %.2f", n1, op, n2, result);

    }
}
