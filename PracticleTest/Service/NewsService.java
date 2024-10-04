package PracticleTest.Service;

import PracticleTest.Entity.News;

import java.util.List;

public interface NewsService {
    List<News> findAll();
    News findById(Long id);
    News save(News news);
}