package pl.sda.domain;


import java.time.LocalDateTime;
import java.util.List;


public class Question {

    public int id;                       // unique ID of question
    public String author;                //author login view
    public String content;               //question content
    LocalDateTime creationDate;          // time and date view
    LocalDateTime editionDate;           // time and date edit
    LocalDateTime deleteDate;            // time and date delete
    List<Integer> answerIDs;             // answer id list for id question

}