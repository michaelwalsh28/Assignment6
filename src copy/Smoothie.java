
public class Smoothie extends Beverage
{
	public static final double protein = 1.50;
	public static final double extraFruit = 0.50;
	public boolean addProtein;
	public int numOfFruits;

	Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein) {
		super(bevName, Type.SMOOTHIE, size);
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
	}

	public int getNumOfFruits()
	{
		return numOfFruits;
	}
	
	public boolean addProtein()
	{
		return addProtein;
	}
	
	
	@Override
	public double calcPrice() {
		double total = 0.0;
		total += addSizePrice();
		for (int i = 0; i < numOfFruits; i++)
		{
			total += extraFruit;
		}
		if (addProtein == true)
		{
			total += protein;
		}
		return total;
	}
	
	@Override
	public boolean equals (Beverage anotherBev)
	{
		boolean status = false;
		if (getBevName().equals(anotherBev.getBevName()) &&
				getSize().equals(anotherBev.getSize()) &&
				getNumOfFruits() == ((Smoothie) anotherBev).getNumOfFruits() &&
				addProtein() == ((Smoothie) anotherBev).addProtein())
				
		{
			status = true;
		}
		return status;
	}
	
	public String toString()
	{
		return getBevName() + ", " + getSize() + ", " + addProtein() + ", " + getNumOfFruits() + ", " + calcPrice();
	}

}
