public class artist {

    private String name;
    private String genre;

    public artist(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "artist{name='" + name + "', genre='" + genre + "'}";
    }
}
