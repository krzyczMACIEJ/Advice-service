package pl.sda.adapters.category;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.domain.Answer;
import pl.sda.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
