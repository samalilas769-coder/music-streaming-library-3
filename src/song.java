public class song {

    private String title;
    private int duration; // seconds

    public song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }


    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    private String formatTime() {
        int min = duration / 60;
        int sec = duration % 60;
        return min + " min " + sec + " sec";
    }

    public void play() {
        System.out.println("▶ Playing: " + title + " (" + formatTime() + ")");
    }

    @Override
    public String toString() {
        return "Song{title='" + title + "', duration=" + formatTime() + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        song other = (song) obj;
        return duration == other.duration &&
                title.equals(other.title);
    }

    @Override
    public int hashCode() {
        return title.hashCode() + duration;
    }
}
