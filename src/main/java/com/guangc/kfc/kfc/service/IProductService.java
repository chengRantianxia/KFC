package com.guangc.kfc.kfc.service;


import com.guangc.kfc.kfc.bean.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAll();

    public Product findProductById(Long id);

    public void saveOrupdateProduct(Product product);

    public void deleteProductById(Long id);
}
