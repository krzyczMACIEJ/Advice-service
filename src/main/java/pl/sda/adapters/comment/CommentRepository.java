package pl.sda.adapters.comment;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.sda.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
