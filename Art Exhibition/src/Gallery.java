import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Gallery {
	
	private static final String FILE_NAME = "C:\\Users\\Lachlan Newman\\git\\ArtExhibition\\Art Exhibition\\src\\resources\\artworks.txt";
	private static final int NUM_ART_INPUTS = 4;
	
	public static ArrayList<Artwork> gallery = new ArrayList<Artwork>();
	
	public Gallery() {
		fillGallery();
		displayGallery();
	}
	
	public static void displayGallery() {
		for(int i = 0;i<gallery.size();i++) {
			System.out.println(i + ").");
			System.out.println("Title: "  + gallery.get(i).title);
			System.out.println("Artist: " + gallery.get(i).artist);
			System.out.println("Price: "  + gallery.get(i).price);
			System.out.println("For Sale" + gallery.get(i).forSale);
			System.out.println("\n");
		}
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
