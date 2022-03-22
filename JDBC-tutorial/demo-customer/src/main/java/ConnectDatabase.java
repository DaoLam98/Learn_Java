import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {
    private final String hostName = "localhost:8082";
    private final String dbName = "customer_manager";
    private final String username = "root";
    private final String password = "123";

    private final String url = "jdbc:mysql://"+hostName+"/"+dbName;

    public Connection connect(){

        //Tạo đối tượng Connection
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
