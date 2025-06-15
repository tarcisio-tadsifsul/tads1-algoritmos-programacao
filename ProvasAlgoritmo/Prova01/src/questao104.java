import java.util.Scanner;

public class questao104 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int op;
        String nome, email, fone, dataE, dataS;
        float valor;

        System.out.println();
        System.out.println("Escolha uma opção:\n [1] Cadastrar Cliente\n [2] Marcar Reserva \n [3] Sair do programa \n");
        System.out.print("Opção: ");
        op = sc.nextInt();

        if (op == 1 || op == 2 || op == 3) {
            if (op == 1){
                System.out.println("\nCadastrar Cliente:");
                System.out.print(" Nome: ");
                nome = sc.next();
                System.out.print(" E-mail: ");
                email = sc.next();
                System.out.print(" Telefone: ");
                fone = sc.next();

                System.out.println("\n----\nCadastro do Cliente:");
                System.out.printf(" Nome: %s \n E-mail: %s \n Telefone: %s",nome, email, fone);
                System.out.println("");
                
            } else if (op == 2){
                System.out.println("\nMarcar uma reserva:");
                System.out.print(" Nome: ");
                nome = sc.next();
                System.out.print(" Data Entrada: ");
                dataE = sc.next();
                System.out.print(" Data Saída: ");
                dataS = sc.next();
                System.out.print(" Valor: ");
                valor = sc.nextFloat();

                System.out.println("\n----\nCadastro do Cliente:");
                System.out.printf(" Nome: %s \n Data Entrada: %s \n Data Saída: %s \n Valor: R$%.2f",nome, dataE, dataS, valor);
                System.out.println("");

            } else if (op == 3) {
                System.out.println("Sair do programa...");
                System.out.println("Logout feito com sucesso!");
                System.exit(0);
            }
        } else {
            System.out.println("OPÇÃO INVÁLIDA!");
            System.out.println("Sair do programa...");
            System.exit(0);
        }

        sc.close();
    }
}
