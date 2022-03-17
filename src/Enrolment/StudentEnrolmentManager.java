package Enrolment;

import java.util.ArrayList;

public interface StudentEnrolmentManager {
    ArrayList<StudentEnrolment> studentenrolment =new ArrayList<StudentEnrolment>();

    public void add();

    public void update();

    public void delete();

    public void getOne();

    public void getAll();

}
