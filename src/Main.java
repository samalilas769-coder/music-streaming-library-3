public class Main {
    public static void main(String[] args) {

        // POLYMORPHISM
        Artist artist = new Singer("Adele");

        Song s1 = new Song("Hello", 295, artist);
        Song s2 = new Song("Easy On Me", 224, artist);

        Playlist playlist = new Playlist("My Playlist");
        playlist.addSong(s1);
        playlist.addSong(s2);

        // SORT
        playlist.sortByDuration();
        playlist.printSongs();

        // SEARCH
        System.out.println("Found: " + playlist.searchByTitle("Hello"));

        // FILTER
        for (Song s : playlist.filterByArtist("Adele")) {
            System.out.println("Filtered: " + s);
        }
    }
}
