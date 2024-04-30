import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;
import org.junit.Test;

public class DayTestStudent 
{
	Day day;
	
	@Before
	public void setUp() throws Exception 
	{
		day = Day.FRIDAY;
	}
	
	@After
	public void tearDown() throws Exception
	{
		day = null;
	}
	
	@Test
	public void testDay()
	{
		assertEquals(Day.FRIDAY, day);
	}
}
