/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoringExample;

import java.util.Date;

/**
 *
 * @author 1791330
 */
public class Student extends Person{
    String studentID;

    public Student(String student_id, String lastName, String firstName, Date dateBirth) {
        this.studentID = createStudentId(lastName, firstName, dateBirth);
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateBirth = dateBirth;
    }
    
    public String createStudentId(String lName, String fName, Date date){
        String end = date.getYear() + "-" + date.getMonth();
        return lName.substring(0, 3) + fName.charAt(0) + end;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void study() {
        System.out.println("I study");
    }
    
}
