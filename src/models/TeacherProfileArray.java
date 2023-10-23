/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author sahil
 */
public class TeacherProfileArray {
    private ArrayList<TeacherProfile> TeacherProfileArray;
    
    public TeacherProfileArray(){
        this.TeacherProfileArray = new ArrayList<TeacherProfile>();
    }
    public ArrayList<TeacherProfile> getTeacherProfileArray() {
        return TeacherProfileArray;
    }

    public void setTeacherProfileArray(ArrayList<TeacherProfile> TeacherProfileArray) {
        this.TeacherProfileArray = TeacherProfileArray;
    }
    
    public TeacherProfile addNewTeacher(){
        TeacherProfile newTeacherProfile = new TeacherProfile();
        TeacherProfileArray.add(newTeacherProfile);
        return newTeacherProfile;
    }
}
