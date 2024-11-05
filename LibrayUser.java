package LibraryManagementSystem;
import java.util.Scanner;
public class LibrayUser extends User {
	Scanner lu=new Scanner (System.in);
	private int borrowedBook;
	
	public LibrayUser(String name,int membershipID,int borrowedBook)
	{
		super(name,membershipID);
		//this.name=name;
		//this.membershipID=membershipID;
		this.borrowedBook=borrowedBook;
	}
	
	
	public int getborrowedBook()
	{
		return borrowedBook;

	}
	
	public void borrowBook(int id)
	{
		switch(id)
		{
		case 101:
		{
			System.out.println("The name of the book is 'Effective Java' and it's id is 101");
			System.out.println("Do you want to borrow this book?\n1.Yes\n2.No");
			int i1;
			System.out.print("Enter your choice ");
			i1=lu.nextInt();
			if(i1==1)
			{
				borrowedBook=borrowedBook+1;
			}
			else if(i1==2)
			{
				System.out.println("You can read here");
				System.out.println("You can read here");
				System.out.println("Do you want to read this book in the libray?\n1.Yes\n2.No I don't need this book");
				System.out.print("Enter your choice ");
				int i1c1=lu.nextInt();
				if(i1c1==1)
				{
					System.out.println("Give your libray card then read this book in the libray");
				}
				else if(i1c1==2)
				{
					System.out.println("Ok ");
				}
				else
				{
					System.out.println("Invalid");
				}
			}
			else
				System.out.println("Invalid");
			break;
		}
		case 102:
		{
			System.out.println("The name of the book is 'Data Structure and Algorithm'and it's id is 102");
			System.out.println("Do you want to borrow this book?\n1.Yes\n2.No");
			int i2;
			System.out.print("Enter your choice ");
			i2=lu.nextInt();
			if(i2==1)
			{
				borrowedBook=borrowedBook+1;
			}
			else if(i2==2)
			{
				System.out.println("You can read here");
				System.out.println("You can read here");
				System.out.println("Do you want to read this book in the libray?\n1.Yes\n2.No I don't need this book");
				System.out.print("Enter your choice ");
				int i2c2=lu.nextInt();
				if(i2c2==1)
				{
					System.out.println("Give your libray card then read this book in the libray");
				}
				else if(i2c2==2)
				{
					System.out.println("Ok ");
				}
				else
				{
					System.out.println("Invalid");
				}
			}
			else
				System.out.println("Invalid");
			break;
		}
		case 103:
		{
			System.out.println("The name of the book is 'The Mythical Man-Month'and it's id is 103");
			System.out.println("Do you want to borrow this book?\n1.Yes\n2.No");
			int i3;
			System.out.print("Enter your choice ");
			i3=lu.nextInt();
			if(i3==1)
			{
				borrowedBook=borrowedBook+1;
			}
			else if(i3==2)
			{
				System.out.println("You can read here");
				System.out.println("You can read here");
				System.out.println("Do you want to read this book in the libray?\n1.Yes\n2.No I don't need this book");
				System.out.print("Enter your choice ");
				int i3c3=lu.nextInt();
				if(i3c3==1)
				{
					System.out.println("Give your libray card then read this book in the libray");
				}
				else if(i3c3==2)
				{
					System.out.println("Ok ");
				}
				else
				{
					System.out.println("Invalid");
				}
			}
			else
				System.out.println("Invalid");
			break;
		}
		case 104:
		{
			System.out.println("The name of the book is 'Desing patterns'and it's id is 104");
			System.out.println("Do you want to borrow this book?\n1.Yes\n2.No");
			int i4;
			System.out.print("Enter your choice ");
			i4=lu.nextInt();
			if(i4==1)
			{
				borrowedBook=borrowedBook+1;
			}
			else if(i4==2)
			{
				System.out.println("You can read here");
				System.out.println("You can read here");
				System.out.println("Do you want to read this book in the libray?\n1.Yes\n2.No I don't need this book");
				System.out.print("Enter your choice ");
				int i4c4=lu.nextInt();
				if(i4c4==1)
				{
					System.out.println("Give your libray card then read this book in the libray");
				}
				else if(i4c4==2)
				{
					System.out.println("Ok ");
				}
				else
				{
					System.out.println("Invalid");
				}
			}
			else
				System.out.println("Invalid");
			break;
		}
		case 105:
		{
			System.out.println("The name of the book is 'The Soul of a New Machine' and it's id is 105");
			System.out.println("Do you want to borrow this book?\n1.Yes\n2.No");
			int i5;
			System.out.print("Enter your choice ");
			i5=lu.nextInt();
			if(i5==1)
			{
				borrowedBook=borrowedBook+1;
			}
			else if(i5==2)
			{
				System.out.println("You can read here");
				System.out.println("You can read here");
				System.out.println("Do you want to read this book in the libray?\n1.Yes\n2.No I don't need this book");
				System.out.print("Enter your choice ");
				int i5c5=lu.nextInt();
				if(i5c5==1)
				{
					System.out.println("Give your libray card then read this book in the libray");
				}
				else if(i5c5==2)
				{
					System.out.println("Ok ");
				}
				else
				{
					System.out.println("Invalid");
				}
			}
			else
				System.out.println("Invalid");
			break;
		}
		default:
		{
			System.out.println("Sorry, this book is not available");
		}
		
		}
		System.out.println("Do you want to return any book?\n1.Yes\n2.No");
		System.out.print("Enter you choice ");
		int r1=lu.nextInt();
		if(r1==1)
		{
			System.out.println("How many book you want to return?");
			int rnum1=lu.nextInt();
			
			if(rnum1<=borrowedBook)
			{
				borrowedBook=borrowedBook-rnum1;
			}
			else if(r1==2)
			{
				System.out.println("ok.Try to return borrowed book before the last date");
			}
			else
			{
				System.out.println("Invalid");
			}
		}
	}
	
