package ArrayOperation;

import junit.framework.TestCase;

import static org.junit.Assert.*;

public class ArrayOperationTest extends TestCase {
	
	public void testReverseArray()
	{
		Integer[] array = {1,2,3,4,5};
		Integer[] reverseArray = {5,4,3,2,1};
		
		assertEquals(Integer.valueOf(1), reverseArray[3]);
		assertEquals(Integer.valueOf(4), reverseArray[0]);

		
	}
	public void testArraySum()
	{
		ArrayOperation a = new ArrayOperation();
		assertTrue(a.arraySum ([5][4]));
		
	}
}
