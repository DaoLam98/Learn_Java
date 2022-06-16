
import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ConnectDatabase connectDatabase = new ConnectDatabase();

        Connection conn = connectDatabase.connect();

//        if(conn != null){
//            System.out.println("Kết nối thành công");
//        }else{
//            System.out.println("Thất bại");
//        }

//        String sql = "SELECT * FROM `customer`";
//
//        ArrayList <Customer> list = new ArrayList<>();
//
//        try {
//            Statement stm = conn.createStatement();
//
//            ResultSet resutl = stm.executeQuery(sql);
//
//            while(resutl.next()){
//                int id = resutl.getInt("id");
//                String fullName = resutl.getString("full_name");
//                Date dob = resutl.getDate("dob");
//                String address = resutl.getString("address");
//                String email = resutl.getString("email");
//                String mobile = resutl.getString("mobile");
//
//                list.add(new Customer(id, fullName, dob, address, email, mobile));
//            }
//
//            conn.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        list.forEach(i -> System.out.println(i));
//        String query = "INSERT INTO `customer`(`id`, `full_name`, `dob`, `address`, `email`, `mobile`) " +
//                "VALUES (null, ? , ? , ? ,? , ?)";
//
//        PreparedStatement pstm = null;
//
//        try {
//            pstm = conn.prepareStatement(query);
//
//            pstm.setString(1, "Ngọc");
//            pstm.setDate(2, Date.valueOf("1996-08-19"));
//            pstm.setString(3, "Hà Nội");
//            pstm.setString(4,"ngoc@techmater.vn");
//            pstm.setString(5, "0123456789");
//
//            int row = pstm.executeUpdate();
//
//            if(row != 0){
//                System.out.println("Thêm thành công " + row);
//            }
//
//            conn.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

//        String query = "UPDATE `customer` SET `email`=? ,`mobile`= ? WHERE id = ?";
//
//        try {
//            PreparedStatement pstm = conn.prepareStatement(query);
//
//            pstm.setString(1, "ngoc@gmail.com");
//            pstm.setString(2, "01234568789");
//            pstm.setInt(3, 1);
//
//            int row = pstm.executeUpdate();
//
//            if(row != 0 ){
//                System.out.println("Cập nhật thành công");
//            }
//
//            conn.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        String query = "DELETE FROM `customer` WHERE id = ?";

        try {
            PreparedStatement pstm = conn.prepareStatement(query);

            pstm.setInt(1, 10);

            int row = pstm.executeUpdate();

            if(row != 0){
                System.out.println("Xóa thành công");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
