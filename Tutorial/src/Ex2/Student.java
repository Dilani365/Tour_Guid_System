package Ex2;

public class Student {

	 private String name;
	 private String ditno;
	 private String address;
	 
public Student(String s, String d, String a){
		 
		 name = s;
		 ditno = d;
		 address = a;
		 
	 }
	 
	 public void display() {
		 
		 System.out.println("name :" + name);
		 System.out.println("ditno :" + ditno);
		 System.out.println("address :" + address);
	 }
	
}
