package PracticleTest.Controllers;

import PracticleTest.Entity.Comment;
import PracticleTest.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    private CommentService commentService;

    @GetMapping
    public List<Comment> findAll() {
        return commentService.findAll();
    }

    @GetMapping("/{id}")
    public Comment findById(@PathVariable Long id) {
        return commentService.findById(id);
    }

    @PostMapping
    public Comment save(@RequestBody Comment comment) {
        return commentService.save(comment);
    }
}