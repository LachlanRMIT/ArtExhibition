public class Artwork {
	
	public String title;
	public String artist;
	//public static String location
	//public static String image
	public double price;
	public boolean forSale;
	
	public Artwork(String title, String artist,double price,boolean forSale) {
		this.title 		= title;
		this.artist		= artist;
		this.price		= price;
		this.forSale	= forSale;
	}
	
	//get the title of the artwork
	public String getTitle() {
		return title;
	}
	
	//get the artist of the artwork
	public String getArtist() {
		return artist;
	}
	
	//get the location of the artwork
	
	//get the image of the artwork
	
	//get the price of the artwork
	public double getPrice() {
		return price;
	}
	
	//check is the artwork is for sale of not
	public boolean forSale() {
		return forSale;
	}
}