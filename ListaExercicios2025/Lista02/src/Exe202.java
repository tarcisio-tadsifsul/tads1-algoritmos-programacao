
/**
 * Lista de Exercicio 02
 * 
 * Exercicio 02
 * 
 * Enunciado:
 * 02) Faça um programa que leia um número real e o imprima no console.
 * 
 */
import java.util.Scanner;

public class Exe202 {
    public static void main(String[] args) {
        // Declaraçao Variaveis
        float numeroReal;
        Scanner entrada = new Scanner(System.in);

        // Entrada de Dados
        System.out.print("Digite um numero real: ");
        numeroReal = entrada.nextFloat();

        // Saida de dados
        System.out.println("Voce digitou o numero real " + numeroReal);

        // Fecha a classe Scanner
        entrada.close();
    }
}
