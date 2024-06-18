
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddBooks {
    
    Connection conn;
    
    public AddBooks() {
        // Initialize the connection when the object is created
        conn = (Connection) DBConnection.getStatementConnection();
    }
    
    public void addBook(String sno, String bName, String category) {
        String sql = "INSERT INTO books (sno, b_name, category) VALUES (?, ?, ?)";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, sno);
            pstmt.setString(2, bName);
            pstmt.setString(3, category);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void Books(String sno, String b_name, String category) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
