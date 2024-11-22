package somamatriz;

import java.util.Scanner;


public class Somamatriz {
	private int[][] matA, matB, matC;
	
	
	public  
	Somamatriz() {
		
		this.matA = new int[2][2];
		this.matB = new int[2][2];
		this.matC = new int[2][2];
	}


	public int[][] getMatA() {
		return matA;
	}


	public void setMatA(int[][] matA) {
		this.matA = matA;
	}


	public int[][] getMatB() {
		return matB;
	}


	public void setMatB(int[][] matB) {
		this.matB = matB;
	}


	public int[][] getMatC() {
		return matC;
	}


	public void setMatC(int[][] matC) {
		this.matC = matC;
	}
	public void somar(int[][] matA, int[][] matB) {
		
		for(int i= 0; i < 2; i++) {
			for(int j = 0; j < 2; j ++) {
				
				 this.matC[i][j] = this.matA[i][j] + this.matB[i][j]; 
			}
		}
		
	
		
		
	}
	

		
		
		
	public void exibir() {
			
			for(int i= 0; i < 2; i++) {
				for(int j = 0; j < 2; j++) {
					
					System.out.print(this.matC[i][j] + " "); 
					System.out.println(); 
	
					
				}
			}
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Somamatriz obj = new Somamatriz();
		
		int m1[][] = new int[2][2];
		int m2[][] = new int[2][2];
		
		for(int i = 0;i < 2; i ++) {
			for(int j = 0; j < 2; j ++) {
				
				System.out.printf("Digite da valor da linha %d  e da coluna %2d ", i, j);
				m1[i][j] = input.nextInt();
			
			}
			
			
		}
		
		for(int i = 0;i < 2; i ++) {
			for(int j = 0; j < 2; j ++) {
				
				System.out.printf("Digite da valor da linha %d  e da coluna %2d ", i, j);
				m2[i][j] = input.nextInt();
			
			}
			
		}
		
		obj.setMatB(m2);
		obj.setMatA(m1);
		
		obj.somar(m1,m2);
		
		
		System.out.printf("O valor da soma das duas matrizes é.: ");
		
		
		obj.exibir();
		
		
		
		input.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
