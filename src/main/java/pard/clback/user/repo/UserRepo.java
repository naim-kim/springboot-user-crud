package pard.clback.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pard.clback.user.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long> {
    List<User> findByPart(String part);
}
