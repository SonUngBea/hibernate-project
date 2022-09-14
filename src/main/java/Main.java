import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simple-jpa-application");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();

		try {
			Student student = em.find(Student.class, 1L);
			System.out.println(student);

//			em.persist(createStudent());

			tx.commit();

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}

		emf.close();
	}

	public static Student createStudent() {
		Student student = new Student();
		student.setId(2L);
		student.setName("영희");
		student.setSchoolName("서울고");
		student.setSchoolId(1L);

		return student;
	}
}
