import java.util.Scanner;

public class resposta105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        float x1,x2,delta;
        System.out.print("Informe o valor de A: ");
        a = sc.nextInt();
        // Correção: o valor de A deve ser testado antes de pedir os outros valores
        System.out.print("Informe o valor de B: ");
        b = sc.nextInt();
        System.out.print("Informe o valor de C: ");
        c = sc.nextInt();
        sc.close();
        delta = (Math.sqrt(b,2) - (4*a*c));
        // Correção: Math.sqrt() receba apenas um argumento;
        if (a == 0) {
            System.out.print("A = 0, equação não é do segundo grau.");
        } else if(delta < 0){
            System.out.print("A equação não possui raízes reais.");
        } else if(delta == 0){
            x1 = (-(b) + (Math.sqrt(delta,2))) / (2 * a);
            // Correção: Math.sqrt() receba apenas um argumento;
        } else {
            x1 = (-(b) + (Math.sqrt(delta,2))) / (2 * a);
            x2 = (-(b) - (Math.sqrt(delta,2))) / (2 * a);
            // Correção: Math.sqrt() receba apenas um argumento;
            System.out.print("Delta maior que 0, equação possui duas raízes reais.");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
