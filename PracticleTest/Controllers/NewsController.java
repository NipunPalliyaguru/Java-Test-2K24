package PracticleTest.Controllers;

import PracticleTest.Entity.News;
import PracticleTest.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/news")
public class NewsController {

    private NewsService newsService;

    @GetMapping
    public List<News> findAll() {
        return newsService.findAll();
    }

    @GetMapping("/{id}")
    public News findById(@PathVariable Long id) {
        return newsService.findById(id);
    }

    @PostMapping
    public News save(@RequestBody News news) {
        return newsService.save(news);
    }
}