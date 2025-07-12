/**
 * Lista 05 - Switch
 * 
 * 9) Crie um programa que converta unidades básicas.
 * O usuário deve escolher o tipo de conversão:
 * Ex: 1 para Comprimento, 2 para Massa, 3 para Temperatura)
 * 
 * Em seguida, as unidades específicas para converter (Ex: cm para m, kg para g,
 * Celsius para Fahrenheit).
 * Use `switch` aninhados ou múltiplos `switch` para gerenciar as opções.
 * 
 */

import java.util.Scanner;

public class Exe509_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipoConversao;

        System.out.println("\n--- CONVERSÃO UNIDADES BASICAS ---");
        System.out.print("\nTipos de Conversão:"
                + "\n [1] Centímetros para metros"
                + "\n [2] Quilos para gramas"
                + "\n [3] Celsius para  Farenheit"
                + "\n\nInforme o tipo de conversão: ");
        tipoConversao = sc.nextInt();

        switch (tipoConversao) {
            case 1:
                System.out.print("Informe uma medida em centímetros: ");
                double cm = sc.nextFloat();
                double m = cm /100f;
                System.out.println(cm + "cm = " + m + "m");
                break;
            case 2:
                System.out.print("Informe uma quantidade em quilos: ");
                double kg = sc.nextFloat();
                double g = kg  * 1000f;
                System.out.println(kg + "kg = " + g + "gr");
                break;
            case 3:
                System.out.print("Informe uma temperatura em Celcius: ");
                double c = sc.nextFloat();
                double f = (c * (9 / 5)) + 32f;
                System.out.println(c + "ºC = " + f + "F");
                break;
            default:
                System.out.println("Tipo de Conversão Inválida!");
                break;
            }
            sc.close();
    }
}
