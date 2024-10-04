package PracticleTest.Repositories;



import PracticleTest.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface CommentRepository{

    Optional<Object> findById(Long id);

    Comment save(Comment comment);

    List<Comment> findAll();
}