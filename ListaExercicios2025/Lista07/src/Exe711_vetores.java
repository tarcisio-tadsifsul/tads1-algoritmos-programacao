/**
 * 11 - Crie um vetor de 8 números inteiros.
 * Conte quantos valores são maiores que 50.
 * Imprima o total.
 * 
*/

import java.util.Arrays;
public class Exe711_vetores {
    public static void main(String[] args ){
        // tipo[] nomeVetor = {valores};
        short[] numeros = {10, 55, 89, 40, 23, 51, 90, 12};
        short totalMaior50 = 0;

        //for(Tipo var : vetor)
        for(short num : numeros){
            if (num > 50){
                totalMaior50++;
            }
        }

        short[] maioresQue50 = new short[totalMaior50];
        short pos = 0;
        // for(int index = 0; index < numeros.length; index++){
        //     if (numeros[index] > 50){
        //         maior50[x] = numeros[index];
        //         x++;
        //     }
        // }
        for (short num : numeros){
            if (num > 50){
                maioresQue50[pos] = num;
                pos++;
            }
        }
        
        System.out.println("\nNúmeros: " + Arrays.toString(numeros));
        System.out.println("Números > 50: " + Arrays.toString(maioresQue50));
        System.out.println("Total Números > 50: " + totalMaior50 + "\n");
    }
}
