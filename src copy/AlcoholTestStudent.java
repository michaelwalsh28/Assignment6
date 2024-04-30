
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AlcoholTestStudent 
{
	Alcohol drink;
	
	@Before
	public void setUp() throws Exception 
	{
		drink = new Alcohol("Moscow Mule", Size.LARGE, true);
	}
	
	@After
	public void tearDown() throws Exception
	{
		drink = null;
	}
	
	@Test
	public void testCalcPrice()
	{
		assertEquals(3.60, drink.calcPrice(), 0.01);
	}
	
	@Test
	public void testIsWeekend()
	{
		assertTrue(drink.isWeekend());
	}
	
	@Test
	public void testToString()
	{
		assertEquals("Moscow Mule, LARGE, true, 3.6", drink.toString());
	}
}
