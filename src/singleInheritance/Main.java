package singleInheritance;

public class Main 
{

	public static void main(String[] args) 
	{
		Parent p=new Parent();
		p.getInfo(20, "naveen");
		p.display();
		
		Child c=new Child();
		c.getInfo("Activa 3G", 109.99f);
		c.display();

	}

}
