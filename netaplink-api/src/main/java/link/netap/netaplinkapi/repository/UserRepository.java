package link.netap.netaplinkapi.repository;

import link.netap.netaplinkapi.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    @Query("select u from User as u where u.delete = false")
    List<User> getActiveUsers();
}
