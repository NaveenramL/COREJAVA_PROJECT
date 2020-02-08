package abstraction;

public class Output extends Program
{

	
	void setDetails(String n, int a) 
	{
		
		this.age=a;
		this.name=n;
	}
	
	void display()
	{
		System.out.println(this.name+" "+this.age);
	}

}
