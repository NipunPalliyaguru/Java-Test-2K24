package PracticleTest.Repositories;

import PracticleTest.Entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository

public interface NewsRepository {

    Optional<Object> findById(Long id);

    News save(News news);

    List<News> findAll();
}