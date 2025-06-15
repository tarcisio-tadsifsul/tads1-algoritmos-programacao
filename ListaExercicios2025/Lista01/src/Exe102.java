
/**
 * Lista de Exercicio 01
 * 
 * Exercicio 02
 * 
 * Enunciado:
 * 2) Faça um algoritmo que calcule e apresente
 * o valor do volume de uma lata de óleo,
 * utilizando a fórmula VOLUME = π * RAIO² * ALTURA.
 * 
 */

public class Exe102 {
    public static void main(String[] args) {
        float ALTURA = 0.0f;
        float RAIO = 0.0f;
        double PI = 0;
        double volume = 0;

        ALTURA = 3.05f;
        RAIO = 12.3f;
        PI = 3.14;

        volume = PI * Math.pow(RAIO, 2) * ALTURA;

        // VOLUME = π * RAIO² * ALTURA
        System.out.printf("Volume = %.2f\n", volume);
    }
}
