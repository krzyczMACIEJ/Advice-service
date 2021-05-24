package pl.sda.services;

import pl.sda.domain.Answer;

public interface AnswerService {

    boolean addAnswer(Answer answer);
    boolean addAnswerScore(Answer answer);
    boolean subAnswerScore(Answer answer);
}
