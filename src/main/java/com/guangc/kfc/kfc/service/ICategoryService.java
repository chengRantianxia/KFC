package com.guangc.kfc.kfc.service;


import com.guangc.kfc.kfc.bean.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> findAll();

    public Category findCategoryById(Long id);

    public void saveOrupdateCategory(Category category);

    public void deleteCategoryById(Long id);
}