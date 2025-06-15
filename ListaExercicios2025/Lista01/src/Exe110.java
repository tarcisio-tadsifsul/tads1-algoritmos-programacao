
/**
 * Lista de Exercicio 01
 * 
 * Exercicio 10
 * 
 * Enunciado:
 * 10) Desenvolva um programa que calcule a área da base de um cilindro.
 * Considere um raio(R) = 5. Utilize a fórmula: AreaBase = π R².
 * 
 */

public class Exe110 {
    public static void main(String[] args) {
        // Declaraçao Variaveis
        int raio = 0;
        float areaBase = 0.0f;
        final float PI = 3.14f;

        // Atribuiçao Variaveis
        raio = 5;

        // Calculos
        areaBase = PI * (raio * raio);

        // Saida de dados
        System.out.println("Raio = " + raio);
        System.out.printf("Area Base Cilindro = %.2f\n", areaBase);
    }
}
