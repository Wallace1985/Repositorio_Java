import java.util.Scanner;
public class Rep3 {
    public static void main(String[] args) {
        float soma = 0;
        int i;
        for (i = 0; i <= 20; i++) {
            soma = soma + (i * 2) - 1 / i;
            System.out.printf("%d/%d + = %.2F ", i * 2 - 1, i, soma);
        }
    }
}
