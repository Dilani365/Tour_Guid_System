package Ex9;

public class Pet {
	
	private String name;
	private String owner;
	private int age=0;
	
	public Pet(String n, String o, int a) {
		name=n;
		owner=o;
		age=a;
	}
	
	public Pet() {
		
	}
	
	
	public void showDetails() {
		
		System.out.println("my pet name is : "+name);
		System.out.println("pet owner is : "+owner);
		System.out.println("pet age : "+age);
	}

}
