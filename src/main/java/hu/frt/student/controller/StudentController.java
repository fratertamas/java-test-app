package hu.frt.student.controller;

import hu.frt.student.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudent(){
        return Arrays.asList(
            Student.builder()
                    .firstName("Fráter")
                    .lastName("Tomika")
                    .bithday(new Date(87, Calendar.MAY,11))
                    .build(),
            Student.builder()
                    .firstName("Füzesi")
                    .lastName("Zsoltika")
                    .bithday(new Date(87, Calendar.NOVEMBER,13))
                    .build());

    }
}
