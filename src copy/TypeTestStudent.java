import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;
import org.junit.Test;

public class TypeTestStudent 
{
	Type type;
	
	@Before
	public void setUp() throws Exception 
	{
		type = Type.SMOOTHIE;
	}
	
	@After
	public void tearDown() throws Exception
	{
		type = null;
	}
	
	@Test
	public void testDay()
	{
		assertEquals(Type.SMOOTHIE, type);
	}
}
