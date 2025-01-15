package ss16.service;


import ss16.model.Student;

import java.util.List;

public interface IStudentService {
    void addStudent(Student student);
    List<Student> getAllStudents();
    boolean deleteStudentByID(int id);
    void updateStudent(Student student);
    Student getStudentByID(int id);
}