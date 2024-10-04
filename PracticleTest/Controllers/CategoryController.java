package PracticleTest.Controllers;


import PracticleTest.Entity.Category;
import PracticleTest.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private CategoryService categoryService;

    @GetMapping
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @GetMapping("/{id}")
    public Category findById(@PathVariable Long id) {
        return categoryService.findById(id);
    }

    @PostMapping
    public Category save(@RequestBody Category category) {
        return categoryService.save(category);
    }
}