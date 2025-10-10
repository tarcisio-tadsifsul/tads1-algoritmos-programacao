/*
 * Construa um algoritmo que criei um laço de repetição com um menu de opções.
 * 1 - Cadastrar cliente: Nome, sobrenome, email, data de nascimento e cpf
 * 2 - Cadastrar funcionário: Nome, sobrenome, email, data de admissão e cpf
 * 3 - Cadastrar fornecedor: Nome fantasia, razão social, email, data de cadastro e cnpj
 * 4 - Cadastrar transportadora: Nome fantasia, razão social, email, data de cadastro e cnpj
 * 5 - Sair do sistema
 * 
 * O programa deve ler e imprimir os dados conforme sugerido
 * em cada uma opções 1, 2, 3 ou 4. Sair do looping se digitar 5.
 * 
 */

import java.util.Scanner;
public class L2_Exe608 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        String nome1 = "", nome2 = "", id = "", email = "", data = "";

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
            sc.nextLine(); 
            switch (menu) {
                case 1:
                    System.out.print("\n[Cadastrar Cliente]");

                    System.out.print("\nNome: ");
                    nome1 = sc.nextLine();

                    System.out.print("Sobrenome: ");
                    nome2 = sc.nextLine();

                    System.out.print("email: ");
                    email = sc.nextLine();

                    System.out.print("Data Nascimento: ");
                    data = sc.nextLine();

                    System.out.print("CPF: ");
                    id = sc.nextLine();

                    System.out.println("\nNome: " + nome1
                    + "\nSobrenome: " + nome2
                    + "\nEmail: " + email
                    + "\nData Nascimento: " + data  
                    + "\nCPF: " + id);
                    
                    break;
                case 2:
                    System.out.println("\n[Cadastrar Funcionário]\n");

                    System.out.print("Nome: ");
                    nome1 = sc.nextLine();

                    System.out.print("Sobrenome: ");
                    nome2 = sc.nextLine();

                    System.out.print("email: ");
                    email = sc.nextLine();

                    System.out.print("Data Admissão: ");
                    data = sc.nextLine();

                    System.out.print("CPF: ");
                    id = sc.nextLine();
                    
                    System.out.println("\nNome: " + nome1
                    + "\nSobrenome: " + nome2
                    + "\nEmail: " + email
                    + "\nData Admissão: " + data  
                    + "\nCPF: " + id);

                    break;
                case 3:
                    System.out.println("\n[Cadastrar Fornecedor]\n");

                    System.out.print("Nome Fantasia: ");
                    nome1 = sc.nextLine();

                    System.out.print("Razão Social: ");
                    nome2 = sc.nextLine();

                    System.out.print("email: ");
                    email = sc.nextLine();

                    System.out.print("Data Cadastro: ");
                    data = sc.nextLine();

                    System.out.print("CNPJ: ");
                    id = sc.nextLine();
                    
                    System.out.println("\nNome Fantasia: " + nome1
                     + "\nRazão Social: " + nome2
                     + "\nEmail: " + email
                     + "\nData Cadastro: " + data 
                     + "\nCNPJ: " + id);

                    break;
                case 4:
                    System.out.println("\n[Cadastrar Transportadora]\n");

                    System.out.print("Nome Fantasia: ");
                    nome1 = sc.nextLine();

                    System.out.print("Razão Social: ");
                    nome2 = sc.nextLine();

                    System.out.print("email: ");
                    email = sc.nextLine();

                    System.out.print("Data Cadastro: ");
                    data = sc.nextLine();

                    System.out.print("CNPJ: ");
                    id = sc.nextLine();  

                    System.out.println("\nNome Fantasia: " + nome1
                     + "\nRazão Social: " + nome2
                     + "\nEmail: " + email
                     + "\nData Cadastro: " + data 
                     + "\nCNPJ: " + id);

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
