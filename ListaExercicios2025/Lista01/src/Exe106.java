
/**
 * Lista de Exercicio 01
 * 
 * Exercicio 06
 * 
 * Enunciado:
 * 6) Crie um algoritmo que converta
 * 80 Km/h (quilômetros por hora) em ms (metros por segundo).
 * A fórmula de conversão é: M = K * 3.6,
 * sendo K a velocidade em Km/h e M em metros por segundo.
 * 
 */

public class Exe106 {
    public static void main(String[] args) {
        // Declaraçao Variaveis
        double K = 0.0;
        double M = 0.0;

        // Atribuiçao Variaveis
        K = 80;

        // Calculos
        M = K * 3.6;

        // Saida de dados
        System.out.println(K + " km/h = " + M + " ms");

    }
}
