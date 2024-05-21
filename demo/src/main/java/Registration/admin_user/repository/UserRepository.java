package Registration.admin_user.repository;

import Registration.admin_user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);
}
