import com.hotelmananger.models.Guest;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hotelPU");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            Guest guest = new Guest();
            guest.setName("Joao");
            guest.setEmail("joao@teste.com");
            guest.setPhone("932456192");
            guest.setAddress("Viana");
            em.persist(guest);

            Guest guest2 = new Guest();
            guest2.setName("Pedro");
            guest2.setEmail("pedro@test.com");
            guest2.setPhone("932456100");
            guest2.setAddress("Cacuaco");
            em.persist(guest2);

            Guest guest3 = new Guest();
            guest3.setName("Antonio");
            guest3.setEmail("Antonio@gmail.com");
            guest3.setPhone("932456200");
            guest3.setAddress("Sequele");
            em.persist(guest3);

            em.getTransaction().commit();
            System.out.println("Hospede salvo com sucesso!");
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
