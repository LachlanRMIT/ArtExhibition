
public class Artwork {
	
	public static String title;
	public static String artist;
	//public static String location
	//public static String image
	public static double price;
	public static boolean forSale;
	
	public Artwork(String title, String artist,double price,boolean forSale) {
		this.title 		= title;
		this.artist		= artist;
		this.price		= price;
		this.forSale	= forSale;
	}
	
	//get the title of the artwork
	public static String getTitle() {
		return title;
	}
	
	//get the artist of the artwork
	public static String getArtist() {
		return artist;
	}
	
	//get the location of the artwork
	
	//get the image of the artwork
	
	//get the price of the artwork
	public static double getPrice() {
		return price;
	}
	
	//check is the artwork is for sale of not
	public static boolean forSale() {
		return forSale;
	}
}
