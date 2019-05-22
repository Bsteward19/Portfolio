/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;
import java.sql.*;
public class StudentConnection extends connection.DBConnection
       
{
    private String retrieveQuery;
  public StudentConnection(final String JFLTeam)
{
    //run connectDatabase method
    this.connectDatabase(JFLTeam);
}
  //Initialising array with data types
 public void insertRecord(final String FNAME, final String LNAME, final String STUDENTNO, final String ROLE, final String SKILLS, final int Team)
 {
     //creating SQL query to insert array into Database
     final String insertStmt = "INSERT INTO USER1.STUDENT (FNAME, LNAME, STUDENTNO,ROLE, SKILLS, Team) VALUES (?,?,?,?,?,?)";
 try
 {
     PreparedStatement pstmt = 
             getConnection().prepareStatement(insertStmt);
     
     pstmt.setString(1, FNAME);
     pstmt.setString(2, LNAME);
     pstmt.setString(3, STUDENTNO);
     pstmt.setString(4, ROLE);
     pstmt.setString(5, SKILLS);
     pstmt.setInt(6, Team);
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
                 
                 String FName = output.getString(1);
                 String LName = output.getString(2);
                 String STUDENTno = output.getString(3);
                 String ROLE = output.getString(4);
                 String SKILLS = output.getString(5);
                 int Team = output.getInt(6);
                 System.out.println (FName + " " + LName+"\n"+STUDENTno+ROLE+SKILLS+Team);
             }
         }
     }
     catch (SQLException sqle)
     {
         System.out.println("Exception when printing teams: " + sqle.toString() );
     }
 }

}
