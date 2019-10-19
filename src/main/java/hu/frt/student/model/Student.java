package hu.frt.student.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Student {
    private String firstName;
    private String lastName;
    private Date bithday;
}
