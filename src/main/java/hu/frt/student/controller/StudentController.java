package hu.frt.student.controller;

import hu.frt.student.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudent(){

        Student s1 = new Student();
        s1.setName("Fráter Tomika");
        s1.setBithday(new Date(87, Calendar.MAY,11));

        Student s2 = new Student();
        s2.setName("Füzesi Zsoltika");
        s2.setBithday(new Date(87, Calendar.NOVEMBER,13));

        List<Student> students =  new ArrayList<>();
        students.add(s1);
        students.add(s2);

        return students;
    }
}
