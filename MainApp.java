import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        // Load Spring context from the configuration class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the student bean from the context
        Student student = context.getBean(Student.class);

        // Print student details
        System.out.println(student);

        // Close the context
        context.close();
    }
}
