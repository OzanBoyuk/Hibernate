package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaPostgreSqlEntegrasyon");
	 	EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		
		Student student =new Student();
		student.setAd("Ozan");
		student.setSoyad("Böyük");
		student.setOgrNo("272");
		
		Dersler ders1 = new Dersler();
		ders1.setDersAdi("Matemeatik");
		ders1.setKredi("4");
		ders1.setStudent(student);
		em.persist(ders1);
		
		Dersler ders2 = new Dersler();
		ders2.setDersAdi("Türkçe");
		ders2.setKredi("3");
		ders2.setStudent(student);
		em.persist(ders2);
		
		
		em.persist(student);
		
		
		
		em.getTransaction().commit();
		

	}

}
