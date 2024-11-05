package LibraryManagementSystem;

public class User {

	//properties
	private String name;
	private final int membershipID;
	
	//constructor
	public User(String name,int membershipID)
	{
		this.name=name;
		this.membershipID=membershipID;
	}
	
	//method for get attributes
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMembershipID() {
		return membershipID;
	}	
		
	//method for display
		public void display()
		{
			System.out.println("User information:");
			System.out.println("Name :"+this.name+"\nMembership Id : "+this.membershipID);
		}
		
   @Override
		public String toString()
		{
			return "User information:\nName : "+name+"\nMembership ID : "+membershipID+"\n";
		}
		

		}
