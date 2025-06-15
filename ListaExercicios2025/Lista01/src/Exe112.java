
/**
 * Lista de Exercicio 01
 * 
 * Exercicio 12
 * 
 * Enunciado:
 * 12) Crie um algoritmo que calcule a área total de um cilindro,
 * utilizando a fórmula AreaTotal = 2 x Ab + Al.
 * O programa devera informar a área da base e a área lateral
 * (Exercícios 10 e 11).
 * 
 */

public class Exe112 {
    public static void main(String[] args) {
        // Declaraçao Variaveis
        byte raio = 0;
        byte altura = 0;
        float areaLateral = 0.0f;
        float areaBase = 0;
        final float PI = 3.14f;
        float areaTotal = 0.0f;

        // Atribuiçao Variaveis
        raio = 5;
        altura = 10;

        // Calculos
        areaBase = PI * (raio * raio);
        areaLateral = 2 * PI * raio * altura;
        areaTotal = 2 * (areaBase + areaLateral);

        // Saida de dados
        System.out.println("Raio = " + raio);
        System.out.println("Altura = " + altura);
        System.out.printf("Area Base Cilindro = %.2f\n", areaBase);
        System.out.printf("Area Lateral Cilindro = %.2f\n", areaLateral);
        System.out.printf("Area Total Cilindro = %.2f\n", areaTotal);
    }
}
