package com.hibernet.crud;

import org.hibernate.Session;

public class Client {

	public static void main(String[] args) {
		
		Session session=HibernateDbConnect.getSessionFactory().openSession();
		
		
				//CRUD
				//Step 1:Create
			
//			  User user= new User("Aftab samani", "987", "Aftab", "samani", "Mumbai");
//			  session.beginTransaction(); 
//			  session.save(user);
//			  session.getTransaction().commit();
			  
			  
				//Step 2: Retrieval
				
				
//				 User user1=new User(); 				
//				 session.beginTransaction();
//				 user1=session.get(User.class, 4); 
//				 System.out.println(user1);
//				 session.getTransaction().commit();
				 
				 
				 
				//step 3: update
					
//					User user2=new User(); session.beginTransaction();
//					user2=session.get(User.class, 1); 
//					user2.setFirstname("Talha");
//					System.out.println(user2);
//					session.getTransaction().commit();
		
		
				//step 4: delete
				
//				 User user3=new User(); session.beginTransaction();
//				 user3=session.get(User.class, 3); 
//				 session.delete(user3);
//				 session.getTransaction().commit();
				 
					 
				 

	}

}
