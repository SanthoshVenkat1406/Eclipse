package orm.hibernateDemo;
import org.hibernate.SessionFactory;

import com.mysql.cj.Session;

import jakarta.transaction.Transaction;
import orm.hibernateDemo.config.HibernateUtility;
import orm.hibernateDemo.entities.Product;

public class App {
  public static void main(String[] args) {
	  
	    SessionFactory sessionFactory=HibernateUtility.getSessionFactoryObject(); 
		 org.hibernate.Session session=sessionFactory.openSession();
		 Product prdObj=session.get(Product.class, 1);
		 session.close();
		 //prdObj is detached
		 prdObj.setPrdPrice(2000);
		 org.hibernate.Session session1=sessionFactory.openSession();
		 Product myObj=session1.get(Product.class, 1);//myObj persistant
		 org.hibernate.Transaction trnx= session1.beginTransaction();
		 session1.merge(prdObj);
		 trnx.commit();
		 session1.close();
		 System.out.println(prdObj);
		 System.out.println(myObj);
	    
  }
}
