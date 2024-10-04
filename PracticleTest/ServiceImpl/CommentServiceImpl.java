package PracticleTest.ServiceImpl;

import PracticleTest.Entity.Comment;
import PracticleTest.Repositories.CommentRepository;
import PracticleTest.Service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CommentServiceImpl implements CommentService {

    private CommentRepository commentRepository;

    @Override
    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    @Override
    public Comment findById(Long id) {
        return (Comment) commentRepository.findById(id).orElse(null);
    }

    @Override
    public Comment save(Comment comment) {
        return commentRepository.save(comment);
    }
}