package Enrolment;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class StudentEnrolment implements StudentEnrolmentManager {
    private Student student;
    private Course course;
    private String semester;
    private ArrayList<StudentEnrolment> enrolment_list =new ArrayList<StudentEnrolment>();
    private ArrayList<Student> student_list =new ArrayList<Student>();
    private ArrayList<Course> course_list =new ArrayList<Course>();
    private ArrayList<String> sem_list =new ArrayList<String>();

    public StudentEnrolment(Student student, Course course, String semester) {
        this.student = student;
        this.course = course;
        this.semester = semester;
    }

    public void add(){}

    public void update(){}

    public void delete() {}

    public StudentEnrolment() {
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getSemester() {
        return semester;
    }


}
