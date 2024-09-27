package projetodewallace;

import java.util.Scanner;




public class CalcB{

	private float a, b, resultado;

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getResultado() {
		return resultado;
	}

	public void setResultado(float resultado) {
		this.resultado = resultado;
	}
	
	
	public float Somar() {
		return (this.a + this.b);
	}
	
	public float Subtrair() {
		return (this.a - this.b);
	}
	
	public float Multiplicar() {
		return (this.a * this.b);
	}
	
	public float Dividir() {
		return (this.a / this.b);
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		CalcB obj = new CalcB();
		
	
		float entrada;
	
		System.out.println("Digite o primeiro valor:");
		
		entrada = input.nextFloat();
	
		obj.setA(entrada);
		
		System.out.println("Digite o segumdo valor:");
		
		entrada = input.nextFloat();
	
		obj.setB(entrada);
		
		entrada=obj.Somar();
		
		
		//entrada = obj.getResultado();
		
		System.out.printf("A soma = %.2f\n", entrada);
		
		
		entrada = obj.Subtrair();
		
		System.out.printf("A subtração = %.2f\n", entrada);
		
		entrada = obj.Multiplicar();
		
		System.out.printf("A multiplicação =%.2f\n", entrada);
		
		
		entrada = obj.Dividir();
		
		System.out.printf("A Divisão = %.2f\n", entrada);
		
	}
}