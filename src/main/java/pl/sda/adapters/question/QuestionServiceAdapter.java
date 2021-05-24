package pl.sda.adapters.question;

import org.springframework.stereotype.Component;
import pl.sda.domain.Category;
import pl.sda.domain.Question;
import pl.sda.services.QuestionService;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class QuestionServiceAdapter implements QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionServiceAdapter(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public boolean addQuestion(Question question, Category category) {
         questionRepository.save(question);
         return true;
    }

    @Override
    public boolean findQuestionByContent(String content) {
        return false;
    }

    @Override
    public Question findQuestionById(int id) {
        return null;
    }

    @Override
    public boolean findQuestionByCategory(Category category) {
        return false;
    }

    @Override
    public boolean deleteQuestion(int id, LocalDateTime deleteDate) {
        return false;
    }

    @Override
    public boolean editQuestion(int id, String content, LocalDateTime editDate) {
        return false;
    }

    @Override
    public boolean canEditQuestion(Question question) {
        return false;
    }

    @Override
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }
}
