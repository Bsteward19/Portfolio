/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import connection.LeagueConnection;
import connection.GameConnection;
import connection.PlayerConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author brend
 */
public class JFLMatch extends javax.swing.JFrame {

    /** Creates new form JFLMatch */
    public JFLMatch() {
        initComponents();
    }
     public  void cboHome(){
         
    ResultSet rs = null;
    //connect to team table, and populate combo boxes with its data
    PlayerConnection ac = new PlayerConnection("JFLTeam");
  final String retrieveQuery = "SELECT * from app.TEAM";
    ac.setQuery(retrieveQuery);
    ac.runQuery();
    DefaultComboBoxModel model =(DefaultComboBoxModel) cboHomeTeam.getModel();
    cboAwayTeam.getModel();
    cboHomeTeam1.getModel();
    cboAwayTeam1.getModel();
    ResultSet output = ac.getResultSet();
    
         try {   
              if (null != output)
              {
             while(output.next())
            {
                String Team = output.getString(1);
                cboHomeTeam.addItem(Team);
                cboAwayTeam.addItem(Team);
                cboHomeTeam1.addItem(Team);
                cboAwayTeam1.addItem(Team);
            }
              }
    
                    }
    catch (SQLException sqle)
    {
        System.out.println("Expcetion while printing" + sqle.toString());
        }
    }

