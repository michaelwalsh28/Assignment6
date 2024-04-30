import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;
import org.junit.Test;

public class SizeTestStudent 
{
	Size size;
	
	@Before
	public void setUp() throws Exception 
	{
		size = Size.MEDIUM;
	}
	
	@After
	public void tearDown() throws Exception
	{
		size = null;
	}
	
	@Test
	public void testDay()
	{
		assertEquals(Size.MEDIUM, size);
	}
}
