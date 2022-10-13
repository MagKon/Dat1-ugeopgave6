import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<String> currentCourses;
    private ArrayList<String> passedCourses;
    private int courseCount;

    public Student(String name, int age, ArrayList<String> passedCourses) {
        super(name, age);
        this.currentCourses = new ArrayList<String>();
        this.passedCourses = passedCourses;
        this.courseCount = 0;
    }

    public boolean addCourse(String course) {
        if (this.courseCount < 10 && !this.passedCourses.contains(course)) {
            this.currentCourses.add(course);
            this.courseCount++;
            return true;
        }
        return false;
    }

    public String toString() {
        return super.toString();
    }
}
