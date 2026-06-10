package assignment;

public class Album {
	private String name;
	private String coverURL;
	
	public Album(String name, String coverURL) {
		this.name = name;
		this.coverURL = coverURL;
	}

	public void printAlbumInfo() {
        if (name != null && !name.isEmpty()) {
            System.out.println("album title: " + name);
        }
    }
}