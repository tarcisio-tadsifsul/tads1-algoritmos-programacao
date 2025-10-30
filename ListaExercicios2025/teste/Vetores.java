public class Vetores {
    public static void main(String[] args){
        // Declaração: tipo[] nomeDoVetor;
        int[] numeros;
        // Alocação (inicialização): nomeDoVetor = new tipo[tamanho];
        numeros = new int[5]; // Cria um vetor de inteiros com 5 posições (índices de 0 a 4)

        // Ou pode ser feito em uma única linha
        // Declaração: tipo[] nomeVetor = new tipo[tamanho]
        String[] nomes = new String[10]; // Um vetor para 10 Strings
        // Sintaxe tbm aceita colchete depois do nome da var
        String sobrenomes[] = new String[10];

        // Exemplos de declaração
        int[] nro = new int[16];
        double salario[] = new double[6];
        String[] mes = new String[12];

        // --------------------------------
        //Exemplos uso
        int n = 10;
        int[] v = new int[n]; // usando var n para tamanho do vetor
        int i;

        for (i=1; i<n; i++){
            v[i] = i;
            System.out.println(v[i]);
        }
    }
}
