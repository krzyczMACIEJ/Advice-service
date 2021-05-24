package pl.sda.services;

import pl.sda.domain.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    boolean addCategory(Category category);
    Optional<Category> findCategoryByName(String categoryName);
    List<Category> chooseCategory(String categoryName);
    List<Category> getAllCategories();

}
