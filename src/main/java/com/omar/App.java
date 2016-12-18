package com.omar;

import com.omar.model.Person ;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Person p1 = new Person("omar","Ariana") ;
       Person p2 = new Person("Jhon", "London") ;
       
       
       Configuration configuration = new Configuration().configure();
       
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		
		Session session = sessionFactory.openSession() ;
		session.beginTransaction();
		session.save(p1);
		session.save(p2) ;
		session.getTransaction().commit();
		session.close();
    }
}
