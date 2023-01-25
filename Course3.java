package Udemy;

import java.util.ArrayList;
import java.util.List;

public class Course3 {

    final String name;
    final List<Student3> students = new ArrayList<>();

    Course3 (String name) {
        this.name = name;
    }

    void addStudent (Student3 student3){
        this.students.add(student3);
        student3.courses.add(this);
    }
}
