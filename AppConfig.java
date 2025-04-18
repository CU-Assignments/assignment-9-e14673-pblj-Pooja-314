import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Bean for Course
    @Bean
    public Course course() {
        return new Course("Java Programming", "3 months");
    }

    // Bean for Student
    @Bean
    public Student student() {
        // Inject the Course dependency into the Student bean
        return new Student("John Doe", course());
    }
}
