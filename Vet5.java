import java.util.Scanner;
public class Vet5 {
    public static void main(String[] args) {
        int[][] M1 = new int[2][2];
        int[][] M2 = new int[2][2];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1[i].length; j++) {
                
                System.out.printf("Digite o valor da linha %d e da coluna %d: \n", i , j);

                M1[i][j] = scan.nextInt();
                scan.nextLine();
                M2[i][j] = M1[i][j];
            }
        }
        


        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1[i].length; j++) 
                System.out.printf("%4d", M1[i][j]);

                
            
        
            System.out.print("\n");


        }

        System.out.println();

        for (int i = 0; i < M2.length; i++) {
            
            for (int j = 0; j < M2[i].length; j++) {
                
                if (j > i) {
                    
                    M2[i][j] = 0;

                }    
            
            }
        
        }

        for (int i = 0; i < M2.length; i++) {
            for (int j = 0; j < M2[i].length; j++) 
                
                System.out.printf("%4d", M2[i][j]);



            System.out.println();
        }


    }

  



}
