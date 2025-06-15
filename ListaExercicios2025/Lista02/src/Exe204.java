
/**
 * Lista de Exercicio 02
 * 
 * Exercicio 04
 * 
 * Enunciado:
 * 04) Leia um número real e imprima o resultado do cubo e do quadrado
 * desse número.
 * 
 */
import java.util.Scanner;

public class Exe204 {
    public static void main(String[] args) {
        // Declaraçao Variaveis
        float numeroReal;
        double quadrado, cubo;
        Scanner entrada = new Scanner(System.in);

        // Entrada de Dados
        System.out.print("Digite um numero: ");
        numeroReal = entrada.nextFloat();

        // Calculos
        quadrado = Math.pow(numeroReal, 2);
        cubo = Math.pow(numeroReal, 3);

        // Saida de dados
        System.out.println("------------------------------");
        System.out.println("O numero " + numeroReal + " ao quadrado e " + quadrado);
        System.out.println("O numero " + numeroReal + " ao cubo = " + cubo);

        // Fecha a classe Scanner
        entrada.close();
    }
}
