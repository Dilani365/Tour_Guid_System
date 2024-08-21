package Ex10;

public class PartTimeStudent extends Student{
	
	int workinHors=23;
	
	public void showDetails() {
		
		super.showDetails();
		System.out.println(workinHors);
	}

}
