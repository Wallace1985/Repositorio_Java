import java.util.Scanner;
public class Vet4 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] V1 = new int[5]; 
        int[] V2 = new int[5];
        
        int [] V3 = new int[10];

       

        for (int i = 0; i < V1.length ; i++) {
            
          

           System.out.println("Digite um numero inteiro");

             V1[i] = scan.nextInt();


            V3[i] = V1[i];
            

        }
        
        System.out.println("\n");


       



        for (int i = 0; i < V2.length; i++) {
            
            
            System.out.println("Digite um numero inteiro");
            
            V2[i] = scan.nextInt();


            V3[i + 5] = V2[i];

        }

        for (int i = 0; i < V3.length; i++) {

          for (int j = i + 1; j < V3.length; j++) {


                    if (V3[i] == V3[j]) {
            
                     V3[j] = 0;

          }
          }
            
           
            
        }


        System.out.println("\n");

        for (int i = 0; i < V3.length; i++) {
            
            System.out.printf("|%d ", V3[i]);

        }


    }
}
