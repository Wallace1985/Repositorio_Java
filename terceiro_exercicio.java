import java.util.Scanner;

public class terceiro_exercicio {
    /*
     * Faça um programa que receba três numeros inteiros e mostre o maior deles.
     * Considere que os numeros podem ser iguais.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n1 = 0, n2 = 0, n3 = 0, maior = 0;

        System.out.println("digite um numero inteiro: ");
        n1 = scan.nextInt();
        System.out.println("digite um numero inteiro: ");
        n2 = scan.nextInt();
        System.out.println("digite um numero inteiro: ");
        n3 = scan.nextInt();

        if (n1 > n2 && n1 > n3) {
            maior = n1;
            System.out.printf("%d é o maior numero! ", maior);
        }
           
            if (n2 > n1 && n2 > n3) {
                 maior = n2;
                System.out.printf("%d é o maior numero! ", maior);   
            }
            
            
            if(n3 > n1 && n3 > n2){
                 maior = n3;
                System.out.printf("%d é o maior numero! ", maior);
            }   
                
            
            if (n1 == n2 && n1 ==n3) {
               System.out.println("Os numeros sao iguais!"); 
            }
   
                 
    }
}
