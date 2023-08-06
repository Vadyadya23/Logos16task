package Homework16_Advanced;

import java.util.ArrayList;
import java.util.List;

public interface StudentDao {
    void saveStudent(Student student);

    Student getStudentById(int id);

    List<Student> getAllStudents();

    void updateStudent(Student student);

    void deleteStudent(int id);
}


