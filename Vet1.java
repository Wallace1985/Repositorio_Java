public class Vet1 {

    public static void main(String[] args) {
        
        int soma = 0;
        
        int[] A = {1, 0, -5, -2, -5, 3};

        
         


        for (int i = 0; i < A.length; i++) {
            soma = A[0] + A[1] + A[5];
        }

        System.out.printf("Soma dos elemento da posição 0, 1, 5: %d\n", soma);


         for (int i = 0; i < A.length; i++) {
            A[4] = 239;
        }


        for (int i = 0; i < A.length; i++) {
            System.out.printf("|%d ", A[i]);
        }



    }
}