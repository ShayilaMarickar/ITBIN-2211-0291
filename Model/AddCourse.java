package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddCourse {
    private Connection conn;
    
    public AddCourse(){
        conn = (Connection) DBConnection.getStatementConnection();
    }
    public void addCourse(String c_code, String c_name, String lec_in_chrg) {
        String sql = "INSERT INTO courses (c_code, c_name, lec_in_chrg) VALUES (?, ?, ?)";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, c_code);
            pstmt.setString(2, c_name);
            pstmt.setString(3, lec_in_chrg);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
