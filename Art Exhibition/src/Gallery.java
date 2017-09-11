import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Gallery {
	
	private static final String FILE_NAME = "C:\\Users\\Lachlan Newman\\git\\ArtExhibition\\Art Exhibition\\src\\resources\\artworks.txt";
	private static final int NUM_ART_INPUTS = 4;
	
	public static ArrayList<Artwork> gallery = new ArrayList<Artwork>();
	
	public static String titleSearch = ".*";
	public static String artistSearch = ".*";
	
	public Gallery() {
		fillGallery();
		displayGallery();
	}
	
<<<<<<< HEAD
	public static void searchGallery(String title,String artist) {
		titleSearch = title + titleSearch;
		artistSearch = artist + artistSearch;
		displayGallery();
	}
	
=======
>>>>>>> 7d32f5fec9303a8074089a744fd6ddc8b2f15907
	//select artwork
	public static Artwork selectArtwork(int choice) {
		Artwork artwork =null;
		try{
			artwork = gallery.get(choice);
		}
		catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		return artwork;
	}
	
	
	public static void displayGallery() {
		Artwork artwork;
		for(int i = 0;i<gallery.size();i++) {
			artwork = gallery.get(i);
			if(artwork.title.matches(titleSearch) && artwork.artist.matches(artistSearch)) {
				System.out.println(i + ").");
				System.out.println("Title: "  + artwork.title);
				System.out.println("Artist: " + artwork.artist);
				System.out.println("Price: "  + artwork.price);
				System.out.println("For Sale" + artwork.forSale);
				System.out.println("\n");
			}
		}
		titleSearch = ".*";
		artistSearch= ".*";
	}
	
	public static void fillGallery() {
		BufferedReader readFile = null;
		FileReader file = null;
		String[] artInputs = new String[NUM_ART_INPUTS];

		try {

			file = new FileReader(FILE_NAME);
			readFile = new BufferedReader(file);
			String Line;
			
			while ((Line = readFile.readLine()) != null) {
				artInputs = Line.split(",");
				gallery.add(new Artwork(
						artInputs[0],
						artInputs[1],
						Double.parseDouble(artInputs[2]),
						Boolean.parseBoolean(artInputs[3])
						));	
			}
			
			readFile.close();

		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}