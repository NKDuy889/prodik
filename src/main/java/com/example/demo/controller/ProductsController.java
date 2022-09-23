package com.example.demo.controller;

import com.example.demo.model.Products;
import com.example.demo.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class ProductsController {

  private final ProductsService productsService;

  @Autowired
  public ProductsController(ProductsService productsService) {
    this.productsService = productsService;
  }

  @GetMapping(value = "get-products")
  public ResponseEntity<Products> getProducts() {
    return new ResponseEntity<>(productsService.getProduct(), HttpStatus.OK);
  }
}
