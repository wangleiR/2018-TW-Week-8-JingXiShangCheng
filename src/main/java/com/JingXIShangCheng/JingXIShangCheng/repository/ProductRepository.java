package com.JingXIShangCheng.JingXIShangCheng.repository;

import com.JingXIShangCheng.JingXIShangCheng.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    //Product findById( id);
}