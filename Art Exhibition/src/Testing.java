import java.util.Scanner;

public class Testing {
	
	private static Scanner input;
	private static String firstName;
	private static String lastName;
	private static String email;
	private static String artistName;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Login");
		System.out.print("Enter firstname: ");
		String firstName 	= input.next();
		System.out.print("Enter lastname:  ");
		String lastName		= input.next();
		System.out.print("Enter Email:");
		String email		= input.next();
		
		System.out.println("Enter        if you want to continue as a visitor:");
		System.out.println("Enter ARTIST if you want to continue as a artist :");
		System.out.println("Enter ADMIN  if you want to continue as a admin  :");
		
		String choice = input.next();
		if(choice.equals("ARTIST")) {
			System.out.println("Enter Artist name: ");
			artistName = input.next();
			artistHome();
		}
		else if(choice.equals("ADMIN")) {
			System.out.print("Enter Password: ");
			String password = input.next();
			Admin admin = new Admin(firstName, lastName, email, password);
			
		}
		else {
			visitorHome();
			
		}
		
		
	}
	
	public static void artistHome() {
		Artist artist = new Artist(firstName, lastName, email, artistName);
		while(true) {
			input = new Scanner(System.in);
			System.out.println("Menu");
			System.out.println("View Gallery  => 1");
			System.out.println("View Map      => 2");
			System.out.println("Veiw Shopping => 3");
			System.out.println("Veiw My Art   => 4");
			System.out.println("Log Out       => 0");
			switch(input.nextInt()) {
			case 1:
				veiwGallery(artist);
				break;
			case 2:
				veiwMap(artist);
				break;
			case 3:
				veiwShopping(artist);
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Not a valid output please try again");
				break;
			}
		}
		
	}
	
	public static void visitorHome() {
		Visitor visitor = new Visitor(firstName, lastName, email);
		while(true) {
			input = new Scanner(System.in);
			System.out.println("Menu");
			System.out.println("View Gallery  => 1");
			System.out.println("View Map      => 2");
			System.out.println("Veiw Shopping => 3");
			System.out.println("Log Out       => 0");
			switch(input.nextInt()) {
				case 1:
					veiwGallery(visitor);
					break;
				case 2:
					veiwMap(visitor);
					break;
				case 3:
					veiwShopping(visitor);
					break;
				case 0:
					System.exit(0);
					break;
				default:
					System.out.println("Not a valid output please try again");
					break;
			}
		}
	}
			
	public static void veiwGallery(Visitor visitor) {
	
		input = new Scanner(System.in);
		Gallery gallery = visitor.veiwGallery();
		System.out.println("Enter resective value about artwork to get more detail info");
		Artwork artwork = gallery.selectArtwork(input.nextInt());
		System.out.println("Title   : " + artwork.title  );
		System.out.println("Artist  : " + artwork.artist );
		System.out.println("Price   : " + artwork.price  );
		System.out.println("For Sale: " + artwork.forSale);
		
		gallery.searchGallery("Mona", "");
		
	}
	
	public static void veiwMap(Visitor visitor) {
		System.out.println("Map need to be implemented");
	}
	
	public static  void  veiwShopping(Visitor visitor) {
		System.out.println("Shopping needs to be implemented");
	}
	
}

