import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    // GETTER / SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    // SEARCH
    public Song searchByTitle(String title) {
        for (Song s : songs) {
            if (s.getTitle().equalsIgnoreCase(title)) {
                return s;
            }
        }
        return null;
    }

    // FILTER
    public List<Song> filterByArtist(String artistName) {
        List<Song> result = new ArrayList<>();
        for (Song s : songs) {
            if (s.getArtist().getName().equalsIgnoreCase(artistName)) {
                result.add(s);
            }
        }
        return result;
    }

    // SORT
    public void sortByDuration() {
        songs.sort(Comparator.comparingInt(Song::getDuration));
    }

    public void printSongs() {
        for (Song s : songs) {
            System.out.println(s);
        }
    }
}
