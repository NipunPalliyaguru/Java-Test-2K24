package PracticleTest.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String headline;
    private String content;

    @ManyToMany
    private Set<Category> categories;

    @OneToMany(mappedBy = "news")
    private Set<Comment> comments;


}