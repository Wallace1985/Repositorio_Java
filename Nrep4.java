import java.util.Scanner;
public class Nrep4 {
    public static void main(String[] args) {
        int x = 1, n = 1, p = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um outro numero inteiro");
        
        while ((x = scan.nextInt()) !=0) {
         
         p *= x ;
        
         System.out.println("Digite outro numero inteiro");
        
          

            
        }        
        System.out.printf("O produto dos valores e: %d \n\n", p);
    }
}
