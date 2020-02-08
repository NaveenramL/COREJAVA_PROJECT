package methodOverloading;

public class Example {

	void average(float a,float b)
	{
		float average=((a+b)/2);
		System.out.println(average);
	}
	
	void average(double a,double b)
	{
		double average=((a+b)/2);
		System.out.println(average);
	}
	
	int add(int a,int b)
	{
		System.out.println(a+b);
		return a+b;
	}
	int add(int a,int b,int c)
	{
		System.out.println(a+b+c);
		return a+b+c;
	}
}
