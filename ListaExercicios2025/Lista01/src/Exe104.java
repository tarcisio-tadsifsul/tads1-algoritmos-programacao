
/**
 * Lista de Exercicio 01
 * 
 * Exercicio 04
 * 
 * Enunciado:
 * 4) Faça um algoritmo para converter as seguintes temperaturas:
 * Fahrenheit = (Celsius × 9/5) + 32
 * Kelvin = (Fahrenheit - 32) / 1.8 + 273.15
 * Celsius = Kelvin - 273.15.
 * Comece atribuindo para Celsius 30º e utilize o tipo primitivo Float.
 * 
 */

public class Exe104 {
    public static void main(String[] args) {
        // Declaraçao Variaveis
        double F = 0.0;
        double K = 0.0;
        double C = 0.0;

        // Atribuiçao Variaveis
        C = 30;

        // Calculos
        F = (C * (9 / 5)) + 32;
        K = (F - 32) / (1.8 + 273.15);
        C = K - 273.15;

        // Saida de dados
        System.out.printf("Fahrenheit = %.2f\n", F);
        System.out.printf("Kelvin = %.2f\n", K);
        System.out.printf("Celsius = %.2f\n", C);
    }
}
