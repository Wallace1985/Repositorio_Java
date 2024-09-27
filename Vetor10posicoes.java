/*1º)Crie um vetor de 10 posições;
 *2º)Inicializar o vetor com valores fornecidos pelo usuáro;
 *3º)Exibir todos os valores da ultima até a primeira posição;
 *4º)Calcular e exibir a quantodades de numeros pares;
 *5º)Calcular e exibir a mádia de todos os valores. */

import java.util.Scanner;

public class Vetor10posicoes {

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);    
    
        int[] vet  = new int[10];
    
    
    
        for (int i = 0; i < vet.length; i++) {
         
            System.out.println("Digite um numero inteiro");

            vet[i] = input.nextInt();
    
            
        }

        System.out.println("Valores em ordem decrescente");        

        System.out.print("[");
        
        for (int i = vet.length - 1; i >= 0; i--) {
            
            if(i > 0){
                System.out.printf("%d, ", vet[i]);
            }else{
                System.out.printf("%d", vet[i]);
            }

        }
        System.out.print("]");
    
            System.out.println("");

            int cont = 0;

        for (int i = 0; i < vet.length; i++) {
            
            if (vet[i] % 2 == 0) {
                 
                cont ++;


            }

        }
    
        System.out.printf("Em vet existe %d numeros pares\n", cont);

    

        int soma = 0;

        


        for (int i = 0; i < vet.length; i++) {
            
            soma += vet[i];

        }


       float  media = (float)soma / vet.length;


        System.out.printf("A média dos valores armazenados em vet é: %.2f\n", media);

    }



}
