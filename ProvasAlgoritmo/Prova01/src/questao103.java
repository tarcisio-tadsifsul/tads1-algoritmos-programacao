import java.util.Scanner;
public class questao103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] arrM = {0,0};
        float [] arrN =  {0,0,0};
        
        System.out.print("\n--- CÁLCULO DE MÉDIAS --- \n");
        for (int i = 0; i < arrN.length; i++) {
            System.out.printf("Informe o valor da nota #%d: ", (i+1));
            arrN[i] = sc.nextFloat();
            arrM[0] += arrN[i];
        }
        sc.close();

        arrM[0] = arrM[0] / arrN.length;
        arrM[1] = (float) ( (arrN[0]*2.25) + (arrN[1]*3.25) + (arrN[2]*4) ) / 10;
        
        System.out.printf("\nMédia Aritmética: %.2f", arrM[0]); 
        System.out.printf("\nMédia ponderada: %.2f", arrM[1]); 
        System.out.println();
    }
}