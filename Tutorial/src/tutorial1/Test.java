package tutorial1;


public class Test {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println(s1.name);
		
		s1.address="colombo";
		s1.name="dilani";
		s1.ditno="IT2132344";
		
		Student s2 = new Student();
		s2.address="matara";
		s2.ditno="it2344";
		s2.name="kanchi";
		
		s1.display();
		s2.display();

	}

}
