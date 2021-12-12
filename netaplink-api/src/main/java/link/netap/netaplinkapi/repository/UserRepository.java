package link.netap.netaplinkapi.repository;

import link.netap.netaplinkapi.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