	//Overloading
	public void borrowBook(String book)
	{
		//Scanner lu=new Scanner (System.in);
		switch(book)
		{
		case "Effective Java":
		{
			System.out.println("The name of the book is 'Effective Java' and it's id is 101 and the author name is Joshua Bloch");
			System.out.println("Do you want to borrow this book?\n1.Yes\n2.No");
			int s1;
			System.out.print("Enter your choice ");
			s1=lu.nextInt();
			if(s1==1)
			{
				borrowedBook=borrowedBook+1;
				//System.out.println();
			}
			else if(s1==2)
			{
				System.out.println("You can read here");
				System.out.println("Do you want to read this book in the libray?\n1.Yes\n2.No I don't need this book");
				System.out.print("Enter your choice ");
				int s1c1=lu.nextInt();
				if(s1c1==1)
				{
					System.out.println("Give your libray card then read this book in the libray");
				}
				else if(s1c1==2)
				{
					System.out.println("Ok ");
				}
				else
				{
					System.out.println("Invalid");
				}
			}
			else
			{
				System.out.println("Invaild");
			}
			break;
		}
		case "Data Structure and Algorithm":
		{
			System.out.println("The name of the book is 'Data Structure and Algorithm'and it's id is 102 and the author name is Jeffrey D.Ullman");
			System.out.println("Do you want to borrow this book?\n1.Yes\n2.No");
			int s1;
			System.out.print("Enter your choice ");
			s1=lu.nextInt();
			if(s1==1)
			{
				borrowedBook=borrowedBook+1;
				//System.out.println();
			}
			else if(s1==2)
			{
				System.out.println("You can read here");
				System.out.println("Do you want to read this book in the libray?\n1.Yes\n2.No I don't need this book");
				System.out.print("Enter your choice ");
				int s1c1=lu.nextInt();
				if(s1c1==1)
				{
					System.out.println("Give your libray card then read this book in the libray");
				}
				else if(s1c1==2)
				{
					System.out.println("Ok ");
				}
				else
				{
					System.out.println("Invalid");
				}
			}
			else
			{
				System.out.println("Invaild");
			}
			break;
		}
		case "The Mythical Man-Month":
		{
			System.out.println("The name of the book is 'The Mythical Man-Month'and it's id is 103 and the author name is Frederick P.Brooks");
			System.out.println("Do you want to borrow this book?\n1.Yes\n2.No");
			int s1;
			System.out.print("Enter your choice ");
			s1=lu.nextInt();
			if(s1==1)
			{
				borrowedBook=borrowedBook+1;
				//System.out.println();
			}
			else if(s1==2)
			{
				System.out.println("You can read here");
				System.out.println("Do you want to read this book in the libray?\n1.Yes\n2.No I don't need this book");
				System.out.print("Enter your choice ");
				int s1c1=lu.nextInt();
				if(s1c1==1)
				{
					System.out.println("Give your libray card then read this book in the libray");
				}
				else if(s1c1==2)
				{
					System.out.println("Ok ");
				}
				else
				{
					System.out.println("Invalid");
				}
			}
			else
			{
				System.out.println("Invaild");
			}
			break;
		}
		case "Desing patterns":
		{
			System.out.println("The name of the book is 'Desing patterns'and it's id is 104 and the author name is Erich Gamma");
			System.out.println("Do you want to borrow this book?\n1.Yes\n2.No");
			int s1;
			System.out.print("Enter your choice ");
			s1=lu.nextInt();
			if(s1==1)
			{
				borrowedBook=borrowedBook+1;
			}
			else if(s1==2)
			{
				System.out.println("You can read here");
				System.out.println("Do you want to read this book in the libray?\n1.Yes\n2.No I don't need this book");
				System.out.print("Enter your choice ");
				int s1c1=lu.nextInt();
				if(s1c1==1)
				{
					System.out.println("Give your libray card then read this book in the libray");
				}
				else if(s1c1==2)
				{
					System.out.println("Ok ");
				}
				else
				{
					System.out.println("Invalid");
				}
			}
			else
			{
				System.out.println("Invaild");
			}
			break;
		}
		case "The Soul of a New Machine":
		{
			System.out.println("The name of the book is 'The Soul of a New Machine' and it's id is 105 and the author name is Tracy Kidder");
			System.out.println("Do you want to borrow this book?\n1.Yes\n2.No");
			int s1;
			System.out.print("Enter your choice ");
			s1=lu.nextInt();
			if(s1==1)
			{
				borrowedBook=borrowedBook+1;
			}
			else if(s1==2)
			{
				System.out.println("You can read here");
				System.out.println("Do you want to read this book in the libray?\n1.Yes\n2.No I don't need this book");
				System.out.print("Enter your choice ");
				int s1c1=lu.nextInt();
				if(s1c1==1)
				{
					System.out.println("Give your libray card then read this book in the libray");
				}
				else if(s1c1==2)
				{
					System.out.println("Ok ");
				}
				else
				{
					System.out.println("Invalid");
				}
			}
			else
			{
				System.out.println("Invaild");
			}
			break;
		}
		default:
		{
			System.out.println("Sorry, this book is not available");
		}
		}
		System.out.println("Do you want to return any book?\n1.Yes\n2.No");
		System.out.print("Enter you choice ");
		int r1=lu.nextInt();
		if(r1==1)
		{
			System.out.println("How many book you want to return?");
			int rnum1=lu.nextInt();
			
			if(rnum1<=borrowedBook)
			{
				borrowedBook=borrowedBook-rnum1;
			}
			else if(r1==2)
			{
				System.out.println("ok.Try to return borrowed book before the last date");
			}
			else
			{
				System.out.println("Invalid");
			}
		}
	}
	
	//method for display
	@Override
	public void display()
	{
		super.display();
		System.out.println("Borrow Number of Book is : "+this.borrowedBook);
	}	
	// "TASK 9" //
	public String BookTask9(Book book1)
	{
		return book1.display();
	}
}
