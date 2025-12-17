void main() {
    artist a1 = new artist("The Weeknd", "Pop");
    artist a2 = new artist("Eminem", "Rap");

    song s1 = new song("Blinding Lights", 200, a1);
    song s2 = new song("Save Your Tears", 180, a1);
    song s3 = new song("Lose Yourself", 240, a2);

    playlist p = new playlist("My Favorites");
    p.addSong(s1);
    p.addSong(s2);
    p.addSong(s3);

    System.out.println("Artist 1: " + a1);
    System.out.println("Artist 2: " + a2);
    System.out.println("Song 1: " + s1);
    System.out.println("Song 2: " + s2);
    System.out.println("Song 3: " + s3);
    System.out.println("Playlist: " + p);
    System.out.println("Is s1 longer than s2: " + (s1.duration() > s2.duration()));
}
