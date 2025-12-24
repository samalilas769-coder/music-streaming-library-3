public class artist {

    private String name;
    private String genre;
    private int debutYear;

    public artist(String name, String genre, int debutYear) {
        this.name = name;
        this.genre = genre;
        this.debutYear = debutYear;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getDebutYear() {
        return debutYear;
    }

    public int getExperience(int currentYear) {
        return currentYear - debutYear;
    }

    public void showInfo() {
        System.out.println("Artist name : " + name);
        System.out.println("Genre       : " + genre);
        System.out.println("Debut year  : " + debutYear);
    }

    // ✅ Override Object.toString()
    @Override
    public String toString() {
        return "Artist: " + name +
                " | Genre: " + genre +
                " | Experience: " + getExperience(2025) + " years";
    }

    // ✅ Override Object.equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        artist other = (artist) obj;
        return debutYear == other.debutYear &&
                name.equals(other.name) &&
                genre.equals(other.genre);
    }

    // ✅ Override Object.hashCode()
    @Override
    public int hashCode() {
        return name.hashCode() + genre.hashCode() + debutYear;
    }
}
