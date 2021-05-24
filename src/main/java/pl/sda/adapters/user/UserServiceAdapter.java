package pl.sda.adapters.user;

import org.springframework.stereotype.Component;
import pl.sda.domain.Answer;
import pl.sda.domain.Comment;
import pl.sda.domain.Question;
import pl.sda.domain.User;
import pl.sda.services.UserService;

import java.util.List;
import java.util.Optional;

@Component
public class UserServiceAdapter implements UserService {

    private final UserRepository userRepository;

    public UserServiceAdapter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findUserByUsername(String userName) {
        return userRepository.findUserByLogin(userName);
    }

    @Override
    public boolean passwordForget(String email) {
        return false;
    }

    @Override
    public boolean passwordReset(String email) {
        Optional<User> userEntity = userRepository.findByEmail(email);
        if(userEntity.isEmpty()) {
            return false;
        }
        return false;
    }

    @Override
    public List<Question> questionListByLogin(String email) {
        return null;
    }

    @Override
    public List<Answer> answerListByLogin(String email) {
        return null;
    }

    @Override
    public List<Comment> commentListByLogin(String email) {
        return null;
    }
}
