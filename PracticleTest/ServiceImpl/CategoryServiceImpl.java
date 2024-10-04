package PracticleTest.ServiceImpl; // Add the correct package declaration


import PracticleTest.Entity.Category;
import PracticleTest.Repositories.CategoryRepository;
import PracticleTest.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(Long id) {
        return (Category) categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }
}