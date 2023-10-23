/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import javax.swing.ImageIcon;

/**
 *
 * @author sahil
 */
public class TeacherMyCourses {
    private String TeacherUsername;
    private String CourseSubject;
    private String CourseSemester;
    private String CourseName;
    private String CoursePrice;
    private String Catalog;
    ImageIcon ImageOfCourse;
    private String[] CourseSchedule;
    
    public String[] getCourseSchedule() {
        return CourseSchedule;
    }

    public void setCourseSchedule(String[] CourseSchedule) {
        this.CourseSchedule = CourseSchedule;
    }
    

    public String getTeacherUsername() {
        return TeacherUsername;
    }

    public void setTeacherUsername(String TeacherUsername) {
        this.TeacherUsername = TeacherUsername;
    }

    public String getCourseSubject() {
        return CourseSubject;
    }

    public void setCourseSubject(String CourseSubject) {
        this.CourseSubject = CourseSubject;
    }

    public String getCourseSemester() {
        return CourseSemester;
    }

    public void setCourseSemester(String CourseSemester) {
        this.CourseSemester = CourseSemester;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public String getCoursePrice() {
        return CoursePrice;
    }

    public void setCoursePrice(String CoursePrice) {
        this.CoursePrice = CoursePrice;
    }

    public String getCatalog() {
        return Catalog;
    }

    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    public ImageIcon getImageOfCourse() {
        return ImageOfCourse;
    }

    public void setImageOfCourse(ImageIcon ImageOfCourse) {
        this.ImageOfCourse = ImageOfCourse;
    }

    
    
    
}
