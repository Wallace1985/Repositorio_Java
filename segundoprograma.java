import java.util.Scanner;
/*
 * Faça um programa que receba a idade do usuário e verifique se tem 18
 * anos ou mais. Se a respsosta for positiva escrever "maior idade", 
 * senão menor idade 
 */
public class segundoprograma { 
    
    public static void main(String[] args) {
        int idade = 0; 
        String resultado = "";    
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade= scan.nextInt();
        
        if (idade >= 18) {
           resultado = "Maior idade!"; 
        }else{
            resultado = "Menor idade!"; 
        }
     System.out.printf("%s", resultado);

    }

}
