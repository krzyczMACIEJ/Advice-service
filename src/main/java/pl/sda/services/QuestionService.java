package pl.sda.services;


import pl.sda.domain.Category;
import pl.sda.domain.Question;

import java.time.LocalDateTime;

public interface QuestionService {

    boolean addQuestion(Question question, Category category);
    boolean findQuestionByContent(String content);
    Question findQuestionById(int id);
    boolean findQuestionByCategory(Category category);
    boolean deleteQuestion(int id, LocalDateTime deleteDate);
    boolean editQuestion(int id, String content, LocalDateTime editDate);
    boolean canEditQuestion(Question question);









}
