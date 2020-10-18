package pl.sda.adapters.answer;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.domain.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
