

import java.util.Scanner;

public class BevShopDriver 
{

	public static void main(String[] args) 
	{
		Size size = null;
		Day orderDay = null;
		Type type = null;
		
		double total = 0.0;
		
		String name;
		int age;
		int numFruit = 0; 
		String decision, decision2, decision3;
		boolean addFruit, addSyrup, addShot;
		
		String day; 
		
		System.out.println("The current order in process can have at most 3 "
				+ "alcoholic beverages");
		System.out.println("The minimum age to order alcoholic drink is 21");
		System.out.println("Start a new order please: ");

		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = keyboard.nextLine();
		System.out.println("Enter your age: ");
		age = keyboard.nextInt();
		
		System.out.println();
		
		Order order = new Order();
		
		Customer customer = new Customer(name, age);
		
		System.out.println("What day of the week is it?");
		day = keyboard.nextLine();
		
		if (day.equalsIgnoreCase("monday"))
		{
			orderDay = Day.MONDAY;
		}
		else if (day.equalsIgnoreCase("wednesday"))
		{
			orderDay = Day.WEDNESDAY;
		}
		else if (day.equalsIgnoreCase("thursday"))
		{
			orderDay = Day.THURSDAY;
		}
		else if (day.equalsIgnoreCase("friday"))
		{
			orderDay = Day.FRIDAY;
		}
		else if (day.equalsIgnoreCase("saturday"))
		{
			orderDay = Day.SATURDAY;
		}
		else if (day.equalsIgnoreCase("sunday"))
		{
			orderDay = Day.SUNDAY;
		}
		
		
		
		
		if (age > 20)
		{
			System.out.println("You are above 21 so you can order alcohol");
			System.out.println("Woud you like to order an alcoholic drink? (yes or no");
			decision = keyboard.nextLine();
			
			if (decision.equalsIgnoreCase("yes"))
			{
				while (order.findNumOfBeveType(Type.ALCOHOL) < BevShop.MAX_ORDER_FOR_ALCOHOL)
				{
					System.out.println("What alcoholic drink would you like?");
					String bevName = keyboard.nextLine();
					System.out.print("What size? (small, medium, large)");
					String size1 = keyboard.nextLine();
					
					if (size1.equalsIgnoreCase("small"))
					{
						size = Size.SMALL;
					}
					else if (size1.equalsIgnoreCase("medium"))
					{
						size = Size.MEDIUM;
					}
					else if (size1.equalsIgnoreCase("large"))
					{
						size = Size.LARGE;
					}
			
					order.addNewBeverage(bevName, size);
					total += order.calcOrderTotal();
				}
			}
		}
		else
		{
			System.out.println("You must be 21 or older to order alcohol");
		}
		System.out.println();
		
		System.out.println("Would you like to order a Smoothie? yes or no");
		decision2 = keyboard.nextLine();
		if (decision2.equalsIgnoreCase("yes"))
		{
			System.out.println("What Smoothie would you like?");
			String bevName = keyboard.nextLine();
			System.out.println("What size? (small, medium, large)");
			String size1 = keyboard.nextLine();
			
			if (size1.equalsIgnoreCase("small"))
			{
				size = Size.SMALL;
			}
			else if (size1.equalsIgnoreCase("medium"))
			{
				size = Size.MEDIUM;
			}
			else if (size1.equalsIgnoreCase("large"))
			{
				size = Size.LARGE;
			}
			for (int i = 0; i < BevShop.MAX_FRUIT; i++)
			{
				System.out.println("Enter 1 fruit: ");
				String fruit = keyboard.nextLine();
				if (fruit != null)
				{
					numFruit++;
				}
			}
			System.out.println("Would you like protein? (yes or no)");
			String answer = keyboard.nextLine();
			if (answer.equalsIgnoreCase("yes"))
			{
				addFruit = true;
			}
			else
			{
				addFruit = false;
			}
			order.addNewBeverage(bevName, size, numFruit, addFruit);
			total += order.calcOrderTotal();
		}
		
		System.out.println();
		
		
		System.out.println("Would you like to order a Coffee? yes or no");
		decision3 = keyboard.nextLine();
		if (decision3.equalsIgnoreCase("yes"))
		{
			System.out.println("What Coffee would you like?");
			String bevName = keyboard.nextLine();
			System.out.println("What size? (small, medium, large)");
			String size1 = keyboard.nextLine();
			
			if (size1.equalsIgnoreCase("small"))
			{
				size = Size.SMALL;
			}
			else if (size1.equalsIgnoreCase("medium"))
			{
				size = Size.MEDIUM;
			}
			else if (size1.equalsIgnoreCase("large"))
			{
				size = Size.LARGE;
			}

			System.out.println("Would you like to add Syrup? (yes or no)");
			String answer2 = keyboard.nextLine();
			if (answer2.equalsIgnoreCase("yes"))
			{
				addSyrup = true;
			}
			else
			{
				addSyrup = false;
			}
			
			System.out.println("Would you like to add an extra shot? (yes or no)");
			String answer3 = keyboard.nextLine();
			if (answer3.equalsIgnoreCase("yes"))
			{
				addShot = true;
			}
			else
			{
				addShot = false;
			}
			order.addNewBeverage(bevName, size, addSyrup, addShot);
			total += order.calcOrderTotal();
		}
		
		System.out.print("The total price for the order is: $" + total);
	}

}
