import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentApp {

    public static void main(String[] args) {
        // Create Session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            // Start a transaction
            session.beginTransaction();

            // Create a new student
            Student student = new Student("John Doe", 25);
            session.save(student); // CREATE

            // Commit transaction
            session.getTransaction().commit();

            // Get a new session for reading the data
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();

            // Read student by ID
            Student retrievedStudent = session.get(Student.class, student.getId()); // READ
            System.out.println("Retrieved Student: " + retrievedStudent);

            // Update student
            retrievedStudent.setAge(26);
            session.update(retrievedStudent); // UPDATE

            // Commit transaction
            session.getTransaction().commit();

            // Delete student
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.delete(retrievedStudent); // DELETE
            session.getTransaction().commit();

        } finally {
            HibernateUtil.closeSessionFactory();
        }
    }
}
