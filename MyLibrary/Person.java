package Library;

public class Person {
	String name;
	int maxBooks;
	
	public Person()
	{
		name = "unknown";
		maxBooks = 3;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMaxBooks(int maxBooks) {
		this.maxBooks = maxBooks;
	}

	public String getName() {
		return name;
	}

	public int getMaxBooks() {
		return maxBooks;
	}
	public String toString()
	{
		return getName() + getMaxBooks() ;
	}
}
