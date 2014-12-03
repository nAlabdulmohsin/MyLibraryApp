package Library;

public class Book {
	String author;
	String title;
	Person person;
	boolean isAvailable;
	
	public Book(String title) {
		super();
		this.title = title;
	}

	public Book() {
		this.title = "Sideways";
		this.author = "John";
		 person = new Person();
		 this.isAvailable = false;
	}

	public void setTitle(String title) {
		this.title=title;		
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person p2) {
		this.person = p2;
	}

	public String getTitle() {
		return title;
	}
	public String toString()
	{
	
		String available = "error";
		if (isAvailable == true )
		{
			available = "Available";
		}
		else 
		{
			available = "unavailable";
		}
		return getTitle() + " by " + getAuthor() + "; " + available ; 
	}

}
