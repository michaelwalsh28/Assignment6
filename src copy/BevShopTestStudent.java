import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BevShopTestStudent 
{
	Order orderOne;
	BevShop bev;
	
	@Before
	public void setUp() throws Exception
	{
		ArrayList<Order> orders = null;
		orderOne = new Order();
		BevShop.customerName = "Mike";
		orders.add(orderOne);
	}
	
	@Test
	public void getMaxNumOfFruits()
	{
		assertEquals(BevShop.MAX_FRUIT, 5);
	}
	
	@Test
	public void getMinAgeForAlcohol()
	{
		assertEquals(BevShop.MIN_AGE_FOR_ALCOHOL, 21);
	}
	
	@Test
	public void testIsMaxFruit()
	{
		int numFruit = 4;
		assertFalse(bev.isMaxFruit(numFruit));
	}
	
	@Test 
	public void testGetMaxOrderForAlcohol()
	{
		assertEquals(BevShop.MAX_ORDER_FOR_ALCOHOL, 3);
	}
	
	@Test
	public void testIsEligibleForMore()
	{
		assertTrue(bev.isEligibleForMore());
	}
}
