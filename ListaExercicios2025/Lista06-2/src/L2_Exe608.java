/*
 * Construa um algoritmo que criei um laço de repetição com um menu de opções.
 * 1 - Cadastrar cliente: Nome, sobrenome, email, data de nascimento e cpf
 * 2 - Cadastrar funcionário: Nome, sobrenome, email, data de admissão e cpf
 * 3 - Cadastrar fornecedor: Nome fantasia, razão social, email, data de cadastro e cnpj
 * 4 - Cadastrar transportadora: Nome fantasia, razão social, email, data de cadastro e cnpj
 * 5 - Sair do sistema
 * 
 * 
 */

import java.util.Scanner;
public class L2_Exe608 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int menu = 1;

        String listaMenu = "\nMENU SISTEMA:"
                            + "\n[1] Cadastrar Cliente"
                            + "\n[2] Cadastrar Funcionário"
                            + "\n[3] Cadastrar Fornecedor"
                            + "\n[4] Cadastrar Transportadora"
                            + "\n[5] Sair do Sistema";

        while (menu != 5){
            System.out.println(listaMenu);
            System.out.print("\nDigite uma opção: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("\n[Cadastrar Cliente]");
                    break;
                case 2:
                    System.out.println("\n[Cadastrar Funcionário]");
                    break;
                case 3:
                    System.out.println("\n[Cadastrar Fornecedor]");
                    break;
                case 4:
                    System.out.println("\n[Cadastrar Transportadora]");
                    break;
                case 5:
                    System.out.println("\n[Sair do Sistema]");
                    break;
            
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    continue;
            }
        }

        sc.close();
    }
}
