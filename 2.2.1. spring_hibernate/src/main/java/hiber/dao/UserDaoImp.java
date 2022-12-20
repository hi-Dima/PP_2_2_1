package hiber.dao;
import hiber.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {
   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public void add(User user) {
      sessionFactory.openSession().save(user);
   }
   @Override
   public List<User> getUserCar(String model, int series){
      TypedQuery<User> query = sessionFactory.openSession().createQuery("from User user where user.carId.model = :model and user.carId.series = :series");

      query.setParameter("model", model).setParameter("series", series);
      List<User> user = query.getResultList();
      return user;
   }
   @Override
   public List<User> listUsers() {
      TypedQuery<User> query=sessionFactory.openSession().createQuery("from User", User.class);
      return query.getResultList();
   }

}
