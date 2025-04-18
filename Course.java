public class Course {
    private String courseName;
    private String duration;

    // Constructor
    public Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Getters and Setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    // Override toString for displaying Course details
    @Override
    public String toString() {
        return "Course [courseName=" + courseName + ", duration=" + duration + "]";
    }
}
