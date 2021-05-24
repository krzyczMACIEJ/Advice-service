package pl.sda.adapters.answer;

import org.springframework.stereotype.Component;
import pl.sda.domain.Answer;
import pl.sda.services.AnswerService;


@Component
public class AnswerServiceAdapter implements AnswerService {

    private final AnswerRepository answerRepository;

    public AnswerServiceAdapter(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }


    @Override
    public boolean addAnswer(Answer answer) {
        return false;
    }

    @Override
    public boolean addAnswerScore(Answer answer) {
        return false;
    }

    @Override
    public boolean subAnswerScore(Answer answer) {
        return false;
    }
}
