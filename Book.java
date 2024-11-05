package LibraryManagementSystem;

public class Book {

	//attributes
	private String title;
	private String author;
	private int id;
	
	//constructor
	public Book(String title,String author,int id)
	{
		this.title=title;
		this.author=author;
		this.id=id;
	}
	
	//method for get attributes
	    
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	//method for display
	public String display()
	{
		System.out.println("Book information:");
		System.out.println("Title :"+this.title+"\nAuthor : "+this.author+"\nId : "+this.id);
		return "\0";
	}
	
	

	//Overload 
	public void display(String title,String author,int id)
	{
		System.out.println("Book information:");
		System.out.println("Title :"+this.title+"\nAuthor : "+this.author+"\nId : "+this.id);
	}

	
}
