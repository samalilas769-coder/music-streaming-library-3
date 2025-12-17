public record artist(String name, String genre) {
    @Override
    public String toString() {
        return "Artist{name='" + name + "', genre='" + genre + "'}";
    }
}
