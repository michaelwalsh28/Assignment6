
public class Alcohol extends Beverage
{

	public static final double weekendPrice = 0.6;
	public boolean isWeekend;
	
	Alcohol(String bevName, Size Size, boolean isWeekend) 
	{
		super(bevName, Type.ALCOHOL, Size);
		this.isWeekend = isWeekend;
	}

	
	public boolean isWeekend()
	{
		return isWeekend;
	}
	
	@Override
	public double calcPrice() 
	{
		double total = 0.0;
	    total += addSizePrice();
		if (isWeekend() == true)
		{
			total += weekendPrice;
		}
		return total;
	}
	
	@Override
	public boolean equals (Beverage anotherBev)
	{
		boolean status = false;
		if (getBevName().equals(anotherBev.getBevName()) &&
				getSize().equals(anotherBev.getSize()) &&
				isWeekend() == ((Alcohol) anotherBev).isWeekend() &&
				calcPrice() == ((Alcohol) anotherBev).calcPrice())
				
		{
			status = true;
		}
		return status;
	}

	public String toString()
	{
		return getBevName() + ", " + getSize()  + ", " + isWeekend() + ", " + calcPrice();
 	}
}
