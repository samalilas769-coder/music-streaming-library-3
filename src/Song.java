public class Song {
    private String title;
    private int duration;
    private Artist artist;

    public Song(String title, int duration, Artist artist) {
        this.title = title;
        this.duration = duration;
        this.artist = artist;
    }

    // GETTERS
    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Artist getArtist() {
        return artist;
    }

    // SETTERS
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return title + " (" + duration + " sec) - " + artist.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song = (Song) o;
        return title.equals(song.title) && artist.equals(song.artist);
    }

    @Override
    public int hashCode() {
        return title.hashCode() + artist.hashCode();
    }
}
