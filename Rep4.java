import java.util.Scanner;

public class Rep4 {
public static void main(String[] args) {
    int x = 1, n = 1, p;
    Scanner scan = new Scanner(System.in);


       do {
        System.out.println("Digite um numero inteiro");
        n = scan.nextInt();
        
        System.out.println("Digite um outro numero inteiro");
        x = scan.nextInt();
       
        
          p = x * n;
            System.out.printf("O produto dos valores e: %d \n", p);  
       
       } while (n != 0); {
        
         System.out.println("Fim do Programa!");
        
        
        
        } 
    

    

}
    
}