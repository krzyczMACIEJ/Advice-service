package pl.sda.adapters.comment;

import pl.sda.domain.Answer;
import pl.sda.domain.Comment;
import pl.sda.services.CommentService;

public class CommentServiceAdapter implements CommentService {

    private final CommentRepository commentRepository;

    public CommentServiceAdapter(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }


    @Override
    public boolean addAnswerComment(Comment comment, Answer answer) {
        return false;
    }
}
