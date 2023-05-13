package br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.services;

import org.springframework.stereotype.Service;

import br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.model.entities.Category;
import br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.repositories.CategoryRepositories;

@Service
public class CategoryService {
  private CategoryRepositories repository;

    public CategoryService(CategoryRepositories repository) {
        this.repository = repository;
    }
    
    public void salvar(Category category){
        repository.save(category);
    }

}
