package assignment;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Artist artist = new Artist("Bernadya", "Bernadya Putri", "url_image");
        Album album = new Album("Terlintas", "url_cover");
        
        Song song = new Song("1", "Satu Bulan", "2014", "url_music");
        song.setArtist(artist);
        song.setAlbum(album);
        song.setGenre(Song.Genre.POP);

        Scanner level = new Scanner(System.in);

        System.out.println("Menu Tampilan (0-3) : ");
        System.out.println("0. Song Info");
        System.out.println("1. Song Info + Artist Info");
        System.out.println("2. Song Info + Album Info");
        System.out.println("3. Song Info + Artist & Album Info");
        song.printInfo(level.nextInt());
    }
}