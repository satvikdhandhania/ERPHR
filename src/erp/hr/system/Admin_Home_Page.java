/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Admin_Home_Page.java
 *
 * Created on Apr 19, 2014, 11:45:09 PM
 */
package erp.hr.system;

import javax.swing.JOptionPane;

/**
 *
 * @author asimali
 */
public class Admin_Home_Page extends javax.swing.JDialog {
    /** Creates new form Admin_Home_Page */
    Login parent;
    public Admin_Home_Page(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public void initialize()
    {
        getContentPane().setBackground(java.awt.Color.LIGHT_GRAY);
    }
    public void parent_initialization(Login pr)
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin Home Page");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome Admin");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(-16777216,true), 5, true));

        jButton1.setText("Add Employee");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_employee(evt);
            }
        });

        jButton2.setText("Remove Employee");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remove_employee(evt);
            }
        });

        jButton3.setText("Create Department");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_department(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Remove Department");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remove_department(evt);
            }
        });

        jButton5.setText("Create Project");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_project(evt);
            }
        });

        jButton6.setText("Remove Project");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remove_project(evt);
            }
        });

        jButton7.setText("Create Backup");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_backup(evt);
            }
        });

        jButton9.setText("Log Out");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout(evt);
            }
        });

        jButton8.setText("Assign Project");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                assign_project(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                        .addGap(97, 97, 97))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton8))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton7))
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void add_employee(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_employee
// TODO add your handling code here:
    Add_Employee ae=new Add_Employee(new java.awt.Frame(), true);
    setVisible(false);
    ae.parent_initialization(Admin_Home_Page.this);
    ae.initialize();
    ae.setVisible(true);
}//GEN-LAST:event_add_employee

private void remove_employee(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove_employee
// TODO add your handling code here:
    Remove_Employee re=new Remove_Employee(new java.awt.Frame(), true);
    setVisible(false);
    re.parent_initialization(Admin_Home_Page.this);
    re.initialize();
    re.setVisible(true);
}//GEN-LAST:event_remove_employee

private void create_project(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_project
// TODO add your handling code here:
    Create_Project cp=new Create_Project(new java.awt.Frame(), true);
    cp.initialize();
    cp.parent_initialization(Admin_Home_Page.this);
    setVisible(false);
    cp.setVisible(true);
}//GEN-LAST:event_create_project

private void logout(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout
// TODO add your handling code here:
    dispose();
    parent.clear();
    parent.setVisible(true);
}//GEN-LAST:event_logout

private void remove_project(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove_project
// TODO add your handling code here:
    Remove_Project rp=new Remove_Project(new java.awt.Frame(), true);
    rp.initialize();
    rp.parent_initialization(Admin_Home_Page.this);
    setVisible(false);
    rp.setVisible(true);
}//GEN-LAST:event_remove_project

private void create_department(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_department
// TODO add your handling code here:
    Create_Department cp=new Create_Department(new java.awt.Frame(), true);
    setVisible(false);
    cp.initialize();
    cp.parent_initialization(Admin_Home_Page.this);
    cp.setVisible(true);
}//GEN-LAST:event_create_department

private void remove_department(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove_department
// TODO add your handling code here:
    Remove_Department rd=new Remove_Department(new java.awt.Frame(), true);
    setVisible(false);
    rd.initialize();
    rd.parent_initialization(Admin_Home_Page.this);
    rd.setVisible(true);
}//GEN-LAST:event_remove_department

private void create_backup(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_backup
// TODO add your handling code here:
    if(JOptionPane.showConfirmDialog(null, "Are you sure you want to create backup?")==JOptionPane.YES_OPTION)
    {
        System.out.println("Success");
        try{
            new ProcessBuilder("bash", "-c", "mysqldump -u'root' -p'password' erp > erp_backup.sql").start();
            JOptionPane.showMessageDialog(null, "Backup successfully created!!");
        }catch(Exception e){
            System.out.println("Error: "+e);
        };
    }
    else
    {
        JOptionPane.showMessageDialog(null, "Backup not created!!");
    }
}//GEN-LAST:event_create_backup

private void assign_project(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assign_project
// TODO add your handling code here:
    Assign_Project ap=new Assign_Project(new java.awt.Frame(), true);
    setVisible(false);
    ap.initialize();
    ap.parent_initialization(Admin_Home_Page.this);
    ap.setVisible(true);
}//GEN-LAST:event_assign_project

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Admin_Home_Page dialog = new Admin_Home_Page(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    // End of variables declaration//GEN-END:variables
}