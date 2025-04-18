public class Student {
    private String name;
    private Course course; // Dependency

    // Constructor
    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    // Override toString for displaying Student details
    @Override
    public String toString() {
        return "Student [name=" + name + ", course=" + course + "]";
    }
}
