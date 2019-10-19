package hu.frt.student.controller;

import hu.frt.student.model.Gender;
import hu.frt.student.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudent(
            @RequestParam(name = "gender", required = true) Gender gender){
        List<Student> students = Arrays.asList(
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
                    .build());
        List<Student> studentsResult = new ArrayList<>();
        for(Student student: students){
            if(student.getGender() == gender){
                studentsResult.add(student);
            }
        }
        return studentsResult;
    }
}
