package PracticleTest.ServiceImpl;

import PracticleTest.Entity.News;
import PracticleTest.Repositories.NewsRepository;
import PracticleTest.Service.NewsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    private NewsRepository newsRepository;

    @Override
    public List<News> findAll() {
        return newsRepository.findAll();
    }

    @Override
    public News findById(Long id) {
        return (News) newsRepository.findById(id).orElse(null);
    }

    @Override
    public News save(News news) {
        return newsRepository.save(news);
    }
}