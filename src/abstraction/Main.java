package abstraction;

public class Main 
{
public static void main(String[] args)
{

	Output o=new Output();
	o.setDetails("p", 55);
	o.display();
	
	o.setInfo(67.3433f, 98);
	o.displayDetails();
}
}
