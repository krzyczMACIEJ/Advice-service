package pl.sda.services;

import pl.sda.domain.Answer;
import pl.sda.domain.AnswerComment;

public interface AnswerCommentService {

    boolean addAnswerComment(AnswerComment answerComment, Answer answer);
}
