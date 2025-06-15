
/**
 * Lista de Exercicio 01
 * 
 * Exercicio 09
 * 
 * Enunciado:
 * 9) Faça um programa que calcule
 * a associação em paralelo de dois resistores R1 e R2.
 * Para R1 = 4.25f e R2 = 3.75f.
 * 
 * R = R1 * R2 / R1 + R2
 */

public class Exe109 {
    public static void main(String[] args) {
        // Declaraçao Variaveis
        float R1 = 0.0f;
        float R2 = 0.0f;
        double R = 0;

        // Atribuiçao Variaveis
        R1 = 4.25f;
        R2 = 3.75f;

        // Calculos
        R = (R1 * R2) / (R1 + R2);

        // Saida de dados
        System.out.println("R1 = " + R1);
        System.out.println("R2 = " + R2);
        System.out.printf("Associaçao de dois Resistores = %.2f\n", R);
    }
}
