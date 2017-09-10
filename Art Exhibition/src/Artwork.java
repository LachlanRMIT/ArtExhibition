
public class Artwork {
	
	public static String artName;
	public static String artist;
	//public static String location
	//public static String image
	public static double price;
	public static boolean forSale;
	
	public Artwork(String artName, String artist,double price,boolean forSale) {
		this.artName 	= artName;
		this.artist		= artist;
		this.price		= price;
		this.forSale	= forSale;
	}
}
