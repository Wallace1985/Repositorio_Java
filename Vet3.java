import java.util.Scanner;
public class Vet3 {
    public static void main(String[] args) {
        
        int [] V = new int[10];

        int maior = 0, inicio = 0, posicao = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");

        for (int i = 0; i < V.length; i++) {
            
            V[i] = scan.nextInt();

            System.out.println("Digite outro numero inteiro");

            if (inicio == 1) {
                maior = V[i];
            }

        }

            
            inicio = 01;

            for (int i = 0; i < V.length; i++) {
                if (V[i] > maior) {
                    
                    maior = V[i];

                    posicao = i;



                }
            }

            System.out.printf("O maior valor no vetor V e: %d e esta na posicao: %d ", maior, posicao);
    }
}
