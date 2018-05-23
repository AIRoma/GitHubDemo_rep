/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoringExample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1791330
 */
public class Professor extends Person{
    List<Student> students = new ArrayList<>();
    
    String photoUrl;
    
    public Professor(String lastName, String firstName){
        String employeeID = formatEmployeeID(lastName, firstName);
        
        System.out.println("New Professor: " + employeeID);
    }

    private String formatEmployeeID(String lastName1, String firstName1) {
        return lastName1.toUpperCase().trim().substring(1, 3) + firstName1.toUpperCase().trim().substring(1, 3);
    }
    
    public void setPhotoUrl(String photoName, String photoPath){
        this.photoUrl = photoPath + photoName;
    }

    public void isSupervisedBy(Student student) {
        this.students.add(student);
    }
}
