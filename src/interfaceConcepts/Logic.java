package interfaceConcepts;

public class Logic implements Functions
{

	public void add(int a,int b)
	{
		System.out.println("the output is ...."+(a+b));
	}
	
	public void even(int a)
	{
		if(a%2==0)
		{
			System.out.println("it's a even number");
		}
		else
		{
			System.out.println("it's a odd number");
		}
	}
}
