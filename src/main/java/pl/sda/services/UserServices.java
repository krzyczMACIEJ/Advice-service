package pl.sda.services;

import pl.sda.domain.Answer;
import pl.sda.domain.AnswerComment;
import pl.sda.domain.Question;

import java.util.List;

public interface UserServices {

   boolean addUser(String login, String Password, String email);
   boolean passwordForget(String email);
   boolean passwordReset(String email);
   List<Question> questionListByLogin(String email);
   List<Answer> answerListByLogin(String email);
   List<AnswerComment> commentListByLogin(String email);







}
