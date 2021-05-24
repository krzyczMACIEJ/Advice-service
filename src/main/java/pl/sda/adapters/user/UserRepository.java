package pl.sda.adapters.user;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
    Optional<User> findUserByLogin(String username);

}
