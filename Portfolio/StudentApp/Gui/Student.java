/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

/**
 *
 * @author brend
 */
import connection.StudentConnection;
import java.util.*;
import java.util.stream.*;
public class Student extends GStudent {
   
      String FName = "Null";
    String LName = "Null";
    String StudentNo = "Null";
    String Role = "Null";
    String Skills = "Null";
    int Team;
    
    public Student(String FName, String LName, String StudentNo, String Role, String Skills, int Team) {
          //Initialise variables for Student object
   this.LName = LName;
   this.FName = FName;
   this.StudentNo = StudentNo;
   this.Role = Role;
   this.Skills = Skills;
   this.Team = Team;
   System.out.print(FName);
}
    //get changed values
    public String getRole(){
        return Role;
    }
    public int getTeam() {
        return Team;
    }
    public void setTeam(int Team) {
        this.Team = Team;
    }
    //override default binary output, and return strings to console
    @Override
        public String toString(){
    return "First Name: "+ this.FName+ ", Last Name: " + this.LName+ ", Student Number:" + this.StudentNo + "Role: " + Role + "Skills: " + Skills + "Team:" + Team + "   ";
}
}
