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
        String employeeID = lastName.toUpperCase().trim().substring(1, 3) + firstName.toUpperCase().trim().substring(1, 3);
        
        System.out.println("New Professor: " + employeeID);
    }
    
    public void setPhotoUrl(String photoName){
        this.photoUrl = "/photos/professor/mad/" + photoName;
    }
}
