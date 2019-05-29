package com.guangc.kfc.kfc.service.impl;

import com.guangc.kfc.kfc.bean.Product;
import com.guangc.kfc.kfc.bean.ProductExample;
import com.guangc.kfc.kfc.mapper.ProductMapper;
import com.guangc.kfc.kfc.service.IProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public List<Product> findAll() {
        ProductExample example=new ProductExample();
        List<Product> list=productMapper.selectByExample(example);
        return list;
    }

    @Override
    public Product findProductById(Long id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrupdateProduct(Product product) {
        if(product.getId()!=null){
            productMapper.updateByPrimaryKey(product);
        }else{
            productMapper.insert(product);
        }
    }

    @Override
    public void deleteProductById(Long id) {
        productMapper.deleteByPrimaryKey(id);
    }
}
