
/**
 * Lista de Exercicio 02
 * 
 * Exercicio 01
 * 
 * Enunciado:
 * 01) Faça um programa que leia um número inteiro e o imprima no console.
 * 
 */
import java.util.Scanner;

public class Exe201 {
    public static void main(String[] args) {
        // Declaraçao Variaveis
        int numero;
        Scanner entrada = new Scanner(System.in);

        // Entrada de Dados
        System.out.print("Digite um numero: ");
        numero = entrada.nextInt();

        // Saida de dados
        System.out.println("Voce digitou o numero " + numero);

        // Fecha a classe Scanner
        entrada.close();
    }
}
