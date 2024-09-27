/*. Faça um programa que permita ao usuário entrar com uma 
matriz de 3 x 3 números inteiros quaisquer. Em seguida, gere 
um array unidimensional pela soma dos números de cada 
coluna da matriz e mostrar na tela esse array. Por exemplo, a 
matriz:              
5 -8 10
1 2 15
25 10 7

Vai gerar um vetor, onde cada posição é a soma das dos 
valores de cada coluna dessa matriz. A primeira posição do 
vetor será a somatória de 5 + 1 + 25, e assim por diante.*/





import java.util.Scanner;

public class Mat6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] V1 = new int[3][3];
        int[]V2 = new int[3];


        System.out.println("Digite um numero inteiro");

        for (int i = 0; i < V1.length; i++) {
            for (int j = 0; j < V1[i].length; j++) {
                
                V1[i][j] = scan.nextInt();


            }
        }

            int soma = 0;


            for (int j = 0; j < V1[0].length; j++) {
                
                for (int i = 0; i < V1[j].length; i++) {
                    

                    soma += V1[i][j] ;
                }

                V2[j] = soma;
            }

           System.out.println("Matriz V1: ");

            for (int i = 0; i < V2.length; i++) {

                for (int j = 0; j < V2.length; j++) 
                    
                    System.out.print(V1[i][j] + "\t");
                
                
              System.out.println();
                
            }

        
                
                
            
            
            System.out.println("Soma das Colunas: ");

        for (int j = 0; j < 3; j++) {
             System.out.print(" Coluna " + (j + 1)  +": " + V2[j]);


        }


    }
}
