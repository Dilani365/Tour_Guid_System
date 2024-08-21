package Ex3;

public class Student {
	
	String name;
	String ditno;
	String address;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDitno() {
		return ditno;
	}

	public void setDitno(String ditno) {
		this.ditno = ditno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public void getDetails() {
		
		System.out.println("I am a Student.\n"
				+ "My name is Udaya.\n"
				+ "I am from Malabe.\n"
				+ "My dit no is DIT/11/C1/0010");
	}
	
	
	
	
	
	
	
	/*public void display() {
		
		System.out.println("name :"+name);
		System.out.println("name :"+ditno);
		System.out.println("name :"+address);
	}*/

};
