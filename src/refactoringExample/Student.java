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
    String student_id;
    String lastName;
    String firstName;
    Date dateBirth;

    public Student(String student_id, String lastName, String firstName, Date dateBirth) {
        this.student_id = student_id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateBirth = dateBirth;
    }
    
    public String createStudentId(String lName, String fName, Date date){
        String end = concatDate(date);
        return lName.substring(0, 3) + fName.charAt(0) + end;
    }

    private String concatDate(Date date) {
        return date.getYear() + "-" + date.getMonth();
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }
    
    public void isSupervisedBy(Professor professor){
        professor.students.add(this);
    }
}
