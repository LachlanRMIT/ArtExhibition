
public class Artist extends Visitor {
	
	public static String artistName;
	
	public Artist(String firstName, String lastName, String email,String artistName) {
		super(firstName,lastName,email);
		this.artistName = artistName;
	}
}
