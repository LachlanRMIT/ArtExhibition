
public class Visitor {
	
	public static String firstName;
	public static String lastName;
	public static String email;
	
	public Visitor(String firstName, String lastName, String email){
		this.firstName 	= 	firstName;
		this.lastName	=	lastName;
		this.email		=	email;
	}
	
	//get the full name of the visitor
	public static String getFullName() {
		return (firstName + " " + lastName);
	}
	
	//get the first name of the visitor
	public static String getFirstName() {
		return firstName;
	}
	
	//get the last name of the visitor
	public static String getLastname() {
		return lastName;
	}
	
	//get the email of the visitor
	public static String getEmail() {
		return email;
	}
	
	//Displays Artwork Gallery
	public static Gallery veiwGallery() {
		Gallery gallery = new Gallery();
		return gallery;
	}
}
