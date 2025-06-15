import java.util.Scanner;

public class questao105 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        int a,b,c;
        double delta,x1,x2;

        System.out.println("\n--- CÁLCULO BÁSKARA ---\n");
        System.out.print("Digite o valor de A: ");
        a = sc.nextInt();

        if (a == 0) {
            System.out.println("O valor de A igual a zero. A equação não é do segundo grau!");
            System.out.println("Encerrando programa...");
            System.exit(0);
        }

        System.out.print("Digite o valor de B: ");
        b = sc.nextInt();
        System.out.print("Digite o valor de C: ");
        c = sc.nextInt();
        
        sc.close();

        delta = (Math.pow(b,2)) - (4*a*c);

        if (delta < 0){
            System.out.println("Delta igual a zero. A equação não possui raízes reais.");
            System.out.println("Encerrando programa...");
            System.exit(0);
        } else if (delta == 0){
            x1 = ( -(b) + (Math.sqrt(delta)) ) / (2 * a);

            System.out.println("Delta igual 0. A equação possui apenas uma raiz real");
            System.out.println("x1 = " + x1);

        } else if (delta > 0){
            x1 = ( -(b) + (Math.sqrt(delta)) ) / (2 * a);
            x2 = ( -(b) - (Math.sqrt(delta)) ) / (2 * a);

            System.out.println("Delta positivo. A equação possui duas raiz reais:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("Valores inválidos!");
            System.out.println("Encerrando programa...");
        }

    }

}