public record song(String title, int duration, artist artist) {
    @Override
    public String toString() {
        return "Song{title='" + title + "', duration=" + duration +
                ", artist=" + artist.name() + "}";
    }
}
