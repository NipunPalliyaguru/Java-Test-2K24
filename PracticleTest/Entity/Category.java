package PracticleTest.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "categories")
    private Set<News> news;

    
}