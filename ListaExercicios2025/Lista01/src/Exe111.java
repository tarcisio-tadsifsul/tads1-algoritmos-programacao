
/**
 * Lista de Exercicio 01
 * 
 * Exercicio 11
 * 
 * Enunciado:
 * 11) Faca um algoritmo que calcule a área lateral de um cilindro,
 * utilizando a fórmula: AreaLateral = 2 π R H.
 * Considere um raio(R) = 5 e uma altura(H) = 10.
 * 
 */

public class Exe111 {
    public static void main(String[] args) {
        // Declaraçao Variaveis
        byte raio = 0;
        byte altura = 0;
        final float PI = 3.14f;
        float areaLateral = 0.0f;

        // Atribuiçao Variaveis
        raio = 5;
        altura = 10;

        // Calculos
        areaLateral = 2 * PI * raio * altura;

        // Saida de dados
        System.out.println("Raio = " + raio);
        System.out.println("Altura = " + altura);
        System.out.printf("Area Lateral Cilindro = %.2f\n", areaLateral);
    }
}
