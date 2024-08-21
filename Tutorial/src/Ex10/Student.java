package Ex10;

public class Student extends Person {
	
	String StudentID="IT3464";
	
	public void showDetails() {
		
		super.showDetails();
		System.out.println(StudentID);
	}

}
