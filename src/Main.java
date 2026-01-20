import java.sql.*;

public class Main {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:postgresql://localhost:5432/assignment3_db";
        String user = "postgres";
        String password = "samal2007";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connection to PostgreSQL established successfully!");
            Statement statement = connection.createStatement();

            // 1. CREATE (Write) - Adding a new artist
            String insertArtist = "INSERT INTO artists (name, genre) VALUES ('Taylor Swift', 'Pop')";
            statement.executeUpdate(insertArtist);
            System.out.println("Data inserted successfully!");

            // 2. READ - Fetching data from the database
            System.out.println("List of Artists in Database:");
            ResultSet rs = statement.executeQuery("SELECT * FROM artists");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + " | Name: " + rs.getString("name") + " | Genre: " + rs.getString("genre"));
            }

            // 3. UPDATE - Changing existing data
            String updateSql = "UPDATE artists SET genre = 'Country' WHERE name = 'Taylor Swift'";
            statement.executeUpdate(updateSql);
            System.out.println("Data updated successfully!");

            // 4. DELETE - Removing data
            // To delete, uncomment the line below:
            // statement.executeUpdate("DELETE FROM artists WHERE name = 'Taylor Swift'");
            // System.out.println("Data deleted successfully!");

        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}