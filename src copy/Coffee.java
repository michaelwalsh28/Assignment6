
public class Coffee extends Beverage
{

	private boolean extraShot;
	private boolean extraSyrup;
	private static final double extra = 0.50;
	
	public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup)
	{
		super(bevName, Type.COFFEE, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}

	
	@Override
	public double calcPrice() 
	{
		// TODO Auto-generated method stub
		double total = 0.0;
		total += addSizePrice();
		if (getExtraShot() == true)
		{
			total += extra;
		}
		if (getExtraSyrup() == true)
		{
			total += extra;
		}
		return total;
	}
	
	public boolean getExtraShot()
	{
		return extraShot;
	}
	
	public boolean getExtraSyrup()
	{
		return extraSyrup;
	}
	
	@Override
	public boolean equals(Beverage anotherBev)
	{
		boolean status = false;
		if (getBevName().equals(anotherBev.getBevName()) &&
				getSize().equals(anotherBev.getSize()) &&
				getExtraShot() == ((Coffee) anotherBev).getExtraShot() &&
				getExtraSyrup() == ((Coffee) anotherBev).getExtraSyrup())
				
		{
			status = true;
		}
		return status;
	}
	
	public String toString()
	{
		return getBevName() + ", " + getSize() + ", " + getExtraShot() + ", " + getExtraSyrup() + ", " + calcPrice();
	}
}
