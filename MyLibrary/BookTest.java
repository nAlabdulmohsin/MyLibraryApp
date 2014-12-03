package Library;

import junit.framework.TestCase;

public class BookTest extends TestCase {
	public void testBook() {
		Book b = new Book("Sideways");
		b.setAuthor("Rex");
		assertEquals("Sideways", b.getTitle());
		assertEquals("Rex", b.getAuthor());
	}
	public void testGetPerson() {
		Book b1 = new Book("Great Expectations");
		Person p2 = new Person();
		p2.setName("Elivis");
		b1.setPerson(p2);
		String testName = b1.getPerson().getName();
		assertEquals("Elivis",testName);
	}
	public void testSetTitle() {
		Book b2 = new Book();
		b2.setTitle("HelloWorld");
		assertEquals("HelloWorld",b2.getTitle());
	}
	
	public void testSetAuthor() {
		Book b3 = new Book();
		b3.setAuthor("Rex");
		assertEquals("Rex",b3.getAuthor());
	}
	
	public void testToString()
	{
		Book b1 = new Book();
		
		b1.setAuthor("Phil");
		b1.isAvailable = true;
		b1.setTitle("Before I fall");
		assertEquals("Before I fall by Phil; Available", b1.toString());
		b1.isAvailable = false;
		assertEquals("Before I fall by Phil; unavailable", b1.toString());
	}

}
