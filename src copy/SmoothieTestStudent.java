import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SmoothieTestStudent
{
	Smoothie smoothie1;
	
	@Before
	public void setUp() throws Exception 
	{
		smoothie1 = new Smoothie("Energizer", Size.LARGE, 5, true);
	}
	
	@After
	public void tearDown() throws Exception
	{
		smoothie1 = null;
	}
	
	@Test
	public void testCalcPrice()
	{
		assertEquals(7.0, smoothie1.calcPrice(), 0.01);
	}
	
	@Test
	public void testAddProtein()
	{
		assertTrue(smoothie1.addProtein());
	}
	
	@Test
	public void testGetNumOfFruits()
	{
		assertEquals(5,smoothie1.getNumOfFruits(), 0.1);
	}
	
	@Test
	public void testToString()
	{
		assertEquals("Energizer, LARGE, true, 5, 7.0", smoothie1.toString());
	}
}
	
