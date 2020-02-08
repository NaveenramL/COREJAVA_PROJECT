package methodOveriding;

public class Main {
	public static void main(String[] args) {
		
		A a=new A();
		a.setInfo("naveen", 96, 94.97978f);
		a.displayDetails();
		
		B b=new B();
		b.setInfo("ram", 98, 96.77f);
        b.displayDetails();
	}

}
