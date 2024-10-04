package PracticleTest.Service;

import PracticleTest.Entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CategoryService {
    List<Category> findAll();
    Category findById(Long id);
    Category save(Category category);
}