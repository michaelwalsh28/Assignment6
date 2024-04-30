import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CoffeeTestStudent 
{
	Coffee coffee1;
	
	@Before
	public void setUp() throws Exception 
	{
		coffee1 = new Coffee("Espresso", Size.LARGE, true, true);
	}
	
	@After
	public void tearDown() throws Exception
	{
		coffee1 = null;
	}
	
	@Test
	public void testCalcPrice()
	{
		assertEquals(4.0, coffee1.calcPrice(), 0.01);
	}
	
	@Test
	public void testGetExtraShot()
	{
		assertTrue(coffee1.getExtraShot());
	}
	
	@Test
	public void testGetExtraSyrup()
	{
		assertTrue(coffee1.getExtraSyrup());
	}
	
	@Test
	public void testToString()
	{
		assertEquals("Espresso, LARGE, true, true, 4.0", coffee1.toString());
	}
	
}
