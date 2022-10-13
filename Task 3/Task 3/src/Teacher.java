import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<String> canTeach;
    private ArrayList<String> currentCourses;


    public Teacher(String name, int age, ArrayList<String> canTeach) {
        super(name, age);
        this.currentCourses = new ArrayList<String>();
        this.canTeach = canTeach;
    }

    public boolean addCourse(String course) {
        if (this.currentCourses != null && this.canTeach.contains(course)) {
            this.currentCourses.add(course);
            return true;
        }
        return false;
    }
}
