package hibernate.theater;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class mainApp {
	public static void main(String[] args) {
	theater t1 = new theater(101,"Dhol");
	theater t2 = new theater(102,"3-idiot");
	theater t3 = new theater(103,"Robot");
	Transaction txn;
	try(Session session = hibernateUtil.getSessionFactory().openSession()){
	txn = session.beginTransaction();
	session.save(t1);
	session.save(t2);
	session.save(t3);
	txn.commit();
	}
	}
	}