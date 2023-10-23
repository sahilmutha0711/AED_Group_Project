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
public class TeacherMyCoursesArray {
    private ArrayList<TeacherMyCourses> TeacherMyCoursesArray;

    public TeacherMyCoursesArray() {
        this.TeacherMyCoursesArray = new ArrayList<TeacherMyCourses>();
    }

    
    public ArrayList<TeacherMyCourses> getTeacherMyCoursesArray() {
        return TeacherMyCoursesArray;
    }

    public void setTeacherMyCoursesArray(ArrayList<TeacherMyCourses> TeacherMyCoursesArray) {
        this.TeacherMyCoursesArray = TeacherMyCoursesArray;
    }
    
    public TeacherMyCourses addNewMyCourse(){
        TeacherMyCourses teachermycourses = new TeacherMyCourses();
        TeacherMyCoursesArray.add(teachermycourses);
        return teachermycourses;
    }
    
}
