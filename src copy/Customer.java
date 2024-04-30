
public class Customer extends Object
{
	String name;
	int age;
	
	Customer(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	Customer(Customer C)
	{
		this(C.name,C.age);
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return name + ", " + getAge();
	}
}
