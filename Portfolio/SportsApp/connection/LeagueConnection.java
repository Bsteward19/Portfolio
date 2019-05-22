/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

/**
 *
 * @author brend
 */
import java.sql.*;
public class LeagueConnection extends connection.DBConnection
       
{
    private String retrieveQuery;
  public LeagueConnection(final String JFLTeam)
{
    this.connectDatabase(JFLTeam);
}
 public void insertRecord(final String TEAMNAME, final int Score)
 {
     final String insertStmt = "INSERT INTO app.League (TeamName, Score) VALUES (?,?)";
 try
 {
     PreparedStatement pstmt = 
             getConnection().prepareStatement(insertStmt);
     
     pstmt.setString(1, TEAMNAME);
     pstmt.setInt(2, Score);
     
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
                 int Tscore = output.getInt(2);
                 System.out.println (Tname + " " + Tscore);
             }
         }
     }
     catch (SQLException sqle)
     {
         System.out.println("Exception when printing teams: " + sqle.toString() );
     }
 }
}