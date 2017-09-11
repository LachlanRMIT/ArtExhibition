import java.util.Scanner;

public class Admin extends Visitor {
	
	private static final String PASSWORD = "test";

	public Admin(String firstName, String lastName, String email,String password) {
		super(firstName, lastName, email);
		if(!password.equals(PASSWORD)) {
			System.exit(-1);
		}
		
	}
	
	//update artworks TODO
	
	//add new artworks TODO
	
	//update event info TODO


}
