/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;
import java.sql.*;
public class GameConnection extends connection.DBConnection
       
{
    private String retrieveQuery;
  public GameConnection(final String JFLTeam)
{
    //run connectDatabase method
    this.connectDatabase(JFLTeam);
}
  //Initialising array with data types
 public void insertRecord(final String HOMETEAM, final String AWAYTEAM, final int HOMESCORE, final String Referee, final String Date, final int AWAYSCORE)
 {
     //creating SQL query to insert array into Database
     final String insertStmt = "INSERT INTO app.GAME (HOMETEAM, AWAYTEAM, HOMESCORE,REFEREE, DATE,  AWAYSCORE) VALUES (?,?,?,?,?,?)";
 try
 {
     PreparedStatement pstmt = 
             getConnection().prepareStatement(insertStmt);
     
     pstmt.setString(1, HOMETEAM);
     pstmt.setString(2, AWAYTEAM);
     pstmt.setInt(3, HOMESCORE);
     pstmt.setString(4, Referee);
     pstmt.setString(5, Date);
     pstmt.setInt(6, AWAYSCORE);
     pstmt.executeUpdate();
 }
 catch (SQLException sqle)
 {
     System.out.println("Exception when inserting Teams record: " + sqle.toString());
 }
 }
 public void printAllRecords()
 {
     //set SQL query to retrieveQuery, and run that SQL statement
     this.setQuery(retrieveQuery);
     this.runQuery();
     ResultSet output = this.getResultSet();
     try
     {
         if (null != output)
         {
             while(output.next())
             {
                 
                 String HTeam = output.getString(1);
                 String ATeam = output.getString(2);
                 int HScore = output.getInt(3);
                 String Ref = output.getString(4);
                 String dat = output.getString(5);
                 int AScore = output.getInt(6);
                 System.out.println (HTeam + " " + ATeam+"\n"+HScore+Ref+dat+AScore);
             }
         }
     }
     catch (SQLException sqle)
     {
         System.out.println("Exception when printing teams: " + sqle.toString() );
     }
 }

}
