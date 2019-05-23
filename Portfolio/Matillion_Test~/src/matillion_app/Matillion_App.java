/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matillion_app;

import java.sql.*;
import java.util.*;
public class Matillion_App {
static String strDepartment = "";
static String strPay_Type = "";
static String strEducation_Level = "";
    public static void main(String[] args) {
        //get user input from console and call Connect method
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a Department");
        strDepartment = in.nextLine();
        System.out.println("Enter a Pay Type");
        strPay_Type =  in.nextLine();
        System.out.println("Enter an Education Level");
        strEducation_Level = in.nextLine();
       Connect();
       
       }
    
public static void Connect() {
      try {
          //create prepared statement, and connect to database
           PreparedStatement pst;
           Class.forName("com.mysql.jdbc.Driver");
           Connection connect=DriverManager.getConnection(
           "jdbc:mysql://mysql-technical-test.cq5i4y35n9gg.eu-west-1.rds.amazonaws.com/foodmart","technical_test", "HopefullyProspectiveDevsDontBreakMe");
           //Set SQL query using User Input
           String query = "SELECT department.department_id, department.department_description, employee.employee_id, employee.education_level, position.position_id, position.pay_type FROM employee INNER JOIN department ON employee.department_id = department.department_id INNER JOIN position ON employee.position_id = position.position_id WHERE  department_description = \"" + strDepartment + "\" AND education_level = \""+ strEducation_Level + "\" AND pay_type = \""+ strPay_Type + "\"";
           //User Prepared Statement to execute query
           pst = connect.prepareStatement(query);
           ResultSet rs = pst.executeQuery(query);
           while(rs.next())
               System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4) +" "+rs.getString(5) +" "+rs.getString(6)+" ");
           connect.close();
         DatabaseMetaData md = connect.getMetaData();
         ResultSet result = md.getTables(null, null, "%", null);
         //print results
         while (result.next()) {
             System.out.println(result.getString(4));
         }
       } catch (Exception e){System.out.println(e);{
       }
  }
}
}

    

