package pl.sda.domain;


import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Question {

    @Id
    @GeneratedValue
    public int id;                       // unique ID of question
    public String author;                //author login view
    public String content;               //question content
    @CreationTimestamp
     public LocalDateTime creationDate;          // time and date view
//    LocalDateTime editionDate;           // time and date edit
//    LocalDateTime deleteDate;            // time and date delete
    @OneToMany
    public List<Answer> answers;             // answer id list for id question

    public Question() {}

    public Question(String author, String content) {
        this.author = author;
        this.content = content;
        this.answers = new ArrayList<>();
    }
}