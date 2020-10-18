package pl.sda.adapters.category;

import org.springframework.stereotype.Component;
import pl.sda.domain.Category;
import pl.sda.services.CategoryService;

import java.util.List;
import java.util.Optional;

@Component
public class CategoryServiceAdapter implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceAdapter(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public boolean addCategory(Category category) {
        categoryRepository.save(category);
        return true;
    }

    @Override
    public Optional<Category> findCategoryByName(String categoryName) {
        return Optional.empty();
    }

    @Override
    public List<Category> chooseCategory(String categoryName) {
        return null;
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
