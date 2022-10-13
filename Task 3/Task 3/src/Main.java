import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<String> passedCourses = new ArrayList<String>();
        passedCourses.add("Java 1.0");

        Student magnus = new Student("Magnus", 21, passedCourses);
        Student peter = new Student("Peter", 20, new ArrayList<String>());
        Student yusuf = new Student("Yusuf", 22, new ArrayList<String>());

        ArrayList<String> canTeach = new ArrayList<String>();
        canTeach.add("Math");
        canTeach.add("English");
        canTeach.add("Computer Science");
        canTeach.add("Java 1.0");

        Teacher jörg = new Teacher("jörg", 30, canTeach);
        Teacher jens = new Teacher("jens", 40, new ArrayList<String>());

        magnus.addCourse("Computer Science");
        peter.addCourse("Computer Science");
        yusuf.addCourse("Computer Science");

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(magnus);
        people.add(peter);
        people.add(yusuf);
        people.add(jörg);
        people.add(jens);

        for (Person person : people) {
            boolean hasCourse;
            hasCourse = person.addCourse("Java 1.0");

            if (hasCourse) {
                System.out.println(person.getName() + " has been added to the course");
            } else {
                if (person instanceof Student) {
                    System.out.println(person.getName() + " has already passed the course");
                } else {
                    System.out.println(person.getName() + " can't teach the course");
                }
            }
        }
    }
}