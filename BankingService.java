import org.hibernate.Session;
import org.hibernate.Transaction;

public class BankingService {

    public void transferMoney(int senderAccountId, int receiverAccountId, double amount) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            // Begin transaction
            session.beginTransaction();

            // Fetch accounts
            Account sender = session.get(Account.class, senderAccountId);
            Account receiver = session.get(Account.class, receiverAccountId);

            if (sender.getBalance() < amount) {
                throw new Exception("Insufficient funds in sender's account");
            }

            // Perform money transfer
            sender.setBalance(sender.getBalance() - amount);
            receiver.setBalance(receiver.getBalance() + amount);

            // Save transaction record
            Transaction transaction = new Transaction(senderAccountId, receiverAccountId, amount);
            session.save(transaction);

            // Commit transaction
            session.getTransaction().commit();
        } catch (Exception e) {
            // Rollback transaction on error
            session.getTransaction().rollback();
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}
