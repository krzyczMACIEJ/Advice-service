package pl.sda.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue
    public int ID;

    public String categoryName;

    @ManyToOne
    public Category categoryParent;

    @OneToMany
    public List<Category> childs;

    @OneToMany
    public List<Question> questions;

    public Category() {}

    public Category(String categoryName, Category categoryParent, List<Category> childs, List<Question> questions) {
        this.categoryName = categoryName;
        this.categoryParent = categoryParent;
        this.childs = childs;
        this.questions = questions;
    }
}
