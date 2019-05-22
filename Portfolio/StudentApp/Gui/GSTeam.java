/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import connection.StudentConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author brend
 */
public class GSTeam extends javax.swing.JFrame {

    /**
     * Creates new form GSTeam
     */
    public GSTeam() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnLoad = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        txtStuNo = new javax.swing.JTextField();
        txtTeam = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        LRole = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        LSkill = new javax.swing.JList<>();
        btnSubmit = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnDeleteStudent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Student Number", "Role", "Skills", "Team"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("View / Edit students");

        btnLoad.setText("Load students");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Edit Student");

        jLabel3.setText("First Name");

        jLabel4.setText("Last Name");

        jLabel5.setText("Student Number");

        jLabel6.setText("Team");

        jLabel7.setText("Role");

        jLabel8.setText("Skills");

        txtLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLNameActionPerformed(evt);
            }
        });

        LRole.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Specification", "Design", "Development", "Testing" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(LRole);

        LSkill.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Team Management", "Planning", "Programming", "Negotiation", "Design", "Writing a report", "Time Management", "Research", "Leadership" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(LSkill);

        btnSubmit.setText("Edit Student");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnDeleteStudent.setText("Delete Student");
        btnDeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(95, 95, 95)
                        .addComponent(btnLoad)
                        .addGap(48, 48, 48)
                        .addComponent(btnRefresh)
                        .addGap(42, 42, 42)
                        .addComponent(btnDeleteStudent))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(94, 94, 94)
                                .addComponent(jLabel8)
                                .addGap(156, 156, 156))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtLName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                            .addComponent(txtTeam, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtStuNo, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFName))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addGap(77, 77, 77)
                                        .addComponent(btnSubmit))))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHome))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(btnLoad)
                                    .addComponent(btnRefresh)
                                    .addComponent(btnDeleteStudent)))
                            .addComponent(btnHome))
                        .addGap(1, 1, 1)
                        .addComponent(btnSubmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtStuNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        LoadTable();
    }//GEN-LAST:event_btnLoadActionPerformed

    private void txtLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLNameActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
 //Call EditStudent and StuDetails methods
        EditStudent();
        StuDetails(); 
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        //Clear table, then reload data with LoadTable method
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       model.setRowCount(0);
        LoadTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteStudentActionPerformed
       //Call EditStudent method, clear table, and reload it
        EditStudent();
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       model.setRowCount(0);
        LoadTable();
    }//GEN-LAST:event_btnDeleteStudentActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
         this.setVisible(false);
            new GSHome().setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(GSTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GSTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GSTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GSTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GSTeam().setVisible(true);
            }
        });
    }
    public void LoadTable(){
     //connect to STUDENTS table, and load records into jTable1
    StudentConnection ac = new StudentConnection("Task5DB");
    final String retrieveQuery = "SELECT * from USER1.STUDENT";
    ac.setQuery(retrieveQuery);
    ac.runQuery();
    DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
    ResultSet output = ac.getResultSet();
    try
    {
        if (null != output)
        {
            while(output.next())
            {
                String FName = output.getString(1);
                String LName = output.getString(2);
                int STUDENTNO = output.getInt(3);
                String ROLE = output.getString(4);
                String Skills = output.getString(5);
                int Team = output.getInt(6);
                model.addRow(new Object[]{FName, LName, STUDENTNO, ROLE, Skills, Team});   
            }
        }
    
                    }
    catch (SQLException sqle)
    {
        System.out.println("Expcetion while printing" + sqle.toString());
        }
    }
    public void EditStudent(){
        //get the currently selected item, then select it from the database with an SQL query, then delete records with matching values
    int row = jTable1.getSelectedRow();
int column = jTable1.getSelectedColumn();
    final String cellValue = (String)jTable1.getValueAt(row, column);
    StudentConnection ac = new StudentConnection("Task5DB");
     final String retrieveQuery = "DELETE FROM USER1.STUDENT WHERE LNAME = '" + cellValue + "'";
    ac.setQuery(retrieveQuery);
    ac.updateQuery();
    
    }
    public void StuDetails() {
        if (txtFName.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Error! Please enter a value");
        
        } else if (txtLName.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Error! Please enter a value");
        } 
        else if (txtStuNo.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Error! Please enter a value");
        }
        else if (LRole.getSelectedValue().equals("")) {
            JOptionPane.showMessageDialog(null,"Error! Please enter a value");
        }
        else if (LSkill.getSelectedValue().equals("")) {
            JOptionPane.showMessageDialog(null,"Error! Please enter a value");
        }
        else {
        //input a new record with details from the textboxes and lists into the Students database
        String FName = txtFName.getText();
       String LName = txtLName.getText();
        String SNumber = txtStuNo.getText();
        int team = Integer.parseInt(txtTeam.getText());
        String Role = LRole.getSelectedValue();
        String Skill = LSkill.getSelectedValue();
        
                
      StudentConnection ac = new StudentConnection("Task5DB");
        ac.insertRecord(FName, LName, SNumber, Role, Skill, team);
        ac.closeConnection(); 
        }
                                   
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> LRole;
    private javax.swing.JList<String> LSkill;
    private javax.swing.JButton btnDeleteStudent;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtStuNo;
    private javax.swing.JTextField txtTeam;
    // End of variables declaration//GEN-END:variables
}
