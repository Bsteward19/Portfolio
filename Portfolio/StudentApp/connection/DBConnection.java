/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;
import java.sql.*;
/**
 *
 * @author brend
 */
public class DBConnection {
    //set initial variables
    private Connection dbConnection = null;
    private Statement stmt = null;
    private ResultSet dataRS = null;
    private String query = null;
    
    private void loadDriver()
 {
 
 try
 {
 //Load SQL driver
 Class driver = org.apache.derby.jdbc.ClientDriver.class;
 System.out.println("Class=" + driver.getSimpleName());
 Class.forName ("org.apache.derby.jdbc.ClientDriver");
 }
 catch (ClassNotFoundException err)
 {
 System.out.println("Could not load driver ");
 System.exit(1);
 }
 }
    
    public void connectDatabase(final String dbName)
 {
 try
 {
     //Run loadDriver method and connect to following database
 loadDriver();
 dbConnection=
DriverManager.getConnection("jdbc:derby://localhost:1527/" + dbName,
"user1", "password");
 }
 catch(SQLException error)
 {
 System.err.println("Error connecting to database: "
 + error.toString());
 }
 }
    
 public void updateQuery(){
     try
         //insert data held by stmt into an SQL query
     {
         stmt = dbConnection.createStatement();
         //Execute an SQL update with stmt data
         stmt.executeUpdate(query);
     }
          catch(SQLException error)
 {
 System.err.println("Error connecting to database: "
 + error.toString());
 }    
         }
public void runQuery()
 {
 try
     //inset data held by stmt into an SQL query
 {
 stmt = dbConnection.createStatement();
 //Execute an SQL query with stmt data
 dataRS = stmt.executeQuery(query);
 }
 catch(SQLException error)
 {
 System.err.println("Error connecting to database: "
 + error.toString());
 }
}

 public void setQuery(final String q)
         //set query as String
 {
 query = new String(q);
 }
 
 public void closeConnection()
  //close the current connection
 {
 try
 {
 if (null != dbConnection && !dbConnection.isClosed())
 {
 dbConnection.close();
 }
 }
 catch (SQLException sqle)
 {
 System.out.println("Error closing connection: " +
sqle.toString());
 }
 }

 
 public ResultSet getResultSet()
 {
 return dataRS;
 }
 /**
 * Returns the connection object for the current database
 * @return The connection
 */
 public Connection getConnection()
 {
 return dbConnection;
 }

 
}
