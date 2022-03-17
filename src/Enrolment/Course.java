package Enrolment;

public class Course {
    private String  id, name;
    private int num_credits;

    public Course(String id, String name, int num_credits) {
        this.id = id;
        this.name = name;
        this.num_credits = num_credits;
    }

    public Course() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNum_credits() {
        return num_credits;
    }
}
