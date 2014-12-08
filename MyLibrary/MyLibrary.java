package Library;

import java.util.ArrayList;

import junit.framework.TestCase;

public class MyLibrary {
	String name;
	ArrayList<Book> books;
	ArrayList<Person> people;
	private Object maxBooks;
	
	
	public MyLibrary(String name)
	{
		this.name = name;
		ArrayList<Book> b1 = new ArrayList<Book>();
		ArrayList<Person> p1 = new ArrayList<Person>();
		
	}


	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}


	public boolean checkout(Book b1, Person p1) {
		if (b1.getPerson() == null)
		{
			b1.setPerson(p1);
			return true;
		}
		else 
		{	
		return false;
		}
	}


	public boolean checkin(Book b1, Person p1) {
		if (b1.getPerson() == null)
		{
			b1.setPerson(p1);
			return true;
		}
		else 
		{	
		return false;
		}
	}


	public void setBook(ArrayList<Book> books2) {
		this.books= books2;
		
	}


	public void setPerson(ArrayList<Person> people2) {
		this.people = people2;
	}


	public ArrayList<Person> getPerson() {
		// TODO Auto-generated method stub
		return people;
	}


	public ArrayList<Book> getBook() {
		// TODO Auto-generated method stub
		return books;
	}
	public int getCountOfBooks(Person p1)
	{
		
		return p1.getMaxBooks();
	}
	public ArrayList<Book> getAvailableBooks() //this has not been completed as it returns the whole list
	{
	
		return books;
		
	}


	public void setMaxBooks(int n) {
		this.maxBooks = maxBooks;
	}

	
	
}
