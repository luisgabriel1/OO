package Udemy;

import java.util.ArrayList;
import java.util.List;

public class Student3 {

    final String name;
    final List <Course3> courses = new ArrayList<>();

    Student3 (String name) {
        this.name = name;
    }

    void addCourse(Course3 course3) {
        this.courses.add(course3);
        course3.students.add(this);
    }

    public String toString (){
        return name;
    }
}
