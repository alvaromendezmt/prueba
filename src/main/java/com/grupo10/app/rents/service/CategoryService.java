/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo10.app.rents.service;

import com.grupo10.app.rents.interfaces.IQuadbikeRepository;
import com.grupo10.app.rents.entities.Category;
import com.grupo10.app.rents.interfaces.ICategoryRepository;
import com.grupo10.app.rents.entities.Quadbike;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres
 */
@Service
public class CategoryService {

     @Autowired
    ICategoryRepository repository;


    public Iterable<Category> get() {
        Iterable<Category> response = repository.findAll();
        return response;
    }

    public String create(Category request) {       
        
        if (request.getName() != null) {
            repository.save(request);
            return "created....";
        } else {
            return "falta el nombre";
        }

    }
    
    public Category update(Category category) {
        Category categoryToUpdate=new Category();
        if(repository.existsById(category.getId())){
            categoryToUpdate = category;
            repository.save(categoryToUpdate);
        }        
        return categoryToUpdate;
    }
    
    public Boolean delete(Integer id) {
        repository.deleteById(id);
        Boolean deleted = true;
        return deleted;
    }
}
