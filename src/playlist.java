public class playlist {

    private String name;
    private song song1;
    private song song2;

    public playlist(String name, song song1, song song2) {
        this.name = name;
        this.song1 = song1;
        this.song2 = song2;
    }

    public void showPlaylist() {
        System.out.println("Playlist: " + name);
        System.out.println(song1);
        System.out.println(song2);
    }
}
