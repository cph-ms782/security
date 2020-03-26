package test;

import entity.Demo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Tester {
  public static void main(String[] args) {
//    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    EntityManager em = emf.createEntityManager();
    try {
      em.getTransaction().begin();
      em.persist(new Demo("Info-1"));
      em.persist(new Demo("Info-2"));
      em.persist(new Demo("Info-3"));
      em.getTransaction().commit();
    }finally{
      em.close();
    }
  }
}

