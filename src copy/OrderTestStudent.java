import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OrderTestStudent 
{
	Order orderone, ordertwo;
	
	@Before
	public void setUp() throws Exception
	{
		orderone = new Order(9, Day.THURSDAY, new Customer("Mike", 21));
		ordertwo = new Order(11, Day.SATURDAY, new Customer("Chris", 18));
	}
	
	@After
	public void tearDown() throws Exception
	{
		orderone = ordertwo = null;
	}
	
	@Test
	public void testCompareTo()
	{
		assertEquals(orderone.compareTo(ordertwo), -1);
	}
	
	@Test
	public void testFindNumOfBeveType()
	{
		orderone.addNewBeverage("regular Coffee", Size.SMALL, false, false);
		orderone.addNewBeverage("Mohito", Size.SMALL);
		orderone.addNewBeverage("Detox", Size.MEDIUM, 1, false);
		
		assertEquals(orderone.findNumOfBeveType(Type.ALCOHOL), 1);
	}
	
	@Test
	public void testgetters()
	{
		orderone.addNewBeverage("BEER", Size.LARGE);
		orderone.addNewBeverage("WINE", Size.SMALL);
		assertEquals(orderone.getDay(), Day.THURSDAY);
		assertEquals(ordertwo.getOrderDay(), Day.SATURDAY);
		assertEquals(orderone.getOrderTime(), 9);
		assertEquals(orderone.getTotalItems(), 2);
	}
	
	@Test
	public void testIsWeekend()
	{
		assertEquals(ordertwo.isWeekend(), true);
		assertEquals(orderone.isWeekend(), false);
	}
	
}
