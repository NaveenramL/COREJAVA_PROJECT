package classAndObjects; // it is the name of the package

public class A // A is the name of the class
{

	int age; // here age is a variable
	
	A()  // it is a constructor
	{
		
	}
	
	void getAge(int a) // it is a method with parameter
	{
		this.age=a;
	}
	
	void display() // it is a method without parameter
	{
		System.out.println("the age is ...."+this.age);
	}
	void message()
	{
		System.out.println("Just now started....");
	}
}
