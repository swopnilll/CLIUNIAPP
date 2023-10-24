package models;

import utilities.Utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student implements Serializable {
    private int id;
    private String name;
    private String email;
    private String password;
    private List<Subject> subjects;
    private double averageGrade;

    public Student(String name, String email, String password) {
        this.id = Utils.generateUniqueStudentID();
        this.name = name;
        this.email = email;
        this.password = password;
        this.subjects = new ArrayList<>();
        this.averageGrade = 0.0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void addSubject(Subject subject) {

    }

    public void removeSubject(Subject subject) {

    }

    private void calculateAverageGrade() {

    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    public boolean passCourse() {
        return averageGrade >= 50;
    }
}
