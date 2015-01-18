/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.hr.system;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author asimali
 */
public class ERPHRSYSTEM {

    /**
     * @param args the command line arguments
     */
    public static String url;
    public static Connection con;
    public static Statement stm;
    public static ResultSet rs;
    public static String username;
    public void close()
    {
        try
        {
            if(rs!=null)
               rs.close();
            if(con!=null)
               con.close();
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e);
        }
    }
    public static void main(String[] args) {
        
        url = "jdbc:mysql://localhost:3306/erp";
        con=null;
        stm=null;
        rs=null;
        try
        {
            con=DriverManager.getConnection(url, "root", "Ageofempires");
            stm=con.createStatement();
            Login dialog=new Login(new javax.swing.JFrame(), true);
            dialog.initialize();
            dialog.setVisible(true);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        // TODO code application logic here
        //System.exit(0);
    }
}