
import java.util.ArrayList;
import java.util.Random;


public class Order extends Object implements OrderInterface, Comparable <Order> 
{
	private int orderNumber;
	private int orderTime;
	private Day orderDay;
	private Customer cust;
	private ArrayList<Beverage> orderList = new ArrayList<>();

	public Order()
	{
		
	}
	public Order(int orderTime, Day orderDay, Customer cust)
	{
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.cust = cust;
		this.orderList = new ArrayList<>();
		this.orderNumber = generateOrder();
	}


	public void addNewBeverage(String bevName, Size size)
	{

		Alcohol newAlcohol = new Alcohol(bevName, size, isWeekend());
		orderList.add(newAlcohol);
		
	}
	
	public void addNewBeverage(String bevName, Size Size, boolean extraShot, boolean extraSyrup)
	{
		Coffee newCoffee = new Coffee(bevName, Size, extraShot, extraSyrup);
		orderList.add(newCoffee);
	}
	
	public void addNewBeverage(String bevName, Size Size, int numOfFruits, boolean addProtein)
	{
		Smoothie newSmoothie = new Smoothie(bevName, Size, numOfFruits, addProtein);
		orderList.add(newSmoothie);
	}
	
	public double calcOrderTotal()
	{
		double total = 0.0;
		for (Beverage beverage : orderList)
		{
			total += beverage.calcPrice();
		}
		return total;
	}
	
	public int compareTo(Order anotherOrder)
	{
		return Integer.compare(this.orderNumber, anotherOrder.orderNumber);
	}
	
	public int findNumOfBeveType(Type type)
	{
		int count = 0;
		for (int i = 0; i < orderList.size(); i++)
		{
			if (orderList.get(i).getType() == type)
			{
				count++;
			}
		}
		return count;
	}
	
	public int generateOrder()
	{
		int number;
		Random randomNumbers = new Random();
		number = randomNumbers.nextInt(80000) + 10000;
		return number;
	}
	
	public Beverage getBeverage(int itemNo)
	{
		Beverage newBeverage = orderList.get(itemNo);
		return newBeverage;
	}
	
	public Customer getCustomer()
	{
		return cust;
	}
	
	public Day getDay()
	{
		return orderDay;
	}
	
	public Day getOrderDay()
	{
		return orderDay;
	}
	
	public int getOrderTime()
	{
		return orderTime;
	}
	
	public int getOrderNumber()
	{
		return orderNumber;
	}
	
	public int getTotalItems()
	{
		return orderList.size();
	}
	
	public boolean isWeekend()
	{
		boolean isWeekend = false;
		if (getDay() == Day.SATURDAY || getDay() == Day.SUNDAY)
		{
			isWeekend = true;
		}
		return isWeekend;
	}
	
	public String toString()
	{
		return getOrderNumber() + ", " + getOrderTime() + ", " +  getOrderDay() + ", " + cust.getName() + ", " + cust.getAge();
	}
}
