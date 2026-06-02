import java.util.ArrayList;
import java.util.List;

class Book{
	
	int id;
	String title;
	String author;
	boolean isIssued;
	
	public Book(int id, String title, String author)
	{
		this.id = id;
		this.title = title;
		this.author = author;
		
		this.isIssued = false;
	}
	
	public void displayBook()
	{
		System.out.println("Book ID:-" + id + ", Title: " + title + " Author: " + author + " Issued: " + isIssued);
	}
}

class User{
	
	
	int userId;
	String name;
	List<Book> issuedBook;
	
	public User(int userId, String name)
	{
		this.userId = userId;
		this.name = name;
		this.issuedBook = new ArrayList<>();
		
		
	}
	
	public void displayUser()
	{
		System.out.println("User Id: " + userId + " name " + name + " issuedBook " + issuedBook);
	}
		
}

class Library{
	
	List<Book> books;
	List<User> users;
	
	public Library()
	{
		books = new ArrayList<>();
		users = new ArrayList<>();
	
	}
	
	public void addbook(Book book)
	{
		books.add(book);
		System.out.println("Books added successfully");
	}
	
	public void registerUser(User user)
	{
		users.add(user);
		System.out.println("User registered successfully");
		
	}
	
	public void issueBook(int bookid, int userid)
	
	{
		User user = findUser(userid);
		Book books = findBook(bookid);
		
		if(books == null)
		{
			System.out.println("Book not found");
			return;
		}
		
		if(user == null)
		{
			System.out.println("User not found");
			return;
		}
		
		if(books.isIssued)
		{
			System.out.println("Books are already issued");
		}
		else {
			books.isIssued = true;
			user.issuedBook.add(books);
			System.out.println("Book issued to " + user.name);
		}
		
		
	}
	
	public void returnBook(int bookId, int userId)
	{
		User user = findUser(userId);
		if(user == null)
		{
			System.out.println("User not found");
			return;
		}
		
		Book bookToReturn = null;
		for(Book b: user.issuedBook)
		{
			if(b.id == bookId)
			{
				bookToReturn = b;
				break;
			}
		}
		
		if(bookToReturn == null)
		{
			System.out.println("This book was not issued");
		}
		else {
			bookToReturn.isIssued = false;
			user.issuedBook.remove(bookToReturn);
			System.out.println("Book returned successfully");
		}
		
	}
	
	public Book findBook(int id)
	{
		for(Book b: books)
		{
			if(b.id == id)
			{
				return b;
			}
		}
		
		return null;
	}
	
	public User findUser(int id)
	{
		for(User u: users)
		{
			if(u.userId == id)
			{
				return u;
			}
		}
		
		return null;
	}
	
	public void displayBook()
	{
		for(Book b: books)
		{
			b.displayBook();
		}
	}
	
	public void displayAllUsers()
	{
		for(User u: users)
		{
			u.displayUser();
		}
	}
	
	
}

public class BookManagementSystem {

	public static void main(String[] args)
	{
		Library library1 = new Library();
		
		library1.addbook(new Book(1, "The Jungle Book", "Mowgli"));
		library1.addbook(new Book(2, "Harry Potter", "JK Rowling"));
		
		library1.registerUser(new User(1, "Arumugam"));
		library1.registerUser(new User(1, "Rahul"));
		
		library1.displayAllUsers();
		library1.displayBook();
		
		library1.issueBook(1, 1);
		library1.returnBook(1, 1);
		
		library1.issueBook(1, 2);
		
		library1.displayAllUsers();
		library1.displayBook();
		
	}
}
