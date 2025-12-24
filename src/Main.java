public class Main {

    public static void main(String[] args) {

        song s1 = new song("Shape of You", 240);
        song s2 = new song("Perfect", 263);
        song s3 = new song("Shape of You", 240);

        playlist p = new playlist("My Favorites", s1, s2);

        System.out.println("=== PLAYLIST INFO ===");
        System.out.println(p); // toString override

        System.out.println("\n=== SONG COMPARISON ===");
        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equals s3: " + s1.equals(s3));

        System.out.println("\n=== PLAYING ===");
        s1.play();
        s2.play();
    }
}
