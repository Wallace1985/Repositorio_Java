import java.util.Scanner;

public class exerciciotres {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        float salario = 0, bonus = 0;
        
        int tempo = 0;


        System.out.println("Digite o valor do seu salario: ");
    
        salario = scan.nextFloat(); 

        System.out.println("Digite o valor do seu tempo de serviço: ");

        tempo = scan.nextInt();
        
        if (tempo >= 5 ) {
            
            bonus = (salario/100)*20;
        }
        if (tempo < 5) {
            
            bonus = (salario/100)*10; 
        }
    
        System.out.printf("Seu bonus salarial foi de  %f Reais", bonus);
    
    
    }
}
