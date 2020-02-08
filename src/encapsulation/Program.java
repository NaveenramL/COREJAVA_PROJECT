package encapsulation;

public class Program {
	private String name;
	private int age;
	private long phone;
	
	void setName(String n)
	{
		this.name=n;
		
	}
	String getName()
	{
		return name;
	}

	void setAge(int a)
	{
		this.age=a;
	}
	
	int getAge()
	{
		return age;
	}
	
	void setPhone(long p)
	{
		this.phone=p;
	}
	
	long getPhone()
	{
		return phone;
	}
}
