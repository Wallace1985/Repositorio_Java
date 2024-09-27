public class Vet2 {
    public static void main(String[] args) {
        int[] V1 ={3, 5, 7, 9, 11, 13};

        int[] V2 = new int[6];

        for (int i = 0; i < V1.length; i++) {
            V2[i] = V1[i] * V1[i];
        }

        for (int i = 0; i < V1.length; i++) {
            System.out.printf("|%d ", V1[i]);
        }

        System.out.println("\n\n");
        
        for (int j = 0; j < V2.length; j++) {
            System.out.printf("|%d ", V2[j]);
        }

    }
}
