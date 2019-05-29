package com.guangc.kfc.kfc.service.impl;

import com.guangc.kfc.kfc.bean.Category;
import com.guangc.kfc.kfc.bean.CategoryExample;
import com.guangc.kfc.kfc.mapper.CategoryMapper;
import com.guangc.kfc.kfc.service.ICategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> findAll() {
        CategoryExample example=new CategoryExample();
        List<Category> list=categoryMapper.selectByExample(example);
        return list;
    }

    @Override
    public Category findCategoryById(Long id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrupdateCategory(Category category) {
        if(category.getId()!=null){
            categoryMapper.updateByPrimaryKey(category);
        }else{
            categoryMapper.insert(category);
        }
    }

    @Override
    public void deleteCategoryById(Long id) {
        categoryMapper.deleteByPrimaryKey(id);
    }
}
    