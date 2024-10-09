package com.example.cicd4;



import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/product")
public class ProductController {

    List<Product> productList = new ArrayList<>();


    @GetMapping( "/getProducts")
    public List<Product> getProducts()
    {
        return productList;
    }

    @PostMapping("/addProduct")
    public List<Product> addProduct(@Valid @RequestBody Product product)
    {
        productList.add(product);
        return productList;
    }



}