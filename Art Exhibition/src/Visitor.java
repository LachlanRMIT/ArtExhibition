
public class Visitor {
	
	public static String firstName;
	public static String lastName;
	public static String email;
	
	public Visitor(String firstName, String lastName, String email){
		this.firstName 	= 	firstName;
		this.lastName	=	lastName;
		this.email		=	email;
	}
	
	//get the fullname of the vistor
	public static String getFullName() {
		return (firstName + " " + lastName);
	}
	
	//get the firstname of the vistor
	public static String getFirstName() {
		return firstName;
	}
	
	//get the lastname of the vistor
	public static String getLastname() {
		return lastName;
	}
	
	//get the email of the visitor
}
