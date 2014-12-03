package Library;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

	public void testPerson() {
		Person p = new Person();
		assertEquals("unknown", p.getName());
		assertEquals(3, p.getMaxBooks());
	}

	public void testSetName() {
		Person s = new Person();
		 s.setName("Noor");
		assertEquals("Noor",s.getName());
	}

	public void testSetMaxBooks() {
		Person n = new Person();
		n.setMaxBooks(20);
		assertEquals(20, n.getMaxBooks());
	}
	public void testToString(){
		Person f = new Person();
		f.setName("Fred Flintstone");
		assertEquals("Fred Flintstone", f.getName());
		f.setMaxBooks(6);
		assertEquals(6, f.getMaxBooks());
		
	}

}
