public class playlist {

    private String name;
    private song song1;
    private song song2;

    public playlist(String name, song song1, song song2) {
        this.name = name;
        this.song1 = song1;
        this.song2 = song2;
    }

    public int getTotalDuration() {
        return song1.getDuration() + song2.getDuration();
    }

    private String formatTime(int seconds) {
        int min = seconds / 60;
        int sec = seconds % 60;
        return min + " min " + sec + " sec";
    }

    // ✅ Override Object.toString()
    @Override
    public String toString() {
        return "Playlist name: " + name + "\n" +
                song1 + "\n" +
                song2 + "\n" +
                "Total duration: " + formatTime(getTotalDuration());
    }
}
