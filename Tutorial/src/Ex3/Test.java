package Ex3;

public class Test {
	
	public static void main(String args[]) {
		
	
		Student s1 = new Student();
		s1.setName("dilani");
		s1.setDitno("it3234");
		s1.setAddress("colombo"); 
		
		System.out.println(s1.getName());
		System.out.println(s1.getDitno());
		System.out.println(s1.getAddress());
		
		s1.getDetails();
		
	}

}