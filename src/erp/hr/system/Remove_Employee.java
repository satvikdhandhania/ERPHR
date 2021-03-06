/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Remove_Employee.java
 *
 * Created on Apr 20, 2014, 6:51:14 PM
 */
package erp.hr.system;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author asimali
 */
public class Remove_Employee extends javax.swing.JDialog {

    /** Creates new form Remove_Employee */
    Admin_Home_Page parent;
    private static int flag=0;
    ERPHRSYSTEM obj=new ERPHRSYSTEM();
    private static int e;
    public Remove_Employee(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public void initialize()
    {
        getContentPane().setBackground(java.awt.Color.LIGHT_GRAY);
    }
    public void parent_initialization(Admin_Home_Page pr)
    {
        this.parent=pr;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        eid = new javax.swing.JTextField();
        go = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detail = new javax.swing.JTextArea();
        delete = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Remove Employee");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(-16777216,true), 5, true));

        jLabel2.setText("Employee ID");

        eid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Remove_Employee.this.focusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Remove_Employee.this.focusLost(evt);
            }
        });

        go.setText("Go");
        go.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search(evt);
            }
        });

        jLabel3.setText("Details");

        detail.setColumns(20);
        detail.setEditable(false);
        detail.setRows(5);
        detail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Remove_Employee.this.focusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Remove_Employee.this.focusLost(evt);
            }
        });
        jScrollPane1.setViewportView(detail);

        delete.setText("Delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eid, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(go, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(eid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(go))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete)
                    .addComponent(cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void focusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusGained
// TODO add your handling code here:
    evt.getComponent().setBackground(Color.YELLOW);
}//GEN-LAST:event_focusGained

private void focusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusLost
// TODO add your handling code here:
    evt.getComponent().setBackground(Color.WHITE);
}//GEN-LAST:event_focusLost

private void cancel(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel
// TODO add your handling code here:
    dispose();
    parent.setVisible(true);
}//GEN-LAST:event_cancel

private void search(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search
// TODO add your handling code here:
    flag=0;
    try
    {
        if(eid.getText().equals("")==true)
        {
            JOptionPane.showMessageDialog(null, "Cannot be empty!!");
            detail.setText("");
            return;
        }
        e=Integer.parseInt(eid.getText());
        String query="select * from Employee where employee_id="+Integer.parseInt(eid.getText());
        obj.rs=obj.stm.executeQuery(query);
        if(obj.rs.next()){
        int ra=obj.rs.getInt(16);
        obj.rs=obj.stm.executeQuery("select first_name, middle_name, last_name from Employee where employee_id="+ra);
        obj.rs.next();
        String raname=obj.rs.getString(1)+" "+obj.rs.getString(2)+" "+obj.rs.getString(3);
        obj.rs=obj.stm.executeQuery(query);
        obj.rs.next();
        StringBuffer ans=new StringBuffer("");
        ans.append("Employee-Id: "+obj.rs.getInt(1)+"\n");
        ans.append("First Name: "+obj.rs.getString(2)+"\n");
        ans.append("Middle Name: "+obj.rs.getString(3)+"\n");
        ans.append("Last Name: "+obj.rs.getString(4)+"\n");
        ans.append("Date of Birth: "+obj.rs.getString(5)+"\n");
        ans.append("Phone Number: "+obj.rs.getString(6)+"\n");
        ans.append("Mobile Number: "+obj.rs.getString(7)+"\n");
        ans.append("Address: "+obj.rs.getString(8)+"\n");
        ans.append("City: "+obj.rs.getString(9)+"\n");
        ans.append("State: "+obj.rs.getString(10)+"\n");
        ans.append("country: "+obj.rs.getString(11)+"\n");
        ans.append("Pincode: "+obj.rs.getString(12)+"\n");
        ans.append("Email-ID: "+obj.rs.getString(13)+"\n");
        ans.append("Post: "+obj.rs.getString(14)+"\n");
        ans.append("Department ID: "+obj.rs.getString(15)+"\n");
        ans.append("Reporting authority: "+raname+"\n");
        ans.append("Username: "+obj.rs.getString(17)+"\n");
        ans.append("Position Id: "+obj.rs.getString(18)+"\n");
        detail.setText(ans.toString());
        flag=1;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Given employee does not exist!!");
            detail.setText("");
        }
    }
    catch(Exception e)
    {
        flag=0;
        System.out.println("Error: "+e);
    }
}//GEN-LAST:event_search

private void delete(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete
// TODO add your handling code here:
    if(flag==1)
    {
        try
        {
            String user="";
            String query="select username from Employee where employee_id="+e;
            obj.rs=obj.stm.executeQuery(query);
            obj.rs.next();
            user=obj.rs.getString(1);
            query="delete from Employee where username='"+user+"'";
            obj.stm.execute(query);
            query="delete from Login where username='"+user+"'";
            obj.stm.execute(query);
            query="delete from Employee_Project where employee_id="+Integer.parseInt(eid.getText());
            obj.stm.execute(query);
            query="delete from leave_form where employee_id="+Integer.parseInt(eid.getText());
            obj.stm.execute(query);
            JOptionPane.showMessageDialog(null, "Employee successfully removed!!");
            flag=0;
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e);
        }
    }
    else
        JOptionPane.showMessageDialog(null, "First click on GO!!");
}//GEN-LAST:event_delete

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Remove_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Remove_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Remove_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Remove_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Remove_Employee dialog = new Remove_Employee(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton delete;
    private javax.swing.JTextArea detail;
    private javax.swing.JTextField eid;
    private javax.swing.JButton go;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