    /** This method is called from within the constructor to
     * initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cboHomeTeam = new javax.swing.JComboBox<>();
        cboHomeTeam1 = new javax.swing.JComboBox<>();
        cboAwayTeam = new javax.swing.JComboBox<>();
        cboAwayTeam1 = new javax.swing.JComboBox<>();
        txtReferee = new javax.swing.JTextField();
        txtReferee1 = new javax.swing.JTextField();
        btnHome = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtDate = new javax.swing.JTextField();
        txtDate1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtHScore = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtAScore = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtHScore1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtAScore1 = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Add Match");

        jLabel2.setText("Home Team");

        jLabel3.setText("Away Team");

        jLabel4.setText("Referee");

        jLabel5.setText("Date");

        jLabel6.setText("Game 1");

        jLabel7.setText("Game 2");

        jLabel8.setText("Home Team");

        jLabel9.setText("Away Team");

        jLabel10.setText("Referee");

        jLabel11.setText("Date");

        cboHomeTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboHomeTeamActionPerformed(evt);
            }
        });

        cboHomeTeam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboHomeTeam1ActionPerformed(evt);
            }
        });

        cboAwayTeam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAwayTeam1ActionPerformed(evt);
            }
        });

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh Teams");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Home Team", "Away Team", "Home Score", "Away Score", "Date", "Referee"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        txtDate.setText("0");

        txtDate1.setText("0");

        jLabel12.setText("Home Score");

        txtHScore.setText("0");

        jLabel13.setText("Away Score");

        txtAScore.setText("0");

        jLabel14.setText("Home Score");

        txtHScore1.setText("0");

        jLabel15.setText("Away Score");

        txtAScore1.setText("0");
        txtAScore1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAScore1ActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Match");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
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
                        .addGap(240, 240, 240)
                        .addComponent(btnRefresh)
                        .addGap(33, 33, 33)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHome))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(cboHomeTeam1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(20, 20, 20)
                                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cboHomeTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtReferee1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboAwayTeam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(cboAwayTeam1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(txtHScore, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtAScore))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtHScore1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtReferee, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAScore1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(btnHome)
                            .addComponent(btnRefresh)
                            .addComponent(btnDelete))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(cboHomeTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cboAwayTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(txtAScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtReferee1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel11)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cboHomeTeam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtHScore1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cboAwayTeam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtAScore1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtReferee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboHomeTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboHomeTeamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboHomeTeamActionPerformed

    private void cboHomeTeam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboHomeTeam1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboHomeTeam1ActionPerformed

    private void cboAwayTeam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAwayTeam1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAwayTeam1ActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        //reset jTable1, and call cboHome and insertRecords methods
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       model.setRowCount(0);
        cboHome();
        insertRecords();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
//get textbox data, and insert data using GameConnection to connect to Game table
        String Date = txtDate.getText();
        String Hteam = cboHomeTeam.getItemAt(cboHomeTeam.getSelectedIndex());
        int hscore = Integer.parseInt(txtHScore.getText());
      String Ateam = cboAwayTeam.getItemAt(cboAwayTeam.getSelectedIndex());
      int Ascore = Integer.parseInt(txtAScore.getText());
      String referee = txtReferee.getText();
       String Date2 = txtDate1.getText();
        String Hteam2 = cboHomeTeam1.getItemAt(cboHomeTeam1.getSelectedIndex());
        int hscore2 = Integer.parseInt(txtHScore1.getText());
      String Ateam2 = cboAwayTeam1.getItemAt(cboAwayTeam1.getSelectedIndex());
      int Ascore2 = Integer.parseInt(txtAScore1.getText());
      String referee2 = txtReferee1.getText();
      calculateFirstScore();
      calculateSecondScore();
        GameConnection ac = new GameConnection("JFLTeam");
        ac.insertRecord(Hteam,Ateam,hscore,referee, Date, Ascore);
       ac.insertRecord(Hteam2, Ateam2,hscore2,referee2, Date2, Ascore2);
      ac.closeConnection();
      txtDate.setText("");
      txtHScore.setText("");
      txtAScore.setText("");
      txtReferee.setText("");
      txtDate1.setText("");
      txtHScore1.setText("");
      txtAScore1.setText("");
      txtReferee1.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        this.setVisible(false);
        new JFHome().setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed
public void deleteMatch()
{
    //get the selected row, and delete row with matching date value
    int row = jTable1.getSelectedRow();
int column = jTable1.getSelectedColumn();
    final String cellValue = (String)jTable1.getValueAt(row, column);
    GameConnection ac = new GameConnection("JFLTeam");
     final String retrieveQuery = "DELETE FROM app.GAME WHERE DATE = '" + cellValue + "'";
    ac.setQuery(retrieveQuery);
    ac.updateQuery();
}
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       deleteMatch();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtAScore1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAScore1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAScore1ActionPerformed
public void calculateFirstScore(){
    //initialise homescore, homeleaguescore, awayscore, awayleaguescore
  int HomeScore = Integer.parseInt(txtHScore.getText());
  int HomeLeagueScore = 0;
  int AwayScore = Integer.parseInt(txtAScore.getText());
  int AwayLeagueScore = 0;
  //if homescore is higher than awayscore set homeLeaguescore's value to +3, otherwise if awayscore's higher set awayLeagyescore value to +3
  //if equal, then set both leaguescores to +1
  if (HomeScore > AwayScore)
  HomeLeagueScore = HomeLeagueScore + 3;
  else if (AwayScore > HomeScore)
  AwayLeagueScore = AwayLeagueScore + 3;
   else if (AwayScore == HomeScore) {
   HomeLeagueScore = HomeLeagueScore + 1;
      AwayLeagueScore = AwayLeagueScore + 1;
    }
  //connect to League table using LeagueConnection class, and update both scores
    LeagueConnection ac = new LeagueConnection("JFLTeam");
    final String retrieveQuery = "UPDATE APP.LEAGUE SET SCORE = SCORE +" + HomeLeagueScore +  "WHERE TEAMNAME = '" + cboHomeTeam.getSelectedItem() + "'";
    ac.setQuery(retrieveQuery);
     ac.updateQuery();
    final String retrieveAwayQuery = "UPDATE APP.LEAGUE SET SCORE = SCORE +" + AwayLeagueScore +  "WHERE TEAMNAME = '" + cboAwayTeam.getSelectedItem() + "'";
    ac.setQuery(retrieveAwayQuery);
     ac.updateQuery();
}
public void calculateSecondScore(){
    //same code as above, used to calculate second game.
  int HomeScore1 = Integer.parseInt(txtHScore1.getText());
  int HomeLeagueScore1 = 0;
  int AwayScore1 = Integer.parseInt(txtAScore1.getText());
  int AwayLeagueScore1 = 0;
  if (HomeScore1 > AwayScore1)
  HomeLeagueScore1 = HomeLeagueScore1 + 3;
  else if (AwayScore1 > HomeScore1)
  AwayLeagueScore1 = AwayLeagueScore1 + 3;
   else if (AwayScore1 == HomeScore1) 
   HomeLeagueScore1 = HomeLeagueScore1 + 1;
      AwayLeagueScore1 = AwayLeagueScore1 + 1;
    
    LeagueConnection ac = new LeagueConnection("JFLTeam");
    final String retrieveQuery = "UPDATE APP.LEAGUE SET SCORE = SCORE +" + HomeLeagueScore1 +  "WHERE TEAMNAME = '" + cboHomeTeam1.getSelectedItem() + "'";
    ac.setQuery(retrieveQuery);
     ac.updateQuery();
    final String retrieveAwayQuery = "UPDATE APP.LEAGUE SET SCORE = SCORE +" + AwayLeagueScore1 +  "WHERE TEAMNAME = '" + cboAwayTeam1.getSelectedItem() + "'";
    ac.setQuery(retrieveAwayQuery);
     ac.updateQuery();
}
    private void insertRecords() {
        //connect to Game table with GameConnection class, select all records with sql query
     GameConnection ac = new GameConnection("JFLTeam");
    final String retrieveQuery = "SELECT * from app.Game";
            
    ac.setQuery(retrieveQuery);
    ac.runQuery();
    DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
    ResultSet output = ac.getResultSet();
    try
        //insert selected records into jTable1
    {
        if (null != output)
        {
            while(output.next())
            {
                String HTeam = output.getString(1);
                String ATeam = output.getString(2);
                int HScore = output.getInt(3);
                String ref = output.getString(4);
                String dat = output.getString(5);
                int AScore = output.getInt(6);
                model.addRow(new Object[]{HTeam, ATeam, HScore,AScore, dat, ref});   
            }
        }
    
                    }
    catch (SQLException sqle)
    {
        System.out.println("Expcetion while printing" + sqle.toString());
        }
    }
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
            java.util.logging.Logger.getLogger(JFLMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLMatch().setVisible(true);
            }
        });
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cboAwayTeam;
    private javax.swing.JComboBox<String> cboAwayTeam1;
    private javax.swing.JComboBox<String> cboHomeTeam;
    private javax.swing.JComboBox<String> cboHomeTeam1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtAScore;
    private javax.swing.JTextField txtAScore1;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDate1;
    private javax.swing.JTextField txtHScore;
    private javax.swing.JTextField txtHScore1;
    private javax.swing.JTextField txtReferee;
    private javax.swing.JTextField txtReferee1;
    // End of variables declaration//GEN-END:variables

}
