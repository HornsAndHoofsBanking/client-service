package internship.andersenlab.client.repository;

import internship.andersenlab.client.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public interface UserRepository extends JpaRepository<User,Long> {
}
