package pl.sda.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Answer {


    @Id
    @GeneratedValue

    private int ID;
    public String respondent;       // answer author name
    public String content;          //answer login
    public LocalDateTime createDate;       //date and time view
//    AnswerScore score;              // answer score -> AnswerScoreCLASS
//    List<Integer> commentIDs;        //comment ID List<> for comment
    @OneToMany
    public List<Comment> comments;


    public Answer() {}

    public Answer(String respondent, String content) {
        this.respondent = respondent;
        this.content = content;
        this.comments = new ArrayList<>();
    }


}
