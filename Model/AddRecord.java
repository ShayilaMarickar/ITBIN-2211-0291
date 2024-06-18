package Model;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddRecord {
       
 Statement stmt;
 
public void addStudent(String u_id, String stdname, String f_name, String m_name, String phn, String city, String clss) {
        String query = "INSERT INTO student (u_id, stdname, f_name, m_name, phn, city, clss) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = DBConnection.getConnection(); PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setString(1, u_id);
            pstmt.setString(2, stdname);
            pstmt.setString(3, f_name);
            pstmt.setString(4, m_name);
            pstmt.setString(5, phn);
            pstmt.setString(6, city);
            pstmt.setString(7, clss);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
}
    public void addCourse(String c_code, String c_name, String lec_in_chrg) {
        String query = "INSERT INTO courses (c_code, c_name, lec_in_chrg) VALUES (?, ?, ?)";
        try (Connection con = DBConnection.getConnection(); PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setString(1, c_code);
            pstmt.setString(2, c_name);
            pstmt.setString(3, lec_in_chrg);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addBook(String serial, String bk_name, String cat) {
        String query = "INSERT INTO books (serial, bk_name, cat) VALUES (?, ?, ?)";
        try (Connection con = DBConnection.getConnection(); PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setString(1, serial);
            pstmt.setString(2, bk_name);
            pstmt.setString(3, cat);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void Form(String u_id, String stdname, String f_name, String m_name, String m_name0, String city, String clss) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
