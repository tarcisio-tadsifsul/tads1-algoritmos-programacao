/**
 * Segunda aula de Algoritmo e Programação
 * Aprendendo os primeiros comandos
 * 
 * Exercício 01
 * Crie um algoritmo
 */

public class Exe001 {
    public static void main(String[] args) {
        // Comentário de linha única
        System.out.println("Exercício #01");

        // Declaração de variaveis
        byte numero;

        // Atribuição de Valores
        numero = 1;

        //
        short idade = 10;
        int quant = 25;
        long bilhao = 100;
        float preco = 10.5f; // f para diferenciar do double
        double gramas = 100.554;
        boolean vf = true;
        char letra = 'A'; // Aspas simples
        String palavra = "Nome"; // Strings são aspas duplas

        System.out.println("Tipo byte: " + numero);
        System.out.println("Tipo short: " + idade);
        System.out.println("Tipo int: " + quant);
        System.out.println("Tipo long: " + bilhao);
        System.out.println("Tipo float: " + preco);
        System.out.println("Tipo double: " + gramas);
        System.out.println("Tipo boolean: " + vf);
        System.out.println("Tipo char: " + letra);
        System.out.println("Tipo String: " + palavra);
    }
}