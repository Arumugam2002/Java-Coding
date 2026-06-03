package com.library;
import java.util.*;

public class LibraryManagementSystem {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Book> books = new ArrayList<>();
		
		int choice;
		
		do {
			
			System.out.println("Menu");
			System.out.println();
			System.out.println("1.Add Book");
			System.out.println("2.Display Books");
			System.out.println("3.Search book by Id");
			System.out.println("4.Count total books");
			System.out.println("5.Exit");
			
			choice = sc.nextInt();
			
			
			switch(choice)
			{
			case 1: System.out.println("Add Book");
			
					System.out.println("Enter book Name:- ");
					sc.nextLine();
					
					String bookName = sc.nextLine();
					
					System.out.println("Enter bookId:- ");
					
					int bookId = sc.nextInt();
					
					
					System.out.println("Enter Book's author name:- ");
					
					sc.nextLine();
					
					String bookAuthor = sc.nextLine();
					
					books.add(new Book(bookName, bookId, bookAuthor));
					
					
			break;
			
			
			case 2: System.out.println("Display Books");
			
			
					if(books.isEmpty())
					{
						System.out.println("No books data available");
					}
					
					else {
						for(Book b : books)
						{
							System.out.println("Book Name:- " + b.bookName);
							System.out.println("Book Id:- " + b.bookId);
							System.out.println("Book Author:- " + b.author);
							System.out.println();
						}
					}
			
			break;
			
			case 3: System.out.println("Search Book By Id");
			
			if(books.isEmpty())
			{
				System.out.println("Books data is not available");
			}
			else {
				System.out.println("Enter bookId for book");
				
				int searchBookId = sc.nextInt();
				
				boolean found = false;
				
				for(Book b : books)
				{
					if(searchBookId == b.bookId)
					{
						
						System.out.println("Your book is " + b.bookName + " and its author is " + b.author);
						
						found = true;
						break;
					}
					
				}
				

				if(!found)
				{
					System.out.println("No book is being referenced to your mentioned id, please write correct book id");
				}
			}
			
			break;
			
			case 4: System.out.println("Count total books");
			
			if(books.isEmpty())
			{
				System.out.println("Books data is not available");
			}
			
			else {
				
				
					System.out.println("Total books in this library are " + books.size());
				
			}

			break;

			case 5: System.out.println("Exiting");

			break;
			
			default: System.out.println("You have written wrong number. Please choose correct number to enter menu");
			
			break;
			}
			
			
			
		}while(choice!=5);
	}
	
}
