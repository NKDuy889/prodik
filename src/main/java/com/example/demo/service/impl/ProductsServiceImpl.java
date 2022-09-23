package com.example.demo.service.impl;

import com.example.demo.model.Products;
import com.example.demo.service.ProductsService;
import org.springframework.stereotype.Service;

@Service
public class ProductsServiceImpl implements ProductsService {

  @Override
  public Products getProduct() {
    return new Products("Ma túy đá", Long.parseLong("1000000"));
  }
}
