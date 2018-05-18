package com.JingXIShangCheng.JingXIShangCheng.controller;


import com.JingXIShangCheng.JingXIShangCheng.entity.Product;
import com.JingXIShangCheng.JingXIShangCheng.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    //获取product列表
    @GetMapping
    public List<Product> getAll(){
        return productRepository.findAll();
    }
    

}
