package Controller;

import javax.swing.JOptionPane;

public class BookController {
    
    public static void Books(String sno, String b_name, String category){
 new Model.AddBooks().Books(sno, b_name, category);
 JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
 
 }

    public static void Books() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
