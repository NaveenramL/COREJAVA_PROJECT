package encapsulation;

public class Main {
	public static void main(String[] args) {
		
		Program p=new Program();
		p.setName("naveen");
		System.out.println(p.getName());
		
		p.setAge(23);
		System.out.println(p.getAge());
		
		p.setPhone(984849943349l);
		System.out.println(p.getPhone());
	}

}
