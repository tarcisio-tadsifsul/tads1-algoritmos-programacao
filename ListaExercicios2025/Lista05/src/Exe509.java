
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

public class Exe509 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipoConversao, conversao;
        float unidIni, unidFim;

        System.out.println("\n--- CONVERSÃO UNIDADES BASICAS ---");
        System.out.print("\nTipos de Conversão:"
                + "\n [1] Comprimento"
                + "\n [2] Massa"
                + "\n [3] Temperatura"
                + "\n\nInforme o tipo de conversão: ");
        tipoConversao = sc.nextInt();

        switch (tipoConversao) {
            case 1:
                System.out.print("\nEspecificação da Conversão:"
                        + "\n [1] cm -> m "
                        + "\n [2] cm -> km"
                        + "\n [3] m  -> cm"
                        + "\n [4] m  -> km"
                        + "\n [5] km -> cm "
                        + "\n [6] km -> m"
                        + "\n\nInforme a conversão de Comprimento: ");
                conversao = sc.nextInt();
                switch (conversao) {
                    case 1:
                        System.out.print("\nInforme o valor em centímetros: ");
                        unidIni = sc.nextFloat();
                        unidFim = unidIni / 100f;
                        System.out.println("RESULTADO: " + unidIni + "cm = " + unidFim + "m");
                        break;
                    case 2:
                        System.out.print("\nInforme o valor em centímetro: ");
                        unidIni = sc.nextFloat();
                        unidFim = unidIni / 100000f;
                        System.out.println("RESULTADO: " + unidIni + "cm = " + unidFim + "km");
                        break;
                    case 3:
                        System.out.print("\nInforme o valor em metros: ");
                        unidIni = sc.nextFloat();
                        unidFim = unidIni * 100f;
                        System.out.println("RESULTADO: " + unidIni + "m = " + unidFim + "cm");
                        break;
                    case 4:
                        System.out.print("\nInforme o valor em metros: ");
                        unidIni = sc.nextFloat();
                        unidFim = unidIni / 1000f;
                        System.out.println("RESULTADO: " + unidIni + "m = " + unidFim + "km");
                        break;
                    case 5:
                        System.out.print("\nInforme o valor em Quilômetros: ");
                        unidIni = sc.nextFloat();
                        unidFim = unidIni * 100000f;
                        System.out.println("RESULTADO: " + unidIni + "km = " + unidFim + "cm");
                        break;
                    case 6:
                        System.out.print("\nInforme o valor em Quilômetros: ");
                        unidIni = sc.nextFloat();
                        unidFim = unidIni * 1000f;
                        System.out.println("RESULTADO: " + unidIni + "km = " + unidFim + "m");
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                        break;
                }
                break;
            case 2:
                System.out.print("\nEspecificação da Conversão:"
                        + "\n [1] g  -> kg "
                        + "\n [2] g  -> t"
                        + "\n [3] kg -> g"
                        + "\n [4] kg -> t"
                        + "\n [5] t  -> g"
                        + "\n [6] t  -> kg"
                        + "\n\nInforme a conversão de Massa: ");
                conversao = sc.nextInt();
                switch (conversao) {
                    case 1:
                        System.out.print("\nInforme a quantidade inicial em Gramas: ");
                        unidIni = sc.nextFloat();
                        unidFim = unidIni / 1000f;
                        System.out.println("RESULTADO: " + unidIni + "g = " + unidFim + "kg");
                        break;
                    case 2:
                        System.out.print("\nInforme a quantidade inicial em Gramas: ");
                        unidIni = sc.nextFloat();
                        unidFim = unidIni / 1000000f;
                        System.out.println("RESULTADO: " + unidIni + "g = " + unidFim + "t");
                        break;
                    case 3:
                        System.out.print("\nInforme a quantidade inicial em Quilogramas: ");
                        unidIni = sc.nextFloat();
                        unidFim = unidIni * 1000f;
                        System.out.println("RESULTADO: " + unidIni + "kg = " + unidFim + "g");
                        break;
                    case 4:
                        System.out.print("\nInforme a quantidade inicial em Quilogramas: ");
                        unidIni = sc.nextFloat();
                        unidFim = unidIni / 1000f;
                        System.out.println("RESULTADO: " + unidIni + "kg = " + unidFim + "t");
                        break;
                    case 5:
                        System.out.print("\nInforme a quantidade inicial em Toneladas: ");
                        unidIni = sc.nextFloat();
                        unidFim = unidIni * 1000000f;
                        System.out.println("RESULTADO: " + unidIni + "t = " + unidFim + "g");
                        break;
                    case 6:
                        System.out.print("\nInforme a quantidade inicial em Toneladas: ");
                        unidIni = sc.nextFloat();
                        unidFim = unidIni * 1000f;
                        System.out.println("RESULTADO: " + unidIni + "t = " + unidFim + "kg");
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                        break;
                }
                break;
            case 3:
                System.out.print("\nEspecificação da Conversão:"
                        + "\n [1] °C -> °F "
                        + "\n [2] °C ->  K"
                        + "\n [3] °F -> °C"
                        + "\n [4] °F ->  K"
                        + "\n [5]  K -> °C"
                        + "\n [6]  K -> °F"
                        + "\n\nInforme a conversão de Temperatura: ");
                conversao = sc.nextInt();
                switch (conversao) {
                    case 1:
                        System.out.print("\nInforme a temperatura em Celsius: ");
                        unidIni = sc.nextFloat();
                        unidFim = (unidIni * (9 / 5)) + 32f;
                        System.out.println("RESULTADO: " + unidIni + " °C = " + unidFim + " °F");
                        break;
                    case 2:
                        System.out.print("\nInforme a temperatura em Celsius: ");
                        unidIni = sc.nextFloat();
                        unidFim = unidIni + 273.15f;
                        System.out.println("RESULTADO: " + unidIni + " °C = " + unidFim + " K");
                        break;
                    case 3:
                        System.out.print("\nInforme a temperatura em Fahrenheit: ");
                        unidIni = sc.nextFloat();
                        unidFim = (unidIni - 32f) * (5f / 9f);
                        System.out.println("RESULTADO: " + unidIni + " °F = " + unidFim + " °C");
                        break;
                    case 4:
                        System.out.print("\nInforme a temperatura em Fahrenheit: ");
                        unidIni = sc.nextFloat();
                        unidFim = ((unidIni - 32f) * (5f / 9f)) + 273.15f;
                        System.out.println("RESULTADO: " + unidIni + " °F = " + unidFim + " K");
                        break;
                    case 5:
                        System.out.print("\nInforme a temperatura em Kelvin: ");
                        unidIni = sc.nextFloat();
                        unidFim = unidIni - 273.15f;
                        ;
                        System.out.println("RESULTADO: " + unidIni + " K = " + unidFim + " °C");
                        break;
                    case 6:
                        System.out.print("\nInforme a temperatura em Kelvin: ");
                        unidIni = sc.nextFloat();
                        unidFim = ((unidIni - 273.15f) * (9f / 5f)) + 32f;
                        System.out.println("RESULTADO: " + unidIni + " K = " + unidFim + " °F");
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                        break;
                }
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }
        sc.close();
    }
}
