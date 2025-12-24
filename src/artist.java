package com.a81.music;

import java.util.Objects;

public class artist {
    private String name;
    private String genre;
    private int debutYear;

    public artist() {}

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


    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDebutYear(int debutYear) {
        this.debutYear = debutYear;
    }

    // ✅ equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        artist other = (artist) obj;
        return debutYear == other.debutYear &&
                Objects.equals(name, other.name) &&
                Objects.equals(genre, other.genre);
    }

    // ✅ hashCode
    @Override
    public int hashCode() {
        return Objects.hash(name, genre, debutYear);
    }

    // ✅ toString
    @Override
    public String toString() {
        return "artist{name='" + name + "', genre='" + genre + "', debutYear=" + debutYear + "}";
    }
}
