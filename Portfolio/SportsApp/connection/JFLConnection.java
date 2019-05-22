/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;
import java.sql.*;
public class JFLConnection extends connection.DBConnection
       
{
    private String retrieveQuery;
  public JFLConnection(final String JFLTeam)
{
    this.connectDatabase(JFLTeam);
}
 public void insertRecord(final String TEAMNAME, final String MANAGER, final String COACH)
 {
     final String insertStmt = "INSERT INTO app.Team (TeamName, Coach, Manager) VALUES (?,?,?)";
 try
 {
     PreparedStatement pstmt = 
             getConnection().prepareStatement(insertStmt);
     
     pstmt.setString(1, TEAMNAME);
     pstmt.setString(2, MANAGER);
     pstmt.setString(3, COACH);
     
     pstmt.executeUpdate();
 }
 catch (SQLException sqle)
 {
     System.out.println("Exception when inserting Teams record: " + sqle.toString());
 }
 }
 public void printAllRecords()
 {
     this.setQuery(retrieveQuery);
     this.runQuery();
     ResultSet output = this.getResultSet();
     try
     {
         if (null != output)
         {
             while(output.next())
             {
                 
                 String Tname = output.getString(1);
                 String coach = output.getString(2);
                 String mnergr = output.getString(3);
                 System.out.println (Tname + " " + coach+"\n"+mnergr);
             }
         }
     }
     catch (SQLException sqle)
     {
         System.out.println("Exception when printing teams: " + sqle.toString() );
     }
 }

}
