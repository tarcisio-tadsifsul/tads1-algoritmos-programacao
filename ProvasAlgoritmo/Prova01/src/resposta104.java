import java.util.Scanner;

public class resposta104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        String nome, email, fone, dataE, dataS;
        float valor = 0.00f;

        System.out.print("Escolha uma opção: [1] Cadastrar Cliente [2] Marcar Reserva [3] Sair do programa");
        op = sc.nextInt();       
        
        if (op == 1) {
            System.out.print("Nome cliente: ");
            nome = sc.nextLine();
            System.out.print("Email cliente: ");
            email = sc.nextLine();
            System.out.print("Telefone cliente: ");
            fone = sc.nextLine();
            System.out.print("\nNome: " + nome + "\nEmail: " + email + "\nTelefone: " + fone);
        } else if (op == 2){
            System.out.print("Nome cliente: ");
            nome = sc.nextLine();
            System.out.print("Data Entrada: ");
            dataE = sc.nextLine();
            System.out.print("Data Saída: ");
            dataS = sc.nextLine();
            System.out.print("Valor Diária: ");
            valor = sc.nextFloat();
            System.out.print("\nNome: " + nome + "\nData Entrada: " + dataE + "\nData Saída: " + dataS + "\nValor Diária: " + valor);
        } else if (op == 3){
            System.out.print("Logout feito com Sucesso.");
        } else {
            System.out.print("ERRO: opção inválida!");
        }
        // faltou fechar a var sc
        // sc.close();
    }
}
