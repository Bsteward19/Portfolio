/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;
import java.sql.*;
public class PlayerConnection extends connection.DBConnection
       
{
    private String retrieveQuery;
  public PlayerConnection(final String JFLTeam)
{
    this.connectDatabase(JFLTeam);
}
 public void insertRecord(final String PNAME, final String PLNAME, final String POSITION, final String Team)
 {
     final String insertStmt = "INSERT INTO app.PLAYERS (PNAME, PLNAME, POSITION, TEAM) VALUES (?,?,?, ?)";
 try
 {
     PreparedStatement pstmt = 
             getConnection().prepareStatement(insertStmt);
     
     pstmt.setString(1, PNAME);
     pstmt.setString(2, PLNAME);
     pstmt.setString(3, POSITION);
     pstmt.setString(4, Team);
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
                 
                 String Pname = output.getString(1);
                 String Plname = output.getString(2);
                 String psition = output.getString(3);
                 String Team = output.getString(4);
                 System.out.println (Pname + " " + Plname+"\n"+psition + Team);
             }
         }
     }
     catch (SQLException sqle)
     {
         System.out.println("Exception when printing teams: " + sqle.toString() );
     }
 }

}
