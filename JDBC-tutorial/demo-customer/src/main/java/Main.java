import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        ConnectDatabase connectDatabase = new ConnectDatabase();

        Connection conn = connectDatabase.connect();

        if(conn != null){
            System.out.println("Kết nối thành công");
        }else{
            System.out.println("Thất bại");
        }
    }
}
