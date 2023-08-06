package Homework16_Advanced;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        StudentDao studentDao = context.getBean(StudentDao.class);

        // Додавання нового студента
        Student student1 = new Student(1, "John", 20);
        studentDao.saveStudent(student1);

        // Отримання студента за ID
        Student fetchedStudent = studentDao.getStudentById(1);
        System.out.println("Fetched student: " + fetchedStudent.getName());

        // Оновлення студента
        fetchedStudent.setAge(21);
        studentDao.updateStudent(fetchedStudent);

        // Виведення всіх студентів
        List<Student> allStudents = studentDao.getAllStudents();
        System.out.println("All students:");
        for (Student student : allStudents) {
            System.out.println(student.getName() + ", Age: " + student.getAge());
        }

        // Видалення студента
        studentDao.deleteStudent(1);
    }
}

