/*Faça um programa para exibir a tabuada de 0 a 9
 *de um numero inteiro qualquer informado pelo 
 usuário */




import java.util.Scanner;
public class Rep2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = 0;
        int  x = 0;
        int[] n = new int[9];
         System.out.println(" Digite um numero inteiro: ");
         x = scan.nextInt();
       
        for(i = 0; i <= n.length; i++){
            n[i] = x*i;
            System.out.printf("%d X %d = %d \n", x, i, n[i] );
        }
        


    }
}
