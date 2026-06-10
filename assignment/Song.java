package assignment;

public class Song {

	public enum Genre {
    	UNDEFINED, POP, ROCK, HIP_HOP, RNB, JAZZ, INSTRUMENTALS, CLOWNCORE
	}

	private String id;
	private String title;
	private String releaseYear;
	private String musicFileURL;
	private Genre genre= Genre.UNDEFINED;

	private Artist artist;
	private Album album;
	
	// private String albumName;
	// private String albumCoverURL;
	
	// private String artistName;
	// private String artistAlias;
	// private String artistImageURL;
	
	public Song(String id, String title, String releaseYear, String musicFileURL) {
		this.id = id;
		this.title = title;
		this.releaseYear = releaseYear;
		this.musicFileURL = musicFileURL;
	}
	
	public void setAlbum(Album album) {
        this.album = album;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
	
	/**
	 * Set the genre of this song
	 * 
	 * 0 = undefined
	 * 1 = pop
	 * 2 = rock
	 * 3 = hip hop
	 * 4 = RnB
	 * 5 = jazz
	 * 6 = instrumentals
	 * 7 = clowncore
	 * 
	 * @param genre
	 */
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	/**
	 * Print info of the song based on desired detail level
	 * 
	 * 0 = song info only
	 * 1 = song info and artist info
	 * 2 = song info and album info
	 * 3 = song, artist, and album info
	 * 
	 * @param genre
	 */
	// public void printInfo(int detailLevel) {
	// 	if (detailLevel == 0) {
	// 		System.out.println("song title: " + title);
	// 		System.out.println("release year: " + releaseYear);
	// 		if (genre > 0) {
	// 			System.out.println("genre: " + genre);
	// 		}
	// 	}else if(detailLevel == 1) {
	// 		System.out.println("song title: " + title);
	// 		System.out.println("release year: " + releaseYear);
	// 		if (genre > 0) {
	// 			System.out.println("genre: " + genre);
	// 		}
	// 		if (!artistName.equals("")) {
	// 			System.out.println("artist name: " + artistName);
	// 		}
	// 		if (!artistAlias.equals("")) {
	// 			System.out.println("artist also known as: " + artistAlias);
	// 		}
	// 	}else if (detailLevel == 2) {
	// 		System.out.println("song title: " + title);
	// 		System.out.println("release year: " + releaseYear);
	// 		if (genre > 0) {
	// 			System.out.println("genre: " + genre);
	// 		}
	// 		if (!albumName.equals("")) {
	// 			System.out.println("album title: " + albumName);
	// 		}
	// 	}else if (detailLevel == 3) {
	// 		System.out.println("song title: " + title);
	// 		System.out.println("release year: " + releaseYear);
	// 		if (genre > 0) {
	// 			System.out.println("genre: " + genre);
	// 		}
	// 		if (!artistName.equals("")) {
	// 			System.out.println("artist name: " + artistName);
	// 		}
	// 		if (!artistAlias.equals("")) {
	// 			System.out.println("artist also known as: " + artistAlias);
	// 		}
	// 		if (!albumName.equals("")) {
	// 			System.out.println("album title: " + albumName);
	// 		}
	// 	}
	// }

	public void printInfo(int detailLevel) {
        printBasicInfo();

        switch (detailLevel) {
            case 1: // Song + Artist
                if (artist != null) artist.printArtistInfo();
                break;
            case 2: // Song + Album
                if (album != null) album.printAlbumInfo();
                break;
            case 3: // Song + Artist + Album
                if (artist != null) artist.printArtistInfo();
                if (album != null) album.printAlbumInfo();
                break;
            default:
                break;
        }
    }

	private void printBasicInfo() {
        System.out.println("song title: " + title);
        System.out.println("release year: " + releaseYear);
        if (genre != Genre.UNDEFINED) {
            System.out.println("genre: " + genre.toString().toLowerCase().replace("_", " "));
        }
    }
	
}
