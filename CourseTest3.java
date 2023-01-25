package Udemy;

public class CourseTest3 {
    public static void main(String[] args) {
        Student3 s1 = new Student3("Luis");
        Student3 s2 = new Student3("Hugo");
        Student3 s3 = new Student3("Alan");

        Course3 c1 = new Course3("Java Completed");
        Course3 c2 = new Course3("Web 2023");
        Course3 c3 = new Course3("React Native");

        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);

        c2.addStudent(s1);
        c2.addStudent(s2);
        c2.addStudent(s3);

        s1.addCourse(c3);
        s2.addCourse(c3);
        s3.addCourse(c3);

        for (Student3 student3: c1.students) {
            System.out.println("I am enrolled in course of ... " + c1.name);
            System.out.println("... and my name is " + student3.name);
        }

        System.out.println(s1.courses.get(0).students);
    }
}
