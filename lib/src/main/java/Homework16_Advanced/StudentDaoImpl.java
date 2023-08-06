package Homework16_Advanced;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private List<Student> students = new ArrayList<>();

    @Override
    public void saveStudent(Student student) {
        students.add(student);
    }

    @Override
    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public void updateStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == student.getId()) {
                students.set(i, student);
                return;
            }
        }
    }

    @Override
    public void deleteStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }
}

