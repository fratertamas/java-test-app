package hu.frt.student.model;

import java.util.Date;

public class Student {
    private String name;
    private Date bithday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBithday() {
        return bithday;
    }

    public void setBithday(Date bithday) {
        this.bithday = bithday;
    }
}
