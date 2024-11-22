package excecoes2;

import excecoes.Excecoes;
import excecoes.Excecoes.wallace;

public class Excecoes2 {

	private int a, b, c;
	
	class wallace extends Throwable{
		
	}

	public Excecoes2() {
		this.a = 2;
		this.b = 0;
		this.c = 0;
		
	}

	public int divisao() throws wallace{

		if(b == 0)throw new wallace();
		if(b!=0) {
			
			c = a/b;
		}
		return c;
	}
	
	public void exercicio() {
		 
		 try {
			 divisao();
		 }
	 
		 catch(Exception e) {
			 
			 System.out.println("Erro Divisão...");
			 
			 }
		 catch(wallace a) {
			 System.out.println("Erro Divisão...");
		 }
		 
		 finally{
			 System.out.println("Programa extendido com sucesso!");
		 }
	 
	 
	 }

	public static void main(String[] args) {
		
		Excecoes2 obj = new Excecoes2();
		
			obj.exercicio();
		
		
		
	 	}

}
