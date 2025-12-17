import java.util.ArrayList;

public class playlist {
    private final String name;
    private final ArrayList<song> songs = new ArrayList<>();

    public playlist(String name) {
        this.name = name;
    }

    public void addSong(song s) {
        songs.add(s);
    }

    public int getTotalDuration() {
        int total = 0;
        for (song s : songs) {
            total += s.duration(); // ✅ record‑тағы дұрыс әдіс
        }
        return total;
    }

    @Override
    public String toString() {
        return "Playlist{name='" + name + "', songs=" + songs +
                ", totalDuration=" + getTotalDuration() + "}";
    }
}

