
/**
 * Lista de Exercicio 02
 * 
 * Exercicio 05
 * 
 * Enunciado:
 * 05) Leia um número real e imprima
 *     a terça, quarta e quinta parte deste número.
 * 
 */
import java.util.Scanner;

public class Exe205 {
    public static void main(String[] args) {
        // Declaraçao Variaveis
        float numeroReal, umTerco, umQuarto, umQuinto;
        Scanner entrada = new Scanner(System.in);

        // Entrada de Dados
        System.out.print("Digite um numero: ");
        numeroReal = entrada.nextFloat();

        // Calculos
        umTerco = numeroReal / 3;
        umQuarto = numeroReal / 4;
        umQuinto = numeroReal / 5;

        // Saida de dados
        System.out.println("------------------------------");
        System.out.println("A terça parte do numero " + numeroReal + " e igual a " + umTerco);
        System.out.println("A quarta parte do numero " + numeroReal + " e igual a " + umQuarto);
        System.out.println("A quinta parte do numero " + numeroReal + " e igual a " + umQuinto);

        // Fecha a classe Scanner
        entrada.close();
    }
}
