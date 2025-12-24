public class song {

    private String title;
    private int duration;

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

    public void play() {
        System.out.println("Playing: " + title);
    }

    @Override
    public String toString() {
        return "song{title='" + title + "', duration=" + duration + "}";
    }
}
