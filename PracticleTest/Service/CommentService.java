package PracticleTest.Service;

import PracticleTest.Entity.Comment;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CommentService {
    List<Comment> findAll();
    Comment findById(Long id);
    Comment save(Comment comment);
}