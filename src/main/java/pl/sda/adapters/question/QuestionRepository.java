package pl.sda.adapters.question;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.domain.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
