package Pol;

public class Test {

	public void fazerAnimalComer(Animal animal) {
		animal.comer();
	}
	public static void main(String[] args) {
		Test t = new Test();
		
		t.fazerAnimalComer(new Animal());
		t.fazerAnimalComer(new Cao());
		t.fazerAnimalComer(new Tigre());
		
		
	}//fim

}//fim classe
