import java.util.Scanner;
import java.sql.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String url = "jdbc:postgresql://localhost:5432/assignment3_db";
        String user = "postgres";
        String password = "samal2007";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("--- Connected to Database ---");

            // --- INSERT into artists ---
            System.out.print("Enter Artist Name: ");
            String artistName = input.nextLine();

            System.out.print("Enter Artist Genre: ");
            String artistGenre = input.nextLine();

            String insertArtistSql = "INSERT INTO artists (name, genre) VALUES (?, ?)";
            try (PreparedStatement pstmt = connection.prepareStatement(insertArtistSql)) {
                pstmt.setString(1, artistName);
                pstmt.setString(2, artistGenre);
                pstmt.executeUpdate();
                System.out.println("Success: Artist added to DB!");
            }

            // --- UPDATE artist ---
            System.out.println("\n--- Update Artist Info ---");
            System.out.print("Enter Artist ID to update: ");
            int updateArtistId = input.nextInt();
            input.nextLine();

            System.out.print("Enter NEW Name for this artist: ");
            String newArtistName = input.nextLine();

            String updateArtistSql = "UPDATE artists SET name = ? WHERE id = ?";
            try (PreparedStatement pstmtUpdate = connection.prepareStatement(updateArtistSql)) {
                pstmtUpdate.setString(1, newArtistName);
                pstmtUpdate.setInt(2, updateArtistId);
                int rowsAffected = pstmtUpdate.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Artist updated successfully!");
                } else {
                    System.out.println("Artist with this ID not found.");
                }
            }

            // --- DELETE artist ---
            System.out.println("\n--- Delete Artist ---");
            System.out.print("Enter Artist ID to delete: ");
            int deleteArtistId = input.nextInt();
            input.nextLine();

            String deleteArtistSql = "DELETE FROM artists WHERE id = ?";
            try (PreparedStatement pstmtDelete = connection.prepareStatement(deleteArtistSql)) {
                pstmtDelete.setInt(1, deleteArtistId);
                int deletedRows = pstmtDelete.executeUpdate();
                if (deletedRows > 0) {
                    System.out.println("Artist deleted successfully!");
                } else {
                    System.out.println("No artist found with that ID.");
                }
            }

            // --- INSERT into songs ---
            System.out.println("\n--- Add New Song ---");
            System.out.print("Enter Song Title: ");
            String songTitle = input.nextLine();

            System.out.print("Enter Artist ID (must exist): ");
            int songArtistId = input.nextInt();
            input.nextLine();

            System.out.print("Enter Duration (in seconds): ");
            int durationSeconds = input.nextInt();
            input.nextLine();

            String insertSongSql = "INSERT INTO songs (title, artist_id, duration_seconds) VALUES (?, ?, ?)";
            try (PreparedStatement pstmtSong = connection.prepareStatement(insertSongSql)) {
                pstmtSong.setString(1, songTitle);
                pstmtSong.setInt(2, songArtistId);
                pstmtSong.setInt(3, durationSeconds);
                pstmtSong.executeUpdate();
                System.out.println("Success: Song added to DB!");
            }

            // --- UPDATE song ---
            System.out.println("\n--- Update Song Info ---");
            System.out.print("Enter Song ID to update: ");
            int updateSongId = input.nextInt();
            input.nextLine();

            System.out.print("Enter NEW Title for this song: ");
            String newSongTitle = input.nextLine();

            String updateSongSql = "UPDATE songs SET title = ? WHERE id = ?";
            try (PreparedStatement pstmtUpdateSong = connection.prepareStatement(updateSongSql)) {
                pstmtUpdateSong.setString(1, newSongTitle);
                pstmtUpdateSong.setInt(2, updateSongId);
                int rowsAffected = pstmtUpdateSong.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Song updated successfully!");
                } else {
                    System.out.println("Song with this ID not found.");
                }
            }

            // --- DELETE song ---
            System.out.println("\n--- Delete Song ---");
            System.out.print("Enter Song ID to delete: ");
            int deleteSongId = input.nextInt();
            input.nextLine();

            String deleteSongSql = "DELETE FROM songs WHERE id = ?";
            try (PreparedStatement pstmtDeleteSong = connection.prepareStatement(deleteSongSql)) {
                pstmtDeleteSong.setInt(1, deleteSongId);
                int deletedRows = pstmtDeleteSong.executeUpdate();
                if (deletedRows > 0) {
                    System.out.println("Song deleted successfully!");
                } else {
                    System.out.println("No song found with that ID.");
                }
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}

