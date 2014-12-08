package Library;

import java.util.ArrayList;

import junit.framework.TestCase;

public class MyLibraryTest extends TestCase{
	
	
	private Person p1;
	private Book b1;
	private Book b2;
	private Person p2;
	private ArrayList<Book> books;
	private ArrayList<Person> people;
	private MyLibrary m;

	public void setup()
	{
		books = new ArrayList<Book>();
		people = new ArrayList<Person>();
		
		b1 = new Book("Before I fall");
		p1 = new Person();
		p1.setName("Bob");
		
		b2 = new Book("After I fall");
		p2 = new Person();
		p2.setName("Justin");
		
	
		books.add(b1);
		people.add(p2);
		people.add(p1);
		books.add(b2);
		
	
	}
	
	public void testMyLibrary()
	{
		setup();
		m = new MyLibrary("Bob");
		m.setBook(books);
		m.setPerson(people);
	
		assertEquals("Bob", m.getName());
		assertEquals("Before I fall",m.getBook().get(0).getTitle());
	}
	
	public void testCheckout ()
	{
		setup();
		m = new MyLibrary("Bob");
		assertTrue ( m.checkout(b1,p1));
		assertFalse (m.checkout(b1, p2));
		 
	}
	public void testCheckin()
	{
		setup();
		m = new MyLibrary("Bob");
		assertTrue(m.checkin(b1, p1));
		assertFalse (m.checkin(b1, p2));
		
	}
	public void testCountOfBooks()
	{
		setup();
		m = new MyLibrary("Bob");
		m.setMaxBooks(3);
		m.setPerson(people);
		assertEquals(3, m.getPerson().get(0).getMaxBooks());
	}
	
	public void testAvailableBooks()
	{
		setup();
		m = new MyLibrary("Bob");
		m.setBook(books);
		m.setPerson(people);
		assertTrue(m.checkout(b1, p1));
		assertFalse(m.checkout(b1, p2));
	}
	
	//public void testgetAvailableBooks() should be added
}
