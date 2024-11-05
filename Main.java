package LibraryManagementSystem;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// Creating book object
		 Scanner sc=new Scanner (System.in);
		 Scanner s=new Scanner (System.in);
		////CSE Department 
	    Book book1 = new Book("Effective Java","Joshua Bloch",101);
	    Book book2 = new Book("Data Structure and Algorithm","Jeffrey D.Ullman",102);
	    Book book3 = new Book("The Mythical Man-Month","Frederick P.Brooks",103);
	    Book book4 = new Book("Desing patterns","Erich Gamma",104);
	    Book book5 = new Book("The Soul of a New Machine","Tracy Kidder",105);
       
        
        //creating user object
       
        User user1 = new User("Mahnoor",2001);
        User user2 = new User("Rabeya",2002);
        User user3 = new User("Samia",2003);
        User user4 = new User("Ramisa",2004);
        ArrayList<User>users=new ArrayList<User>();
        
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
		
		System.out.println("User List");
		System.out.println("=============\n");
		for(int i=0;i<users.size();i++)
		{
			System.out.println(users.get(i));
		}
		System.out.println();
		
        //creating librayUser object
        LibrayUser librayuser1 = new LibrayUser("Mahnoor",2001,2);
        LibrayUser librayuser2 = new LibrayUser("Rabeya",2002,4);
        LibrayUser librayuser3 = new LibrayUser("Samia",2003,3);
        LibrayUser librayuser4 = new LibrayUser("Ramisa",2004,0);
        
        //method call for book
        System.out.println("List of book");
        System.out.println("=============\n");
        book1.display("Effective Java","Joshua Bloch",101);
        book2.display();
        book3.display();
        book4.display();
        book5.display();
        System.out.println();
       
      
        //User information and what they need
        int tID=2005;	
        while(true)
        {	
         System.out.println("Do you want to open or close this program.\n1.Open \n2.Close");
         System.out.print("Enter your choice ");
         int po=sc.nextInt();
       
        switch(po)
        {
        //program on or off
        case 1:
        {	
        	System.out.println("Are you a member of our library?\n1.Yes\n2.NO");
            int ck;
            System.out.print("Enter your choice : ");
            ck=sc.nextInt();
            //have membership or not
            if (ck==1)
            {	 	
        int num;
        String word;
        //method call for object 1
        System.out.print("Enter your name:");
        String n=s.nextLine();
        System.out.print("Enter your ID: ");
        int mi=sc.nextInt();
		
        
		//compare user information with user object
		if(n.equals(user1.getName()) && mi==user1.getMembershipID())
		{
			
			librayuser1.display();
			System.out.println("Enter the id or title of the book you want to borrow :\n1.Enter the id of the book\n2.Enter the title of the book");
			int ch1;
			System.out.print("Enter your choice ");
			ch1=sc.nextInt();
			if(ch1==1)
			{	
			System.out.print("Enter the id of the book you want to borrow : ");
	        num=sc.nextInt();
	        
	        //TASK 9
	        if(num==101)
	            librayuser1.BookTask9(book1);
	        else if(num==102)
	        	librayuser1.BookTask9(book2);
	        else if(num==103)
	        	librayuser1.BookTask9(book3);
	        else if(num==104)
	        	librayuser1.BookTask9(book4);
	        else if(num==105)
	        	librayuser1.BookTask9(book5);
	        else
	        	System.out.println("Sorry");
	        librayuser1.borrowBook(num);
	        
			}
			else if(ch1==2)
			{	
	        System.out.print("Enter the title of the book you want to borrow : ");
	        word=s.nextLine();
	        librayuser1.borrowBook(word);
			}
			else
			{
				System.out.println("Invalid");
			}
			
			System.out.println("Current condition ");
	        librayuser1.display();
	        System.out.println();
	       
		}
		
        
      //method call for object 2
		else if(n.equals(user2.getName())&& mi==user2.getMembershipID() )
		{
		librayuser2.display();		
		System.out.println("Enter the id or title of the book you want to borrow :\n1.Enter the id of the book\n2.Enter the title of the book");
		int ch2;
		System.out.print("Enter your choice ");
		ch2=sc.nextInt();
		if(ch2==1)
		{	
		System.out.print("Enter the id of the book you want to borrow : ");
        num=sc.nextInt();
      //TASK 9
        if(num==101)
            librayuser2.BookTask9(book1);
        else if(num==102)
        	librayuser2.BookTask9(book2);
        else if(num==103)
        	librayuser2.BookTask9(book3);
        else if(num==104)
        	librayuser2.BookTask9(book4);
        else if(num==105)
        	librayuser2.BookTask9(book5);
        else
        	System.out.println("Sorry");
        librayuser2.borrowBook(num);
		}
		else if(ch2==2)
		{	
        System.out.print("Enter the title of the book you want to borrow : ");
        word=s.nextLine();
        librayuser2.borrowBook(word);
		}
		else
		{
			System.out.println("Invalid");
		}
		System.out.println("Current condition ");
        librayuser2.display();
        System.out.println();
		}
		
		
       //method call for object 3
		else if(n.equals(user3.getName())&& mi==user3.getMembershipID() )
		{
	    librayuser3.display();
	    System.out.println("Enter the id or title of the book you want to borrow :\n1.Enter the id of the book\n2.Enter the title of the book");
		int ch3;
		System.out.print("Enter your choice ");
		ch3=sc.nextInt();
		if(ch3==1)
		{	
		System.out.print("Enter the id of the book you want to borrow : ");
        num=sc.nextInt();
      //TASK 9
        if(num==101)
            librayuser3.BookTask9(book1);
        else if(num==102)
        	librayuser3.BookTask9(book2);
        else if(num==103)
        	librayuser3.BookTask9(book3);
        else if(num==104)
        	librayuser3.BookTask9(book4);
        else if(num==105)
        	librayuser3.BookTask9(book5);
        else
        	System.out.println("Sorry");
        librayuser3.borrowBook(num);
		}
		else if(ch3==2)
		{	
        System.out.print("Enter the title of the book you want to borrow : ");
        word=s.nextLine();
        librayuser3.borrowBook(word);
		}
		else
		{
			System.out.println("Invalid");
		}
		System.out.println("Current condition ");
        librayuser3.display();
        System.out.println();
		}
		
		
		//method call for object 4
		else if(n.equals(user4.getName())&& mi==user4.getMembershipID() )
		{
	     librayuser4.display();	
	     System.out.println("Enter the id or title of the book you want to borrow :\n1.Enter the id of the book\n2.Enter the title of the book");
		 int ch4;
		 System.out.print("Enter your choice ");
		 ch4=sc.nextInt();
		 if(ch4==1)
		 {	
		 System.out.print("Enter the id of the book you want to borrow : ");
	     num=sc.nextInt();
	   //TASK 9
	        if(num==101)
	            librayuser4.BookTask9(book1);
	        else if(num==102)
	        	librayuser4.BookTask9(book2);
	        else if(num==103)
	        	librayuser4.BookTask9(book3);
	        else if(num==104)
	        	librayuser4.BookTask9(book4);
	        else if(num==105)
	        	librayuser4.BookTask9(book5);
	        else
	        	System.out.println("Sorry");
	     librayuser4.borrowBook(num);
		 }
		 else if(ch4==2)
		 {	
	      System.out.print("Enter the title of the book you want to borrow : ");
	      word=s.nextLine();
	      librayuser4.borrowBook(word);
		  }
		 else
		 {
		   System.out.println("Invalid");
		 }
		   System.out.println("Current condition ");
	       librayuser4.display();
		   System.out.println();
		}
		
		//For invalid information
		else
		{
			System.out.println("Those are wrong information");
		}
            }
            else if(ck==2)
            {
            	System.out.println("For borrow book you have to be a member of this Libray.You can fill the form then you will get the membership id.");
            	System.out.println("Do you want to make a libray card?\n1.Yes\n2.No");
            	System.out.print("Enter your choice ");
            	int want=sc.nextInt();
            	
            	if(want==1)
            	{
            		System.out.println("What is your name?");
            		String nam=s.nextLine();
            	    User userNew = new User(nam,tID);
            	    users.add(userNew);
            	    System.out.println("Ater add a new member ");
            	    System.out.println(users.get(users.size()-1));
            	    
            		System.out.println();
            	}
            }  
            
           
            
            System.out.println();
            
        break;
        }
       
       
        case 2:
        {
        	//for current user
     	    System.out.println("Final user information till now");
     	    System.out.println("=====================================\n");
     	    for(int i=0;i<users.size();i++)
     		{
     			System.out.println(users.get(i));
     		}
        	System.out.println("Have a nice day.\nCLOSE");
        	return ;
        	//break;
        }
        default:
        {
        	System.out.println("I am confuse");
        }
         }            //switch
        tID=tID+1;
           }           //if
	
        
       
        

	}       //main
}           //class
