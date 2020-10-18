package pl.sda.services;

import pl.sda.domain.Answer;
import pl.sda.domain.Comment;

public interface CommentService {

    boolean addAnswerComment(Comment comment, Answer answer);
}
