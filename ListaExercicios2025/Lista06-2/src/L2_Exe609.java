/*
 * 9 Construa um algoritmo que criei um laço de repetição com um menu de opções.
 * Dentro de cada opção outros submenus.
 * 1 - Consultas: Saldo, extrato, limite
 * 2 - Transferências: Contas próprias ou de terceiros, TEDs, DOCs, Pix
 * 3 - Pagamentos: Contas de serviços (água, luz, telefone), boletos, impostos
 * 4 - Investimentos: Poupança, fundos de investimento, CDBs
 * 5 - Serviços Pessoais: Alteração de senha, dados cadastrais
 * 6 - Sair do sistema
 * 
 */

import java.util.Scanner;

public class L2_Exe609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0, subMenu = 12;

        String MenuList = "\n\n-MENU"
                      + "\n[1] Consultas: Saldo, extrato, limite"
                      + "\n[2] Transferências: Contas próprias ou de terceiros, TEDs, DOCs, Pix"
                      + "\n[3] Pagamentos: Contas de serviços, boletos, impostos"
                      + "\n[4] Investimentos: Poupança, fundos de investimento, CDBs"
                      + "\n[5] Serviços Pessoais: Alteração de senha, dados cadastrais"
                      + "\n[6] Sair do sistema";

        String menuConsulta = "\n[11] -Saldo-"
                          + "\n[12] -Extrato-"
                          + "\n[13] -Limite-";

        String menuTranf = "\n[21] -Contas Próprias ou de Terceiros-"
                       + "\n[22] -TEDs-"
                       + "\n[23] -DOCs-"
                       + "\n[24] -PIX-";
                        
        String menuPagtos = "\n[31] -Contas de Serviços-"
                        + "\n[32] -Boletos-"
                        + "\n[33] -Impostos-";

         String menuInvest = "\n[41] -Poupança-"
                         + "\n[42] -Fundos de Investimento-"
                         + "\n[43] -CDBs-";

         String menuServPessoais = "\n[51] -Alteração de Senha-"
                                + "\n[52] -Dados Cadastrais-";
         
         String cta = "\nDigite uma opção: ";

         String subMenuText = "";

        while (menu != 6) {
            System.out.println(MenuList);
            System.out.print(cta);
            menu = sc.nextInt();

            switch(menu){
                case 1:
                    System.out.println(menuConsulta);
                    System.out.print(cta);
                    subMenu = sc.nextInt();

                    if (subMenu == 11){
                        subMenuText = "Saldo";
                    } else if (subMenu == 12){
                        subMenuText = "Extrato";
                    } else {
                        subMenuText = "Limite";
                    }

                    System.out.print("\n " + subMenuText);

                    break;

                case 2:
                    System.out.println(menuTranf);
                    System.out.print(cta);
                    subMenu = sc.nextInt();

                    if (subMenu == 21){
                        subMenuText = "Contas Próprias ou de Terceiros";
                    } else if (subMenu == 22){
                        subMenuText = "TEDs";
                    }else if (subMenu == 23){
                        subMenuText = "DOCs";
                    } else {
                        subMenuText = "PIX";
                    }

                    System.out.print("\n " + subMenuText);

                    break;

                case 3:
                    System.out.println(menuPagtos);
                    System.out.print(cta);
                    subMenu = sc.nextInt();

                    if (subMenu == 31){
                        subMenuText = "Contas de Serviços";
                    } else if (subMenu == 32){
                        subMenuText = "Boletos";
                    } else {
                        subMenuText = "Impostos";
                    }

                    System.out.print("\n " + subMenuText);

                    break;

                case 4:
                    System.out.println(menuInvest);
                    System.out.print(cta);
                    subMenu = sc.nextInt();

                    if (subMenu == 41){
                        subMenuText = "Poupança";
                    } else if (subMenu == 42){
                        subMenuText = "Fundos de Investimento";
                    } else {
                        subMenuText = "CDBs";
                    }

                    System.out.print("\n " + subMenuText);

                    break;

                case 5:
                    System.out.println(menuServPessoais);
                    System.out.print(cta);
                    subMenu = sc.nextInt();

                    if (subMenu == 51){
                        subMenuText = "Alteração de Senha";
                    } else {
                        subMenuText = "Dados Cadastrais";
                    }

                    System.out.print("\n " + subMenuText);                    

                    break;

                case 6:
                    break;
                default:
                    System.out.println("Opção Inválida. Tente outra Opção");
                    continue;
            }
        }
        sc.close();

    }
}
