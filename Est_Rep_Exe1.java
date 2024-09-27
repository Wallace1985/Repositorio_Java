import java.util.Scanner;
public class Est_Rep_Exe1 {
  
   public static void main(String[] args) {
    Scanner Scan = new Scanner(System.in);
    int i = 0, inicio = 1; //cria variável i
    float[] x = new float[5]; //cria o a vetor x
    float maior = 0, menor = 0;// criar dias variveis do tipo inteiro
     for (i = 0 ; i < 5 ; i ++) {
         System.out.println("Digite um numero Real");
         x[i] = Scan.nextFloat();
     }
         
     
     for ( i = 0; i < 5; i ++ ) {
        
        if (inicio == 1) {
            menor = x[i];
            maior = x[i];
        }
            inicio = 0;
        if (x[i] > maior) {
            maior = x[i];
        }
        if (x[i]< menor) {
            menor = x[i];
        }
     }
     System.out.printf("O maior  valor do vetor e: %f  e o menor e: %f", maior, menor);

   }
}