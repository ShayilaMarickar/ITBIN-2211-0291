/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Home;
import Model.DBConnection;
import Model.DBSearch;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import View.login;
/**
 *
 * @author fawzu
 */
public class LoginController {
    public static void login(String userName, String pass) {
 try {
 String username = null; // initial value of the username
 String password = null; // initial value of the password
 ResultSet rs = new DBSearch().searchadmin(userName, password);
//Process the Query
 while (rs.next()) {
username = rs.getString("username"); //assign database login name to the variable
password = rs.getString("password"); //assign database password to the variable
 }
 if (username != null && password != null) {
 if (password.equals(pass)) {
 System.out.println("Login Successfull");
 login.getFrames()[0].dispose();
 new Home().setVisible(true);
 } else {
JOptionPane.showMessageDialog(null, "Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE);
 }
 } else {
JOptionPane.showMessageDialog(null, "Please check the Credentials", "Error", JOptionPane.ERROR_MESSAGE);
 }
 DBConnection.closeCon();
 } catch (SQLException ex) { 
Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
 }
 }
}
