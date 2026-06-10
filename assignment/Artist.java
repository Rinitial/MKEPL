package assignment;

public class Artist {
    private String name;
	private String alias;
	private String imageURL;
	
	public Artist(String name, String alias, String imageURL) {
		this.name = name;
		this.alias = alias;
		this.imageURL = imageURL;
	}

	public void printArtistInfo() {
        if (name != null && !name.isEmpty()) {
            System.out.println("artist name: " + name);
        }
        if (alias != null && !alias.isEmpty()) {
            System.out.println("artist also known as: " + alias);
        }
    }
}
