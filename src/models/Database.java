package models;

import java.io.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;



public class Database {

//    public static void saveStudentDataToFile(Student student) {
//        File file = new File("resources/students.data");
//
//        if(file.exists()){
//            System.out.println("File exists");
//            try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))){
//                List<Student> existingStudents = (List<Student>) inputStream.readObject();
//
//                // Add the new students to the existing ones
//                existingStudents.add(student);
//
//                try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
//                    outputStream.writeObject(existingStudents);
//                    System.out.println("Data appended to students.data.");
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//            }catch (IOException e) {
//                e.printStackTrace();
//            } catch (ClassNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//
//    }
    public static void saveStudentsData(Student student){
        List<Student> students = new ArrayList<>();

        students.add(student);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("resources/students.data"))) {
            outputStream.writeObject(students);
            System.out.println("Students data has been written to students.data.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void clearDatabase(){
        System.out.println("database Cleared");
    }

    public static List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();

        return students;
    }
}
