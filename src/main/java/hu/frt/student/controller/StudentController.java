package hu.frt.student.controller;

import hu.frt.student.model.Gender;
import hu.frt.student.model.Student;
import hu.frt.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getStudent(
            @RequestParam(name = "gender", required = false) Gender gender){
        List<Student> students = studentService.getStudent();
        List<Student> studentsResult = new ArrayList<>();
        if(gender == null){
            return students;
        }
        for(Student student: students){
            if(student.getGender() == gender){
                studentsResult.add(student);
            }
        }
        return studentsResult;
    }

    @PostMapping
    public void createStudent(@RequestBody Student student){
        studentService.createStudent(student);
    }
}
