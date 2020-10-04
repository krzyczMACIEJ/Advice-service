package pl.sda.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Answer {


    private int ID;
    public String respondent;       // answer author name
    public String content;          //answer login
    private int questionID;         //unique answer ID to answer list<>
    LocalDateTime createDate;       //date and time view
    AnswerScore score;              // answer score -> AnswerScoreCLASS
    List<Integer> commentIDs;        //comment ID List<> for comment


}
