public class Main {

    public static void main(String[] args) {

        song s1 = new song("Shape of You", 240);
        song s2 = new song("Perfect", 260);

        artist a1 = new artist("Ed Sheeran", "Pop");

        playlist p1 = new playlist("My Favorites", s1, s2);

        s1.play();
        s2.play();

        System.out.println(a1);
        p1.showPlaylist();

        // comparison
        if (s1.getDuration() > s2.getDuration()) {
            System.out.println(s1.getTitle() + " is longer than " + s2.getTitle());
        } else {
            System.out.println(s2.getTitle() + " is longer than " + s1.getTitle());
        }
    }
}
