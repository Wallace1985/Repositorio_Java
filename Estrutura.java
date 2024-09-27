import java.util.Scanner;
public class Estrutura {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

       
       
        N[] VetorI = new N[5] ;
        
        N[] VetorD = new N[5] ;


        System.out.println("Digite um numero inteiro");

        for (int i = 0; i < VetorI.length; i++) {
            int x = scan.nextInt();

            N objetoInteiro = new N();

            objetoInteiro.setN(x);

            VetorI[i] = objetoInteiro;

        }




    }
}
