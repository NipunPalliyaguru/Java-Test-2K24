package PracticleTest.Repositories;

import PracticleTest.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface CategoryRepository  {

    Optional<Object> findById(Long id);

    List<Category> findAll();

    Category save(Category category);
}