package models;

import java.util.Arrays;
import java.util.List;

public class Admin {
    // Other admin-related properties and methods...

    public void groupStudents() {
        // Retrieve the list of students from the database
        List<Student> students = Database.getAllStudents();

        System.out.println("Group Student Methods");
    }

    public void partitionStudents() {
        // Retrieve the list of students from the database
        List<Student> students = Database.getAllStudents();

        System.out.println("Partition Student Method");
    }

    public void removeStudent(int studentId) {
        // Retrieve the list of students from the database
        List<Student> students = Database.getAllStudents();

        System.out.println("Remove Student Method");
    }

    public  void showStudents(){
        var students =  Database.getAllStudents();

        students.forEach(student -> System.out.println(student.getName()));
    }

}
