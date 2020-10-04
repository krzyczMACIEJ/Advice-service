package pl.sda.domain;

import java.time.LocalDateTime;

public class AnswerComment {

    public String commentator;              //comment user name
    public String content;                  // comment content
    LocalDateTime createDate;               // date and time view
    private int commentID;                  // unique comment ID to answer List<>


}
