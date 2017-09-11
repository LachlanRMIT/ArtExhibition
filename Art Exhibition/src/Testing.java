import java.util.Scanner;

public class Testing {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Login");
		System.out.print("Enter firstname: ");
		String firstName 	= input.next();
		System.out.print("Enter lastname:  ");
		String lastName		= input.next();
		System.out.print("Enter Email:");
		String email		= input.next();
		
		System.out.println("Enter YES if you want to login as a artist: ");
		if(input.next().equals("YES")) {
			System.out.print("Enter Artistname: ");
			String artistName = input.next();
			Artist artist = new Artist(firstName, lastName, email, artistName);
			
			
		}
		else {
			Visitor visitor = new Visitor(firstName, lastName, email);
			visitor.veiwGallery();
			System.out.println("Enter resective value about artwork to get more detail info");
			System.out.println("Enter 0 to search for artworks");
			
		}
		
		
	}
}

