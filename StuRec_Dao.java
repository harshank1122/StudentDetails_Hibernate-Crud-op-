package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.StudentDetails;


public class StuRec_Dao {
	
    public EntityManager getEntityManager() {
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("StudentRecordes");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
    	return entityManager ;
    			
    }
    
    
	
	public void save(StudentDetails studentDetails) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(studentDetails); //-- insert data
		//entityManager.merge(bike);    // --- update values
		entityTransaction.commit();
	}
	
//	public void deleteById(String contactno) {
//		EntityManager entityManager = getEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		entityTransaction.begin();
//	}
	
	public StudentDetails findById(String id) {
		EntityManager entityManager = getEntityManager();
		StudentDetails studentDetails = entityManager.find(StudentDetails.class, id);
		return studentDetails;
	}
	
	public void Update(StudentDetails studentDetails) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(studentDetails);
		entityTransaction.commit();
	}

}
