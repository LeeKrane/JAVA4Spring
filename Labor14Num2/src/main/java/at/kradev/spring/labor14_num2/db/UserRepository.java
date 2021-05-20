package at.kradev.spring.labor14_num2.db;

import at.kradev.spring.labor14_num2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
