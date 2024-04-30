
public abstract class Beverage
{
	private String bevName; 
	private Type type;
	private Size size;
	public static final double basePrice = 2.0;
	public static final double increaseSize = 0.5;
	
	public Beverage (String bevName, Type type, Size size)
	{
		this.bevName = bevName;
		this.type = type;
		this.size = size;
	}
	
	public abstract double calcPrice();
	
	public double getBasePrice()
	{
		return basePrice;
	}
	
	public void setBevName(String bevName)
	{
		this.bevName = bevName;
	}
	public String getBevName()
	{
		return bevName;
	}
	
	public Size getSize()
	{
		return size;
	}
	
	public Type getType()
	{
		return type;
	}
	
	public double addSizePrice()
	{
		double total = basePrice;
		if (size == Size.MEDIUM)
		{
			total += increaseSize;
		}
		else if (size == Size.LARGE)
		{
			total += (increaseSize * 2);
		}
		
		return total;
	}
	
	public boolean equals(Beverage anotherBev)
	{
		boolean status = false;
		if (getBevName().equals(anotherBev.getBevName()) &&
				getSize().equals(anotherBev.getSize()))
		{
			status = true;
		}
		return status;
	}
	
	public String toString()
	{
		return getBevName() + ", " + getSize();
	}
}
