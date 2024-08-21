package Ex9;

public class Cat extends Pet{
	
	private int lives=7;
	
	public Cat(String n, String o, int a, int l) {
		
		super(n, o, a);
		lives=l;
	}

	
	public Cat() {
		
		
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("new born age :"+lives);
		
	}
}
