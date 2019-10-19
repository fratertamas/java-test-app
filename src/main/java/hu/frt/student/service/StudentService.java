package hu.frt.student.service;

import hu.frt.student.model.Gender;
import hu.frt.student.model.Student;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {

    private List<Student> students;

    public StudentService(){
        students = new ArrayList<>(Arrays.asList(
                Student.builder()
                        .firstName("Ecseri")
                        .lastName("Barbika")
                        .bithday(new Date(91, Calendar.FEBRUARY,4))
                        .gender(Gender.FEMALE)
                        .build(),
                Student.builder()
                        .firstName("Fráter")
                        .lastName("Tomika")
                        .bithday(new Date(87, Calendar.MAY,11))
                        .gender(Gender.MALE)
                        .build(),
                Student.builder()
                        .firstName("Füzesi")
                        .lastName("Zsoltika")
                        .bithday(new Date(87, Calendar.NOVEMBER,13))
                        .gender(Gender.MALE)
                        .build()));
    }

    public List<Student> getStudent(){
        return students;
    }

    public void createStudent(Student student) {
        students.add(student);
    }
}
