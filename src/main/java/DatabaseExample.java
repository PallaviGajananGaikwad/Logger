import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.*;
public class DatabaseExample {
     // Initialize SLF4J Logger
        private static final Logger logger = LoggerFactory.getLogger(DatabaseExample.class);
        // JDBC URL, username, and password
        private static final String URL = "jdbc:mysql://localhost:3306/company";
        private static final String USERNAME = "root";
        private static final String PASSWORD = "1520";

        public static void main(String[] args) {
            Connection connection = null;
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;

            try {
                // Register JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Open a connection
                logger.info("Connecting to database...");
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

                // Execute a query
                String sql = "SELECT * FROM users";
                preparedStatement = connection.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery();

                // Process the result set
                while (resultSet.next()) {
                    // Retrieve by column name
                    String username = resultSet.getString("username");
                    String password = resultSet.getString("password");

                    // Display values
                    logger.info("Username: {},password: {}", username,password);

                }
            } catch (ClassNotFoundException e) {
                logger.error("Failed to load JDBC driver: {}", e.getMessage());
            } catch (SQLException e) {
                logger.error("SQL Exception: {}", e.getMessage());
            } finally {
                // Close resources
                try {
                    if (resultSet != null) resultSet.close();
                    if (preparedStatement != null) preparedStatement.close();
                    if (connection != null) connection.close();
                } catch (SQLException e) {
                    logger.error("Failed to close resources: {}", e.getMessage());
                }
            }
        }
}
