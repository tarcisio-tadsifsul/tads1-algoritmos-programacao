public class primos0a100 {
    public static void main(String[] args){
        int numero = 1;
        while (numero <= 10) {
            
            if (numero <= 1){
                System.out.println(numero + " não é primo!");
            } else {
                int x = 2;
                while (x <= Math.sqrt(numero)) {
                    if (numero % x == 0){
                        System.out.println(numero + " não é primo!");
                    } else{
                        System.out.println(numero + " é primo!");
                    }
                    x++;
                }
            }

            
            numero++;
        }
    }
}
