
public class Admin {

	private static final String PASSWORD = "JUPITER1";
	public Admin(String password) {
		if(!password.equals(PASSWORD)) {
			System.out.println("Incorrect Password");
			System.exit(1);
		}
	}
	
	

}
