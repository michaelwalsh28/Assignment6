
import java.util.ArrayList;

public class BevShop implements BevShopInterface
{
	public static String customerName;
	int numAlcoholicDrinks;
	int numOfFruits;
	int time;
	int age;
	
	ArrayList<Order> orders;
	
	public BevShop()
	{
		this.numAlcoholicDrinks = numAlcoholicDrinks;
		this.numOfFruits = numOfFruits;
		this.time = time;
		this.age = age;
	}
	
	public boolean isValidTime(int time) 
	{
		boolean status = false;
		if (time < 8 || time > 23)
		{
			status = false;
		}
		return status;
	}

	
	public int getMaxNumOfFruits() 
	{
		return MAX_FRUIT;
	}

	
	public int getMinAgeForAlcohol() 
	{
		return MIN_AGE_FOR_ALCOHOL;
	}

	
	public boolean isMaxFruit(int numOfFruits) 
	{
		boolean status = false;
		if (numOfFruits >= getMaxNumOfFruits())
		{
			status = true;
		}
		return status;
	}

	
	public int getMaxOrderForAlcohol() 
	{
		return MAX_ORDER_FOR_ALCOHOL;
	}

	
	public boolean isEligibleForMore() 
	{
		boolean status = false;
		if (getNumOfAlcoholDrink() < MAX_ORDER_FOR_ALCOHOL)
		{
			status = true;
		}
		return status;
	}

	
	public int getNumOfAlcoholDrink() 
	{
		numAlcoholicDrinks = getCurrentOrder().findNumOfBeveType(Type.ALCOHOL);
		return numAlcoholicDrinks;
	}

	
	public boolean isValidAge(int age) 
	{
		boolean status = false;
		if (age > MIN_AGE_FOR_ALCOHOL)
		{
			status = true;
		}
		return status;
	}

	
	public void startNewOrder(int time, Day day, String customerName, int customerAge) 
	{
		Order newOrder = new Order(time, day, new Customer(customerName, customerAge));
		orders.add(newOrder);
	}

	
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) 
	{
		getCurrentOrder().addNewBeverage(bevName, size, extraShot, extraSyrup);
	}


	public void processAlcoholOrder(String bevName, Size size) 
	{
		getCurrentOrder().addNewBeverage(bevName, size);
	}

	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) 
	{
		getCurrentOrder().addNewBeverage(bevName, size, numOfFruits, addProtein);
	}

	public int findOrder(int orderNo) 
	{
		return orders.indexOf(orders.get(orderNo));
	}

	public double totalOrderPrice(int orderNo)
	{
		double total = 0.0;
		total = orders.get(orderNo).calcOrderTotal();
		return total;
	}

	public double totalMonthlySale() 
	{
		double total = 0.0;
		for (int i = 0; i < orders.size(); i++)
		{
			total += totalOrderPrice(i);
		}
		return total;
	}

	
	public int totalNumOfMonthlyOrders()
	{
		return orders.size();
	}

	
	public Order getCurrentOrder() 
	{
		return orders.getLast();
	}

	
	public Order getOrderAtIndex(int index)
	{
		return orders.get(index);
	}


	public String toString()
	{
		return orders.toString() + ", $" + totalMonthlySale();
	}

	@Override
	public void sortOrders() 
	{
		
	}
}
