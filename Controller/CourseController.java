package Controller;

import javax.swing.JOptionPane;

public class CourseController {
    
     public static void Books(String c_code, String c_name, String lec_in_chrg){
 new Model.AddBooks().Books(c_code, c_name, lec_in_chrg);
 JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
 
 }

    public static void Books() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
