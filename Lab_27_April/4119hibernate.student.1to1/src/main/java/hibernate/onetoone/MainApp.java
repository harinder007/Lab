package hibernate.onetoone;

import org.hibernate.Session;
import org.hibernate.Transaction;
public class MainApp {
public static void main(String[] args) {
Student s1 = new Student("Harinder");
ID id = new ID(71122345);
s1.setID(id);
Transaction txn;
try(Session session=HibernateUtil.getSessionFactory().openSession()){
txn = session.beginTransaction();
session.save(s1);
txn.commit();
}
}
}