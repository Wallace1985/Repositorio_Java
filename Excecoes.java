package excecoes;

public class Excecoes {
	private int a, b, c;
	
	
	class wallace extends Throwable{
		}
	

	public Excecoes() {
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
		 
		 System.out.println("Qualquer exceção!");
		 
		 }
 
	 catch(wallace a) {
		 System.out.println("Exceções wallace!....");
	 }
 
 
 }

 	public static void main(String[] args) {
	
	Excecoes obj = new Excecoes();
	
		obj.exercicio();
	
	
	
 	}


}
	
	
