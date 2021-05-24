package pl.sda.services;

import pl.sda.domain.Answer;
import pl.sda.domain.Comment;
import pl.sda.domain.Question;
import pl.sda.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

   User addUser(User user);
   Optional<User> findUserByUsername(String userName);
   boolean passwordForget(String email);
   boolean passwordReset(String email);
   List<Question> questionListByLogin(String email);
   List<Answer> answerListByLogin(String email);
   List<Comment> commentListByLogin(String email);







}
