package pl.sda.domain;


import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
@Entity

public class Comment {

    @Id
    @GeneratedValue
    private long id;

    public String commentator;              //comment user name
    public String content;                  // comment content
    @CreationTimestamp
    public LocalDateTime createDate;               // date and time view

    public Comment() {}

    public Comment(String commentator, String content) {
        this.commentator = commentator;
        this.content = content;


    }
}
