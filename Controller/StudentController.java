
package Controller;

import javax.swing.JOptionPane;


public class StudentController {
    
public static void Form(String u_id, String stdname, String f_name, String m_name, String city, String clss) {
 new Model.AddRecord().Form(u_id, stdname, f_name, m_name, m_name, city, clss);
 JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
}
}

