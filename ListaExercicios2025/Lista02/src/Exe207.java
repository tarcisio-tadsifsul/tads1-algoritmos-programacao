
/**
 * Lista de Exercicio 02
 * 
 * Exercicio 07
 * 
 * Enunciado:
 * 07) Faca um algoritmo que receba um valor em minutos
 *     e transforme e mostre em segundos no console.
 * 
 */
import java.util.Scanner;

public class Exe207 {
    public static void main(String[] args) {
        // Declaraçao Variaveis
        int minutos, segundos;
        Scanner entrada = new Scanner(System.in);

        // Entrada de Dados
        System.out.print("Digite um valor em minutos: ");
        minutos = entrada.nextInt();

        // Calculos
        segundos = minutos * 60;

        // Saida de dados
        System.out.println(minutos + " minutos = " + segundos + " segundos");

        // Fecha a classe Scanner
        entrada.close();
    }
}
