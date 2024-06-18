package Model;

import Model.DBConnection;
import View.Student;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class DBSearch {
    Statement stmt;
 ResultSet rs;
public ResultSet searchadmin(String username, String password) throws SQLException {
 try {
 stmt = DBConnection.getStatementConnection();
 String name = username;
 String pass = password;
//Execute the Query
rs = stmt.executeQuery("SELECT * FROM login WHERE username = '"+name+"' AND password = '"+pass+"'");
 } catch (Exception e) {
 e.printStackTrace();
 }
 return rs;
 }

public ResultSet searchStudent(){
 try{
 stmt = DBConnection.getStatementConnection();
 rs = stmt.executeQuery("SELECT * FROM student");
 }
 catch(Exception e){
 
 }
 return null;
 }

public ResultSet searchcourses(){
 try{
 stmt = DBConnection.getStatementConnection();
 rs = stmt.executeQuery("SELECT * FROM courses");
 }
 catch(Exception e){
 
 }
 return rs;
 }

public ResultSet searchbooks(){
 try{
 stmt = DBConnection.getStatementConnection();
 rs = stmt.executeQuery("SELECT * FROM books");
 }
 catch(Exception e){
 
 }
 return rs;
 }

}
