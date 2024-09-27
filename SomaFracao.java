public class SomaFracao {
        public static void main(String[] args) {
            double soma = 0;
            int numerador = 1;
            int denominador = 1;
    
            for (int i = 1; i <= 20; i++) {
                soma += (double) numerador / denominador;
                System.out.printf("%d/%d ", numerador, denominador);
    
                numerador += 2;
                denominador++;

                if (i < 20) {
                    System.out.print("+ ");
                } else {
                    System.out.printf("= %.2f%n", soma);
                }
            }
        }
    
}
