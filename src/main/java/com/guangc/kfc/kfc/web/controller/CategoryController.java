package com.guangc.kfc.kfc.web.controller;

import com.guangc.kfc.kfc.bean.Category;
import com.guangc.kfc.kfc.service.ICategoryService;
import com.guangc.kfc.kfc.utils.Message;
import com.guangc.kfc.kfc.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("findAll")
    public Message findAll(){
        List<Category> list=categoryService.findAll();
        return MessageUtil.success(list);
    }

    @GetMapping("findCategoryById")
    public Message findCategoryById(Long id){
        Category category=categoryService.findCategoryById(id);
        return MessageUtil.success(category);
    }

    @PostMapping("saveOrupdateCategory")
    public Message saveOrupdateCategory(Category category){
        categoryService.saveOrupdateCategory(category);
        return MessageUtil.success("success");
    }

    @GetMapping("deleteCategoryById")
    public Message deleteCategoryById(Long id){
        categoryService.deleteCategoryById(id);
        return MessageUtil.success("success");
    }
}
