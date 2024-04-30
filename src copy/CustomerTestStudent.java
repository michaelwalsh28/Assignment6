
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CustomerTestStudent 
{
	Customer customer1, customer2;
	
	@Before
	public void setUp() throws Exception
	{
		customer1 = new Customer("Mike", 21);
		customer2 = new Customer("John", 99);
	}
	
	@After
	public void tearDown() throws Exception
	{
		customer1 = customer2 = null;
	}
	
	@Test 
	public void testGetName()
	{
		assertEquals(customer1.getName(), "Mike");
		assertEquals(customer2.getName(), "John");
	}
	
	@Test
	public void testGetAge()
	{
		assertEquals(customer1.getAge(), 21);
		assertEquals(customer2.getAge(), 99);
	}
	
	@Test
	public void testToString()
	{
		assertEquals(customer1.toString(), "Mike, 21");
	}
}
